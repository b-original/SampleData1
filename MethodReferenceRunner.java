/*
	* This page contains the information related to Method Reference functionality provided by java8
	* Genrally lambda expression uses to remove the creation of additional class using interface
	* whereas it only calls the exisiting method in intrface by providing implemetaion as well
	* In case of Method Reference we are doing the exactly same thing it enables us to call method directly by name
	* lets see below Example :-
*/

import java.util.List;
import java.util.ArrayList;
import java.util.stream.*;
import java.util.Arrays;
import java.time.chrono.IsoChronology;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.Period;

public class MethodReferenceRunner{
	
	public static void main(String[] args){
		List<Person> roaster= Person.createRoster();
		
		Person[] personList= roaster.toArray(new Person[roaster.size()]);
		Arrays.sort(personList,Person::compareByAge);
		
		for(Person p : personList){
			p.printPerson();
		}
	}
}

class Person{
	
	private String name;
	private LocalDate birthday;
	
	
	public Person(String nameArg, LocalDate birthdayArg){
		this.name=nameArg;
		this.birthday=birthdayArg;
	}
	
	public String getName(){
		return this.name;
	}
	
    public int getAge() {
        return birthday
            .until(IsoChronology.INSTANCE.dateNow())
            .getYears();
    }

    public void printPerson() {
      System.out.println(name + ", " + this.getAge());
    }
	
	 public LocalDate getBirthday() {
        return birthday;
    }
	
	public static int compareByAge(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
    }

	public static List<Person> createRoster() {
        
        List<Person> roster = new ArrayList<>();
        roster.add(
            new Person(
            "Fred",
            IsoChronology.INSTANCE.date(1980, 6, 20)));
        roster.add(
            new Person(
            "Jane",
            IsoChronology.INSTANCE.date(1990, 7, 15)));
        roster.add(
            new Person(
            "George",
            IsoChronology.INSTANCE.date(1991, 8, 13)));
        roster.add(
            new Person(
            "Bob",
            IsoChronology.INSTANCE.date(2000, 9, 12)));
        
        return roster;
    }
	
	@Override
	public String toString(){
		return this.name+" "+getAge() ;
	}

}

/*
	*The Method reference is semantically the same as the lambda expression.
	*There are four ways to implement method Reference 
		1.Reference to a static method.
			ContainingClass::staticMethodName
			Person::compareByAge
		2.Reference to an instance method of a particular object
			containingObject::instanceMethodName
			e.g. User usr= new User();
				 usr::toString	
		3.Reference to an instance method of an arbitrary object of a particular type
			ContainingType::methodName
			e.g. String::compareToIgnoreCase
				 String::concat
		4.Reference to a constructor
			ClassName::new
			e.g. HashSet::new
	
*/
