package io.javabrains.springbootstarter.etudiant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EtudiantService {
	List<Etudiant> etudiants = new ArrayList<>(Arrays.asList(
			new Etudiant("Aminata", "Ba", 34, "SEN001"),
			new Etudiant("Ibrahima", "Fall", 33, "SEN002"),
			new Etudiant("Fatou", "Diallo", 25, "SEN003"),
			new Etudiant("Mamadou", "Sarr", 32, "SEN004"),
			new Etudiant("Fatoumata", "Diouf", 29, "SEN005"),
			new Etudiant("Ousmane", "Ndiaye", 35, "SEN006"),
			new Etudiant("Marieme", "Ba", 26, "SEN007"),
			new Etudiant("Cheikh", "Sow", 28, "SEN008"),
			new Etudiant("Ndeye", "Dieng", 31, "SEN009"),	
			new Etudiant("Moussa", "Ndiaye", 30, "SEN010"),
			new Etudiant("Aminata", "Ndiaye", 34, "SEN011"),
			new Etudiant("Ibrahima", "Diagne", 33, "SEN012"),
			new Etudiant("Fatou", "Mbengue", 25, "SEN013"),
			new Etudiant("Mamadou", "Sow", 32, "SEN014"),
			new Etudiant("Fatoumata", "Touré", 29, "SEN015"),
			new Etudiant("Ousmane", "Diallo", 35, "SEN016"),
			new Etudiant("Marieme", "Gueye", 26, "SEN017"),
			new Etudiant("Cheikh", "Cissé", 28, "SEN018"),
			new Etudiant("Ndeye", "Sarr", 31, "SEN019"),
			new Etudiant("Moussa", "Ba", 30, "SEN020"),
			new Etudiant("Ami", "Ndiaye", 34, "SEN021"),
			new Etudiant("Ibra", "Diagne", 33, "SEN022"),
			new Etudiant("Fa", "Mbengue", 25, "SEN023"),
			new Etudiant("Mama", "Sow", 32, "SEN024"),
			new Etudiant("Fatou", "Touré", 29, "SEN025"),
			new Etudiant("Ouz", "Diallo", 35, "SEN026"),
			new Etudiant("Marie", "Gueye", 26, "SEN027"),
			new Etudiant("Che", "Cissé", 28, "SEN028"),
			new Etudiant("Nde", "Sarr", 31, "SEN029"),
			new Etudiant("Mous", "Ba", 30, "SEN030"),
			new Etudiant("Fatou", "Ndiaye", 25, "SEN031"),
			new Etudiant("Mamadou", "Diallo", 32, "SEN032"),
			new Etudiant("Fatoumata", "Sow", 29, "SEN033"),
			new Etudiant("Ousmane", "Mbengue", 35, "SEN034"),
			new Etudiant("Marieme", "Touré", 26, "SEN035"),
			new Etudiant("Cheikh", "Gueye", 28, "SEN036"),
			new Etudiant("Ndeye", "Cissé", 31, "SEN037"),
			new Etudiant("Moussa", "Diagne", 30, "SEN038"),
			new Etudiant("Aminata", "Ba", 34, "SEN039"),
			new Etudiant("Ibrahima", "Fall", 33, "SEN040"),
			new Etudiant("Astou", "Ndiaye", 34, "SEN041"),
			new Etudiant("Gora", "Diagne", 33, "SEN042"),
			new Etudiant("Abdou", "Mbengue", 25, "SEN043"),
			new Etudiant("Sam", "Sow", 32, "SEN044"),
			new Etudiant("Fati", "Touré", 29, "SEN045"),
			new Etudiant("Weuz", "Diallo", 35, "SEN046"),
			new Etudiant("Ida", "Gueye", 26, "SEN047"),
			new Etudiant("Iba", "Cissé", 28, "SEN048"),
			new Etudiant("Aly", "Sarr", 31, "SEN049"),
			new Etudiant("Paul", "Ba", 30, "SEN050")
		));
		
		public List<Etudiant> getAllEtudiants(){
			return etudiants;
		}
		
		public Etudiant getEtudiant(String id) {
			return etudiants.stream().filter(t -> t.getMatricule().equals(id)).findFirst().get();
		}
		
		public void addEtudiant(Etudiant topic) {
			etudiants.add(topic);
		}
		
		public void updateEtudiant(String id, Etudiant topic) {
			for (int i = 0; i < etudiants.size(); i++)
			{
				Etudiant t = etudiants.get(i);
				if(t.getMatricule().equals(id))
				{
					etudiants.set(i, topic);
					return;
				}
			}
		}
		
		public void deleteEtudiant(String id) {
			etudiants.removeIf(t -> t.getMatricule().equals(id)); 	
		}
		
		
		
		
		
}
