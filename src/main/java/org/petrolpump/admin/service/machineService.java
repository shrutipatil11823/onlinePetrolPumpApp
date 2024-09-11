package org.petrolpump.admin.service;

import java.util.List;


import org.petrolpump.admin.model.machineModel;

public interface machineService 
{
	public boolean isAddNewMachine(machineModel model, String ftype[], String capArray[]);
	
	public List<Object []> getMachineDetails();
	
	public boolean isDeleteMachine(int id);

	public boolean isUpdateMachine(machineModel model);
}
