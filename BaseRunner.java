
public class BaseRunner{
	
	public static void main(String[] args){
		
		System.out.println("File running");
		
		testCaller testC= new testCaller();
		//to check if  private variable is accessiable from main class
		//testC.var= 15;
		/*got below Error for private variable 
		BaseRunner.java:10: error: var has private access in testCaller
                testC.var= 15;
		*/
		//to check if default variable is accessiable from main class
		testC.var2=90;
		//success
		
		testCaller testC2= new testCaller(5);
		
		System.out.println("var value "+testC.getVar());
		System.out.println("var value "+testC.var2);
		System.out.println("var2 value "+testC2.getVar());
		System.out.println("File End");

	
	}
	
}

class testCaller{
	
	private int var;
	
	int var2;
	public testCaller(){
		var=10;
	}
	
	public testCaller(int i){
		
		var=i;
	}
	
	public int getVar(){
		return var;
	}
	
}