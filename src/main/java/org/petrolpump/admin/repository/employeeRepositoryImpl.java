package org.petrolpump.admin.repository;

import java.util.*;

import org.config.DBConfig;
import org.petrolpump.admin.model.employeeModel;

public class employeeRepositoryImpl extends DBConfig implements employeeRepository {
	List<employeeModel> lst=new ArrayList<employeeModel>();
	
	public int getEmployeeId()
	{
		int id=0;
		try
		{
			p=c.prepareStatement("select max(eid) from employee");
			rs=p.executeQuery();
			
			if(rs.next())
			{
				id=rs.getInt(1);
			}
			return ++id;
		}catch(Exception ex)
		{
			System.out.println("Exception "+ex);
			return -1;
		}
	}
	
	@Override
	public boolean isAddNewEmployee(employeeModel model) {

		int empid=this.getEmployeeId();
		try
		{
			//System.out.println("hii");
			p=c.prepareStatement("insert into employee values(?,?,?,?,?,?)");
			p.setInt(1, empid);
			p.setString(2,model.getName());
			p.setString(3, model.getEmail());
			p.setString(4, model.getContact());
			p.setString(5,model.getAddress());
			p.setInt(6, model.getSalary());
			
			int value=p.executeUpdate();
			
			return value>0?true:false;
		}catch(Exception ex)
		{
			System.out.println("Exception inserts "+ex);
			return false;
		}

		
	}

	@Override
	public List<employeeModel> getAllEmployee() {
		
		try
		{
			p=c.prepareStatement("select * from employee");
			rs=p.executeQuery();
			
			while(rs.next())
			{
				employeeModel emp=new employeeModel();
				emp.setId(rs.getInt("eid"));
				emp.setName(rs.getString("name"));
				emp.setEmail(rs.getString("email"));
				emp.setContact(rs.getString("contact"));
				emp.setAddress(rs.getString("address"));
				emp.setSalary(rs.getInt("salary"));
				
				lst.add(emp);
			}
			
			return lst.size()>0?lst:null;
		}catch(Exception ex)
		{
			System.out.println("Exception "+ex);
			return null;
		}
		
	}

	@Override
	public boolean getMachineDetails(int eid, int mid, String... x) {
			
		try
		{
			p=c.prepareStatement("insert into employeemachinejoin values(?,?,?,?,?)");
			p.setInt(1, eid);
			p.setInt(2,mid);
			p.setString(3,x[0]);
			p.setString(4,x[1]);
			p.setString(5, x[2]);
			
			int value=p.executeUpdate();
			
			return value>0?true:false;
		}catch(Exception ex)
		{
			System.out.println("Exception "+ex);
			return false;
		}
		
	}

}
