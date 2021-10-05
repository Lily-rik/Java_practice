package jp.learningjavatext_sukkiri1.javastudy;

// 暗黙の継承
// あるクラスを定義するとき、親クラスを指定しなければ、
// java.lang.Objectを親クラスとして継承したとみなされる
public class Chapter14_Empty {
// 本来上記はpublic class Chapter14_Empty extends Object {} となっている

}

// Javaでは親なしのクラスを定義できない
// どのクラスも親をたどると最終的にはjava.lang.Objectに到達する

// Objectクラス
// equals() あるインスタンスと自分自身が同じか調べる
// toString() 自分自身の内容の文字列表現を返す

// メリット①：多態性を利用できるようになるから
// メリット②：全てのクラスが最低限備えるべきメソッドを定義できるから
