package javaCamp2021_day2;

public class Product {
	public Product() {
		System.out.println("ben calistim");
	}
		public Product(int id,String name,double unitPrice,String detail) {
			System.out.println("ben calistim");
			this.id=id;
			this.name=name;
			this.unitPrice=unitPrice;
			this.detail=detail;
			
		}
		// burada birden fazla constructor var. AMA HER ZAMAN BÝR TANE CONSTRUCTOR CALÝSÝR.
		// TODO Auto-generated method stub
		int id;
		String name;
		double unitPrice;
		String detail;
}
