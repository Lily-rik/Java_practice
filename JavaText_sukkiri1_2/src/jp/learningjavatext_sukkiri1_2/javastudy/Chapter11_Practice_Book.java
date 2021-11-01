package jp.learningjavatext_sukkiri1_2.javastudy;

public class Chapter11_Practice_Book extends Chapter11_Practice_TangibleAsset {
	
	String isbn;
	
	// コンストラクタ
	public Chapter11_Practice_Book(String name, int price, String color, doubString isbn) {		// superの引数として継承クラスにももう一度
		super(name, price, color, weight);																													// 引数の定義をしなければならない
		this.isbn = isbn;
	}
	
	// メソッド
	public String getIsbn() {
		return this.isbn;
	}

}
