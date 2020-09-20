public class Farm {
	public static void main(String[] args) {
		Animal pig = new Pig("Wilbur");
		System.out.println(pig);
		Animal horse = new Horse("Amberlin", "Eventing horse");
		System.out.println(horse);
		Animal[] pen = new Animal[4];
		pen[0] = pig;
		Animal horse1 = new Horse("Mr. Ed", "Show horse");
		pen[1] = horse1;
		Animal horse2 = new Horse("Secretariat", "Racing horse");
		pen[2] = horse2;
		Animal cow = new Cow("Bessie");
		pen[3] = cow;
		System.out.println("=============================");
		for (Animal animal : pen)
			System.out.println(animal);
		
		for (Animal animal : pen)
			System.out.println(animal.speak());
		
	}
}