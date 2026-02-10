package demo_testscript;

public class Demo {
	int age;
	double salary;
	String name;
	char department;

	
	public void show()
	{
		 age=25;
		 salary=50000.00;
		 name="Rahul";
		 department='A';
	}
	public static void main(String[] args) {
	
		
		Demo obj=new Demo();
		obj.show();
		System.out.println("Name: "+obj.name);
		System.out.println("Age: "+obj.age);// TODO Auto-generated method stub
		System.out.println("Department: "+obj.department);
		System.out.println("Salary: "+obj.salary);
	}
}
