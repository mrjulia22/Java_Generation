package entities;

public abstract class Animal {

	private String typeAnimal;

	public Animal(String typeAnimal) {
		this.typeAnimal = typeAnimal;
	}

	abstract public void name(String nameAnimal);

	abstract public void age(int ageAnimal);

	abstract public void sound(String soundAnimal);

	public String getTypeAnimal() {
		return typeAnimal;
	}

	public void setTypeAnimal(String typeAnimal) {
		this.typeAnimal = typeAnimal;
	}

}
