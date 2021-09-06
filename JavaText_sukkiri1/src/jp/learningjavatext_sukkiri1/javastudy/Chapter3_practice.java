package jp.learningjavatext_sukkiri1.javastudy;

class Chapter3_practice {

//	1.
//		① weight == 60;
//		② (age1 + age2) * 2 > 60;
//		③ age % 2 == 1
//		④ name.equals("湊")
		
	
//	2.
//		C,D,E
		
	
//	3.	
//	public static void main(String[] args) {	
//		int isHungry = 0;
//		String food = "お寿司";
//		
//		System.out.println("こんにちは");
//		
//		if (isHungry == 0 ) {
//			System.out.println("お腹がいっぱいです");
//		} else {
//			System.out.println("はらぺこです");
//			System.out.println(food + "をいただきます");
//		}
//		System.out.println("ごちそうさまでした");
//	}
	
//	3.	正答、解説
//	public static void main(String[] args) {	
//		int isHungry = 0;
//		String food = "お寿司";
//		
//		System.out.println("こんにちは");
//		
			// 三項条件演算子を使用し、下記のような書き方をすることもできる
//		System.out.println(isHungry == 0 ? "お腹がいっぱいです" : "はらぺこです");
//		
	  	// もしisHungryが空腹を示すならばという条件のため、上記文のelseではなく、
			// (isHungry == 1)という条件式を作らなければならない
			// (elseであると(isHungry == 3)などの場合も含まれてしまうため)
//		if (isHungry == 1) {
//			System.out.println(food + "をいただきます");
//		}
//	
//		System.out.println("ごちそうさまでした");
//	}
	
	
// 4.
//	public static void main(String[] args) {
//		boolean tenki = true;
//		if (tenki == true) {
//			System.out.println("洗濯をします");
//			System.out.println("散歩に行きます");
//		} else	// 1行の時は{}で囲わなくてもよい決まりがある
//			System.out.println("DVDを見ます");
//	
//		boolean tenki2 = false;
//		if (tenki2 == true) {
//			System.out.println("洗濯をします");
//			System.out.println("散歩に行きます");
//		} else {	// 2行以上の時は{}で囲う必要がある
//			System.out.println("DVDを見ます");
//			System.out.println("寝ます");
//		}
//	}
	
	
//	5.
//	public static void main(String[] args) {
//		System.out.print("[メニュー] 1:検索 2:登録 3:削除 4:変更 > ");
//		int selected = new java.util.Scanner(System.in).nextInt();
//		
//		switch (selected) {
//			case 1:
//				System.out.println("検索します");
//				break;
//			case 2:
//				System.out.println("登録します");
//				break;
//			case 3:
//				System.out.println("削除します");
//				break;
//			case 4:
//				System.out.println("変更します");
//		}
//	}
				
	
//	6.
//	public static void main(String[] args) {
//		System.out.println("【数あてゲーム】");
//		int ans = new java.util.Random().nextInt(10);
//		
//		for (int i = 0; i < 5; i++) {
//			System.out.println("0〜9の数字を入力してください");
//			int num = new java.util.Scanner(System.in).nextInt();
//			
//			if (num == ans) {
//				System.out.println("アタリ！");
//				break;
//			} else {
//				System.out.println("違います");
//			}
//		}
//		System.out.println("ゲームを終了します");
//	}

}
