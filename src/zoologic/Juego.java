package zoologic;
/**
 * 
 * @author Jordi Oscar
 */
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
/**
 * classe principal del Joc JavaFX
 */
public class Juego extends Application {
    /**
    * atributs
    * stageprincipal indica el Stage de l'aplicacio
    * rootPane indica el Pane de stageprincipal
    * modificando s'utiliza per desar l'animal que estic modificant, per quan tenim que accedir a la escena d'alimentar un animal
    */
    private Stage stagePrincipal;
    private AnchorPane rootPane;
    protected String modificando;
    /**
    * mètode start
    * es mostra la utilització de la classe interna
    * es truca a la funció escena0
    * @param stagePrincipal indica el Stage
    */
    @Override
    public void start(Stage stagePrincipal) throws Exception {
        Juego j=new Juego();
        j.crearInterna();
        this.stagePrincipal = stagePrincipal;
        escena0();       
    }
    /**
    * classe interna
    */
    class Interna{
        /**
        * mètode que mostra un missatge de benvinguda al joc
        */
        public void mensaje(){
            System.out.println("¡Bienvenido a Zoologic! ");
        }
    }
    /**
    * mètode que crea una instancia de la classe interna i truca al mètode mensaje
    */
    public void crearInterna(){
        Interna interna = new Interna();
        interna.mensaje();
    }
    
