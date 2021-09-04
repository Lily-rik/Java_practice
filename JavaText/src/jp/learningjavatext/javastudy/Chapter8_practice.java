package jp.learningjavatext.javastudy;

class Chapter8_practice {

	public static void main(String[] args) {
//		1.
//		System.out.println("コマンドライン引数の数は" + args[0] + "個です。");
//		
//		for (String s : args) {
//			System.out.println(s);
//		}
		
//		1. 正答
//		System.out.println("コマンドライン引数の数は" + args.length + "個です。");
//																						 // args.lengthで配列に格納されている値の数を出すことができる
//																						 // (lengthは数を数えるメソッド)
//			for (String s : args) {  // for文で配列に格納された値を順番に全て取り出すことができる
//				System.out.println(s);
//			}
		
//		2.
//		for (int i = 0; i < args.length; i++) {
//			System.out.println(args[i] + "は" + args[i].length() + "文字です。");
//		}
		
//		3.
//import java.util.Scanner;
//import java.io.FileReader;
//
//class Chapter8_4_2_2 {
//
//	public static void main(String[] args) {
//		FileReader fr = null;
//		
//		try {
//			fr = new FileReader("Chapter8_4_2_2.java");
//		} catch (Exception e) {
//			System.out.println("ファイルが見つかりません。");
//			System.exit(0);
//		}
//		
//		Scanner sin = new Scanner(fr);
//		int i = 1;
//		while (sin.hasNext()) {
//			String s = sin.nextLine();
//			System.out.println(s);
//			i++;
//		}
//
//	}
//
//}
		
//		3. 正答
//import java.util.Scanner;
//import java.io.FileReader;
//
//class Chapter8_4_2_2 {
//
//	public static void main(String[] args) {
//		FileReader fr = null;
//		
//		try {
//			fr = new FileReader("Chapter8_4_2_2.java");
//		} catch (Exception e) {
//			System.out.println("ファイルが見つかりません。");
//			System.exit(0);
//		}
//		
//		Scanner sin = new Scanner(fr);
//		int i = 1;
//		while (sin.hasNext()) {
//			String s = sin.nextLine();
//			System.out.println(i + ": " + s);  // 文章の前に数字を入れたいので、文章出力の場所の前に変数iを書く
//			i++;
//		}
//
//	}
//
//}
		
//		4.
//import java.util.Scanner;
//import java.io.FileReader;
//
//class Chapter8_4_2_2 {
//
//	public static void main(String[] args) {
//		FileReader fr = null;
//		
//		try {
//			fr = new FileReader("Renshu84", "Renshu83.java");
//		} catch (Exception e) {
//			System.out.println("ファイルが見つかりません。");
//			System.exit(0);
//		}
//		
//		Scanner sin = new Scanner(fr);
//		int i = 1;
//		while (sin.hasNext()) {
//			String s = sin.nextLine();
//			System.out.println(s);
//			i++;
//		}
//
//	}
//
//}
//		4. 正答
//import java.util.Scanner;
//import java.io.FileReader;
//
//class Chapter8_4_2_2 {
//
//	public static void main(String[] args) {
//		FileReader fr = null;
//		
//		try {
//			fr = new FileReader(args[0]);  // コマンドライン引数からファイル名を指定するため、args[i]の記述となる
//		} catch (Exception e) {
//			System.out.println("ファイルが見つかりません。");
//			System.exit(0);
//		}
//		
//		Scanner sin = new Scanner(fr);
//		int i = 1;
//		while (sin.hasNext()) {
//			String s = sin.nextLine();
//			System.out.println(s);
//			i++;
//		}
//
//	}
//
//}

	}

}
