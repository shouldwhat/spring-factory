package local.study.spring.configuration;

import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import local.study.spring.service.model.HumanFactory;

@Configuration
public class HumanFactoryConfiguration 
{
	@Bean
	public ServiceLocatorFactoryBean serviceLocatorFactoryBean()
	{
		ServiceLocatorFactoryBean serviceLocatorFactoryBean = new ServiceLocatorFactoryBean();
		serviceLocatorFactoryBean.setServiceLocatorInterface(HumanFactory.class);
		
		return serviceLocatorFactoryBean;
	}
	/***
	 * Model�� ���� @Component�� @Scope�� ���̰ų�(Man.java, Woman.java ����), �Ʒ��� ���� ���� @Bean �������� ����� ���� ����.
	 */
	/*
	@Bean(name = "man")
	@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Man man()
	{
		return new Man();
	}
	
	@Bean(name = "woman")
	@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Woman woman()
	{
		return new Woman();
	}
	*/
}
