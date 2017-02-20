package local.study.spring.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import local.study.spring.service.TFactoryService;

@Controller
public class TFactoryController
{
	private static final Logger logger = LoggerFactory.getLogger(TFactoryController.class);
	
	@Autowired
	private TFactoryService tFactoryService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model)
	{
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate);
		
		return "home";
	}
	
	@RequestMapping(value = "/man", method = RequestMethod.POST)
	public String testCreateManFromFactory(HttpServletRequest request)
	{
		logger.info("*****************************************************************************************.");
		logger.info("****************************** START TFactoryController.testCreateManFromFactory Method.");
		
		tFactoryService.createMan();
		
		logger.info("****************************** END TFactoryController.testCreateManFromFactory Method.");
		
		return "home";
	}
	
	@RequestMapping(value = "/woman", method = RequestMethod.POST)
	public String testCreateWomanFromFactory(HttpServletRequest request)
	{
		logger.info("*****************************************************************************************.");
		logger.info("****************************** START TFactoryController.testCreateWomanFromFactory Method.");
		
		tFactoryService.createWoman();
		
		logger.info("****************************** END TFactoryController.testCreateWomanFromFactory Method.");
		
		return "home";
	}
}
