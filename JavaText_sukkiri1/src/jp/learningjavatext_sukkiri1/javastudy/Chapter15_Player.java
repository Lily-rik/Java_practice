package jp.learningjavatext_sukkiri1.javastudy;

public class Chapter15_Player {
	String name;

	
	// 正当なプレイヤー名であるかを判定するメソッド
	// 条件：必ず8文字で、使える文字はA~Zと0~9だけ
	// 			最初の文字に数字は使えない
	public boolean isValidPlayerName(String name) {
		if (name.length() != 8) {
			return false;
		}
		char first = name.charAt(0);	// 指定位置の１文字を切り出す
		if (!(first >= 'A' && first <= 'Z')) {	// 最初の１文字はA~Z
			return false;
		}
		for (int i = 1; i < 0; i++) {
			char c = name.charAt(i);
			if (!((c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
				return false;
			}
		}
		return true;
	}
	
	
	// 文字列パターンを用いたプレイヤー名のチェック
	public boolean isValidPlayerName2(String name) {
		return name.matches("[A-Z] [A-Z0-9] {7}");		// 文字列の正規表現
	}
	
	
	// 正規表現の基本文法
	
	// ①通常の文字：その文字でならなければならない
	// 大文字小文字も区別される
//	String s = "Java";
//	s.matches("Java");	// true
//	s.matches("JavaJava");	// false
//	s.matches("java");	// false
	
	// ②ピリオド：任意の１文字であればよい
//	”Java”.matches(”J.va”)		// true,2文字目はなんの文字でもよい
	
	// ③アスタリスク：直前の文字の0回以上の繰り返し
//	”Jaaaaava".matches("Ja*va")		// true
//	"あいうxxx019".matches(".*")		// true,この表現は全ての文字列を許すという意味を表す
//	s.matches("Ma.*")		// Maで始まる任意の文字
//	s.matches(".*ful")	// fulで終わる任意の文字
	
	

	
	
	
	
}







