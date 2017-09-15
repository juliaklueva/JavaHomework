package home170809;

public class UseDictionary {
	public static void main(String[] args) {

		Dictionary<String, String> peopleAndCities = new Dictionary();
		peopleAndCities.put("Pete", "New York");
		peopleAndCities.put("John", "Boston");
		peopleAndCities.put("Mark", "Chicago");
		peopleAndCities.put("Ivan", "Moscow");

		System.out.println(peopleAndCities.get("John"));
		System.out.println(peopleAndCities.get("Ivan"));
		System.out.println(peopleAndCities.get("Ann"));

		peopleAndCities.put("Mark", "Moscow");
		System.out.println(peopleAndCities.get("Mark"));

		for (Dictionary.Pair pair : peopleAndCities) {
			System.out.println(pair.key + ": " + pair.value);
		}
		;

		System.out.println("-------");

		Dictionary<String, Integer> peopleAndPhone = new Dictionary();
		peopleAndPhone.put("Mark", 123456);
		peopleAndPhone.put("Pete", 234567);
		peopleAndPhone.put("John", 345678);
		peopleAndPhone.put("Ivan", 456789);
		for (Dictionary.Pair pair : peopleAndPhone) {
			System.out.println(pair.key + ": " + pair.value);
		}

	}
}
