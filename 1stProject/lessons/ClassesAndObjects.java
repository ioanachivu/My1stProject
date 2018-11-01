package lessons;

public class ClassesAndObjects {
	public static void main(String[] args) {
		
		Person john= new Person ("John",20);
		
		Person bob= new Person ("Bob",25);
		
		System.out.println(john.getName()+" is "+john.getAge()+" years old");
		System.out.println(bob.getName()+" is "+bob.getAge()+" years old");
		
		john.sayHelloTo(bob);
		bob.sayHelloTo(john);
		
	}
}
