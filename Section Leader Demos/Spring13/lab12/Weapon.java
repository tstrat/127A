public class Weapon{
	String name;  // name of weapon
	String des; // Description of weapon
	int pL; // power level of weapon
	public Weapon(String title){
		name = title;
		pL = 0;
		des = "";
	}

	public Weapon(String title, String description, int pl){
		name = title;
		des = description;
		pL = pl;
	}

	public String getWeaponName(){
		return name;
	}

	public String getWeaponDescription(){
		return des;
	}
	
	public void giveDescription(String d){
		des = d;
	}
	public int getWeaponPowerLevel(){
		return pL;
	}
	public void setPL(int n){
		pL = n;
	}

}
