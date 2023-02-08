import java.util.*;  
import java.util.stream.Collectors;  

class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
	
	public int getId(){
		return this.id;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String toString(){
		return this.name+" "+this.price;
	}
}  

public class JavaStreamRunner{
	
	public static void main(String[] args){
		 List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));
		JavaStreamRunner jsr= new JavaStreamRunner();	
		//System.out.println(jsr.printUsingFilterAndCollect(productsList));
		//jsr.printUsingFilterAndForEach(productsList);
		//System.out.println(jsr.convertToMap(productsList));
		
		
		System.out.println("Use of String.join method to concat two String based on any delimiter");
		String str=String.join("","abc","DEF");
		System.out.println(str);
		System.out.println("There is new class StringJoiner introduced as per Java8 which can also be used for string concatination as well.");

	}


	public List<Product> printUsingFilterAndCollect(List<Product> prodList){
		
		List<Product> productPriceList = prodList.stream().filter(i-> i.price>30000).collect(Collectors.toList());
		System.out.println("Here we are using java8 stream feature to itterate on the product list and collecting product info greater then 30k");
		return productPriceList;
	}
	
	public void printUsingFilterAndForEach(List<Product> prodList){
		prodList.stream().filter(i-> i.price<=30000).forEach(System.out::println);
		
	}
	
	public Map<Integer, String> convertToMap(List<Product> prodList){
		
		System.out.println("Here we are using Collectors.tomap() function to create a map out of given list using Id as key and name as value for key.");
		
		Map<Integer, String> productMap=prodList.stream().collect(Collectors.toMap(Product::getId,Product::getName));
		return productMap;
	}
	
	
	
}