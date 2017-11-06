import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class VueLectureFichier extends JFrame{
	

	  public VueLectureFichier() throws Exception{
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setTitle("JTable");
	    this.setSize(1400, 2700);
	    

	     
	    ControleurLectureFichier clf = new ControleurLectureFichier();
	    
	    String[][]  obj = clf.ControleurLectureFichier();
	    
	  //remplir la table de l'interface du donnée venant de fichier sous forme de table 2D
	    Object[][] data = new Object[obj.length][obj[0].length];
	    
	    
	    for(int i=0; i<obj.length;i++)
	    {
	        for(int j=0; j<obj[0].length;j++)
	        {
	        	data[i][j]=obj[i][j];
	        }
	    }
	     
	    //titre
	    String  title[] = {"AirportId", "AirportName", "CityName","Country","IATA","ICAO","LATITUDE","LONGITUDE","ALTITUDE","TIMEZONE","DST","TYMEZONETYPE","SOURCE","SOURCE 2"};
	    JTable tableau = new JTable(data, title);
	    
	    this.getContentPane().add(new JScrollPane(tableau));
	  }   
	  
}
