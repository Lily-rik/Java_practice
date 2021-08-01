package jp.learningdesign.javastudy;

public class CommonMultiple2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 2または3の倍数を、1から50未満の範囲で表示するプログラム
		int i = 1;
		while (i < 50) {
			if ((i % 2 == 0) || (i % 3 == 0)) {
				// 論理和
				System.out.println(i);
			}
			i++; // インクリメント演算子
		}
	}

}
