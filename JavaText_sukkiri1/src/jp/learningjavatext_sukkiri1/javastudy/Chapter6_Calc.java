//// パッケージの利用（VScode使用）
//
//package calcapp.main;
//// パッケージに対するクラスローダーの動作
//// あるパッケージx.y.zに属するクラスCを探す場合、クラスローダーは、「クラスパスで指定されたフォルダ/x/y/z/C.class」というファイルを読み込む
//// そのため、今回のファイルを読み込むためには、クラスパスでjava_practiceを指定（またはそこまでターミナルで移動）し、
//// そこからcalcapp/main/Chapter6_Calc(クラス名)のフォルダと記述が必要となる！！
//
//import calcapp.logics.Chapter6_CalcLogic;
//// calcapp.logicsパッケージに所属する全てのクラスをインポートしたい場合には、
//// import calcapp.logics.*;
//// と記述すると全てのクラス名を記述することができるようになる
//
//public class Chapter6_Calc {
//
//  public static void main(String[] args) {
//    // 6.1
//    int a = 10;
//    int b = 2;                                                  // 異なるクラスからメソッドを呼び出す際は、クラス名も記載する
//    int total = calcapp.logics.Chapter6_CalcLogic.tasu(a, b);   // クラスは自分と同じパッケージから呼び出そうとするため、
//                                                                // どのパッケージのクラスかを指定しなければならない
//                                                                // この完全なクラス名のことを完全限定クラス名、完全修飾クラス名 = FQCNという
//    int delta = Chapter6_CalcLogic.hiku(a, b);                  // import宣言することによってクラス名のみでよくなる
//    System.out.println("足すと" + total + "、引くと" + delta);
//  }
//
//}