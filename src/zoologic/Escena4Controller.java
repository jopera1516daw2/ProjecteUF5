
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
import javafx.scene.image.ImageView;
/**
 * classe Controller de l'escena 4
 */
public class Escena4Controller implements Initializable{
    /**
    * atributs FXML
    */    
    @FXML private ImageView delfin1;
    @FXML private ImageView delfin2;
    @FXML private ImageView delfin3;
    @FXML private ImageView delfin4; 
    @FXML private ImageView delfin5;
    
    @FXML private ImageView tiburon1;
    @FXML private ImageView tiburon2;
    @FXML private ImageView tiburon3;
    @FXML private ImageView tiburon4; 
    @FXML private ImageView tiburon5;
    
    @FXML private ImageView tortuga1;
    @FXML private ImageView tortuga2;
    @FXML private ImageView tortuga3;
    @FXML private ImageView tortuga4; 
    @FXML private ImageView tortuga5;
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
    * mètode per mostrar una imatge o deixar de mostrar-la
    * @param instance indica una instancia Delfin
    * @param animal indica una imatge
    */
    public void mostrar(Animal instance, ImageView animal){
        if(instance.getEdat()>0){
            animal.setVisible(true);
        }else{
            animal.setVisible(false);
        }
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datosdelfin1() {
        ProgramaPrincipal.escena8("delfin1");
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datosdelfin2() {
        ProgramaPrincipal.escena8("delfin2");
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datosdelfin3() {
        ProgramaPrincipal.escena8("delfin3");
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datosdelfin4() {
        ProgramaPrincipal.escena8("delfin4");
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datosdelfin5() {
        ProgramaPrincipal.escena8("delfin5");
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datostiburon1() {
        ProgramaPrincipal.escena8("tiburon1");
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datostiburon2() {
        ProgramaPrincipal.escena8("tiburon2");
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datostiburon3() {
        ProgramaPrincipal.escena8("tiburon3");
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datostiburon4() {
        ProgramaPrincipal.escena8("tiburon4");
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datostiburon5() {
        ProgramaPrincipal.escena8("tiburon5");
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datostortuga1() {
        ProgramaPrincipal.escena8("tortuga1");
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datostortuga2() {
        ProgramaPrincipal.escena8("tortuga2");
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datostortuga3() {
        ProgramaPrincipal.escena8("tortuga3");
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datostortuga4() {
        ProgramaPrincipal.escena8("tortuga4");
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datostortuga5() {
        ProgramaPrincipal.escena8("tortuga5");
    }
    /**
    * mètode FXML per tornar a l'escena del mapa
    */
    @FXML
    private void volvermapa(ActionEvent event) {
        ProgramaPrincipal.escena2();
    }
    /**
    * quan es carrega l'escena, es comproba quins animals tenim i mostrem els que toca 
    */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        Jugador Jugando = Jugador.getInstance();
        
        if(Jugando.getDelfines()>0){
            Delfin Delfin1=Delfin.getInstance1();
            Delfin Delfin2=Delfin.getInstance2();
            Delfin Delfin3=Delfin.getInstance3();
            Delfin Delfin4=Delfin.getInstance4();
            Delfin Delfin5=Delfin.getInstance5();
            mostrar(Delfin1, delfin1);
            mostrar(Delfin2, delfin2);
            mostrar(Delfin3, delfin3);
            mostrar(Delfin4, delfin4);
            mostrar(Delfin5, delfin5);
        }
        
        if(Jugando.getTiburones()>0){
            Tiburon Tiburon1=Tiburon.getInstance1();
            Tiburon Tiburon2=Tiburon.getInstance2();
            Tiburon Tiburon3=Tiburon.getInstance3();
            Tiburon Tiburon4=Tiburon.getInstance4();
            Tiburon Tiburon5=Tiburon.getInstance5();
            mostrar(Tiburon1, tiburon1);
            mostrar(Tiburon2, tiburon2);
            mostrar(Tiburon3, tiburon3);
            mostrar(Tiburon4, tiburon4);
            mostrar(Tiburon5, tiburon5);
        }
        
        if(Jugando.getTortugas()>0){
            Tortuga Tortuga1=Tortuga.getInstance1();
            Tortuga Tortuga2=Tortuga.getInstance2();
            Tortuga Tortuga3=Tortuga.getInstance3();
            Tortuga Tortuga4=Tortuga.getInstance4();
            Tortuga Tortuga5=Tortuga.getInstance5();
            mostrar(Tortuga1, tortuga1);
            mostrar(Tortuga2, tortuga2);
            mostrar(Tortuga3, tortuga3);
            mostrar(Tortuga4, tortuga4);
            mostrar(Tortuga5, tortuga5);
        }
        
    }
    
    
}