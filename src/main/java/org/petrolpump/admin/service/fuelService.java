package org.petrolpump.admin.service;

import java.util.List;

import org.petrolpump.admin.model.fuelModel;

public interface fuelService {

	public boolean isAddFuelType(fuelModel model);
	public List<fuelModel> getAllFuelTypes();
}
