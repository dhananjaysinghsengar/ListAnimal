package model;

/**
 * @author Dhananjay Singh Sengar 
 * Data model for Pet
 */
public class Pets {

	private String name;
	private String type;

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {

		return name + " and " + type;
	}

}