public class TestStaticAndDefault{
	
	public static void main(String[] args){
		
		Java8Interface j8i= ()->"anonymous implementation";
		Java8Classs j8c= new Java8Classs();

		System.out.println("default method implementation "+j8i.callDefault());
		
		System.out.println("Method implementation call from class with values "+ j8c.testMethod()+" and "+j8c.callDefault());
	}
}

interface Java8Interface{
	
	public String testMethod();
	
	/*
	Static methods can not be overridden by an implementing classes. 
	*/
	static String callStatic(){
		return "call from static method";
	}
	
	String str=callStatic();
	
	//default methods can be overridden by a implementing classes 
	
	public default String callDefault(){
		
		return "call from default and "+str;
	}
	
} 

class Java8Classs implements Java8Interface{
	
	public String testMethod(){
		return "i am an overridden call.";
	}
	
	public  String callDefault(){
		//genrally overridding the default method situation occurs in case of diamond problem in java here you can call the super.Interface.default method to call teh required one 
		return "this is an overridden Default method with same "+Java8Interface.callStatic();
	}
}