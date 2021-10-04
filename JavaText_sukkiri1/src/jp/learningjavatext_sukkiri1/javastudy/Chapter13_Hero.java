package jp.learningjavatext_sukkiri1.javastudy;

// 特に指定や特殊な制限がない限り、基本的にはフィールドはprivate、メソッドにはpublicを用いる
public class Chapter13_Hero {
	private int hp;		// アクセス制限(カプセル化)
										// privateを使用すると自分自身のクラスのみでしか呼び出せなくなる
										// (他クラスでは書き換え不可)
	private String name;
//	Sword Sword;
	
	// getNameメソッドを使用して他のクラスからnameを呼び出せるようにする
	// ある特定のフィールド値を単に取り出すだけのメソッドはgetterメソッドという
	// getter,setterメソッドを用いることで、ReadOnly,WrightOnlyのフィールドを実現することができる
	// → setNameを削除すれば読めるが書き換えられなくできる(ReadOnly)
	// また、フィールドの名前など、クラスの内部設計を自由に変更できることもメリットである(変更が内部だけで完結する)
	public String getName() {		// getName()メソッドを経由してフィールドにアクセスしている
		return this.name;
	}
	
	// ある特定のフィールドに指定された値を代入するだけのメソッドをsetterという
	// setterメソッドを用いることで、メソッド内で値の妥当性をチェックすることができる
	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("名前がnullである。処理を中断。");		// エラーを出してプログラムを強制終了する命令
		}
		if (name.length() <= 1) {
			throw new IllegalArgumentException("名前が短すぎる。処理を中断。");
		}
		if (name.length() >= 8) {
			throw new IllegalArgumentException("名前が長すぎる。処理を中断。");
		}
		this.name = name;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public void bye() {
		System.out.println("勇者は別れを告げた");
	}
	
	private void die() {	// privateを指定したため、外部のクラスからは呼び出せなくなる
		System.out.println(this.name + "は死んでしまった！");
		System.out.println("GAME OVERです");
	}
	
	void sleep() {	// publicを外すことによって、sleepは同じパッケージに属するクラスからの呼び出しのみ可能になる
		this.hp += 100;
		System.out.println(this.name + "は眠って回復した");
	}
	
//	public void attack(Matango m) {		// attackはさまざまなクラスから呼び出される可能性があるため、public指定のままにしておく
//		System.out.println(this.name + "の攻撃！");
//		System.out.println(this.name + "はお化けキノコ" + m.suffix + "から2ポイントの攻撃を受けた");
//		this.hp -= 2;
//		if (this.hp <= 0) {
//			this.die();
//		}
//	}

}
