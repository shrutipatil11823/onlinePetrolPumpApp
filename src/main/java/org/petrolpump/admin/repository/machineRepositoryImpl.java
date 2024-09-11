package org.petrolpump.admin.repository;

import java.util.ArrayList;
import java.util.List;

import org.config.DBConfig;
import org.petrolpump.admin.model.machineModel;

public class machineRepositoryImpl extends DBConfig implements machineRepository{

	List<Object []> lst;
	int mid;
	public int getIdAuto()
	{	
		try
		{
			p=c.prepareStatement("select max(mid) from machineinfo");
			rs=p.executeQuery();
			
			if(rs.next())
			{
				mid=rs.getInt(1);
			}
			
			++mid;
			return mid;
			
		}catch(Exception ex)
		{
			System.out.println("Exception "+ex);
			return -1;
		}
		
	}
	
	public boolean isAddNewmachine(machineModel model ,String[] ftype, String[] capArray) {
	
		try
		{
			mid=this.getIdAuto();
			String machinecode=model.getMachinecode();
			
			
			p=c.prepareStatement("insert into machineinfo values("+mid+",'"+machinecode+"')");
			
			int value=p.executeUpdate();
			
			if(value>=0)
			{	
				
				System.out.println("cap length"+capArray.length);
				for(int i=0;i<capArray.length;i++)
				{
					int j=0;
					if(capArray[i].isEmpty())
					{
						System.out.println("empty");
					}else			
			    	{    
						
					        p = c.prepareStatement("insert into machinetypejoin values(?,?,?)");
					        p.setInt(1, mid);
					        p.setInt(2, Integer.parseInt(ftype[j]));
					        p.setInt(3, Integer.parseInt(capArray[i]));
					        j++;
					        
					        value = p.executeUpdate();	    
			    	} 
					
				}
				return value>0?true:false;
			}else
			{
				return false;
			}
			
			
			
		}catch(Exception ex)
		{
			System.out.println("Exception is "+ex);
			return false;
		}
		
	}

	
	public List<Object[]> getMachineDetails() {
	
		try
		{
			lst=new ArrayList<Object []>();
			p=c.prepareStatement("select m.machinecode,f.ftype,mtj.capacity ,m.mid from machineinfo m left join machinetypejoin mtj on m.mid=mtj.mid left join fueltype f on f.fid=mtj.fid;");
			
			rs=p.executeQuery();
			while(rs.next())
			{
				Object obj[]=new Object[] {rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4)};
				
				lst.add(obj);
			}
			
			return lst.size()>0?lst:null;
			
		}catch(Exception ex)
		{
			System.out.println("Exception ex" +ex);
			return null;
		}
		
		
	}


	@Override
	public boolean isDeleteMachine(int mid) {
		
		try
		{
			p=c.prepareStatement("delete from machineinfo where mid=?");
			p.setInt(1, mid);
			
			int value=p.executeUpdate();
			
			return value>0?true:false;
		}catch(Exception ex)
		{
			System.out.println("Exception "+ex);
			return false;
		}
		
		
	}


	@Override
	public boolean isUpdateMachine(machineModel model) {
	
		try
		{
			p=c.prepareStatement("update machineinfo set machinecode=? where mid=?");
			p.setString(1,model.getMachinecode());
			p.setInt(2,model.getId());
			
			int value=p.executeUpdate();
			return value>0?true:false;
			
			
		}catch(Exception ex)
		{
			System.out.println("Exception ex" +ex);
			return false;
		}
	}
}
