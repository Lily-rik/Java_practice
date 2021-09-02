package jp.learningjavatext.javastudy;

class Chapter5_4 {
	public static void main(String[] args) {
		// 実数型変数
		// 実数を扱う変数の型には、float,doubleの2種類ある
		// 特に制約がない際は、扱う範囲がより大きいdoubleを使用するのが一般的
		
		double shincho, taiju;
		
		shincho = 1.75;
		taiju = 22 * shincho * shincho;  // 標準体重 = 22 * 身長(m) * 身長(m)
		
		System.out.print("身長" + shincho + "mの人の標準体重は、");
		System.out.println(taiju + "kgです。");
		
		int shincho2;
		float taiju2;
		
		shincho2 = 175;
		taiju2 = (shincho2 - 100) * 0.9f;  // 標準体重 = (身長cm - 100) * 0.9
																			 // 小数点を含む実数を表現する場合、通常はdouble型が使用される
																			 // float型を使用するには、[0.9f]のように実数の末尾に[f]をつける = 接尾辞という
		System.out.print("身長" + shincho2 + "cmの人の標準体重は、");
		System.out.println(taiju2 + "kgです。");
	}

}
