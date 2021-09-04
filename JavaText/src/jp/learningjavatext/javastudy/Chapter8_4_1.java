package jp.learningjavatext.javastudy;

import java.util.Scanner;

class Chapter8_4_1 {

	public static void main(String[] args) {
		// double型の値の読み込み
		Scanner sin = new Scanner(System.in);  // newはクラスを元にオブジェクトを生成する（インスタンス化）
																					 // sinは名前だけで中身がないため、newで変数を入れる箱を作ってあげるようなイメージ、、？
																					 // Stringクラスは例外的にnewを使用せずにインスタンス化することができるが、
																					 // 型以外のものは全てnewが必要となる
		double sincho, hyojunTaiju;
		sincho = sin.nextDouble();
		hyojunTaiju = 22 * sincho * sincho;
		System.out.println("身長" + sincho + "mの人の標準体重は" + hyojunTaiju + "kgです。");		
		
	}

}
