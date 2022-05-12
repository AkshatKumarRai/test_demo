package demo1;

import demo1.fan;

public class fan {
	String brand;
	float price;
	String color;

	public static void main(String[] args) {
		fan f1 = new fan();
		f1.brand = "bajaj";
		f1.price = 2999.99f;
		f1.color = "red";

		System.out.println(f1.brand);
		System.out.println(f1.price);
		System.out.println(f1.color);

	}

}
