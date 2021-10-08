package jp.learningjavatext_sukkiri1.javastudy;

public class Chapter17_UnsupportedMusicFileException extends Exception {		// チェック例外にする
	// エラーメッセージを受け取るコンストラクタ
	public Chapter17_UnsupportedMusicFileException(String msg) {
		super(msg);
	}

}
