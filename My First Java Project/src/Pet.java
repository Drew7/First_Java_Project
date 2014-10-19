/**
 * 
 */

/**
 * @author Andrii Navrotskyi
 *
 */
public class Pet {
	int age;
	float weight;
	float height;
	String color;
	
	public void sleep() {
		System.out.println("Good night!!!");
	}

	public void eat() {
		System.out.println("I'm very hungry. Let's have some chips!!!");
	}

	public String say (String aWord){
		String petResponse = "Ohh. Ok!!! " + aWord;
		return petResponse;
	}
	
}
