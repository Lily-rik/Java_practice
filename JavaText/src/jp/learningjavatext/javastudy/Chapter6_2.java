package jp.learningjavatext.javastudy;

class Chapter6_2 {

	public static void main(String[] args) {
		// swith文
		
		// if文で表すと...
		int a = 1;
		
		if (a == 1) {
			System.out.println("Good morning.");
		}
		if (a == 2) {
			System.out.println("Good afternoon.");
		}
		if (a == 3) {
			System.out.println("Good evening.");
		}

		// switch文で置き換えると...
		switch(a) {
			// case1の場合はcase2,case3の処理も行われるため全ての文が表示される
			case 1: System.out.println("Good morning.");
			case 2: System.out.println("Good afternoon.");
			case 3: System.out.println("Good evening.");
		}
		
		// 上記のif文と同じ処理になるように書き換えると...
		switch(a) {
			case 1: System.out.println("Good morning.");
				break;  // breakによってここで処理が終わる
			case 2: System.out.println("Good afternoon.");
				break;
			case 3: System.out.println("Good evening.");  // 最後の行はそれ以降に処理はないためbreakは不要
		}
		
		// アロー構文 [->]
		// アロー[->]を用いるとそれ以降のcase処理には移らないため、breakは記述しなくてよい
		switch(a) {
			// breakなしで１行ずつの処理になる
			// ひとつのswitch文の中に:と->を混在させることはできないため注意！
			case 1 -> System.out.println("Good morning.");
			case 2 -> System.out.println("Good afternoon.");
			case 3 -> System.out.println("Good evening.");
		}
		
		
		// switch式
		// switchは文だけでなく、式として判定に応じた値を返すことも可能
		// yieldの後に値や式を記述すると、該当するcaseでその値を返す
		String message = switch(a) {
			case 1: yield "Good morning.";
			case 2: yield "Good afternoon.";
			case 3: yield "Good evening.";
			default: yield "Good night";
		};
		
		System.out.println(message);
		
		
		// switch式をアロー構文で表すと...
		String message2 = switch(a) {
			case 1 -> "Good morning.";
			case 2 -> "Good afternoon.";
			case 3 -> "Good evening.";
			default -> "Good night";
		};
	
		System.out.println(message2);
	}
}