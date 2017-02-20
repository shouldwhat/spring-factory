package local.study.spring.service.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component("woman")
public class Woman extends Human
{
	public Woman()
	{
		super("woman");
	}
}
