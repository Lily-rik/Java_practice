package jp.learningjavatext.javastudy;

class Chapter4_3_2 {
	public static void main(String[] args) {
		// 式に実数(少数を含んだ数値)が含まれていると結果も少数を含んだものとなる
		// 答えは数値の精度の高い方に合わせるというルールがあるため、
		// 実数はどちらかに含まれていれば結果にも小数点以下が反映される
		// 小数点の反映は、15桁までを扱うように決められている
		System.out.print("1.0 / 3 = ");
		System.out.println(1.0/3);
		
		System.out.print("1 / 3.0 = ");
		System.out.println(1/3.0);
		
		System.out.print("1. / 3. = ");
		System.out.println(1./3.);  //1.0の場合1.と表すこともできる 
		
		
		// 実数を含まない計算と含む計算での結果の違いを確認する
		System.out.print("1 / 3 + 1 / 3 + 1 / 3 = ");
		System.out.println(1/3+1/3+1/3);		
		
		System.out.print("1. / 3 + 1. / 3 + 1. / 3 = ");
		System.out.println(1./3+1./3+1./3);
	}
}
