package umn.ac.id.uts;

public class Exercise {

	private String exerciseid;
	private String name;
	private int muscle;
	private int fat;
	
	Exercise() {}
	Exercise(String exerciseid, String name, int muscle, int fat){
		this.exerciseid = exerciseid;
		this.name = name;
		this.muscle = muscle;
		this.fat = fat;
	}

	public String getExerciseid() {
		return exerciseid;
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
