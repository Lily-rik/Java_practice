package jp.learningjavatext_sukkiri1_2.javastudy;

public class Chapter01_Main {
	public static void main(String[] args) {
		// ソースコードの基本構造
		System.out.println("RPG:スッキリ魔王征伐");
		System.out.println("Ver.0.1 by 湊");
		System.out.println("<ただいま鋭意学習・製作中>");
		System.out.println("プログラムを終了します");
		System.out.println();
		
		// 変数宣言の文
		int age;
		age = 30;
		System.out.println(age);
		System.out.println();
		
		// 変数の再代入
		int age2 = 20;
		System.out.println("私の年齢は" + age2);
		age2 = 31;
		System.out.println("・・・いや、本当の年齢は" + age2);
		System.out.println();
		
		// 円周率に定数を利用する
		final double PI = 3.14;		// 定数名には大文字を用いる
		int pie = 5;
		System.out.print("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * PI);
		System.out.println("パイの半径を倍にします");
//		PI = 10;		// PIに値を代入するとコンパイルエラーとなる
		pie = 10;
		System.out.print("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * PI);
		System.out.println();
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
