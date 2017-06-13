package local.study.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import local.study.spring.service.TFactoryService;

@RestController
public class TFactoryController
{
	private static final Logger LOG = LoggerFactory.getLogger(TFactoryController.class);
			
	@Autowired
	private TFactoryService tFactoryService;
	
	@RequestMapping(value = "/human/{sex}", method = RequestMethod.POST)
	public void createHuman(HttpServletRequest request, @PathVariable String sex)
	{
		LOG.info("------------------------------------- createHuman");
		LOG.info("- sex = {}", sex);
		
		tFactoryService.createHuman(sex);
	}
	
	@RequestMapping(value = "/humans", method = RequestMethod.GET)
	public String getHumanList(HttpServletRequest request)
	{
		LOG.info("------------------------------------- getHumanList");

		return tFactoryService.getHumanList().toString();
	}
}
