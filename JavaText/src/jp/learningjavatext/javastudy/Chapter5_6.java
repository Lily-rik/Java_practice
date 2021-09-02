package jp.learningjavatext.javastudy;

class Chapter5_6 {
	public static void main(String[] args) {
		// 論理型変数
		// 型はboolean飲みで、true or falseのいずれかのみである
		
		boolean yes, no;
		
		yes = true;  // ””で括られていないことに注意！　文字列を代入しようとするとエラーになってしまう
		no = false;  // trueとfalseは文字列ではなく値そのものである
		
		System.out.println("yes = " + yes);
		System.out.println("no = " + no);
	}

}
