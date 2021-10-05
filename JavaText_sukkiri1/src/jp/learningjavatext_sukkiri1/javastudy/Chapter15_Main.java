package jp.learningjavatext_sukkiri1.javastudy;

public class Chapter15_Main {
	public static void main(String[] args) {
		// 文字列を調査する
		String s1 = "スッキリJava";
		String s2 = "Java";
		String s3 = "java";
		
		if (s2.equals(s3)) {
			System.out.println("s2とs3は等しい");
		}
		
		if (s2.equalsIgnoreCase(s3)) {
			System.out.println("s2とs3はケースを区別しなければ等しい");
		}
		System.out.println("s1の長さは" + s1.length() + "です");
		
		if (s1.isEmpty()) {
			System.out.println("s1は空文字です");
		}
		System.out.println();
		
		
		// 文字列を検索する
		// 数字は0から数え始める点に注意する
		// 検索結果がない場合は-1が返される
		String s4 = "Java and JavaScript";
		if (s4.contains("Java")) {
			System.out.println("文字列s4は、Javaを含んでいます");
		}
		
		if (s4.endsWith("Java")) {
			System.out.println("文字列s4は、Javaが末尾にあります");
		}
		
		System.out.println("文字列s4で最初にJavaが登場する位置は" + s4.indexOf("Java"));
		System.out.println("文字列s4で最後にJavaが登場する位置は" + s4.lastIndexOf("Java"));
		System.out.println();
		
		
		// 文字列を切り出す
		String s5 = "Java programming";
		System.out.println("文字列s5の4文字目以降は" + s5.substring(3));		// 4文字目以降全て取り出す
		System.out.println("文字列s5の4~8文字目は" + s5.substring(3, 8));	// 位置指定8の文字は含まれないことに注意
		System.out.println();
		
		// StringBuilderを利用し文字列を1万回連結する
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10000; i++) {
			sb.append("Java");		// バッファにJavaを追加
		}
		String s6 = sb.toString();	// 完成した連結済み文字列を取り出す
		// System.out.println(s6);		// 1万回Javaが表示される
		
		
		
	}

}










