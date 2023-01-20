package com.example.demo;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Cours {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String nom;
private int VolumeHoraire;
@OneToMany(mappedBy = "cours")
private Collection<Inscription> inscription;


}
