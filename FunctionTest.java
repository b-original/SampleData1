import java.util.function.Function;

public class FunctionTest{

	public static void main(String[] agrs){
	
		System.out.println("Here is an example of function Interface type with anonymous and lambda expression.");
		PaisaDouble pD=new PaisaDouble(){
			public float doubleIt(float inr){
				return inr*inr;
			}
			
		};
		System.out.println("here it is example of Paisa double value 10 with anonymous class "+pD.doubleIt(10));
	
		
	//Here created function Interface type for same withOut requirement of external Interface
		Function<Integer,Integer> paisaTriple=(inr)-> inr*inr*inr;
	
		System.out.println("Here it is with lambda expression of PaisaTriple for value 11 "+paisaTriple.apply(11));
	}
}


interface PaisaDouble{
	
	public float doubleIt(float inr);
}