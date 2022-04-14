package entities;

public class Horse extends Animal{
	
	public static String horseHability;

	public Horse(String name, int age, String sound) {
		super(name, age, sound);

		
	}

	public static String getHorseHability() {
		return horseHability;
	}

	public static void setHorseHability(String horseHability) {
		Horse.horseHability = horseHability;
	}

}
