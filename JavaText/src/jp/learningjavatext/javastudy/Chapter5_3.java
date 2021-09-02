package jp.learningjavatext.javastudy;

class Chapter5_3 {
	public static void main(String[] args) {
		// 整数型変数
		// 整数を扱う変数の型には、byte,short,int,longの4種類ある
		// 特に制約がない場合はintを用いる
		
		int thisyear, year, age;  // -2,147,483,648~2,147,483,647
		
		thisyear = 2020;
		age = 100;
		year = thisyear - age;
		
		System.out.println("あなたは西暦" + year + "年生まれです。");
		
		
		byte age2;  // -128~127
		age2 = 52 - 128;  // 年齢から-128し、最後に+128することで、255歳までの年齢を扱うことができるようになった
		System.out.println("あなたは" + (age2 + 128) + "歳です。");
		
		
		short age3;  // -32,768~32,767
		age3 = 300;
		System.out.println("この本の樹齢は" + age3 + "歳です。");
		
		
		int age4;
		long time;  // -9,223,372,036,854,775,808~9,223,372,036,854,775,807
		
		age4 = 52;
		time = age4 * 365 * 24 * 60 * 60;
		
		System.out.println("あなたが生まれてから" + age4 + "年経ちました。");
		System.out.println("これを秒で表すと" + time + "秒です。");
	}

}
