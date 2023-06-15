package DesignPatterns.DesignPatterns.adapter;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Adapter implements DataSource{
	
	private Info info;
	
	public Adapter(Info info) {
		this.info = info;
	}
	
	@Override
	public String getNomeCompleto() {
		return info.getNome() + " " + info.getCognome();

	}

	@Override
	public int getEta() {
		int dataDiNascita = this.calcolaEta(info.getDataDiNascita());
		return dataDiNascita;
	}
	
	 public int calcolaEta(LocalDate dataDiNascita) {
	        LocalDate nascita = info.getDataDiNascita();
	        LocalDate oggi = LocalDate.now();

	        Period periodo = Period.between(nascita, oggi);

	        return periodo.getYears();
	    }

}
