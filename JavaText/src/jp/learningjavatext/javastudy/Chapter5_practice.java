package jp.learningjavatext.javastudy;

public class Chapter5_practice {
	
	// 1. byte, short, int, long
	
	// 2. ②  // 記号、予約後は使用できない。また、１文字目は文字でなくてはならない決まりがある
	
	//	3. 
	//	class Renshu53 {
	//		public static void main(String[] args) {
	//		int x;
	//		double y;
	//		char z;
	//
	//		x = 1/2;
	//		y = 1.0/2.0;
	//		z = 66;
	//
	//		System.out.println("x = " + x);
	//		System.out.println("y = " + y);		
	//		System.out.println("z = " + z);
	//		}
	//	}
	
	//	3. 正答
	//	class Renshu53 {
	//		public static void main(String[] args) {
	//		int x;
	//		double y;
	//		char z;
	//
	//		x = (int)(1.0/2.0);  // キャスト処理を行い型の変更を行っている
	//		y = (double)1/2;
	//		z = (cher)66;
	//
	//		System.out.println("x = " + x);
	//		System.out.println("y = " + y);		
	//		System.out.println("z = " + z);
	//		}
	//	}
	
	
		
	//	4.
	//	class Renshu54 {
	//		public static void main(String[] args) {
	//			int a, b, c;
	//			
	//			a = 100;
	//			b = 200;
	//			c = 300;
	//			
	//			int tmp1 = a;
	//			int tmp2 = b;
	//			
	//			a = c;
	//			b = tmp1;
	//			c = tmp2;
	//			
	//			System.out.println("a = " + a);
	//			System.out.println("b = " + b);
	//			System.out.println("c = " + c);
	//		}		
	//	}
		
	//	5.
	//	class Renshu55 {
	//		public static void main(String[] args) {
	//			double height, weight, BMI;
	//			
	//			height = 1.75;  // 接尾辞がないためfloatではなくdouble型を使用していることがわかる
	//			weight = 65.0;
	//			BMI = weight / (height * height);
	//			
	//			System.out.print("身長" + height + "m, 体重" + weight + "kgの人の肥満度は、");
	//			System.out.println(BMI + "です。");
	//		}		
	//	}
		
	//	6.
	//	class Renshu56 {
	//		public static void main(String[] args) {
	//			
	//			var height = 1.75;  // varはまとめて宣言できないためひとつずつ行う
	//			var weight = 65.0;
	//			var BMI = weight / (height * height);
	//			
	//			System.out.print("身長" + height + "m, 体重" + weight + "kgの人の肥満度は、");
	//			System.out.println(BMI + "です。");
	//		}		
	//	}
	
}
