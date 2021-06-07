package p1;


import java.text.SimpleDateFormat; 
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;

 class Tester {
	public static SimpleDateFormat sdf;
	private int id;
	private String name;
	private double salary;
	private Date dob;
	private EmpType e;
	public enum EmpType {
		HR,MANAGER,SALESMANAGRE,WORKER;
		}
	
	static{
		sdf= new SimpleDateFormat("dd-MM-yy");
	}
	public Tester(int id, String name, double salary, Date dob, EmpType e) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dob = dob;
		this.e = e;
		
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dob=" + sdf.format(dob) + ", e=" + e + "]";
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("in emp equal");
if(	obj instanceof Tester) {
	return this.id==((Tester)obj).id;
}
return false;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public EmpType getE() {
		return e;
	}
	public void setE(EmpType e) {
		this.e = e;
	}
	public Tester(int id) {
		super();
		this.id = id;
	}
	
public static void main(String [] args) {
		
		try(Scanner sc=new Scanner(System.in)){
			Tester e= new Tester(10);
		   HashSet<Tester>empSet=new HashSet<>();
		   boolean exit=false;
		  while(!exit) {
			  System.out.println("1.add employee 2.display employee 3.exit ");
			  System.out.println("enter Choice");
			  try{
				switch(sc.nextInt()){
				case 1:    System.out.println("enter: int id, String name, double salary, Date dob, Empype e"); 
				             empSet.add(new Tester(sc.nextInt(),sc.next(),sc.nextDouble(),Tester.sdf.parse(sc.next()),Tester. EmpType.valueOf(sc.next().toUpperCase())));
					            break;
				case 2:       empSet.forEach(a-> System.out.println(a));
				                break;
				case 3:       exit=true;
					            break;
				
				}
				  
			  }catch (Exception d) {
				  
				  System.out.println(d);
			  }
			  sc.nextLine();
		  }
		 
			
		}catch (Exception e) {
			  
			  System.out.println(e);
		  }
	
}

}

@SuppressWarnings("serial")
class EmpHandlingException extends Exception{
	
	public EmpHandlingException(String mesg) {
		super(mesg);
	}
}

 
	
 
