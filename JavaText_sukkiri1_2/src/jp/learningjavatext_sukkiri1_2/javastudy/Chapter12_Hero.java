package jp.learningjavatext_sukkiri1_2.javastudy;

public class Chapter12_Hero extends Chapter12_Character {
	
	public void run() {
		System.out.println("勇者は剣を持ちながら逃げた！");
	}
	
	public void attack(Chapter08_Matango m) {
		System.out.println("勇者は剣を振りかざして攻撃した！");
		System.out.println("敵に10ポイントのダメージ！");
		m.hp -= 10;
		
	}

}
