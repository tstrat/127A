public class Ship {
	String name, classif;
	int[] crewStatus;
	// Default constructor
	public Ship(){
		name = "Unnamed";
		classif = "Tug-boat, HAHA!";
		crewStatus = new int[10];
      resetCrew();
	}
	
	// constructor with 2 args
	public Ship(String n, String classification){
		name = n;
		classif = classification;
		crewStatus = new int[10];
      resetCrew();
	}

	// constructor with three
	public Ship(String n, String classification, int[] crew){
		name = n;
		classif = classification;
		crewStatus = crew;
	}
   private void resetCrew(){
      for (int i = 0; i < crewStatus.length; i++)
         crewStatus[i] = 1;
   }

	public void setCrew(int[]w){
		crewStatus = new int[w.length];
		for (int i = 0; i < w.length; i++){
			crewStatus[i] = w[i];
		}
	}
		



	public String crewList(){
		if (crewStatus.length == 0)
			return "[]";
		String str = "[";
		for (int i = 0; i < crewStatus.length-1; i++)
			str += crewStatus[i] + ", ";
		str += crewStatus[crewStatus.length-1] + "]\n";
		
		return str;
	}
	public String toString(){
		String str = "Ship Name: "+name+"\n";
		str += "Class: "+classif+"\n";
		str += "Crew: "+ crewList();
		return str;
	}
	
}
