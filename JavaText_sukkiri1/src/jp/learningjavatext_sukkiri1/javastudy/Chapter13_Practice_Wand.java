package jp.learningjavatext_sukkiri1.javastudy;

public class Chapter13_Practice_Wand {
	private String name = "魔女の杖";	// 杖の名前
	private double power = 10.0;	// 杖の魔力
	
	
	
	public  String getName() {
		return this.name;
	}
	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("名前が空白です。処理を中断します。");
		}
		if (name.length() <= 2) {
			throw new IllegalArgumentException("名前が短すぎます。処理を中断します。");
		}
		this.name = name;
	}
	
	public double getPower() {
		return this.power;
	}
	public void setPower(double power) {
		if (power < 0.5 ) {
			throw new IllegalArgumentException("powerは0.5以上で設定してください。処理を中断します。");
		}
		if (power > 100.0) {	// double型なので小数点まで記載する = 100.0
			throw new IllegalArgumentException("powerは100以下で設定してください。処理を中断します。");
		}
		this.power = power;
	}

}
