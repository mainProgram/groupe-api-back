package io.javabrains.springbootstarter.etudiant;

public class Etudiant {
	private String matricule;
	private String nom;
	private String prenom;
	private int age;
	
	public Etudiant() {}
	public Etudiant(String nom, String prenom, int age, String matricule) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMatricule() {
		return matricule;
	}
	
}
