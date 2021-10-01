package jp.learningjavatext_sukkiri1.javastudy;

// 11.1
// 自分の回答
//public abstract class Chpater11_practice_TangibleAsset {
//	String name;
//	int price;
//	String color;
//	String isbn;
//	String makerName;
//	
//	// コンストラクタ
//	public Chpater11_practice_TangibleAsset (int price, String name, String color, String isbn){
//		this.price = price;
//		this.name = name;
//		this.color = color;
//		this.isbn = isbn;
//	}
//	
//	public Chpater11_practice_TangibleAsset (String name, int price, String color, String makerName){
//		this.name = name;
//		this.price = price;
//		this.color = color;
//		this.makerName = makerName;
//	}
//
//	
//	// メソッド
//	public String getName() {
//		return this.name;
//	}
//	
//	public int getPrice() {
//		return this.price;
//	}
//	
//	public String getColor() {
//		return this.color;
//	}
//	
//}

// 解答
// 抽象クラスには内容が同じになるところだけを書く
// 個別性のある部分は継承されたクラス先で書く

//public abstract class Chpater11_practice_TangibleAsset {
//	String name;
//	int price;
//	String color;
//	
//	// コンストラクタ
//	public Chpater11_practice_TangibleAsset (String name, int price, String color){
//		this.price = price;
//		this.name = name;
//		this.color = color;
//	}
//	
//	// メソッド
//	public String getName() {
//		return this.name;
//	}
//	public int getPrice() {
//		return this.price;
//	}
//	public String getColor() {
//		return this.color;
//	}
//
//}

// 11.2
//解答
//public abstract class Chpater11_practice_TangibleAsset extends Chapter11_practice_Asset {
//String color;		// Assetクラスから継承してきているため、nameとpriceは削除する
//
//// コンストラクタ
//public Chpater11_practice_TangibleAsset (String name, int price, String color){
// super(name, price)		// 同様にnameとpriceは継承しているためsuperを使用する
//	this.color = color;
//}
//
//// メソッド
//public String getColor() {	// メソッドもnameとpriceは継承されているため削除
//	return this.color;
//}
//
//}



// 11.4
// 自分の回答
//public abstract class Chpater11_practice_TangibleAsset extends Chapter11_practice_Asset implements Chapter11_practice_Thing {
//	String name;
//	int price;
//	String color;
//	double getWeight;
//	double setWeight;
//	
//	// コンストラクタ
//	public Chpater11_practice_TangibleAsset (String name, int price, String color, double getWeight, double setWeight){
//		this.price = price;
//		this.name = name;
//		this.color = color;
//		this.getWeight = getWeight;
//		this.setWeight = setWeight;
//	}
//	
//	// メソッド
//	public String getName() {
//		return this.name;
//	}
//	public int getPrice() {
//		return this.price;
//	}
//	public String getColor() {
//		return this.color;
//	}
//	
//	public double getWeight() {
//		return this.getWeight;
//	}
//	public double setWeight() {
//		return this.setWeight;
//	}
	
//解答
public abstract class Chpater11_practice_TangibleAsset extends Chapter11_practice_Asset implements Chapter11_practice_Thing {
	String color;
	double weight;	// 欲しい情報はdouble型のweight(重さ)のため、左記のように記述する
	
	// コンストラクタ
	public Chpater11_practice_TangibleAsset (String name, int price, String color) {
		super(name, price);
		this.color = color;
//		this.getWeight = getWeight;		// weightはコンストラクタの指示はないため不要
//		this.setWeight = setWeight;
	}
	
	// メソッド
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	public String getColor() {
		return this.color;
	}
	
	public double getWeight() {
//		return this.getWeight;	//getWeightは値ではない
		return this.weight;
	}
	public void setWeight(double weight) {
//		return this.setWeight;
		this.weight = weight;
	}



}
