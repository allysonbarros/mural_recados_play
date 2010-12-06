package models;

import play.*;
import play.db.jpa.*;
import javax.persistence.*;
import java.util.*;

@Entity
public class Recado extends Model {
	
	String autor;
	String texto;
	int	gostei;
	int naoGostei;
	
	public Recado(String autor, String texto) {
		this.autor = autor;
		this.texto = texto;
		this.gostei = 0;
		this.naoGostei = 0;
	}
	
	public void gostei() {
		this.gostei++;
		this.save();
	}
	
	public void naoGostei() {
		this.naoGostei++;
		this.save();
	}
	
}

