package org.petrolpump.admin.service;

import java.util.List;

import org.petrolpump.admin.model.machineModel;
import org.petrolpump.admin.repository.machineRepository;
import org.petrolpump.admin.repository.machineRepositoryImpl;
public class machineServiceImpl implements machineService {

	machineRepository mRepo=new machineRepositoryImpl();
	
	public boolean isAddNewMachine(machineModel model,String[] ftype, String[] capArray) {
		
		return mRepo.isAddNewmachine(model, ftype, capArray);
	}
	@Override
	public List<Object[]> getMachineDetails() {
		
		return mRepo.getMachineDetails();
	}
	@Override
	public boolean isDeleteMachine(int id) {
		
		return mRepo.isDeleteMachine(id);
	}
	@Override
	public boolean isUpdateMachine(machineModel model) {
		
		return mRepo.isUpdateMachine(model);
	}


}
