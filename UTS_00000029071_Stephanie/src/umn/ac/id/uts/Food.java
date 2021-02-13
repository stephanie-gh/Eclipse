package umn.ac.id.uts;

public class Food extends Human{

	private String foodid;
	private String name;
	private int muscle;
	private int fat;
	
	Food() {}
	Food(String foodid, String name, int muscle, int fat){
		this.foodid = foodid;
		this.name = name;
		this.muscle = muscle;
		this.fat = fat;
	}

	public String getFoodid() {
		return foodid;
	}
	
	public String getName() {
		return name;
	}
	
	public int getMuscle() {
		return muscle;
	}
	
	public int getFat() {
		return fat;
	}

}
