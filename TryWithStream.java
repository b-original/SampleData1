import java.util.*;

public class TryWithStream{

	private int intVar;
	private String stringVar;
	
	public void setIntVar(int value){
		this.intVar=value;
	}
	
	public void setStringVar(String str){
		this.stringVar=str;
	}
	
	public int getIntVar(){
		return intVar;
	}
	
	public String getStringVar(){
		return stringVar;
	}

	public TryWithStream(){
		this.stringVar="dummy";
		this.intVar=0;
	}
	
	public void usageOfFilterInStream(){
		
		/*
		Things to understand that Usage of Integer wrapper class instead of primitive int for Array 
		otherwise got the below error with primitive value 
		:-> 	TryWithStream.java:32: error: bad operand types for binary operator '%'
                long countOfEven= Arrays.asList(intArr).stream().filter(i-> i%2 == 0).count();
                                                                             ^
				first type:  int[]
				second type: int
				1 error
		*/
		
		Integer[] intArr= new Integer[]{1,2,3,4,5,6,7,8,9};
		long countOfEven= Arrays.asList(intArr).stream().filter(i-> i%2 == 0).count();
		
		System.out.println("total no. of even integers "+countOfEven); //success Result:- total no. of even integers 4
		
	}
	
	

}