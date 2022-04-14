package entities;

public class Sloth extends Animal{
	
	public static String slothHability;

	public Sloth(String name, int age, String sound) {
		super(name, age, sound);

	
	}

	public static String getSlothHability() {
		return slothHability;
	}

	public static void setSlothHability(String slothHability) {
		Sloth.slothHability = slothHability;
	}
	
	

}
