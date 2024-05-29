package StreamFilter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product
{
	int id;
	String name;
	double price;
	
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}


public class FourFilter {

	public static void main(String[] args) {
		List<Product> ProductList = new ArrayList<Product>();
		List<Product> result;
		
		ProductList.add(new Product(1, "Mouse", 456.20));
		ProductList.add(new Product(2, "HP-Laptop", 24000));
		ProductList.add(new Product(3, "Apple", 90000));
		ProductList.add(new Product(4, "Lenova", 28000));
		ProductList.add(new Product(5, "Sony", 23000));
		
		//ProductList.stream().filter(ps->ps.price>25000).forEach(pr->System.out.println(pr.price));
		
		result = ProductList.stream().filter(ps->ps.price>25000).collect(Collectors.toList());
		System.out.println((result));
		
		ProductList.stream().filter(m->m.price>20000).forEach(n-> System.out.println(n.price));
		
	}

}
