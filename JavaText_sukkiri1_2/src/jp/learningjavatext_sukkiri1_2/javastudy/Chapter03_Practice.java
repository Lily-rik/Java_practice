package jp.learningjavatext_sukkiri1_2.javastudy;

public class Chapter03_Practice {

	public static void main(String[] args) {
//	3-3
		int isHungry = 1;
		String food = "お寿司";
		
		System.out.println("こんにちは");
		if (isHungry == 0) {
			System.out.println("お腹がいっぱいです");
		} else {
			System.out.println("はらぺこです");
			System.out.println(food + "をいただきます");
		}
		System.out.println("ごちそうさまです");
		System.out.println();
		
		// 三項演算子を用いたプログラム
		// 自分の回答
		//		isHungry == 0 ? "お腹がいっぱいです" : "はらぺこです";		// 出力の引数として記述する
		// 解答																										// 中身単体では使用できない
		System.out.println(isHungry == 0 ? "お腹がいっぱいです" : "はらぺこです");
		System.out.println();
		
		
//	3-4
		// elseの後に{}がないため、条件分岐は1行のみで終了となる
		// よってその後の寝ますは順次の処理で、true or false関係なく出力される
		// そのため、ブロックが複数行になるときは{}で加工必要がある
		boolean tenki = true;
		if (tenki == true) {
			System.out.println("洗濯をします");
			System.out.println("散歩に行きます");
		} else {
			System.out.println("DVDを見ます");
			System.out.println("寝ます");
		}
		System.out.println();
		
		
//	3-4
		System.out.print("[メニュー] 1:検索 2:登録 3:削除 4:変更 > ");
		int selected = new java.util.Scanner(System.in).nextInt();
		switch (selected) {
			case 1:
				System.out.println("検索します");
				break;
			case 2:
				System.out.println("登録します");
				break;
			case 3:
				System.out.println("削除します");
				break;
			case 4:
				System.out.println("変更します");
				break;
		}
		System.out.println();
		
		
//	3-6
		System.out.println("【数あてゲーム】");
		int ans = new java.util.Random().nextInt(10);
		for (int i = 0; i < 5; i++) {
			System.out.println("0〜9の数字を入力してください");
			int num = new java.util.Scanner(System.in).nextInt();
			if (num == ans) {
				System.out.println("アタリ！");
				break;
			} else {
				System.out.println("違います");
			}
		}
		System.out.println("ゲームを終了します");
		System.out.println();

	}

}


//	3-1
//		① weight == 60
//		② (age1 + age2) * 2 > 60
//		③ age % 2 == 1
//		④ name.equals('湊')


//	3-2
//		C,D,E
