
package zoologic;
/**
 * 
 * @author Jordi Oscar
 */
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
/**
 * classe Controller de l'escena 3
 */
public class Escena3Controller implements Initializable, Comparable<Jugador>{
    /**
    * atributs FXML
    */
    @FXML
    private TextField datosnombre;
    
    @FXML
    private TextField datosedat;
    
    @FXML
    private TextField datossexo;
    
    @FXML
    private TextField datosdinero;
    
    @FXML
    private TextField terrestres;
    
    @FXML
    private TextField voladores;
    
    @FXML
    private TextField acuaticos;
    /**
    * atributs
    */
    private Juego ProgramaPrincipal;
    /**
    * mètode que asigna a ProgramaPrincipal 
    * quan es truca a aquest mètode, s'asinga l'escena
    * @param ProgramaPrincipal indica un Juego
    */
    public void setProgramaPrincipal(Juego ProgramaPrincipal) {
        this.ProgramaPrincipal = ProgramaPrincipal;
    }
    /**
    * mètode utilitzat per fer el comparable
     * @return 45
    */
    public int getMaximoAnimales(){
        return 45;
    }
    /**
    * mètode comparable, per veure quines llistes d'animals tenen més de 5 animals
     * @param j indica el Jugador, del que compararme la quantitat d'animals que té
    */
    @Override
    public int compareTo(Jugador j) {
        if (this.getMaximoAnimales() > j.getAnimales()) return 1;
        else if (this.getMaximoAnimales() < j.getAnimales()) return -1;
        else return 0;
    }
    
    /**
    * mètode que llegeix del XML les dades del jugador
    */
    public void LecturaXML() {
        try {
            File song = new File("src/zoologic/xml/jugador.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(song);
            doc.getDocumentElement().normalize();

            System.out.println("arrel " + doc.getDocumentElement().getNodeName());
            NodeList nodes = doc.getElementsByTagName("Jugador");
            System.out.println("==========================");

            for (int i = 0; i < nodes.getLength(); i++) {
                Node node = nodes.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    datosnombre.setText(obtenirContingut("nombre", element));
                    datosedat.setText(obtenirContingut("edat", element));
                    datossexo.setText(obtenirContingut("sexo", element));
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private static String obtenirContingut(String etiqueta, Element element) {
        NodeList nodes = element.getElementsByTagName(etiqueta).item(0).getChildNodes();
        Node node = (Node) nodes.item(0);
        return node.getNodeValue();
    }
    /**
    * mètode FXML per tornar al joc (a l'escena del mapa)
    */
    @FXML
    private void volverjuego(ActionEvent event) {
        ProgramaPrincipal.escena2();
    }
    /**
    * quan es carrega l'escena, s'asignen als camps de dades de jugadors els valors pertinents
    * es crea un arraylist on introduïm les llistes d'animals (terrestres, acuatics, voladors)
    * utilitzem les col·leccions i el comparator per ordenar les llistes
    * s'utilitza el compareTo per veure quan hem conseguit tenir tots els animals
    */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        LecturaXML();
        Jugador Jugando = Jugador.getInstance();
        Terrestre TerrestresList = Terrestre.getInstance();
        Acuatico AcuaticosList = Acuatico.getInstance();
        Volador VoladoresList = Volador.getInstance();
        
        datosdinero.setText(Integer.toString((int) Jugando.getDinero()));
        terrestres.setText(Integer.toString((int) TerrestresList.getNum()));
        acuaticos.setText(Integer.toString((int) AcuaticosList.getNum()));
        voladores.setText(Integer.toString((int) VoladoresList.getNum()));
        
        datosnombre.setEditable(false);
        datosedat.setEditable(false);
        datossexo.setEditable(false);
        datosdinero.setEditable(false);
        terrestres.setEditable(false);
        acuaticos.setEditable(false);
        voladores.setEditable(false);
        
        List<Animal> a = new ArrayList<Animal>();
        a.add(TerrestresList);
        a.add(AcuaticosList);
        a.add(VoladoresList);
        Collections.sort(a, new SizeComparator());
        System.out.println("Tipos de animales, ordenados por los que más tienes:");
        for (Animal animal : a)
            System.out.println(animal+" - animales: "+animal.getNum());

        int resultado=this.compareTo(Jugando);
        if (resultado==0){
            System.out.println("¡Felicidades, has conseguido tener todos los animales posibles y mantenerlos vivos!");
            System.out.println("¡Has completado el Juego!");
        }else{
            System.out.println("¡Sigue jugando, aún puedes tener más animales!");
        }
    }
}
