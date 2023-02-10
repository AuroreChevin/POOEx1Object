package fr.fms.entities;
/**Exo 2 :  une liste de personnalité dont il faut extraire toutes les personnes nées en France ou habitant Paris.
 * 
 * @author ChevinA 2023
  * @since 1.0
 * @version 1.0
 */
public class ListOfPersonalities {
	public static void main(String[] args) {
		Person[] persons = new Person[6];
		persons[0] = new Person("Macron","Emmanuel",43,"l'Elysée à Paris", new City("Amien", "France"));
		persons[1] = new Person("Sarkozy","Nicolas",66,"Paris", new City("Paris", "France", 2000000));
		persons[2] = new Person("Johnson","Boris",56,"Downing street à London", new City("New York", "USA"));
		persons[3] = new Person("Depardieu","Gérard",72,"Moscou", new City("Châteauroux", "France"));
		persons[4]  = new Person("Kravitz","Lenny",56,"Hôtel particulier à Paris", new City("New York", "USA"));
		persons[5] = new Person("Lawrence","Jennifer",30,"Louisville Aux USA", new City("Indian Hills", "USA"));
		for(int i = 0; i<persons.length; i++) {
			System.out.println(persons[i]);
		}
		for(int i = 0; i<persons.length; i++) {
			if(persons[i].getAdress().contains("Paris") || persons[i].getBornCity().getCountry().contains("France"))
			System.out.println(persons[i]);
		}
	}	

}
