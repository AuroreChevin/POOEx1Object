package fr.fms.entities;
import java.util.Scanner;
/**La classe TestCity contient la méthode main qui permettra de tester la classe City
 * 
 * @author ChevinA 2023
 * @since 1.0
 * @version 1.0
 */
public class TestCity {
	public static City toulouse = new City("Toulouse", "France", 450000);
	public static City lille = new City("Lille", "France", 232741);
	public static City kyoto = new City("Kyoto", "Japon", 1475000);
	public static City hull = new City("Hull", 261149);
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int data = 0;
//		1.1 Affichage des attributs des villes et changement du nombre d'habitants
//		System.out.println(toulouse.nameOfCity+ ", "+toulouse.country+", "+toulouse.nbInhabitants);
//		System.out.println(lille.nameOfCity+ ", "+lille.country+", "+lille.nbInhabitants);
//		System.out.println(kyoto.nameOfCity+ ", "+kyoto.country+", "+kyoto.nbInhabitants);
//		System.out.println(hull.nameOfCity+ ", "+hull.country+", "+hull.nbInhabitants);
//		toulouse.nbInhabitants +=20000;
//		System.out.println(toulouse.nameOfCity+ ", "+toulouse.country+", "+toulouse.nbInhabitants);
//		1.2
		System.out.println("Ville : "+toulouse.getNameOfCity()+" - Country : "+toulouse.getCountry()+ " - Nombre d'habitants : "+toulouse.getNbInhabitants());
		System.out.println("Ville : "+lille.getNameOfCity()+" - Country : "+lille.getCountry()+ " - Nombre d'habitants : "+lille.getNbInhabitants());
		System.out.println("Ville : "+kyoto.getNameOfCity()+" - Country : "+kyoto.getCountry()+ " - Nombre d'habitants : "+kyoto.getNbInhabitants());
		System.out.println("Ville : "+hull.getNameOfCity()+" - Country : "+hull.getCountry()+ " - Nombre d'habitants : "+hull.getNbInhabitants());
//		toulouse.setNbInhabitants(-200);
//		toulouse.displayCity();
		System.out.println("Donnez moi le nombre d'habitants de Toulouse");
		data = scan.nextInt();
		toulouse.setNbInhabitants(data);
		toulouse.displayCity();
//		1.3
		hull.displayCity();
		hull.setCountry("Royaume-Uni");
		hull.displayCity();
//		1.4
		lille.display();
//		 1.5 System.out.println(lille); renvoie l'adresse mémoire de l'objet "lille" parce que  la methode toString n'est pas "override"
//		1.6
		System.out.println(lille);
//		1.7 Moyen de compter le nombre d'instance de la classe city
		System.out.println(City.getInstanceCounter());
	}

}
