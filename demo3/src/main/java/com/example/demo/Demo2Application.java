package com.example.demo;

import java.util.Date;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Demo2Application implements CommandLineRunner {
@Autowired
private CoursRepository coursRepository;
@Autowired
private EtudiantRepository etudiantRepository;
@Autowired
private InscriptionRepository inscriptionRepository;
	public static void main(String[] args) {
SpringApplication.run(Demo2Application.class, args);

}
		
@Override
public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
etudiantRepository.save(new Etudiant(null,"Mazen","Haouari",null));
etudiantRepository.save(new Etudiant(null,"Louey","Haouari",null));
etudiantRepository.save(new Etudiant(null,"ali","Zein",null));
coursRepository.save(new Cours (null,"Math",10,null));
coursRepository.save(new Cours(null,"Physique",15,null));
coursRepository.save(new Cours(null,"Arabe",10,null));
Cours cours1=coursRepository.findById(1L).get();
Etudiant etudiant1=etudiantRepository.findById(1L).get();
Cours cours2=coursRepository.findById(2L).get();
Etudiant etudiant2=etudiantRepository.findById(2l).get();
inscriptionRepository.save(new Inscription(null,new Date(),15,cours1,etudiant1));
inscriptionRepository.save(new Inscription(null,new Date(),15,cours2,etudiant2));
Cours coursBD=coursRepository.findById(2L).get();
inscriptionRepository.findByCours(coursBD).forEach(c->{
	System.out.println(c.getEtudiant().getId());
	System.out.println(c.getDate());
	System.out.println(c.getEtudiant().getNom());
	System.out.println(c.getCours().getVolumeHoraire());
});
}

}


