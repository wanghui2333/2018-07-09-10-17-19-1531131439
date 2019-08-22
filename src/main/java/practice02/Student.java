package practice02;

public class Student extends Person{

	public int klass;
	
	public Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, int klass) {
		super(name, age);
		this.klass = klass;
	}

	public int getKlass() {
		return klass;
	}

	public void setKlass(int klass) {
		this.klass = klass;
	}
	
	
	
}
