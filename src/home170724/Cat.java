package home170724;

public class Cat implements Pet {

	private Brain brain = this.new Hungry();

	private class Hungry implements Brain {
		@Override
		public void feed() {
			meow();
			meow();
			fawn();
			eat();
			sleep();
			brain = new Fed();
		}

		@Override
		public void play() {
			meow();
			meow();
			jump();
			fawn();
			meow();
		}
	}

	private class Fed implements Brain {
		@Override
		public void feed() {
			sleep();
			bite();
			jump();
			goOut();
		}

		@Override
		public void play() {
			bite();
			goOut();
			jump();
			sleep();
			brain = new Hungry();
		}
	}

	@Override
	public void feed() {
		brain.feed();
	}

	@Override
	public void play() {
		brain.play();
	}

	private void eat() {
		System.out.println("eats");
	}

	private void jump() {
		System.out.println("jumps");
	}

	private void bite() {
		System.out.println("bites");
	}

	private void sleep() {
		System.out.println("sleeping");
	}

	private void fawn() {
		System.out.println("fawn");
	}

	private void meow() {
		System.out.println("meow");
	}

	private void goOut() {
		System.out.println("go out");
	}

}
