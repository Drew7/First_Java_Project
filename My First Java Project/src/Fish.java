/**
 * 
 */

/**
 * @author Andrii Navrotskyi
 *
 */
public class Fish extends Pet {
	int currentDepth = 0;
	public int dive(int howDeep) {
		currentDepth = currentDepth + howDeep;
		System.out.println("I'm diving on the depth " + howDeep + " meters");
		System.out.println("I'm at " + currentDepth + " meters below sea level");
		return currentDepth;		
	}
	public String say(String something) {
		return "Don't you know? Fish don't speak.";
	}
}
