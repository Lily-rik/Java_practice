package jp.learningjavatext_sukkiri1.javastudy;

import java.io.*;
import java.net.URL;
// import java.sql.*;		// SQLのパッケージクラス(今は接続できないためコメントアウト)

public class Chapter18_Main {

	public static void main(String[] args) throws Exception {
		
		// ファイルから１文字ずつ読み込む
		FileReader fr = new FileReader("data.txt");		// ファイルを開く
		int input = fr.read();	// ファイルの文字を１文字取り出す
		while(input != -1) {		// ファイルの最後まで１文字ずつ読む
														// read()の結果が-1の場合、ファイルを最後まで読み終わったことを表す
			System.out.print((char)input);
			input = fr.read();
		}
		fr.close();		// 開いたら閉じる、忘れないように、、！
		System.out.println();
		
		
		// ファイルに１文字ずつ書き込む
		FileWriter fw = new FileWriter("data.text");
		fw.write('そ');
		fw.write('れ');
		fw.write('で');
		fw.write('は');
		fw.close();
		System.out.println();
		
		// Webページを取得する
		URL u = new URL("https://book.impress.co.jp/");
		InputStream is = u.openStream();		// インターネットへ接続
		int i = is.read();
		while(i != -1) {		// ページの終わりまで繰り返す
			char c = (char)i;
			System.out.print(c);		// 読んだ内容を画面に表示
			i = is.read();
		}
		System.out.println();
		
		
		// DBに接続してSQLを送信する
		// sqlをimportできないためコメントアウト
//		Class.forName("org.h2.Driver");
//		String dburl = "jdbc.h2~/test";		// 接続先DBを指定
//		String sql = "INSERT INTO EMPROYEES(name) VALUES('aoki)";
//		Connection conn = DriveManager.getConnection(dburl);	// DBに接続
//		conn.createStatement().executeUpdate(sql);	// SQLを送信
//		conn.close();		// DB接続を閉じる
		
	}

}
