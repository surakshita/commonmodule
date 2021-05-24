package com.xworkz.project.dao;

import com.xworkz.project.entity.RegistrationEntity;

public interface RegistrationDAO {
	
	public Integer saveEntity(RegistrationEntity registrationEntity);
	
	public RegistrationEntity getByEmailId(String emailId);

}
