import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Predicate;


public class FunctionTest{

	public static void main(String[] agrs){
	
		System.out.println("Here is an example of function Interface type with anonymous and lambda expression.");
		PaisaDouble pD=new PaisaDouble(){
			public float doubleIt(float inr){
				return inr*inr;
			}
			
		};
		System.out.println("----------------Function Interface example-----------------------------");
		System.out.println("here it is example of Paisa double value 10 with anonymous class "+pD.doubleIt(10));
		//Here created function Interface type for same withOut requirement of external Interface
		Function<Integer,Integer> paisaTriple=(inr)-> inr*inr*inr;
	
		System.out.println("Here it is with lambda expression of PaisaTriple for value 11 "+paisaTriple.apply(11));
		System.out.println("----------------Consumer Interface example-----------------------------");
		Consumer<String> con=(i)->System.out.println("Consumer interface example welcomes "+i);
		
		con.accept("Bhavya");
		con.accept("another user :)");
		
		System.out.println("----------------Supplier Interface example-----------------------------");
		Supplier<Double> randValue=()->Math.ceil(Math.random()*10);
		for(int i=0;i<5;i++){
			System.out.println("Each time get a random value "+randValue.get());
		}
		System.out.println("----------------Predicate Interface example-----------------------------");
		Predicate <Integer> predicateIsTrue=(i)-> i%2==0;
		for(int i=0;i<5;i++){
			System.out.println("Each time check if value is Even "+predicateIsTrue.test(i));
		}
		
	}
	
	
}


interface PaisaDouble{
	
	public float doubleIt(float inr);
}