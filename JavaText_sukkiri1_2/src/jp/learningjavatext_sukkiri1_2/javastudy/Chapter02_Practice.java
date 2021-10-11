package jp.learningjavatext_sukkiri1_2.javastudy;

public class Chapter02_Practice {
	public static void main(String[] args) {
		
//	2-1
		int x = 5;
		int y = 10;
		int ans = x + y;
		System.out.println("x+yは" + ans);
		System.out.println();
		
		// 上記回答で間違いではないが、問題の間違っていた箇所としては、
		// String ans = "x+yは" + x + y;
		// と記述されていることによって、優先順位が等しいため左からの計算となり、
		// 先に"x+yは"+xが計算され、xが文字列に変換されてしまったこと
		// さらにその結果+yとなるのでyも文字列となり、表示が510となった
		// この解決方法としては、x + yを()で括ることによって、先に数値としての計算を行い、
		// その後文字列"x+yはと結合させ、計算結果を文字列として表示させる
		// よって、String ans = "x+yは" + (x + y);
		// 表示は間違っていないけど。問題文の意図的には△、、、？
		
		
//	2-3
		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
		String ageString = new java.util.Scanner(System.in).nextLine();
		int age = Integer.parseInt(ageString);
		int fortune = new java.util.Random().nextInt(4);
		fortune++;
		System.out.println("占いの結果が出ました！");
		System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
		System.out.println("1:大吉、2:中吉、3:吉、4:凶");
		System.out.println();
		
	}

}


//	2-2
//		②、④、⑤、⑦
