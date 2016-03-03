
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
import javafx.scene.control.MenuBar;
/**
 * classe Controller de l'escena 1
 */
public class Escena2Controller implements Initializable{
    /**
    * atributs FXML
    */
    @FXML
    private MenuBar menuBar;
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
    * mètode FXML per anar a l'escena dels animals acuàtics
    */
    @FXML
    private void iracuaticos(ActionEvent event) {
        ProgramaPrincipal.escena4();
    }
    /**
    * mètode FXML per anar a l'escena dels animals voladors
    */
    @FXML
    private void irvoladores(ActionEvent event) {
        ProgramaPrincipal.escena5();
    }
    /**
    * mètode FXML per anar a l'escena dels animals terrestres
    */
    @FXML
    private void irterrestres(ActionEvent event) {
        ProgramaPrincipal.escena6();
    }
    /**
    * mètode FXML per anar a l'escena de la tenda d'animals
    */
    @FXML
    private void irtienda(ActionEvent event) {
        ProgramaPrincipal.escena7();
    }
    /**
    * mètode FXML per anar a l'escena de les dades del jugador (en el menú superior)
    */
    @FXML
    private void datosjugador(ActionEvent event) {
        ProgramaPrincipal.escena3();
    }
    /**
    * mètode FXML per tornar al menu principal (en el menú superior)
    */
    @FXML
    private void volvermenu(ActionEvent event) throws ExcepcionPers {
        ProgramaPrincipal.escena0();
    }
    /**
    * mètode FXML per sortir del joc (en el menú superior)
    */
    @FXML
    private void salir(ActionEvent event){
       System.exit(0);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
}
