package practice04;

public class Person {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public String introduce() {
		return "My name is Tom. I am 21 years old.";
	}
	public String basicIntroduce() {
		return "My name is Tom. I am 21 years old. ";
	}
}

