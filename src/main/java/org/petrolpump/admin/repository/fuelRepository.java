package org.petrolpump.admin.repository;

import java.util.List;

import org.petrolpump.admin.model.fuelModel;

public interface fuelRepository {
	public boolean isAddFueltype(fuelModel model);
	public List<fuelModel> getAllFuelTypes();
}
