package fr.fms.entities;
/**La classe TestPerson contient la méthode main qui permettra de tester la classe Person
 * 
 * @author ChevinA 2023
 * @since 1.0
 * @version 1.0
 */
public class TestPerson {
	public static Person josh = new Person("Homme", "Joshua", 49, "Californie aux USA", new City("Johua Tree", "USA"));
	public static Person tom = new Person("Morello", "Thomas", 58);
	public static Person ben = new Person("Harper", "Benjamin");
	
	public static void main(String[] args) {
		System.out.println(josh);
		System.out.println(tom);
		System.out.println(ben);

	}

}
