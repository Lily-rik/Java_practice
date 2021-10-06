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
		
		
		// 正規表現を用いた処理の一例
		// splitメソッド：文字列の分割
		String s7 = "abc,def:ghi";
		String[] words = s7.split("[,:]");
		for (String w : words) {
			System.out.print(w + "->");
		}
		System.out.println();
		System.out.println();
		
		// replaceAllメソッド：文字列の置換
		String w = s7.replaceAll("[beh]","x");
		System.out.println(w);
		System.out.println();
		
		
		// formatメソッド：整形した文字列を組み立てる
		Chapter15_Hero hero = new Chapter15_Hero();
		hero.setName("minato");
		hero.setJob("hero");
		hero.setGold(2800);
		
		final String FORMAT = "%-9s %-13s 所持金%,6d";
		String s8 = String.format(FORMAT, hero.getName(), hero.getJob(), hero.getGold());
		System.out.println(s8);
		System.out.println();
		
		// formatメソッドを用いて入力と同時に出力を行う場合
		System.out.printf("製造番号%s-%02d", "SJV", 3);
		System.out.println();
		
	}

}










