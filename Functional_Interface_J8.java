
/*
-:Functional Interfaces in java :-

Funtional Interfaces are interfaces which have only single abstract method (only single functionality to exhibit)
they can have multiple no. of default and static methods only one abstract method.
Functional interfaces also known as Single Abstract Method Interfaces(SAM interfaces).
these Interfaces can be annotated with @FunctionalInterface.

@FunctionalInterface annotation is used to indicate the compiler that interface defined below is SAM interface and if there are more then one abstract methods are present, 
the compiler flags an ‘Unexpected @FunctionalInterface annotation’
Note:- its not mandatory to use annotation with functional interface.

Runnable, ActionListener, Comparable, callable are some of the examples of functional interfaces.

prior to Java 8 we use to create anonymous innner class objects to implement these interfaces

e.g.
*/
public class testClass{

	public static void main(String[] args){
		
		// create anonymous inner class object with runnable interface
        new Thread(new Runnable() {
            @Override public void run()
            {
				System.out.println("New thread created");
            }
        }).start();
		
	}

} 

/*
	from java 8 onwards we can use Lambda Expression to create objects from functional interfaces
	e.g.
*/
public class testClass{

	public static void main(String[] args){
		
		// create anonymous inner class object with runnable interface
		//lambda expression to create the object below created thread object have expression runnable interface with implementation for run method using lambda expression.
	new Thread(()->{System.out.println("New thread created");
        }).start();
	}
}

/*
	from java8 there are 4 main type of functional interfaces.
	Function-> Bi-Function,Unary operator, Binary operator
	predicate->Bi-Predicate
	Supplier
	consumer-> Bi-Consumer
	
	Function Interface:- is type of functional interface that recieve one argument and returns a value after processing 
	apply is the method implementation for function interface
	
*/

public class TestFunction{
	
	static String welcomeCall(String str){
		
		return "Hello "+str;
	}
	
	public static void main(String[] args){
		//creating function object
		Function<String,String> funCall=TestFunction::welcomeCall;
		System.out.println(funCall.apply("Bhavya Varshney!!"));
		//output : Hello Bhavya Varshney!!
	}
	
}
