
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
 * classe Controller de l'escena 6
 */
public class Escena6Controller implements Initializable{
    /**
    * atributs FXML
    */        
    @FXML private ImageView leon1;
    @FXML private ImageView leon2;
    @FXML private ImageView leon3;
    @FXML private ImageView leon4; 
    @FXML private ImageView leon5;
    
    @FXML private ImageView elefante1;
    @FXML private ImageView elefante2;
    @FXML private ImageView elefante3;
    @FXML private ImageView elefante4; 
    @FXML private ImageView elefante5;
    
    @FXML private ImageView mono1;
    @FXML private ImageView mono2;
    @FXML private ImageView mono3;
    @FXML private ImageView mono4; 
    @FXML private ImageView mono5;
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
    private void datosleon1() {
        ProgramaPrincipal.escena8("leon1");
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datosleon2() {
        ProgramaPrincipal.escena8("leon2");
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datosleon3() {
        ProgramaPrincipal.escena8("leon3");
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datosleon4() {
        ProgramaPrincipal.escena8("leon4");
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datosleon5() {
        ProgramaPrincipal.escena8("leon5");
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datoselefante1() {
        ProgramaPrincipal.escena8("elefante1");
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datoselefante2() {
        ProgramaPrincipal.escena8("elefante2");
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datoselefante3() {
        ProgramaPrincipal.escena8("elefante3");
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datoselefante4() {
        ProgramaPrincipal.escena8("elefante4");
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datoselefante5() {
        ProgramaPrincipal.escena8("elefante5");
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datosmono1() {
        ProgramaPrincipal.escena8("mono1");
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datosmono2() {
        ProgramaPrincipal.escena8("mono2");
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datosmono3() {
        ProgramaPrincipal.escena8("mono3");
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datosmono4() {
        ProgramaPrincipal.escena8("mono4");
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datosmono5() {
        ProgramaPrincipal.escena8("mono5");
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
        
        if(Jugando.getLeones()>0){
            Leon Leon1=Leon.getInstance1();
            Leon Leon2=Leon.getInstance2();
            Leon Leon3=Leon.getInstance3();
            Leon Leon4=Leon.getInstance4();
            Leon Leon5=Leon.getInstance5();
            mostrar(Leon1, leon1);
            mostrar(Leon2, leon2);
            mostrar(Leon3, leon3);
            mostrar(Leon4, leon4);
            mostrar(Leon5, leon5);
        }
        
        if(Jugando.getElefantes()>0){
            Elefante Elefante1=Elefante.getInstance1();
            Elefante Elefante2=Elefante.getInstance2();
            Elefante Elefante3=Elefante.getInstance3();
            Elefante Elefante4=Elefante.getInstance4();
            Elefante Elefante5=Elefante.getInstance5();
            mostrar(Elefante1, elefante1);
            mostrar(Elefante2, elefante2);
            mostrar(Elefante3, elefante3);
            mostrar(Elefante4, elefante4);
            mostrar(Elefante5, elefante5);
        }
        
        if(Jugando.getMonos()>0){
            Mono Mono1=Mono.getInstance1();
            Mono Mono2=Mono.getInstance2();
            Mono Mono3=Mono.getInstance3();
            Mono Mono4=Mono.getInstance4();
            Mono Mono5=Mono.getInstance5();
            mostrar(Mono1, mono1);
            mostrar(Mono2, mono2);
            mostrar(Mono3, mono3);
            mostrar(Mono4, mono4);
            mostrar(Mono5, mono5);
        }
        
    }
    
    
}
