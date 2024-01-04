package MyPackage;

public class constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     myclass s=new myclass();
		myclass c=new myclass(122,"appu","malayil");
		myclass c1=new myclass(10000);
		
		
		c.display();
		c1.display();;
         

	}

}
class myclass{
	int id;
	String name;
	//String place;
	double salary;
	public myclass() {
		System.out.println("student details");
		
	}
	public myclass(int id , String name,String places) {
		this.id=id;
		this.name=name;
	//	this.places=places;
		
	}
	public myclass (double salary) {
		this.salary=salary;
	}
	public void display() {
	//	System.out.println("ID="+id+"NAME="+name+"places="+places+"SALARY="+salary);
		
	}
	public void display1() {
		System.out.println("SALARY="+salary);	}
}

