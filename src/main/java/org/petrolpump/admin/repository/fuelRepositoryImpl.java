package org.petrolpump.admin.repository;

import java.util.ArrayList;
import java.util.List;

import org.config.DBConfig;
import org.petrolpump.admin.model.fuelModel;

public class fuelRepositoryImpl extends DBConfig implements fuelRepository {
	
	List<fuelModel> lst=new ArrayList<fuelModel>();
	
	@Override
	public boolean isAddFueltype(fuelModel model) {
		
		try
		{
			p=c.prepareStatement("insert into fuelType values('0',?)");
			p.setString(1,model.getFuelType());
			
			return p.executeUpdate()>0?true:false;
		}catch(Exception ex)
		{
			System.out.println("Exception "+ex); 
			return false;
		}
	}
	
	public List<fuelModel> getAllFuelTypes()
	{
		try
		{
			p=c.prepareStatement("select * from fueltype");
			rs=p.executeQuery();
			
			while(rs.next())
			{
				fuelModel model=new fuelModel();
				model.setFuelId(rs.getInt(1));
				model.setFuelType(rs.getString(2));
				
				lst.add(model);
			}
			
			return lst.size()>0?lst:null;
			
		}catch(Exception ex)
		{
			System.out.println("Exception "+ex);
			return null;
		}
		
	}
	
}
