import java.io.IOException;

public class ControleurLectureFichier{

	
	
	public String[][] ControleurLectureFichier() throws IOException {	
	
	Airport ap = new Airport();

	//on peut faire l'encapsulation à partir de la classe airport 
	//envoyer le donnée venant deu modèle vers le vue
		
	ModeleLectureFichier obj = new ModeleLectureFichier();

		String[][] test;
	   
		test  = obj.ModeleLectureFichier();
		
		
		return test;
		
		
		
		}
		
	 }
	
	


