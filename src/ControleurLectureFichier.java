import java.io.IOException;

public class ControleurLectureFichier{

	
	
	public String[][] ControleurLectureFichier() throws IOException {	
	
	Airport ap = new Airport();

	//on peut faire l'encapsulation � partir de la classe airport 
	//envoyer le donn�e venant deu mod�le vers le vue
		
	ModeleLectureFichier obj = new ModeleLectureFichier();

		String[][] test;
	   
		test  = obj.ModeleLectureFichier();
		
		
		return test;
		
		
		
		}
		
	 }
	
	


