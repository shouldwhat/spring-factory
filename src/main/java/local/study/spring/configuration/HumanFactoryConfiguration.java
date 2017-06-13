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
	 * Model에 직접 @Component나 @Scope를 붙이거나(Man.java, Woman.java 참고), 아래와 같이 직접 @Bean 설정으로 사용할 수도 있음.
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
