
public class FishMaster {

	public static void main(String[] args) {
		Fish myFish = new Fish();
		myFish.dive(3);
		myFish.dive(5);		
		System.out.println(myFish.say("Hello"));
		myFish.sleep();
	}

}
