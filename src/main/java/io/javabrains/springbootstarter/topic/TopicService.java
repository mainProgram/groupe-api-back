package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	List<Topic> topics = new ArrayList<>(Arrays.asList(
		new Topic("1", "Introduction au DevOps", "Présentation du concept de DevOps et de ses enjeux pour les entreprises"),
		new Topic("2", "Outils de collaboration", "Présentation des outils de collaboration et de gestion de projet utilisés en DevOps"),
		new Topic("3", "Intégration continue", "Présentation de l'intégration continue et de son rôle dans le développement de logiciels"),
		new Topic("4", "Gestion de configuration", "Présentation des outils de gestion de configuration et de leur utilisation en DevOps"),
		new Topic("5", "Déploiement continu", "Présentation du déploiement continu et de ses avantages pour les équipes de développement"),
		new Topic("6", "Monitoring et alerting", "Présentation des outils de monitoring et d'alerting utilisés en DevOps"),
		new Topic("7", "Gestion de la sécurité", "Présentation de la gestion de la sécurité en DevOps et des bonnes pratiques à suivre"),
		new Topic("8", "Gestion des ressources", "Présentation de la gestion des ressources en DevOps et des outils utilisés pour optimiser l'utilisation des ressources"),
		new Topic("9", "Gestion de la qualité", "Présentation de la gestion de la qualité en DevOps et des outils utilisés pour s'assurer de la qualité des logiciels développés"),
		new Topic("10", "Tendances et futur du DevOps", "Présentation des tendances et du futur du DevOps et de l'évolution attendue de ce domaine de l'informatique")
	));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
	
	public void updateTopic(String id, Topic topic) {
		for (int i = 0; i < topics.size(); i++)
		{
			Topic t = topics.get(i);
			if(t.getId().equals(id))
			{
				topics.set(i, topic);
				return;
			}
		}
	}
	
	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id)); 	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
