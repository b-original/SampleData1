
public class BaseRunner{
	
	public static void main(String[] args){
		
		System.out.println("File running");
		
		testCaller testC= new testCaller();
		testCaller testC2= new testCaller(5);
		
		System.out.println("var value "+testC.getVar());
		System.out.println("var2 value "+testC2.getVar());
		System.out.println("File End");

	
	}
	
}

class testCaller{
	
	private int var;
	
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