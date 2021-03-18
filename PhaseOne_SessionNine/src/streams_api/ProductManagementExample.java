package streams_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
	int id;
	String name;
	float price;
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}

public class ProductManagementExample {
	
	public static void main(String[] args) {
		
		List<Product> productList = new ArrayList<Product>();
		
		/*
		Product p1 = new Product(101,"RAM", 4000);
		Product p2 = new Product(102,"ROM", 3000);
		Product p3 = new Product(103,"HardDisk", 12000);
		Product p4 = new Product(104,"Scanner", 6000);
		Product p5 = new Product(105,"Printer", 9000);
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		productList.add(p4);
		productList.add(p5);
		*/
		
		productList.add(new Product(101,"RAM", 4000));
		productList.add(new Product(102,"ROM", 3000));
		productList.add(new Product(103,"HardDisk", 12000));
		productList.add(new Product(103,"HardDisk", 12000));
		productList.add(new Product(105,"Printer", 9000));
		
		/*
		List<Product> cheaperProducts = new ArrayList<Product>();
		for (Product product : productList) {
			if(product.price < 5000)
				cheaperProducts.add(product);
		}
		System.out.println(cheaperProducts);
		*/
		
		/*
		List<String> cheaperProducts = productList.stream()
				.filter(p -> p.price < 5000) // Filtering the Records
				.map(p -> p.name) // Fetching Product Names
				.collect(Collectors.toList());	// Collecting Data into List
		System.out.println(cheaperProducts);
		*/
		
		/*
		List<Product> cheaperProducts = productList.stream()
				.filter(p -> p.price < 5000) // Filtering the Records
				.map(p -> p) // Fetching Product Objects
				.collect(Collectors.toList());	// Collecting Data into List
		System.out.println(cheaperProducts);
		*/
		
		/*
		productList.stream()
					.filter(p->p.price < 5000)
					.forEach(p -> System.out.println(p));
		*/
		
		/*
		float sum = 0.0F;
		for (Product product : productList) {
			sum = sum + product.price;
		}
		System.out.println(sum);
		*/
		
		/*
		float total = productList.stream()
				.map(p -> p.price)
				.reduce(0.0F, (sum, price) -> sum + price);
		System.out.println(total);
		*/
		
		float total = productList.stream()
				.map(p -> p.price)
				.reduce(0.0F, Float::sum);
		System.out.println(total);
		
	}

}
