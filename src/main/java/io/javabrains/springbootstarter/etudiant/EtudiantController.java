package io.javabrains.springbootstarter.etudiant;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController	
public class EtudiantController {
	@Autowired
	private EtudiantService etudiantService;
	
	@RequestMapping("/etudiants")
	public List<Etudiant> getAllEtudiants() {
		return  etudiantService.getAllEtudiants();
	}
	
	@RequestMapping("/etudiants/{id}")
	public Etudiant getEtudiant(@PathVariable String id) {
		return  etudiantService.getEtudiant(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/etudiants")
	public void addEtudiant(@RequestBody Etudiant topic) {
		etudiantService.addEtudiant(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/etudiants/{id}")
	public void updateEtudiant(@RequestBody Etudiant topic, @PathVariable String id) {
		etudiantService.updateEtudiant(id, topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/etudiants/{id}")
	public void deleteEtudiant(@PathVariable String id) {
		etudiantService.deleteEtudiant(id);
	}
}
