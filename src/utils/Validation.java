package utils;


import p1.CustType;
import p1.CustomException;
public class Validation {
    
	public static String checkEmail(String email)throws CustomException {
		
		if(email.contains("@") && email.endsWith(".com")) 
		return email;
		throw new CustomException ("invalid email");
		
	}
	
	

	public static CustType checkenum(String  c1)throws CustomException {
		
		return  CustType.valueOf(c1.toUpperCase());

	}
	
	
	public static double checkregAmt(double regAmt)throws CustomException {
		
		if(regAmt<=1000) 
			
			return regAmt;
		
		throw new CustomException ("invalid reg amount");
	}
}