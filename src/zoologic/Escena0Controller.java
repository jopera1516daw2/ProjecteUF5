package zoologic;
/**
 * 
 * @author Jordi Oscar
 */
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
/**
 * classe Controller de l'escena 0
 */
public class Escena0Controller implements Initializable {
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
    * mètode FXML al clicar en un botó
    */
    @FXML
    private void nuevapartida(ActionEvent event) {
        ProgramaPrincipal.escena1();
    }
    /**
    * mètode FXML al clicar en un botó
    */
    @FXML
    private void salir(ActionEvent event){
       System.exit(0);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
}
