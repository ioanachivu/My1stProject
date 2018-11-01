package polymorfism;

public class Main {

	public static void main(String[] args) {

		Food []vector = new Food[3];
		vector[0] = new Food(); // place food type from the superclass on 1st position
		vector[1] = new Tuna(); // tuna type from child class - 2nd position
		vector[2] = new Pie(); // pie type from child class
		
		for (int i=0; i<3; ++i) {
			vector[i].eat(); // doing the eat method for every child object 
		}
		//-------------------------------------------------------------------
		
		Tuna t = new Tuna(); // creating tuna obj
		Pie p = new Pie(); // new pie object 
		
		FoodList balarii = new FoodList(); // creating FoodList object
		
		balarii.add(t);
		balarii.add(p);
	}
}
