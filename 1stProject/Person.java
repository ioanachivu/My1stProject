

public class Person {
	String name;
	int age;

	public Person (String name, int age) {
		this.name=name;
		this.age=age;
		System.out.println("constructor folosit");
	}

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
	
	public void sayHelloTo(Person person) {
		System.out.println(getName()+" sais hello to "+person.getName());
	}

	
	
}
	

