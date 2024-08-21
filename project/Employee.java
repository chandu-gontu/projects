package project;

public class Employee extends Person{
	String desg;
	Employee(){
		System.out.println("in child");
		
	}
	public Employee(String desg) {
		
		this();
		this.desg = desg;
		System.out.println(this.desg);
	}
	public static void main(String[] args) {
		Employee a = new Employee("FSD");
	}
}
