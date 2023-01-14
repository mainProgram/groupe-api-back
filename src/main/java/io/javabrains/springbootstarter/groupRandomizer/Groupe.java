package io.javabrains.springbootstarter.groupRandomizer;

import java.util.List;

import io.javabrains.springbootstarter.etudiant.Etudiant;
import io.javabrains.springbootstarter.topic.Topic;

public class Groupe{
	private Topic sujet;
	private List<Etudiant> groupes;

	public Groupe(Topic sujet, List<Etudiant> groupes) {
		this.sujet = sujet;
		this.groupes = groupes;
	}
	public Topic getSujet() {
		return sujet;
	}
	public void setSujet(Topic sujet) {
		this.sujet = sujet;
	}
	public List<Etudiant> getGroupes() {
		return groupes;
	}
	public void setGroupes(List<Etudiant> groupes) {
		this.groupes = groupes;
	}
}