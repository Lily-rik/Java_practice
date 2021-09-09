package jp.learningjavatext_sukkiri1.javastudy;

public class Chapter5_practice {

	public static void main(String[] args) {
//	1.
		introduceOneself();

		
//	2.
		email("こんにちは", "hello.gmail.com", "テストメールです。届いていますか？");
		
//	回答例　変数を用いた方がすっきりして見やすいかも、、、？
		String title = "こんにちは";
		String address = "hello.gmail.com";
		String text = "テストメールです。届いていますか？";
		email(title, address, text);
		
		
//	3.
		email("hello.gmail.com", "テストメールです。届いていますか？");
		
		
//	4.
		double x = 10.0;
		double y = 5.0;
		double triangleArea = calcTriangleArea(x, y);
		System.out.println("三角形の底辺が" + x + "cm、高さが" + y + "cmの場合、面積は" + triangleArea + "cm2");
		System.out.println();
		
		double r = 5.0;
		double circleArea = calcCircleArea(r);
		System.out.println("円の半径が" + r + "cmの場合、面積は" + circleArea + "cm2");
		System.out.println();

	}
	
	
//	1.
	public static void introduceOneself() {
		String name = "みらい";
		int age = 20;
		double height = 155.0;
		char animal = '卯';
		
		System.out.println("自己紹介をします。");
		System.out.println("私の名前は、" + name + "です。");
		System.out.println("年齢は" + age + "歳、身長は" + height + "cmです。");
		System.out.println("私の干支は、" + animal + "です。");
		System.out.println();
	}
	
	
//	2.
	public static void email(String title,  String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
		System.out.println();
	}
	
	
//	3.
	public static void email(String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：無題");
		System.out.println("本文：" + text);
		System.out.println();
	}
	
	
//	4.
	public static double calcTriangleArea(double bottom, double height) {
		double triangleArea = (bottom * height) / 2;
		return triangleArea;
	}
	
	public static double calcCircleArea(double radius) {
		double circleArea = radius * radius * 3.14;
		return circleArea;
	}	

}
