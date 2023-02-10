package fr.fms.entities;
/**La classe Person représente une personne via ses attributs et ses méthodes.
 * Attributs : nom, prénom, âge et adresse.
 * 
 * @author ChevinA
 *
 */
public class Person {
	private String lastName;
	private String firstName;
	private int age;
	private String adress;
	private City bornCity;
	
	public Person(String lastName, String firstName, int age, String adress,City bornCity) {		
		setLastName(lastName);
		setFirstName(firstName);		
		setAge(age);
		setAdress(adress);
		setBornCity(bornCity);
	}
	public Person(String lastName, String firstName, int age) {		
		setLastName(lastName);
		setFirstName(firstName);		
		setAge(age);
		setAdress("inconnu");
	}
	public Person(String lastName, String firstName) {		
		setLastName(lastName);
		setFirstName(firstName);		
		setAge(0);
		setAdress("inconnu");
	}	
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}

	public City getBornCity() {
		return bornCity;
	}
	public void setBornCity(City bornCity) {
		this.bornCity = bornCity;
	}
	@Override
	public String toString(){
		return "Personne : [nom : "+getLastName()+", prénom : "+getFirstName()+
				", âge : "+getAge()+", adress : "+getAdress()+"] Ville de naissance : " +bornCity;
	}
	
}
