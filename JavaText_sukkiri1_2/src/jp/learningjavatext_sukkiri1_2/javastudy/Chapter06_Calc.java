//package calcapp.main;

// import文
//import calcapp.logics.CalcLogic;
//// calcapp.logicsパッケージの全てのクラスをインポートしたいとき
//import calcapp.logics.*;

//public class Calc {
//
//  public static void main(String[] args) {
//    // 計算機プログラム
//    int a = 10;
//    int b = 2;
//    // int total = tasu(a, b); // メソッドは同じクラス内からしか呼び出すことはできないため、
//    // int delta = hiku(a, b); // この記述ではコンパイルエラーになる
//
//    // int total = calcapp.logics.CalcLogic.tasu(a, b); //
//    // そのため、クラスが異なるどこのクラスのメソッドかを明記する必要がある
//    // int delta = calcapp.logics.CalcLogic.hiku(a, b); //
//    // パッケージをしており異なる場合は、パッケージも記載する
//    // // パッケージ名から記載している完全なクラス名は「完全限定クラス = FQCN(full qualified class
//    // // name))」
//
//    // 上記のコードをimport文を利用して表示する
//    int total = CalcLogic.tasu(a, b); // import文を使用することで、その後はクラス名の記述のみでメソッドを使用できるようになる(クラス名は必要なので注意！)
//    int delta = calcapp.logics.CalcLogic.hiku(a, b); // import文を指定していても、FQCNを使用しても問題ない
//    System.out.println("足すと" + total + "引くと" + delta);
//    System.out.println();
//
//    // API利用の例
//    int[] heights = { 172, 149, 152, 191, 155 };
//    java.util.Arrays.sort(heights); // java.utilパッケージのArraysクラスにあるsortメソッドを呼び出し、
//    for (int h : heights) { // 並べ替えのロジックを自分で書かなくても引用するtことができる
//      System.out.println(h); // これらのクラスファイルはJDKのインストール時にコピーされており、自分たちで必要に応じて使用することができる
//    }
//
//  }
//
//}
//
///*
// * コンパイル、実行の仕方 パッケージを使用する際は.の部分でフォルダ(階層)が別れることに注意
// * javac,javaコマンドを使用する際は、共通のフォルダに移動し、 そこからファイルがあるところまで/を用いて下がっていく
// * (javaコマンドが実行されたフォルダがクラスパスとなるため)
// */
