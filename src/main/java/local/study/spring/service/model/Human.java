package local.study.spring.service.model;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class Human implements ISay
{
	private String sex;
	
	private int age;
	
	@Autowired
	private Properties testProp;
	
	public Human(String sex)
	{
		this.sex = sex;
		this.age = -1;
	}

	@Override
	public void say(int age)
	{
		this.age = age;
		this.toString();
	}

	@Override
	public String toString()
	{
		return "Human [sex=" + sex + ", age=" + age + "]";
	}
}
