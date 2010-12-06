package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
  		List<Recado> recados = Recado.all().fetch();
			render(recados);
    }
		
		public static void cadastrar(String autor, String texto) {
			Recado recado = new Recado(autor, texto);
			recado.save();
			
			index();
		}
		
		public static void gostei(Long id) {
			Recado recado = Recado.find("id",id).first();
			recado.gostei();
			index();
		}
		
		public static void naoGostei(Long id) {
			Recado recado = Recado.find("id",id).first();
			recado.naoGostei();
			index();
		}
		
		public static void deletar(Long id) {
			Recado recado = Recado.find("id",id).first();
			recado.delete();
			index();
		}
}