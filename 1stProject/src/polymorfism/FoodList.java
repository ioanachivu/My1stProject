package polymorfism;

public class FoodList {
	Food []list = new Food[10];
	int i=0;
	
	public void add (Food x) {
		if(i<list.length) {
			list[i]=x;
			System.out.println("food has been addes to index "+ i);
			i++;
		}
	}
}
