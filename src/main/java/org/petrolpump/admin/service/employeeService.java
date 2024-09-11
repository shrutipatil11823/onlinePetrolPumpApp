package org.petrolpump.admin.service;

import java.util.*;
import org.petrolpump.admin.model.employeeModel;

public interface employeeService 
{
	public boolean isAddNewEmployee(employeeModel model);
	public List<employeeModel> getAllEmployee();
	public boolean getMachineDetails(int eid,int mid,String ...x);
}
