public class Test{
	
	
	public static void main(String[] args){
		//Person p = new Person();
		Student s = new Student("123");
	}
}

class Person{
	
	private String name;
	
	public Person(String name){
		System.out.println("person constructor [" + name + "] ...");
		this.name = name;
	}
	
	
	
	public String info(){
		return null;
	}
}

class Student extends Person {
	
	private String school;
	
	public Student(String school){
		super();
		System.out.println("Student constructor ...");
		this.school = school;
	}
}