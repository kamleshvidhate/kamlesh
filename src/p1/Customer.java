package p1;



import java.text.SimpleDateFormat; 
import java.util.Date;

public class Customer {
      
	private String name;
	private String email;
	private String pass;
	private CustType c;
	private double regAmt;
	private Date dob;
	public static  SimpleDateFormat sdf;
	static {
		 sdf = new SimpleDateFormat("dd-MM-yyyy");

	}
	
	public Customer(String name, String email, String pass, CustType c, double regAmt,Date dob) {
		super();
		this.name = name;
		this.email = email;
		this.pass = pass;
		this.c = c;
		this.regAmt = regAmt;
		this.dob=dob;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", pass=" + pass + ", c=" + c + ", regAmt=" + regAmt
				+ ", dob=" + sdf.format( dob) + "]";
	}
	
	
}
