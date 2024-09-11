package org.petrolpump.admin.service;

import java.util.List;

import org.petrolpump.admin.model.*;
import org.petrolpump.admin.repository.*;

public class fuelServiceImpl implements fuelService {
	fuelRepository fRepo=new fuelRepositoryImpl();
	@Override
	public boolean isAddFuelType(fuelModel model) {
		
		return fRepo.isAddFueltype(model);
	}
	@Override
	public List<fuelModel> getAllFuelTypes() {
		
		return fRepo.getAllFuelTypes();
	}

}
