package DesignPatterns.DesignPatterns.adapter;

import java.time.LocalDate;
import java.util.Date;

import lombok.Data;

@Data
public class Info { 
	 private String nome; 
	 private String cognome; 
	 private LocalDate dataDiNascita; 
	 
	 public String getNome() { 
		 return nome;
		 } 
	 
	 public void setNome(String nome) {
		 this.nome = nome;
		 } 
	 
	 public String getCognome() {
		 return cognome;
		 } 
	 
	 public void setCognome(String cognome) {
		 this. cognome = cognome;
		 } 
	 
	 public LocalDate getDataDiNascita() { 
		 return dataDiNascita;
		 } 
	 
	 public void setDataDiNascita (LocalDate dataDiNascita) {
		 this. dataDiNascita = dataDiNascita;
		 } 
	 
	}