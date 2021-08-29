package jp.learningjavatext.javastudy;

class Chapter4_4_3 {
	public static void main(String[] args) {
		System.out.println("'A' + 1 = " + 'A'+1);  // "'A' + 1 = " + 'A'を先に計算し、文字列として認識。
		System.out.println("'A' + 2 = " + 'A'+2);  // その後+1をしているため、文字列＋文字列の結合に変換され、
		System.out.println("'A' + 3 = " + 'A'+3);  // 結果は'A' + 1 = A1となる
		
		System.out.println("'A' + 1 = " + ('A'+1));  // この場合Aは文字コードとして認識されており、
		System.out.println("'A' + 2 = " + ('A'+2));  // 'A'は65というコード(数値)が割り当てられるので、
		System.out.println("'A' + 3 = " + ('A'+3));  // 結果は'A' + 1 = 66(65+1)となる

		System.out.println("'A' + 1 = " + (char)('A'+1));  //
		System.out.println("'A' + 2 = " + (char)('A'+2));  //
		System.out.println("'A' + 3 = " + (char)('A'+3));  //		
		
	}

}
