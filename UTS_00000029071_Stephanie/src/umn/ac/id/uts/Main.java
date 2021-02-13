package umn.ac.id.uts;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);
	static Healthy healthy;
	static Unhealthy unhealthy;
	static Food food;
	static Exercise exercise;
	static String nameH, nameU;
	static String foodName, exerciseName;
	static int input;
	static int ageH, ageU;
	static int foodId = 0, FId = 0, foodTotalFat = 0, foodFat = 0, foodTotalStress = 0, foodStress = 0, foodTotalMuscle = 0, foodMuscle = 0;
	static int exerciseId = 0, EXId = 0, exerciseTotalFat = 0, exerciseFat = 0, exerciseTotalStress = 0, exerciseStress = 0, exerciseTotalMuscle = 0, exerciseMuscle = 0;
	static int character = 0, jumlah = 0;
	static ArrayList<Food> foodS = new ArrayList<Food>();
	static ArrayList<Exercise> exerciseS = new ArrayList<Exercise>();
	static ArrayList<Food> activitiesHealthyEatS = new ArrayList<Food>();
	static ArrayList<Food> activitiesUnhealthyEatS = new ArrayList<Food>();
	static Food activitiesEatS;
	static ArrayList<Exercise> activitiesHealthyWorkOutS = new ArrayList<Exercise>();
	static ArrayList<Exercise> activitiesUnhealthyWorkOutS = new ArrayList<Exercise>();
	static Exercise activitiesExerciseS;
	
	public static void Tampilan_Awal() {
		System.out.println("------------------------------");
		System.out.println("          Living Life         ");
		System.out.println("------------------------------");
		System.out.println("Healthy");
		System.out.print("Name	: "); nameH = in.next();
		System.out.print("Age	: "); ageH = in.nextInt();
		healthy = new Healthy(nameH, ageH);
		System.out.println("Healthy character is added");
		System.out.println("Unhealthy");
		System.out.print("Name	: "); nameU = in.next();
		System.out.print("Age	: "); ageU = in.nextInt();
		unhealthy = new Unhealthy(nameU, ageU);
		System.out.println("Unhealthy character is added");
	}
	
	public static void Tampilan_Menu_Utama() {
		System.out.println("------------------------------");
		System.out.println("||        Living Life       ||");
		System.out.println("------------------------------");
		System.out.println("1. Your Detail");
		System.out.println("2. Eat");
		System.out.println("3. Workout");
		System.out.println("4. List of activities");
		System.out.println("5. Credits");
		System.out.println("0. Exit");
		System.out.print("Input : "); 
	}
	
	public static void Tampilan_Menu1() {
		System.out.println("------------------------------");
		System.out.println("||        Living Life       ||");
		System.out.println("------------------------------");
		System.out.println("1.Healthy");
		System.out.println("2.Unhealthy");
		System.out.println("Choose your character : "); character = in.nextInt();

		for(;;) {
		if(character == 1) {
			System.out.println("Healthy");
			System.out.println("Name			: "+healthy.getName());
			System.out.println("Age			: "+healthy.getAge());
			System.out.println("Weight			: "+healthy.getWeight());
			System.out.println("Muscle			: "+healthy.getMuscle());
			System.out.println("Fat			: "+healthy.getFat());
			System.out.println("Stress Level		: "+healthy.getStressLevel());
			break;
		}
		else if(character == 2) {
			System.out.println("Unhealthy");
			System.out.println("Name			: "+unhealthy.getName());
			System.out.println("Age			: "+unhealthy.getAge());
			System.out.println("Weight			: "+unhealthy.getWeight());
			System.out.println("Muscle			: "+unhealthy.getMuscle());
			System.out.println("Fat			: "+unhealthy.getFat());
			System.out.println("Stress Level		: "+unhealthy.getStressLevel());
			break;
			}
		else {
			System.out.println("Input tidak valid");
		}
	}
}
	
	static Food[] foods = new Food[5];
	
	public static void seedDataFood() {
		foods[0] = new Food("1","Pizza",3,10);
		foods[1] = new Food("2","Risotto",2,4);
		foods[2] = new Food("3","Burger",4,9);
		foods[3] = new Food("4","Noodle",3,5);
		foods[4] = new Food("5","Salad",1,1);
	}
	
	public static void Tampilan_Menu2() {
		for(Food f : foods) {
		FId = 1;
		System.out.println("------------------------------");
		System.out.println("||           FOODS	    ||");
		System.out.println("------------------------------");
		System.out.println("ID		: " +f.getFoodid());
		System.out.println("Name		: " +f.getName());
		System.out.println("Muscle		: " +f.getMuscle());
		System.out.println("Fat		: " +f.getFat());
		System.out.println("------------------------------");
		FId++;
		}
		
		System.out.println("Choose your food : "); foodId = in.nextInt();
		System.out.println("\n1. Healthy");
		System.out.println("2. Unhealthy");
		System.out.println("Choose your character : "); character = in.nextInt();
		
		switch(character) {
		
		case 1 :
			food = foodS.get(foodId-1);
			if(healthy.getStressLevel() <= 10) {
				healthy.updateWeight();
				healthy.eat(foodS.get(foodId-1));
				System.out.println(healthy.getName() + " doesn't really like it");
				
				activitiesEatS = foodS.get(foodId-1);
				activitiesHealthyEatS.add(new Food(activitiesEatS.getName(),foodName, activitiesEatS.getMuscle(),activitiesEatS.getFat()));
				break;
			}
			else if(healthy.getStressLevel() > 10) {
				System.out.println(healthy.getName() + " is stressed out");
				break;
			}
			break;
		case 2 :
			food = foodS.get(foodId-1);
			
			if(unhealthy.getMuscle() >= food.getMuscle()) {
				unhealthy.updateWeight();
				unhealthy.eat(foodS.get(foodId-1));
				System.out.println(unhealthy.getName() + " loves it");
				
				activitiesEatS = foodS.get(foodId-1);
				activitiesUnhealthyEatS.add(new Food(activitiesEatS.getName(),foodName, activitiesEatS.getMuscle(),activitiesEatS.getFat()));
				break;
			}
			else if(unhealthy.getMuscle() < food.getMuscle()) {
				System.out.println(unhealthy.getName() + " is way too unhealthy");
				break;
			}
			break;
		default : 
			System.out.println("Invalid Input!");
			}
		}
	
	static Exercise[] exercises = new Exercise[5];
	
	public static void seedDataExercise() {
		exercises[0] = new Exercise("1","Plank",1,2);
		exercises[1] = new Exercise("2","Crunch",2,3);
		exercises[2] = new Exercise("3","Squat",3,3);
		exercises[3] = new Exercise("4","Pull Up",2,2);
		exercises[4] = new Exercise("5","Comandos",5,2);
	}
	
	public static void Tampilan_Menu3() {
		for(Exercise e : exercises) {
			EXId = 1;
			System.out.println("------------------------------");
			System.out.println("||         Exercises        ||");
			System.out.println("------------------------------");
			System.out.println("ID		: " +e.getExerciseid());
			System.out.println("Name		: " +e.getName());
			System.out.println("Muscle		: " +e.getMuscle());
			System.out.println("Fat		: " +e.getFat());
			System.out.println("------------------------------");
			EXId++;
			}
			System.out.println("Choose your exercise : "); exerciseId = in.nextInt();
			System.out.println("\n1. Healthy");
			System.out.println("2. Unhealthy");
			System.out.println("Choose your character : "); character = in.nextInt();
			
			switch(character) {
			case 1 :
				Exercise exercise = exerciseS.get(exerciseId-1);
				if(healthy.getFat() >= exercise.getFat()) {
					healthy.workout(exerciseS.get(exerciseId-1));
					healthy.updateWeight();
					System.out.println(healthy.getName() + " loves it");
					
					activitiesExerciseS = exerciseS.get(exerciseId-1);
					activitiesHealthyWorkOutS.add(new Exercise(activitiesExerciseS.getName(),exerciseName, activitiesExerciseS.getMuscle(),activitiesExerciseS.getFat()));
					break;
				}
				else if(healthy.getFat() < exercise.getFat()) {
					System.out.println(healthy.getName() + " is way too healthy");
				}
			case 2 :
				if(unhealthy.getStressLevel() <= 10) {
					unhealthy.updateWeight();
					unhealthy.workout(exerciseS.get(exerciseId-1));
					System.out.println(unhealthy.getName() + " doesn't really like it");
					
					activitiesExerciseS = exerciseS.get(exerciseId-1);
					activitiesUnhealthyWorkOutS.add(new Exercise(activitiesExerciseS.getName(),exerciseName, activitiesExerciseS.getMuscle(),activitiesExerciseS.getFat()));
					break;
				}
				else if(unhealthy.getStressLevel() > 10) {
					System.out.println(unhealthy.getName() + " is stressed out");
					break;
				}
			default : 
				System.out.println("Invalid Input!");
			}
		}
	
	public static void Tampilan_Menu4() {
		System.out.println("------------------------------");
		System.out.println("          Living Life         ");
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		System.out.println("           Activities         ");
		System.out.println("------------------------------");
		System.out.println("1. Healthy");
		System.out.println("2. Unhealthy");
		System.out.println("Choose your character : "); character = in.nextInt();
		
		switch(character) {
		case 1 :
			System.out.println("Healthy");
			for(Food list: activitiesHealthyEatS) {
				System.out.println("Eating		: " + list.getName());
			}
			for(Exercise list: activitiesHealthyWorkOutS) {
				System.out.println("Working Out	: " + list.getName());
			}
			System.out.println("------------------------------");
			break;
		case 2 :
			System.out.println("Unhealthy");
			for(Food list: activitiesUnhealthyEatS) {
				System.out.println("Eating		: " + list.getName());
			}
			for(Exercise list: activitiesUnhealthyWorkOutS) {
				System.out.println("Working Out	: " + list.getName());
			}break;
		default :
			System.out.println("Input tidak valid"); 
			break;
		}
	}
	
	public static void Tampilan_Menu5() {
		System.out.println("------------------------------");
		System.out.println("          Living Life         ");
		System.out.println("------------------------------");
		System.out.println("Nama   : Stephanie");
		System.out.println("NIM   `: 00000029071");
		System.out.println("Prodi  : Informatika");
	}
	
	public static void Tampilan_Menu6() {
		System.out.println("------------------------------");
		System.out.println("          Living Life         ");
		System.out.println("------------------------------");
		System.out.println("1. Healthy");
		System.out.println("2. Unhealthy");
		System.out.println("Choose your character : "); character = in.nextInt();
	}
	
	public static void main(String[] args) {
		Tampilan_Awal();
		seedDataFood();
		seedDataExercise();
		
		System.out.println("\n");
		Tampilan_Menu_Utama(); 
		input = in.nextInt();
		
		switch(input) {
		case 0 :
			System.exit(0);
			break;
		case 1:
			System.out.println("\n");
			Tampilan_Menu1();
			break;
		case 2:
			System.out.println("\n");
			Tampilan_Menu2();
			break;
		case 3:
			System.out.println("\n");
			Tampilan_Menu3();
			break;
		case 4 :
			System.out.println("\n");
			Tampilan_Menu4();
			break;
		case 5 :
			System.out.println("\n");
			Tampilan_Menu5();
			break;
		case 6 :
			System.out.println("\n");
			Tampilan_Menu6();
			break;
		default :
			System.out.println("\nInput tidak valid"); 
			break;
		}
	}
}
