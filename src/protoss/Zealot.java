package protoss;

//������Ʈ(��ü)�� ���¿� �ൿ�� ������.
public class Zealot {
	public Zealot() {
	this(100,100,16,1);
}

	
	public Zealot(int st, int sh, int attack, int armor) {
		this. st = st; //ü��
		this. sh= sh; //����(��ȣ��)
		this.attack = attack; 
		this.armor = armor;
		
		System.out.println("My Life Aior");
		}

	final String name = "����";
	int st; //ü��
	int sh; //����(��ȣ��)
	int attack; 
	int armor;
	}
