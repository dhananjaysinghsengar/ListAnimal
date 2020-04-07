package model;

import java.util.List;

/**
 * @author Dhananjay Singh Sengar Data model for People
 *
 */
public class People {

	private String name;
	private String gender;
	private float age;
	private List<Pets> pets;

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public float getAge() {
		return age;
	}

	public List<Pets> getPets() {
		return pets;
	}

	@Override
	public String toString() {

		return name + "," + gender + "," + age + "," + pets;
	}
}