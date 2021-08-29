package jp.learningjavatext.javastudy;

class Chapter4_4_2 {
	public static void main(String[] args) {
		// 文字列と数字の足し算
		// 種類が異なるものをそのまま足すことはできないため、
		// 数値の部分は自動的に文字列に変換され、文字列同士の足し算が行われる
		System.out.println("PI = " + 3.14);
		
		System.out.println("123 + 456 = " + (123+456));  // 先に()内が数値と計算され、その後文字列との結合により文字列として表示される
	}
}