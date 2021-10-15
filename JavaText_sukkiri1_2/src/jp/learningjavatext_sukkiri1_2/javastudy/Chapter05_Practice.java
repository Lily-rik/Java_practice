package jp.learningjavatext_sukkiri1_2.javastudy;

public class Chapter05_Practice {

	public static void main(String[] args) {
// 5-1
		introduceOneself();
		System.out.println();
		
		
// 5-2
		email("テストメール", "test@test.com", "こんにちは、テストメールです。");
		System.out.println();
		
// 解答(自分の回答も間違いではないが、変数を用いた方がコードがまとまりよく、汎用性も高い)
		String title = "テストメール";
		String address = "test@test.com";
		String text = "こんにちは、テストメールです。";
		email(title, address, text);
		System.out.println();
		
		
// 5-3
		// 5-2と同様の解説
		email("test2.test.com", "こんばんは、2回目のテストメールです。");
		System.out.println();
		
		
// 5-4
		double triangleArea = calcTriangleArea(10.0, 5.0);
		System.out.println("三角形の底辺の長さが10.0cm、高さが5.0cmの場合、面積は、" + triangleArea + "cm2");
		System.out.println();
		
		double circleArea = calcCircleArea(5.0);
		System.out.println("円の半径が5.0cmの場合、面積は" + circleArea + "cm2");
		
	}
	
	
// 5-1
	public static void introduceOneself() {
		String name = "ミライ";
		int age = 21;
		double height = 155.5;
		char eto = '卯';
		
		System.out.println("自己紹介をします");
		System.out.println("私の名前は" + name + "です");
		System.out.println("年齢は" + age + "歳で、身長は" + height + "cmです");
		System.out.println("干支は" + eto + "です");
		System.out.println("よろしくお願いします");
	}
	
	
// 5-2
	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}
	
	
// 5-3
	public static void email(String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：無題");
		System.out.println("本文：" + text);
	}
	
	
// 5-4
	public static double calcTriangleArea(double bottom, double height) {
		double area = bottom * height / 2;
		return area;
	}
	
	public static double calcCircleArea(double radius) {
		double area = radius * radius * 3.14;
		return area;
	}

}
