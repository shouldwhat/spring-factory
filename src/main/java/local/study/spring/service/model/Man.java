package local.study.spring.service.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component("man")
public class Man extends Human
{
	public Man()
	{
		super("man");
	}
}
