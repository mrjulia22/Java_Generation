package entities;

public class Dog extends Animal {

	private String dogHability;
	
	public Dog(String name, int age, String sound) {
		super(name, age, sound);
		
		
	}

	public String getDogHability() {
		return dogHability;
	}

	public void setDogHability(String dogHability) {
		this.dogHability = dogHability;
	}

	
	

}
