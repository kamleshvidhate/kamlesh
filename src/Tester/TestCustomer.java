package Tester;

import java.util.Scanner; 
import static utils.Validation.*;
import p1.Customer;
import static p1.Customer.sdf;

public class TestCustomer {

	public static void main(String[] args) {
		
        try(Scanner sc=new Scanner(System.in)){
        	
        	Customer [] cmr=new Customer[10];
    		int counter=0;
        	
        	boolean flag=true;
        	while(flag==true) {
        		
        		System.out.println("1.reg new customer,2.display all customer detail, 3. Exit");
        		
        		int choice=sc.nextInt();
        		try {
        			switch(choice) {
        			case 1: if(counter<cmr.length) {
        				System.out.println("enterString name, String email, String pass, CustType c, double regAmt,Date dob" );
        				Customer c4 =new Customer((sc.next()),checkEmail(sc.next()), (sc.next()), checkenum(sc.next().toUpperCase()),(checkregAmt(sc.nextDouble())) ,sdf.parse(sc.next()));
        				 cmr[counter++] = c4;
        				 
        			         }
        				
        				
        				      break;
        			case 2:    for(Customer i:cmr) {
        				       if(i!=null)
        				          System.out.println(i);
        			}
        			 System.out.println("customer registration successful");
        				       break;
        			case 3:   flag=false;
        				       break;
        			
        			
        			
        			}
        		}catch(Exception e)
        		{
        			System.out.println(e);
        		}
       
        		
        	}
        	
        	
        	
        	
        }
	}

	

}
