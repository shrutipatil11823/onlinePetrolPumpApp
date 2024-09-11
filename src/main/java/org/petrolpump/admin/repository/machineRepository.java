package org.petrolpump.admin.repository;

import java.util.List;

import org.petrolpump.admin.model.machineModel;



public interface machineRepository {
	
	public boolean isAddNewmachine(machineModel model, String ftype[],String capArray[]);
	public List<Object []> getMachineDetails();
	public boolean isDeleteMachine(int mid);

	public boolean isUpdateMachine(machineModel model);

	
}
   

