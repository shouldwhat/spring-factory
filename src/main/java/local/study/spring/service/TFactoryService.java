package local.study.spring.service;

import java.util.List;

import local.study.spring.service.model.ISay;

public interface TFactoryService
{
	public void createHuman(String sex);
	
	public List<ISay> getHumanList();
}
