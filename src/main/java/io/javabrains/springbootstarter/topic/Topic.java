package io.javabrains.springbootstarter.topic;

public class Topic {

	private String id;
	private String libelle;
	private String description;
	
	public Topic() {
	}
	
	public Topic(String id, String libelle, String description) {
		this.id = id;
		this.libelle = libelle;
		this.description = description;
	}
	
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getId() {
		return id;
	}
}
