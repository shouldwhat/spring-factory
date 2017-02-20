package local.study.spring.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import local.study.spring.service.model.HumanFactory;
import local.study.spring.service.model.ISay;

@Service
public class TFactoryServiceImpl implements TFactoryService
{
	private static final Logger logger = LoggerFactory.getLogger(TFactoryServiceImpl.class);
	
	@Autowired
	private HumanFactory HumanFactory;
	
	List<ISay> humanList;
	
	@PostConstruct
	public void initialize()
	{
		this.humanList = new ArrayList<ISay>();
	}
	
	@Override
	public void createMan()
	{
		ISay man = HumanFactory.createHuman("man");
		
		man.say(humanList.size());
		
		humanList.add(man);
		
		logger.info(humanList.toString());
	}

	@Override
	public void createWoman()
	{
		ISay woman = HumanFactory.createHuman("woman");
		
		woman.say(humanList.size());
		
		humanList.add(woman);
		
		logger.info(humanList.toString());
	}
}
