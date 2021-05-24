package com.xworkz.project.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.project.dao.RegistrationDAO;
import com.xworkz.project.dto.RegistrationDTO;
import com.xworkz.project.entity.RegistrationEntity;

@Service
public class RegistrationServiceImpl implements RegistrationService {

	private Logger logger;
	@Autowired
	private RegistrationDAO dao;

	public RegistrationServiceImpl() {
		logger = Logger.getLogger(getClass());
	}

	@Override
	public String validateAndSave(RegistrationDTO registrationDTO) {
		logger.info("inside {}");
		RegistrationEntity registrationEntity = new RegistrationEntity();
		try {
			RegistrationEntity reEntity = dao.getByEmailId(registrationDTO.getEmailId());
			if (reEntity == null) {
				BeanUtils.copyProperties(registrationDTO, registrationEntity);
				registrationEntity.setRegisteredBy("Surakshita");
				LocalDateTime localDate = LocalDateTime.now();
				DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");
				String date = dateTimeFormatter.format(localDate);
				registrationEntity.setRegisteredDate(date);

				int rowsEffected = dao.saveEntity(registrationEntity);
				if (rowsEffected > 0) {
					logger.info("Registration successfull");
					return "Registration successfull";

				} else {
					logger.info("Error while registration");
					return "Error while registration";
				}
			} else {
				logger.info("User already exist");
				return "User already exist";
			}
		} catch (Exception e) {
			logger.error("Exception at {}" + e.getMessage(), e);
		}

		return "";
	}

}
