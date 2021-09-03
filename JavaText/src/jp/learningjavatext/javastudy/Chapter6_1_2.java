package jp.learningjavatext.javastudy;

class Chapter6_1_2 {
	public static void main(String[] args) {
		// if文
		double height, weight, fat;
		
		height = 1.75;
		weight = 22 * height * height;
		fat = (100 - weight) / weight * 100;
		
		System.out.println("あなたの肥満率は" + (int)fat + "%です。");
		
		if (fat >= 20) {
			System.out.println("あなたは太りすぎです。");
		}
		
		// if文にboolean型を使用したプログラム
		double height2, weight2, fat2;
		boolean judge;  // 太りすぎを判定する変数judge
		
		judge = false;  // 変数judgeを初期化
		height2 = 1.75;
		weight2 = 22 * height2 * height2;
		fat2 = (100 - weight2) / weight2 * 100;
		
		System.out.println("あなたの肥満率は" + (int)fat2 + "%です。");		
		
		if (fat2 >= 20) {  // 肥満度20以上の時trueになる条件を追加
			judge = true;
		}
		if (judge) {  // judgeがtrueの時下記の文章が表示されるようになる
									// 関係演算子を用いてif(judge == true)と表現することも可能
			System.out.println("あなたは太りすぎです。");
		}
	}
}