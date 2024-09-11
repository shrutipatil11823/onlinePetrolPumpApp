package org.petrolpump.admin.repository;

import org.petrolpump.admin.model.employeeModel;
import java.util.*;

public interface employeeRepository {
	
	public boolean isAddNewEmployee(employeeModel model);
	public List<employeeModel> getAllEmployee();
	public boolean getMachineDetails(int eid, int mid, String ...x);

}
