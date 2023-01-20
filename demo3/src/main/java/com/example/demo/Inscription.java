package com.example.demo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Inscription {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date date;
	private double score;
	@ManyToOne
	private Cours cours;
	@ManyToOne
	private Etudiant etudiant;
	
}
