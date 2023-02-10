import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.*;


public class StreamTest{

	List<Student> students ;
	
	public static void main(String[] args){
		
		StreamTest st= new StreamTest();
		//st.printVariousStreamOption(st);
	Integer[] intArr= {1,2,3,4,5,6,7,8,9};
		Double avgValue=Arrays.asList(intArr).stream().mapToInt(i->i.intValue()).average().getAsDouble();
		System.out.println(avgValue);
	}
	
	public void printVariousStreamOption(StreamTest st){
		st.dummyStudentData();
		System.out.println("Student Data: "+st.students.toString());
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("1. Get student with exact match name \"jayesh\"  function used: filter and findfirst ");
		Optional<Student> result1= st.students.stream().filter(i->i.getName().equals("Jayesh")).findFirst();
		System.out.println(result1.toString());
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("Get  student with matching address \"1235\" function used: filter and findfirst");
		Optional<Student> result2= st.students.stream().filter(i-> i.getAddress().getZipcode().equals("1235")).findFirst();
		System.out.println(result2.toString());
		
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("Get all students having mobile numbers 3333 function used: filter , anymatch,collect");
		List<Student> result3= st.students.stream().filter(i-> i.getMobileNumbers().stream().anyMatch(x->x.getNumber().equals("3333"))).collect(Collectors.toList());
		System.out.println(result3.toString());
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("Get all student having mobile number 1233 and 1234 function used: filter ,allMatch,collect");
		List<Student> result4= st.students.stream().filter(
								i-> i.getMobileNumbers().stream()
								.allMatch(x->x.getNumber().equals("1233") || x.getNumber().equals("1234")))
								.collect(Collectors.toList());
		System.out.println(result4.toString());
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("Convert List<Student> to List<String> of student name function used: map and collect");
		List<String> result5= st.students.stream().map(i->i.getName()).collect(Collectors.toList());
		System.out.println(result5.toString());
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("Change the case of List<String> function used: map,collect,forEach and method Reference");
		Arrays.asList("Bhavya","Kuldeep","Khushboo","Manish","Mukul","Apoorva").stream().map(String::toUpperCase).forEach(System.out::println); 
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("Sort List<String>");
		Arrays.asList("Bhavya","Kuldeep","Khushboo","Manish","Mukul","Apoorva").stream().sorted().forEach(System.out::println); 
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("Conditionally apply Filter condition, say if flag is enabled then");
		boolean condition= true;
		Stream<Student> nameList=st.students.stream().filter(i->i.getName().startsWith("J"));
		if(condition){
			nameList=nameList.sorted(Comparator.comparing(Student::getName));
			nameList.forEach(System.out::println);
		}
		
	}


	public void dummyStudentData(){
	
		 Student student1 = new Student(
            "Jayesh",
            20,
            new Address("1234"),
            Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));
 
        Student student2 = new Student(
            "Khyati",
            20,
            new Address("1235"),
            Arrays.asList(new MobileNumber("1111"), new MobileNumber("3333"), new MobileNumber("1233")));
 
        Student student3 = new Student(
            "Jason",
            20,
            new Address("1236"),
            Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")));
	
			students= Arrays.asList(student1, student2, student3);
	}

}
class TempStudent {
    public String name;
    public int age;
    public Address address;
    public List<MobileNumber> mobileNumbers;
 
    public TempStudent(String name, int age, Address address, List<MobileNumber> mobileNumbers) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.mobileNumbers = mobileNumbers;
    }
}
 
class Student{
    private String name;
    private int age;
    private Address address;
    private List<MobileNumber> mobileNumbers;
 
    public Student(String name, int age, Address address, List<MobileNumber> mobileNumbers) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.mobileNumbers = mobileNumbers;
    }
 
    public String getName() {
        return name;
    }
 
    public int getAge() {
        return age;
    }
 
    public Address getAddress() {
        return address;
    }
 
    public List<MobileNumber> getMobileNumbers() {
        return mobileNumbers;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
 
    public void setAddress(Address address) {
        this.address = address;
    }
 
    public void setMobileNumbers(List<MobileNumber> mobileNumbers) {
        this.mobileNumbers = mobileNumbers;
    }
 
    @Override
    public String toString() {
        return "Student{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", address=" + address +
            ", mobileNumbers=" + mobileNumbers +
            '}';
    }
}
 
class Address{
    private String zipcode;
 
    public Address(String zipcode) {
        this.zipcode = zipcode;
    }
 
    public String getZipcode() {
        return zipcode;
    }
 
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
	
	@Override
	public String toString(){
		return "Address Detail: "+getZipcode();
	}
}
 
class MobileNumber{
    private String number;
 
    public MobileNumber(String number) {
        this.number = number;
    }
 
    public String getNumber() {
        return number;
    }
 
    public void setNumber(String number) {
        this.number = number;
    }
	
	@Override
	public String toString(){
		return "Mobile Number : "+getNumber();
	}
}