    /**
    * mètode que correspon a la escena inicial i llença la excepcio personalitzada
    * agafa les dades del fxml i del controler corresponent
     * @throws zoologic.ExcepcionPers
    */
    public void escena0() throws ExcepcionPers {
        try {
            FXMLLoader loader = new FXMLLoader(Juego.class.getResource("Escena0.fxml"));
            rootPane=(AnchorPane) loader.load();
            Scene scene = new Scene(rootPane);
            stagePrincipal.setTitle("Zoologic");
            stagePrincipal.setScene(scene);
            scene.getStylesheets().add(Juego.class.getResource("css/style.css").toExternalForm());
            Escena0Controller controller = loader.getController();
            controller.setProgramaPrincipal(this);
            stagePrincipal.show();
        } catch (IOException e) {
            throw new ExcepcionPers("¡No se ha podido cargar el Juego!");
        }
    }
    /**
    * mètode que correspon a la escena de log-in
    * agafa les dades del fxml i del controler corresponent
    */
    public void escena1() {
        try {
            FXMLLoader loader = new FXMLLoader(Juego.class.getResource("Escena1Login.fxml"));
            rootPane=(AnchorPane) loader.load();
            Scene scene = new Scene(rootPane);
            stagePrincipal.setTitle("Zoologic");
            stagePrincipal.setScene(scene);
            scene.getStylesheets().add(Juego.class.getResource("css/style.css").toExternalForm());
            Escena1Controller controller = loader.getController();
            controller.setProgramaPrincipal(this);
            stagePrincipal.show();

        } catch (Exception e) {
            System.out.println("No se ha podido cargar la escena.");
        }
    }
    /**
    * mètode que correspon a la escena del mapa del zoo
    * agafa les dades del fxml i del controler corresponent
    */
    public void escena2() {
        try {
            empezarTiempo();
            FXMLLoader loader = new FXMLLoader(Juego.class.getResource("Escena2Mapa.fxml"));
            rootPane=(AnchorPane) loader.load();
            Scene scene = new Scene(rootPane);
            stagePrincipal.setTitle("Zoologic");
            stagePrincipal.setScene(scene);
            scene.getStylesheets().add(Juego.class.getResource("css/style.css").toExternalForm());
            Escena2Controller controller = loader.getController();
            controller.setProgramaPrincipal(this);
            stagePrincipal.show();
            

        } catch (Exception e) {
            System.out.println("No se ha podido cargar la escena.");
        }
    }
    /**
    * mètode que correspon a la escena de les dades del jugador
    * agafa les dades del fxml i del controler corresponent
    */
    public void escena3() {
        try {
            FXMLLoader loader = new FXMLLoader(Juego.class.getResource("Escena3DatosJugador.fxml"));
            rootPane=(AnchorPane) loader.load();
            Scene scene = new Scene(rootPane);
            stagePrincipal.setTitle("Zoologic");
            stagePrincipal.setScene(scene);
            scene.getStylesheets().add(Juego.class.getResource("css/style.css").toExternalForm());
            Escena3Controller controller = loader.getController();
            controller.setProgramaPrincipal(this);
            stagePrincipal.show();

        } catch (Exception e) {
            System.out.println("No se ha podido cargar la escena.");
        }
    }
    /**
    * mètode que correspon a la escena dels animals acuàtics
    * agafa les dades del fxml i del controler corresponent
    */
    public void escena4() {
        try {
            FXMLLoader loader = new FXMLLoader(Juego.class.getResource("Escena4Acuaticos.fxml"));
            rootPane=(AnchorPane) loader.load();
            Scene scene = new Scene(rootPane);
            stagePrincipal.setTitle("Zoologic");
            stagePrincipal.setScene(scene);
            scene.getStylesheets().add(Juego.class.getResource("css/style.css").toExternalForm());
            Escena4Controller controller = loader.getController();
            controller.setProgramaPrincipal(this);
            stagePrincipal.show();

        } catch (Exception e) {
            System.out.println("No se ha podido cargar la escena.");
        }
    }
    /**
    * mètode que correspon a la escena dels animals voladors
    * agafa les dades del fxml i del controler corresponent
    */
    public void escena5() {
        try {
            FXMLLoader loader = new FXMLLoader(Juego.class.getResource("Escena5Voladores.fxml"));
            rootPane=(AnchorPane) loader.load();
            Scene scene = new Scene(rootPane);
            stagePrincipal.setTitle("Zoologic");
            stagePrincipal.setScene(scene);
            scene.getStylesheets().add(Juego.class.getResource("css/style.css").toExternalForm());
            Escena5Controller controller = loader.getController();
            controller.setProgramaPrincipal(this);
            stagePrincipal.show();

        } catch (Exception e) {
            System.out.println("No se ha podido cargar la escena.");
        }
    }
    /**
    * mètode que correspon a la escena dels animals terrestres
    * agafa les dades del fxml i del controler corresponent
    */
    public void escena6() {
        try {
            FXMLLoader loader = new FXMLLoader(Juego.class.getResource("Escena6Terrestres.fxml"));
            rootPane=(AnchorPane) loader.load();
            Scene scene = new Scene(rootPane);
            stagePrincipal.setTitle("Zoologic");
            stagePrincipal.setScene(scene);
            scene.getStylesheets().add(Juego.class.getResource("css/style.css").toExternalForm());
            Escena6Controller controller = loader.getController();
            controller.setProgramaPrincipal(this);
            stagePrincipal.show();

        } catch (Exception e) {
            System.out.println("No se ha podido cargar la escena.");
        }
    }
    /**
    * mètode que correspon a la escena de la tenda d'animals
    * agafa les dades del fxml i del controler corresponent
    */
    public void escena7() {
        try {
            FXMLLoader loader = new FXMLLoader(Juego.class.getResource("Escena7Tienda.fxml"));
            rootPane=(AnchorPane) loader.load();
            Scene scene = new Scene(rootPane);
            stagePrincipal.setTitle("Zoologic");
            stagePrincipal.setScene(scene);
            scene.getStylesheets().add(Juego.class.getResource("css/style.css").toExternalForm());
            Escena7Controller controller = loader.getController();
            controller.setProgramaPrincipal(this);
            stagePrincipal.show();

        } catch (Exception e) {
            System.out.println("No se ha podido cargar la escena.");
        }
    }
    /**
    * mètode que correspon a la escena de les dades d'animal
    * agafa les dades del fxml i del controler corresponent
    * @param modificando indica l'animal que em clicat i volem accedir a les seves dades
    */
    public void escena8(String modificando) {
        try {
            FXMLLoader loader = new FXMLLoader(Juego.class.getResource("Escena8DatosAnimal.fxml"));
            rootPane=(AnchorPane) loader.load();
            Scene scene = new Scene(rootPane);
            stagePrincipal.setTitle("Zoologic");
            stagePrincipal.setScene(scene);
            scene.getStylesheets().add(Juego.class.getResource("css/style.css").toExternalForm());
            Escena8Controller controller = loader.getController();
            this.setModificando(modificando);
            controller.setProgramaPrincipal(this);
            stagePrincipal.show();           

        } catch (Exception e) {
        }
    }
    /**
    * mètode que augmenta el diner del jugador a mesura que pasa el temps (cada 4 segons aumenta un nombre aleatori entre el 1 i el 5)
    */
    public void empezarTiempo(){
        Jugador Jugando = Jugador.getInstance();        
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask()
            {
                public void run()
                {
                    if(Jugando.getAnimales()<=5){
                        Jugando.setDinero(Jugando.getDinero()+(int)(Math.random()*5+1));
                        
                    }else if(Jugando.getAnimales()>5 && Jugando.getAnimales()<=10){
                        Jugando.setDinero(Jugando.getDinero()+(int)(Math.random()*10+1));
                        
                    }else if(Jugando.getAnimales()>10 && Jugando.getAnimales()<=15){
                        Jugando.setDinero(Jugando.getDinero()+(int)(Math.random()*15+1));
                        
                    }else if(Jugando.getAnimales()>5 && Jugando.getAnimales()<=20){
                        Jugando.setDinero(Jugando.getDinero()+(int)(Math.random()*20+1));
                        
                    }else if(Jugando.getAnimales()>5 && Jugando.getAnimales()<=30){
                        Jugando.setDinero(Jugando.getDinero()+(int)(Math.random()*35+1));
                        
                    }else if(Jugando.getAnimales()>5 && Jugando.getAnimales()<=40){
                        Jugando.setDinero(Jugando.getDinero()+(int)(Math.random()*50+1));
                        
                    }
                }
            }, 0, 4000);
    }
    /**
    * mètode principal main
    */
    public static void main(String[] args) {
        launch(args);
    }
    /**
    * mètode que retorna l'animal que estem modificant
    * @return modificando
    */
    public String getModificando() {
        return modificando;
    }
    /**
    * mètode que asigna l'animal que estem modificant
    * @param modificando indica l'animal que estem modificant
    */
    public void setModificando(String modificando) {
        this.modificando = modificando;
    }
    
}