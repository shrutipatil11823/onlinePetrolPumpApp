package org.petrolpump.admin.service;

import java.util.List;

import org.petrolpump.admin.model.employeeModel;
import org.petrolpump.admin.repository.*;

public class employeeServiceImpl implements employeeService {
	
	employeeRepository empRepo=new employeeRepositoryImpl();
	@Override
	public boolean isAddNewEmployee(employeeModel model)
	{		
		return empRepo.isAddNewEmployee(model);
	}
	@Override
	public List<employeeModel> getAllEmployee() {
		
		return empRepo.getAllEmployee();
	}
	@Override
	public boolean getMachineDetails(int eid, int mid, String ...x) {
		
		return empRepo.getMachineDetails(eid,mid,x);
	}

}
