package com.xworkz.project.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.project.dto.RegistrationDTO;
import com.xworkz.project.service.RegistrationService;

@Controller
@RequestMapping("/")
public class RegistrationController {

	private static Logger logger;
	@Autowired
	private RegistrationService registrationService;

	public RegistrationController() {
		logger = Logger.getLogger(getClass());
	}

	//@RequestMapping("/registration.do")
	@PostMapping("registration.do")
	public ModelAndView register(RegistrationDTO registrationDTO) {

		logger.info("invoked register()");
		ModelAndView modelAndView = new ModelAndView("index");
		try {
			String message = registrationService.validateAndSave(registrationDTO);
			modelAndView.addObject("message", message + registrationDTO.getFullName());

		} catch (Exception e) {
			logger.error("exception at {}" + e.getMessage(), e);
		}

		return modelAndView;

	}

}
