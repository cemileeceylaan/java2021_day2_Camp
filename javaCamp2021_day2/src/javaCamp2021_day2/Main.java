package javaCamp2021_day2;

import java2021_ders2.Category;
import java2021_ders2.Product;
import java2021_ders2.ProductManager;

public class Main {
	public class Main {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Product product1 = new Product(1,"Lenovo V14",15000,"16 GB RAM"); 
			// product turunde product1 oluþturdu.(referans olusturma)
			
			
			Product product2 = new Product();
			
			product2.id=1;
			product2.name="Lenovo V15";
			product2.unitPrice=16000;
			product2.detail="15 GB RAM";
			
			Product product3 = new Product();
			product3.id=1;
			product3.name="HP 5";
			product3.unitPrice=10000;
			product3.detail="8 GB RAM";
			
			
			
			Product[] products = {product1,product2,product3};
			
			System.out.println(products.length);
			for (Product product : products) {
				// Product: tip
				// product: nickname
				// : products : name of array
				System.out.println(product.name);
			}
			
			Category category1 = new Category();
			category1.id=1;
			category1.name="bilgisayar";
			
			Category category2=new Category();
			category2.id=2;
			category2.name="ev/bahce";
			
			ProductManager productManager= new ProductManager();
			productManager.addToCart(product1);
			productManager.addToCart(product2);
			productManager.addToCart(product3);
			
			
			
		}
		

	}

}
