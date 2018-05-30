package hello;

public class Person {
	//instance fields
	private String name;
	private int age;
	
	//methods

	public String getAll() {
		
		return String.format("%s %d", name, age);
	}
	//constructor
	
	public Person() {
		name="Muxette";
		age=1;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//accessors
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

	

}
