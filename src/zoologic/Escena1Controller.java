package zoologic;
/**
 * 
 * @author Jordi Oscar
 */
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
/**
 * classe Controller de l'escena 1
 */
public class Escena1Controller implements Initializable {
    /**
    * atributs FXML
    */
    @FXML 
    private TextField nombre;
    
    @FXML 
    private TextField edat;
    
    @FXML 
    private CheckBox masc;
    
    @FXML 
    private CheckBox fem;
    /**
    * atributs
    */
    protected CheckBox svalor;
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
    * mètode que guarda en un XML les dades introduides en els textos y en el select del sexe
    */
    public void CrearXML(){
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            Document nodeDocument = docBuilder.newDocument();
            Element elementArrel = nodeDocument.createElement("Jugador");
            nodeDocument.appendChild(elementArrel);

            elementArrel.setAttribute("id", "1");

            Element nom = nodeDocument.createElement("nombre");
            nom.appendChild(nodeDocument.createTextNode(nombre.getText()));
            elementArrel.appendChild(nom);

            Element edat1 = nodeDocument.createElement("edat");
            edat1.appendChild(nodeDocument.createTextNode(edat.getText()));
            elementArrel.appendChild(edat1);
            
            Element sexo = nodeDocument.createElement("sexo");
            sexo.appendChild(nodeDocument.createTextNode(svalor.getText()));
            elementArrel.appendChild(sexo);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource origen = new DOMSource(nodeDocument);
            StreamResult sortidaXML = new StreamResult(new File("src/zoologic/xml/jugador.xml"));

            transformer.transform(origen, sortidaXML);

            System.out.println("Desat!");

        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }
    }
    /**
    * mètode FXML per tornar a l'escena inicial
    */
    @FXML
    private void volvermenu(ActionEvent event) throws ExcepcionPers {
        ProgramaPrincipal.escena0();
    }
    /**
    * mètode FXML per guardar el Checkbox sobre el que cliquem en l'atribut svalor
    */
    @FXML
    protected void sexo(ActionEvent event) {
        svalor = (CheckBox) event.getSource();
        if("Masculino".equals(svalor.getText())){
            fem.setSelected(false);
            masc.setSelected(true);
        }else {
            fem.setSelected(true);
            masc.setSelected(false);
        }
    }
    /**
    * mètode FXML per començar a jugar (envia a l'escena 2)
    */
    @FXML
    private void empezar(ActionEvent event) {
        CrearXML();
        Jugador Jugando=Jugador.getInstance();
        Jugando.setNombre(nombre.getText());
        Jugando.setEdat(edat.getText());
        Jugando.setSexo(svalor.getText());
        ProgramaPrincipal.escena2();
    }
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }  
    
}
