package home170724;

public class TakeCare {

	public static void main(String[] args) {

		Pet pet = new Cat();

		pet.play();
		System.out.println("---");
		pet.feed();
		System.out.println("---");
		pet.feed();
		System.out.println("---");
		pet.play();
		System.out.println("---");
		pet.play();

		System.out.println("---");
		System.out.println("---");

		Pet rat = new Rat();

		rat.play();
		System.out.println("---");
		rat.feed();
		System.out.println("---");
		rat.feed();
		System.out.println("---");
		rat.play();
		System.out.println("---");
		rat.play();
	}

}
