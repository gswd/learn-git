public class Test{
	
	public static void main(String[] args){
		Student s = new Student("cat", "12");
		
		Student s1 = new Student("cat", "12");
		
		System.out.print(s.equals(s1));
		
		
		
	}
}


class Student{
	private String name;
	private String age;
	
	public Student(String name, String age){

		this.name = name;
		this.age = age;

	}
	
	public Student(){
		
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getAge(){
		return this.age;
	}
	public String toString(){
		return "name:" + name + " age:" + age;
	}
	
	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}
		
		if(!(obj instanceof Student)){
			return false;
			
		}
		
		Student s = (Student)obj;
		
		if(!this.name.equals(s.getName())){
			return false;
		}
		
		if(!this.age.equals(s.getAge())){
			return false;
		}
		
		return true;
		
		
	}
}


//Student@SDF#FwSD
//name:cat age:12
//edit file once
