package umn.ac.id.uts;

import java.util.ArrayList;

public class Unhealthy extends Human {

	private int muscle;
	private int fat;
	private int stressLevel;
	private double weight;
	public ArrayList<String> activities = new ArrayList<String>();
	
	Unhealthy(){}
	Unhealthy(String name, int age){
		super(name, age);
		this.muscle = 25;
		this.fat = 50;
		this.weight = ((fat*0.3)+(muscle*0.6));
		this.stressLevel = 4;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public int getFat() {
		return fat;
	}
	
	public int getMuscle() {
		return muscle;
	}
	
	public int getStressLevel() {
		return stressLevel;
	}
	
	public void updateWeight() {
		this.weight = ((fat*0.3)+(muscle*0.6));
	}

	public void eat(Food food) {
		this.fat = this.fat + food.getFat();
		this.muscle = this.muscle - food.getMuscle();
		this.stressLevel = this.stressLevel - 2;
	}
	
	public void workout(Exercise exercise) {
		this.fat = this.fat - exercise.getFat();
		this.muscle = this.muscle + exercise.getMuscle();
		this.stressLevel = this.stressLevel + 2;
	}

}
