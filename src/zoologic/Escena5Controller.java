
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
 * classe Controller de l'escena 5
 */
public class Escena5Controller implements Initializable{
    /**
    * atributs FXML
    */    
    @FXML private ImageView pelicano1;
    @FXML private ImageView pelicano2;
    @FXML private ImageView pelicano3;
    @FXML private ImageView pelicano4; 
    @FXML private ImageView pelicano5;
    
    @FXML private ImageView loro1;
    @FXML private ImageView loro2;
    @FXML private ImageView loro3;
    @FXML private ImageView loro4; 
    @FXML private ImageView loro5;
    
    @FXML private ImageView buitre1;
    @FXML private ImageView buitre2;
    @FXML private ImageView buitre3;
    @FXML private ImageView buitre4; 
    @FXML private ImageView buitre5;
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
    private void datospelicano1() {
        ProgramaPrincipal.escena8("pelicano1");
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datospelicano2() {
        ProgramaPrincipal.escena8("pelicano2");
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datospelicano3() {
        ProgramaPrincipal.escena8("pelicano3");
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datospelicano4() {
        ProgramaPrincipal.escena8("pelicano4");
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datospelicano5() {
        ProgramaPrincipal.escena8("pelicano5");
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datosloro1() {
        ProgramaPrincipal.escena8("loro1");
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datosloro2() {
        ProgramaPrincipal.escena8("loro2");
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datosloro3() {
        ProgramaPrincipal.escena8("loro3");
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datosloro4() {
        ProgramaPrincipal.escena8("loro4");
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datosloro5() {
        ProgramaPrincipal.escena8("loro5");
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datosbuitre1() {
        ProgramaPrincipal.escena8("buitre1");
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datosbuitre2() {
        ProgramaPrincipal.escena8("buitre2");
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datosbuitre3() {
        ProgramaPrincipal.escena8("buitre3");
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datosbuitre4() {
        ProgramaPrincipal.escena8("buitre4");
    }
    /**
    * mètode FXML per accedir a l'escena de les dades de l'animal que cliquem (escena 8)
    */
    @FXML
    private void datosbuitre5() {
        ProgramaPrincipal.escena8("buitre5");
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
        
        if(Jugando.getPelicanos()>0){
            Pelicano Pelicano1=Pelicano.getInstance1();
            Pelicano Pelicano2=Pelicano.getInstance2();
            Pelicano Pelicano3=Pelicano.getInstance3();
            Pelicano Pelicano4=Pelicano.getInstance4();
            Pelicano Pelicano5=Pelicano.getInstance5();
            mostrar(Pelicano1, pelicano1);
            mostrar(Pelicano2, pelicano2);
            mostrar(Pelicano3, pelicano3);
            mostrar(Pelicano4, pelicano4);
            mostrar(Pelicano5, pelicano5);
        }
        
        if(Jugando.getLoros()>0){
            Loro Loro1=Loro.getInstance1();
            Loro Loro2=Loro.getInstance2();
            Loro Loro3=Loro.getInstance3();
            Loro Loro4=Loro.getInstance4();
            Loro Loro5=Loro.getInstance5();
            mostrar(Loro1, loro1);
            mostrar(Loro2, loro2);
            mostrar(Loro3, loro3);
            mostrar(Loro4, loro4);
            mostrar(Loro5, loro5);
        }
        
        if(Jugando.getBuitres()>0){
            Buitre Buitre1=Buitre.getInstance1();
            Buitre Buitre2=Buitre.getInstance2();
            Buitre Buitre3=Buitre.getInstance3();
            Buitre Buitre4=Buitre.getInstance4();
            Buitre Buitre5=Buitre.getInstance5();
            mostrar(Buitre1, buitre1);
            mostrar(Buitre2, buitre2);
            mostrar(Buitre3, buitre3);
            mostrar(Buitre4, buitre4);
            mostrar(Buitre5, buitre5);
        }
        
    }
    
    
}
