package home170724;

public class Rat implements Pet {

	private RatBrain brain = new RatBrainHangry(this);

	@Override
	public void feed() {
		brain.feed();
	}

	@Override
	public void play() {
		brain.play();
	}

	public void setBrain(RatBrain brain) {
		this.brain = brain;
	}

	public void jump() {
		System.out.println("jumps");
	}

	public void bite() {
		System.out.println("bites");
	}

	public void eat() {
		System.out.println("eats");
	}

	public void gone() {
		System.out.println("gone");
	}

	public void findSomeFood() {
		System.out.println("find some food");
	}

	public void figthForFoodOrDie() {
		System.out.println("fight for food");
	}
}

interface RatBrain extends Brain {

}

class RatBrainHangry implements RatBrain {
	private Rat rat;

	public RatBrainHangry(Rat rat) {
		this.rat = rat;
	}

	@Override
	public void feed() {
		rat.findSomeFood();
		rat.figthForFoodOrDie();
		rat.bite();
		rat.eat();
		rat.jump();
		rat.gone();
		rat.setBrain(new RatBrainFed(rat));
	}

	@Override
	public void play() {
		rat.bite();
		rat.eat();
		rat.jump();
		rat.gone();
	}
}

class RatBrainFed implements RatBrain {
	private Rat rat;

	public RatBrainFed(Rat rat) {
		this.rat = rat;
	}

	@Override
	public void feed() {
		rat.eat(); // потому что крыыса всегда
					// голодна
		rat.jump();
		rat.gone();
		rat.bite();
	}

	@Override
	public void play() {
		rat.bite();
		rat.eat();// может и палец оттяпать
		rat.jump();
		rat.gone();
		rat.setBrain(new RatBrainHangry(rat));
	}

}
