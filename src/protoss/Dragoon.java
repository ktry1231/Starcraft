package protoss;

//오브젝트(객체)는 상태와 행동을 가진다.
public class Dragoon {
	public Dragoon() {
	this(100,100,20,1);
}

	
	public Dragoon(int st, int sh, int attack, int armor) {
		this. st = st; 
		this. sh= sh; 
		this.attack = attack; 
		this.armor = armor;
		
		System.out.println("My Life Aior");
		}

	final String name = "드라군";
	int st; //체력
	int sh; //쉴드(보호막)
	int attack; 
	int armor;
	}
