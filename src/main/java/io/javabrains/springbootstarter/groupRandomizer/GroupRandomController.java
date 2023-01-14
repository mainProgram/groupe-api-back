package io.javabrains.springbootstarter.groupRandomizer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.javabrains.springbootstarter.etudiant.Etudiant;
import io.javabrains.springbootstarter.etudiant.EtudiantService;
import io.javabrains.springbootstarter.topic.Topic;
import io.javabrains.springbootstarter.topic.TopicService;

@RestController
public class GroupRandomController {
	@Autowired
	private EtudiantService etudiantService;
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/groupes")
	public  List<List<Etudiant>> groupes() {
    // Mélange de la liste des étudiants
    Collections.shuffle(etudiantService.getAllEtudiants());

    // Répartition des étudiants en groupes de 10
    List<List<Etudiant>> groups = new ArrayList<>();
    for (int i = 0; i < this.etudiantService.getAllEtudiants().size(); i += 5) {
      groups.add(this.etudiantService.getAllEtudiants().subList(i, i + 5));
    }

    // Affichage des groupes
    return groups;
  }
	@RequestMapping("/sujets")
	public  List<Topic> sujets() 
	{
	    // On crée une copie de la liste d'objets de type Topic
		List<Topic> copy = new ArrayList<>(topicService.getAllTopics());

	    // On mélange aléatoirement les éléments de la liste
	    Collections.shuffle(copy);

	    // On retourne les n premiers éléments de la liste mélangée
	    return copy.subList(0, 10);
	 }
	
	@RequestMapping("/groupes_formes")
	public List<Groupe>  melange() {
		List<Groupe> melanges = new ArrayList<Groupe>();
		List<List<Etudiant>> groupes = this.groupes();
		List<Topic> sujets = this.sujets();
		
		for(int i=0; i < sujets.size(); i++ ) {
			melanges.add(new Groupe(sujets.get(i), groupes.get(i)));
		}
		return melanges;
	}

	/*
	public  List<Topic> sujets(@PathVariable int nombreDeSujets) 
	{
	    // On crée une copie de la liste d'objets de type Topic
		List<Topic> copy = new ArrayList<>(topicService.getAllTopics());

	    // On mélange aléatoirement les éléments de la liste
	    Collections.shuffle(copy);

	    // On retourne les n premiers éléments de la liste mélangée
	    return copy.subList(0, nombreDeSujets);
	 }*/
}
