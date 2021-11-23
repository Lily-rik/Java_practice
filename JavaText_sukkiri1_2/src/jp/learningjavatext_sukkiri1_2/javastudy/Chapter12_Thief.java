package jp.learningjavatext_sukkiri1_2.javastudy;

public class Chapter12_Thief extends Chapter12_Character {
	
	public void run() {
		System.out.println("泥棒は敵のアイテムを奪ってこそこそと逃げた！");
	}
	
	public void attack(Chapter08_Matango m) {
		System.out.println("泥棒は持っているアイテムで攻撃した！");
		System.out.println("敵に15ポイントの攻撃！");
		m.hp -= 15;
	}

}
