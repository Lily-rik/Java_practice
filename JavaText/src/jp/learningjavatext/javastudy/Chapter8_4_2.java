package jp.learningjavatext.javastudy;

// ファイルからの読み込み
import java.util.Scanner;   // Scannerにどのファイルからデータを読み込むのか教えなければならない
import java.io.FileReader;  // そのためファイルから文字データを読み込むFileReaderを使用する

class Chapter8_4_2 {

	public static void main(String[] args) {
		FileReader fr = null;
		
		// try catch 例外処理
		try {  // 例外が発生する可能性のある処理
			fr = new FileReader("Hello.java");
		} catch (Exception e) {  // 例外に対する処理
			System.out.println("ファイルが見つかりません。");
			System.exit(0); // プログラムを終了させるコード
		}
		
		Scanner sin = new Scanner(fr);
		while (sin.hasNext()) {
			String s = sin.nextLine();
			System.out.println(s);
		}

	}

}
