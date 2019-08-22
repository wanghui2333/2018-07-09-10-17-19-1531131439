package practice06;

public class Teacher extends Person{
	public Integer klass;
	
	public Teacher(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	public Teacher(String name, int age, int klass) {
		super(name, age);
		this.klass = klass;
	}
	
	public int getKlass() {
		return klass;
	}

	public void setKlass(int klass) {
		this.klass = klass;
	}
	
	
	public String introduce() {
		if (klass == null) {
			return super.basicIntroduce() + "I am a Teacher. I teach No Class.";
		}
		return super.basicIntroduce() + "I am a Teacher. I teach Class 2.";
	}
	
}
