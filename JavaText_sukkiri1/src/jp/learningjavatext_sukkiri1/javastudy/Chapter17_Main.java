package jp.learningjavatext_sukkiri1.javastudy;

import java.io.*;

// 例外処理
public class Chapter17_Main {
	public static void main(String[] args) {
		
		// Exception系例外は、例外処理を記述していないとコンパイルエラーになる = チェック例外
		try {
			FileWriter fw = new FileWriter("data.txt");
		} catch (IOException e) {
			System.out.println("エラーが発生しました");
		}
		
		
		// ざっくりと例外を補足する
		try {
			FileWriter fw = new FileWriter("data.txt");
			fw.write("hello!");
			fw.close();		// 致命的なバグ → 20行目でcatchへ行ってしまうとファイルは閉じられない
		} catch (Exception e) {		// Exceptionの子孫をどれでもキャッチする
			System.out.println("何らかの例外が発生しました");
		}
		
		
		// 後片付け処理：finallyブロック
		// パターン①
//		try {
//			FileWriter fw = new FileWriter("data.txt");
//			fw.write("hello!");
//		} catch (Exception e) {
//			System.out.println("何らかの例外が発生しました");
//		} finally {
//			fw3.close();
//			上記はコンパイルエラーになる
//			→変数のスコープが原因、fw3はブロック外では使用できない
//		}
	
		// パターン②
//		// 上記エラー解決のため、スコープ外に変数を持ってくると、、、
//		FileWriter fw = new FileWriter("data.txt");		// IOexceptionの例外エラーが発生する、、、
//		try {
//			fw.write("hello!");		// スコープ内のため利用可能！
//		} catch (Exception e) {
//			System.out.println("何らかの例外が発生しました");
//		} finally {
//			fw4.close();		// スコープ内のため利用可能！
//		}
		
		// パターン③
//		FileWriter fw;		// mainメソッドブロックはfwスコープのまま、
//		try {
//			fw = new FileWriter("hello!");		// tryブロック内でコンストラクタが動作する
//		} catch (Exception e) {
//			System.out.println("何らかの例外が発生しました");
//		} finally {
//			fw.close();		// 「初期化されていない変数fwを利用する可能性がある」というエラーが発生！
//										// →tryの途中で例外処理が発生しcatch処理へ移行した場合、
//										// fwには何も値が入っていない状態になる(変数を宣言しただけなので、nullさえ入っていない)
//			
//		}
		
		// パターン④
//		FileWriter fw = null;		// 上記コードの解決方法としてnullを代入しておく(内容が不明な状態を作らない)
//		try {
//			fw = new FileWriter("hello!");
//		} catch (Exception e) {
//			System.out.println("何らかの例外が発生しました");
//		} finally {
//			fw.close();		// fx.close()をtry-catchしていないエラーが発生する、、、
//		}
		
		// パターン⑤
		FileWriter fw = null;
		try {
			fw = new FileWriter("hello!");
		} catch (Exception e) {
			System.out.println("何らかの例外が発生しました");
		} finally {
			try {		// fw.close()に対するtry-catch文の記述
				fw.close();
			} catch (IOException e) {
				;		// 空文：JVMは空文に出会っても何も処理を行わない
						// = 例外処理は何も行わないことを表している
			}
		}
		
		// 上記のコードでエラーは出ないが、77行目でエラーが発生するとfwはnullとなり、
		// NullPointerExceptionが発生してしまう
		// nullということはファイルのオープンに失敗しているため、
		// そもそもcloseする必要はない、よって下記のようにコードを修正する
		
		// パターン⑥
		FileWriter fw2 = null;
		try {
			fw2 = new FileWriter("hello!");
		} catch (Exception e) {
			System.out.println("何らかの例外が発生しました");
		} finally {
			if (fw2 != null) {		// fw2がnull出ない時だけclose()を試みる
				try {
					fw2.close();
				} catch (IOException e) {
					;
				}
			}
		}
		
		// 上記のコードは正確であるが、記述が長く処理も複雑である、、、
		// それをスッキリとさせることがJava7から可能となった！
		
		// パターン⑦
		try (FileWriter fw3 = new FileWriter("data.txt");) {		// ()内にcloseによる後片付け処理が必要な変数の宣言をする
		// try-catch文を抜ける際に自動的にclose()が呼び出されるため、finallyブロックの記述は不要
		// 宣言する変数はAutoCloseableを実装している必要があるため注意
			fw3.write("hello!");
		} catch (Exception e) {
			System.out.println("何らかの例外が発生しました");
		}






		

		
		
		
	}

}
