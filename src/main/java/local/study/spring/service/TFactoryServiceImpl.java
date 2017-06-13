package local.study.spring.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import local.study.spring.service.model.Human;
import local.study.spring.service.model.HumanFactory;
import local.study.spring.service.model.ISay;

@Service
public class TFactoryServiceImpl implements TFactoryService
{
	List<ISay> humanList;
	
	@Autowired
	private HumanFactory HumanFactory;
	
	@PostConstruct
	public void initialize()
	{
		this.humanList = new ArrayList<ISay>();
	}
	
	@Override
	public void createHuman(String sex) 
	{
		/* Create Human From HumanFactory */
		ISay sayableHuman = HumanFactory.createHuman(sex);
		
		/* Set Human */
		Human human = (Human) sayableHuman;
		
		human.setAge(humanList.size());
		
		/* Save Human */
		humanList.add(human);
	}

	@Override
	public List<ISay> getHumanList() 
	{
		return humanList;
	}
}
