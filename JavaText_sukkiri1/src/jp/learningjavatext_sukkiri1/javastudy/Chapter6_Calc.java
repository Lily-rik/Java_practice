package jp.learningjavatext_sukkiri1.javastudy;

public class Chapter6_Calc {

	public static void main(String[] args) {
		// 6.1
		int a = 10; int b = 2;
		int total = Chapter6_CalcLogic.tasu(a, b);	// 異なるクラスからメソッドを呼び出す際は、クラス名も記載する
		int delta = Chapter6_CalcLogic.hiku(a, b);
		System.out.println("足すと" + total + "、引くと" + delta);
	}
	
}
