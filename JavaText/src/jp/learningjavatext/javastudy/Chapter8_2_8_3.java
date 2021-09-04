package jp.learningjavatext.javastudy;

// importは、パッケージと呼ばれるJavaの関連するいくつかのプログラムを集めたものをプログラム中に取り込むための命令
// 「自分の作成しているプログラムだけでは不十分なため、外部から必要な部品を調達してきている」というような考え
// 一度importしてしまうと、それ以降はパッケージ名を書かなくてもそのクラスを使用することができる
import java.util.Scanner;  // パッケージ名.*;　と表記するとパッケージ内の全てのクラスを使用することができるようになる

class Chapter8_2_8_3 {

	public static void main(String[] args) {
		// Scannerクラスを使用することによって、キーボードやファイルから入力した情報を読み込むことふができる
		// System.in(キーボード)からの入力をScannerオブジェクトとして作成し、そこにsinという名前をつけている
		Scanner sin = new Scanner(System.in);  // キーボードから読み込む場合は、System.in(標準出力装置)を指定する
																					 // つまり9行目はキーボード入力した値が引数になることを意味している
		int m, n, ans;
		// 上記でキーボードからのデータ読み込みの準備(オブジェクトの作成)は整ったので、
		// 下記以降では実際に変数sinに対して値を読み込む作業を行っていく
		m = sin.nextInt();  // 変数sinに対して実際に値を読み込む作業を行っている
		n = sin.nextInt();  // nextIntでキーボードからのデータをひとつのint型の値として読み込む
		ans = m + n;
		System.out.println(m + "+" + n + "=" + ans);
		
	}

}
