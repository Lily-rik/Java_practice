package jp.learningjavatext_sukkiri1.javastudy;

// インタフェースが店頭メニューだとすれば、それを継承したクラスはお店そのものと言える
public class Chapter11_KyotoCleaningShop implements Chapter11_CleaningServise {		// インタフェースを継承しクラス宣言する場合はimplementsを使用
	// フィールド(店舗の情報)
	String ownerName;
	String address;
	String phone;
	
	// シャツを洗う
	public Shirt washShirt(Shirt s) {
		// 大型洗濯機15分
		retrun s;
	}
	
	// タオルを洗う
	public Towl washTowl(Towl t) {
		// 大型洗濯機10分
		return t;
	}
	
	// コートを洗う
	public Coat washCoat(Coat c) {
		// ドライ20分
		retrun c;
	}
	
}
