package local.study.spring.service.model;

public abstract class Human implements ISay
{
	private String sex;
	
	private int age;
	
	public Human(String sex)
	{
		this.sex = sex;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}

	@Override
	public void say()
	{
		this.toString();
	}

	@Override
	public String toString() 
	{
		return "Human [sex=" + sex + ", age=" + age + "]";
	}
}
