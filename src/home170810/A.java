package home170810;

import java.util.Random;

class A implements Comparable<A> {
	static Random r = new Random();
	int x = r.nextInt(Limit.LIMIT);

	@Override
	public String toString() {
		return Integer.toString(x);
	}

	@Override
	public int compareTo(A other) {
		return x - other.x;
	}
}
