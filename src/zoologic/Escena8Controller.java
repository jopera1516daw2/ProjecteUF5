
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
import javafx.scene.control.TextField;
/**
 * classe Controller de l'escena 7
 */
public class Escena8Controller implements Initializable{
    /**
    * atributs FXML
    */
    @FXML 
    private TextField talimentado;
    
    @FXML 
    private TextField tedat;
    /**
    * atributs
    */
    private Juego ProgramaPrincipal;
    private String animal;
    /**
    * mètode que asigna a ProgramaPrincipal 
    * quan es truca a aquest mètode, s'asinga l'escena
    * switch case per saber en quin animal hem clicat abans d'accedir a aquesta escena, i posem si esta alimentat
    * @param ProgramaPrincipal indica un Juego
    */
    public void setProgramaPrincipal(Juego ProgramaPrincipal) {
        this.ProgramaPrincipal = ProgramaPrincipal;
        switch (ProgramaPrincipal.getModificando()){
            case "leon1":
                Leon Leon1 = Leon.getInstance1();
                if(Leon1.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Leon1.getEdat()));
                break;
            case "leon2":
                Leon Leon2 = Leon.getInstance2();
                if(Leon2.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Leon2.getEdat()));
                break;
            case "leon3":
                Leon Leon3 = Leon.getInstance3();
                if(Leon3.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Leon3.getEdat()));
                break;
            case "leon4":
                Leon Leon4 = Leon.getInstance4();
                if(Leon4.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Leon4.getEdat()));
                break;
            case "leon5":
                Leon Leon5 = Leon.getInstance5();
                if(Leon5.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Leon5.getEdat())); 
                break;
           case "elefante1":
                Elefante Elefante1 = Elefante.getInstance1();
                if(Elefante1.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Elefante1.getEdat()));
                break;
            case "elefante2":
                Elefante Elefante2 = Elefante.getInstance2();
                if(Elefante2.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Elefante2.getEdat()));
                break;
            case "elefante3":
                Elefante Elefante3 = Elefante.getInstance3();
                if(Elefante3.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Elefante3.getEdat()));
                break;
            case "elefante4":
                Elefante Elefante4 = Elefante.getInstance4();
                if(Elefante4.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Elefante4.getEdat()));
                break;
            case "elefante5":
                Elefante Elefante5 = Elefante.getInstance5();
                if(Elefante5.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Elefante5.getEdat())); 
                break;
            case "mono1":
                Mono Mono1 = Mono.getInstance1();
                if(Mono1.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Mono1.getEdat()));
                break;
            case "mono2":
                Mono Mono2 = Mono.getInstance2();
                if(Mono2.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Mono2.getEdat()));
                break;
            case "mono3":
                Mono Mono3 = Mono.getInstance3();
                if(Mono3.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Mono3.getEdat()));
                break;
            case "mono4":
                Mono Mono4 = Mono.getInstance4();
                if(Mono4.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Mono4.getEdat()));
                break;
            case "mono5":
                Mono Mono5 = Mono.getInstance5();
                if(Mono5.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Mono5.getEdat())); 
                break;
            case "loro1":
                Loro Loro1 = Loro.getInstance1();
                if(Loro1.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Loro1.getEdat()));
                break;
            case "loro2":
                Loro Loro2 = Loro.getInstance2();
                if(Loro2.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Loro2.getEdat()));
                break;
            case "loro3":
                Loro Loro3 = Loro.getInstance3();
                if(Loro3.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Loro3.getEdat()));
                break;
            case "loro4":
                Loro Loro4 = Loro.getInstance4();
                if(Loro4.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Loro4.getEdat()));
                break;
            case "loro5":
                Loro Loro5 = Loro.getInstance5();
                if(Loro5.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Loro5.getEdat())); 
                break;
            case "pelicano1":
                Pelicano Pelicano1 = Pelicano.getInstance1();
                if(Pelicano1.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Pelicano1.getEdat()));
                break;
            case "pelicano2":
                Pelicano Pelicano2 = Pelicano.getInstance2();
                if(Pelicano2.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Pelicano2.getEdat()));
                break;
            case "pelicano3":
                Pelicano Pelicano3 = Pelicano.getInstance3();
                if(Pelicano3.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Pelicano3.getEdat()));
                break;
            case "pelicano4":
                Pelicano Pelicano4 = Pelicano.getInstance4();
                if(Pelicano4.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Pelicano4.getEdat()));
                break;
            case "pelicano5":
                Pelicano Pelicano5 = Pelicano.getInstance5();
                if(Pelicano5.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Pelicano5.getEdat())); 
                break;
            case "buitre1":
                Buitre Buitre1 = Buitre.getInstance1();
                if(Buitre1.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Buitre1.getEdat()));
                break;
            case "buitre2":
                Buitre Buitre2 = Buitre.getInstance2();
                if(Buitre2.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Buitre2.getEdat()));
                break;
            case "buitre3":
                Buitre Buitre3 = Buitre.getInstance3();
                if(Buitre3.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Buitre3.getEdat()));
                break;
            case "buitre4":
                Buitre Buitre4 = Buitre.getInstance4();
                if(Buitre4.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Buitre4.getEdat()));
                break;
            case "buitre5":
                Buitre Buitre5 = Buitre.getInstance5();
                if(Buitre5.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Buitre5.getEdat())); 
                break;
            case "delfin1":
                Delfin Delfin1 = Delfin.getInstance1();
                if(Delfin1.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Delfin1.getEdat()));
                break;
            case "delfin2":
                Delfin Delfin2 = Delfin.getInstance2();
                if(Delfin2.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Delfin2.getEdat()));
                break;
            case "delfin3":
                Delfin Delfin3 = Delfin.getInstance3();
                if(Delfin3.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Delfin3.getEdat()));
                break;
            case "delfin4":
                Delfin Delfin4 = Delfin.getInstance4();
                if(Delfin4.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Delfin4.getEdat()));
                break;
            case "delfin5":
                Delfin Delfin5 = Delfin.getInstance5();
                if(Delfin5.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Delfin5.getEdat())); 
                break;
            case "tiburon1":
                Tiburon Tiburon1 = Tiburon.getInstance1();
                if(Tiburon1.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Tiburon1.getEdat()));
                break;
            case "tiburon2":
                Tiburon Tiburon2 = Tiburon.getInstance2();
                if(Tiburon2.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Tiburon2.getEdat()));
                break;
            case "tiburon3":
                Tiburon Tiburon3 = Tiburon.getInstance3();
                if(Tiburon3.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Tiburon3.getEdat()));
                break;
            case "tiburon4":
                Tiburon Tiburon4 = Tiburon.getInstance4();
                if(Tiburon4.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Tiburon4.getEdat()));
                break;
            case "tiburon5":
                Tiburon Tiburon5 = Tiburon.getInstance5();
                if(Tiburon5.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Tiburon5.getEdat())); 
                break;
            case "tortuga1":
                Tortuga Tortuga1 = Tortuga.getInstance1();
                if(Tortuga1.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Tortuga1.getEdat()));
                break;
            case "tortuga2":
                Tortuga Tortuga2 = Tortuga.getInstance2();
                if(Tortuga2.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Tortuga2.getEdat()));
                break;
            case "tortuga3":
                Tortuga Tortuga3 = Tortuga.getInstance3();
                if(Tortuga3.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Tortuga3.getEdat()));
                break;
            case "tortuga4":
                Tortuga Tortuga4 = Tortuga.getInstance4();
                if(Tortuga4.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Tortuga4.getEdat()));
                break;
            case "tortuga5":
                Tortuga Tortuga5 = Tortuga.getInstance5();
                if(Tortuga5.isAlimentado()==true){
                    talimentado.setText("Sí");
                }else{
                    talimentado.setText("No");
                }
                tedat.setText(String.valueOf(Tortuga5.getEdat())); 
                break;
        }   
    }
    /**
    * mètode FXML que alimenta l'animal sobre el que hem fet clic
    */ 
    @FXML
    private void alimentar(ActionEvent event) {
        switch (ProgramaPrincipal.getModificando()){
            case "leon1":
                Leon Leon1 = Leon.getInstance1();
                Leon1.setAlimentado(true);
                break;
            case "leon2":
                Leon Leon2 = Leon.getInstance2();
                Leon2.setAlimentado(true);
                break;
            case "leon3":
                Leon Leon3 = Leon.getInstance3();
                Leon3.setAlimentado(true);
                break;
            case "leon4":
                Leon Leon4 = Leon.getInstance4();
                Leon4.setAlimentado(true);
                break;
            case "leon5":
                Leon Leon5 = Leon.getInstance5();
                Leon5.setAlimentado(true);
                break;
            case "elefante1":
                Elefante Elefante1 = Elefante.getInstance1();
                Elefante1.setAlimentado(true);
                break;
            case "elefante2":
                Elefante Elefante2 = Elefante.getInstance2();
                Elefante2.setAlimentado(true);
                break;
            case "elefante3":
                Elefante Elefante3 = Elefante.getInstance3();
                Elefante3.setAlimentado(true);
                break;
            case "elefante4":
                Elefante Elefante4 = Elefante.getInstance4();
                Elefante4.setAlimentado(true);
                break;
            case "elefante5":
                Elefante Elefante5 = Elefante.getInstance5();
                Elefante5.setAlimentado(true);
                break;
            case "mono1":
                Mono Mono1 = Mono.getInstance1();
                Mono1.setAlimentado(true);
                break;
            case "mono2":
                Mono Mono2 = Mono.getInstance2();
                Mono2.setAlimentado(true);
                break;
            case "mono3":
                Mono Mono3 = Mono.getInstance3();
                Mono3.setAlimentado(true);
                break;
            case "mono4":
                Mono Mono4 = Mono.getInstance4();
                Mono4.setAlimentado(true);
                break;
            case "mono5":
                Mono Mono5 = Mono.getInstance5();
                Mono5.setAlimentado(true);
                break;
            case "loro1":
                Loro Loro1 = Loro.getInstance1();
                Loro1.setAlimentado(true);
                break;
            case "loro2":
                Loro Loro2 = Loro.getInstance2();
                Loro2.setAlimentado(true);
                break;
            case "loro3":
                Loro Loro3 = Loro.getInstance3();
                Loro3.setAlimentado(true);
                break;
            case "loro4":
                Loro Loro4 = Loro.getInstance4();
                Loro4.setAlimentado(true);
                break;
            case "loro5":
                Loro Loro5 = Loro.getInstance5();
                Loro5.setAlimentado(true);
                break;
            case "pelicano1":
                Pelicano Pelicano1 = Pelicano.getInstance1();
                Pelicano1.setAlimentado(true);
                break;
            case "pelicano2":
                Pelicano Pelicano2 = Pelicano.getInstance2();
                Pelicano2.setAlimentado(true);
                break;
            case "pelicano3":
                Pelicano Pelicano3 = Pelicano.getInstance3();
                Pelicano3.setAlimentado(true);
                break;
            case "pelicano4":
                Pelicano Pelicano4 = Pelicano.getInstance4();
                Pelicano4.setAlimentado(true);
                break;
            case "pelicano5":
                Pelicano Pelicano5 = Pelicano.getInstance5();
                Pelicano5.setAlimentado(true);
                break;
            case "buitre1":
                Buitre Buitre1 = Buitre.getInstance1();
                Buitre1.setAlimentado(true);
                break;
            case "buitre2":
                Buitre Buitre2 = Buitre.getInstance2();
                Buitre2.setAlimentado(true);
                break;
            case "buitre3":
                Buitre Buitre3 = Buitre.getInstance3();
                Buitre3.setAlimentado(true);
                break;
            case "buitre4":
                Buitre Buitre4 = Buitre.getInstance4();
                Buitre4.setAlimentado(true);
                break;
            case "buitre5":
                Buitre Buitre5 = Buitre.getInstance5();
                Buitre5.setAlimentado(true);
                break;
            case "delfin1":
                Delfin Delfin1 = Delfin.getInstance1();
                Delfin1.setAlimentado(true);
                break;
            case "delfin2":
                Delfin Delfin2 = Delfin.getInstance2();
                Delfin2.setAlimentado(true);
                break;
            case "delfin3":
                Delfin Delfin3 = Delfin.getInstance3();
                Delfin3.setAlimentado(true);
                break;
            case "delfin4":
                Delfin Delfin4 = Delfin.getInstance4();
                Delfin4.setAlimentado(true);
                break;
            case "delfin5":
                Delfin Delfin5 = Delfin.getInstance5();
                Delfin5.setAlimentado(true);
                break;
            case "tiburon1":
                Tiburon Tiburon1 = Tiburon.getInstance1();
                Tiburon1.setAlimentado(true);
                break;
            case "tiburon2":
                Tiburon Tiburon2 = Tiburon.getInstance2();
                Tiburon2.setAlimentado(true);
                break;
            case "tiburon3":
                Tiburon Tiburon3 = Tiburon.getInstance3();
                Tiburon3.setAlimentado(true);
                break;
            case "tiburon4":
                Tiburon Tiburon4 = Tiburon.getInstance4();
                Tiburon4.setAlimentado(true);
                break;
            case "tiburon5":
                Tiburon Tiburon5 = Tiburon.getInstance5();
                Tiburon5.setAlimentado(true);
                break;
            case "tortuga1":
                Tortuga Tortuga1 = Tortuga.getInstance1();
                Tortuga1.setAlimentado(true);
                break;
            case "tortuga2":
                Tortuga Tortuga2 = Tortuga.getInstance2();
                Tortuga2.setAlimentado(true);
                break;
            case "tortuga3":
                Tortuga Tortuga3 = Tortuga.getInstance3();
                Tortuga3.setAlimentado(true);
                break;
            case "tortuga4":
                Tortuga Tortuga4 = Tortuga.getInstance4();
                Tortuga4.setAlimentado(true);
                break;
            case "tortuga5":
                Tortuga Tortuga5 = Tortuga.getInstance5();
                Tortuga5.setAlimentado(true);
                break;   
        }
        talimentado.setText("Sí");
    }
    /**
    * mètode FXML per tornar a l'escena anterior
    */
    @FXML
    private void volveratras(ActionEvent event) {
        if(ProgramaPrincipal.getModificando().startsWith("leon") || ProgramaPrincipal.getModificando().startsWith("elefante") ||ProgramaPrincipal.getModificando().startsWith("mono") ){
            ProgramaPrincipal.escena6();
            
        }else if(ProgramaPrincipal.getModificando().startsWith("loro") || ProgramaPrincipal.getModificando().startsWith("pelicano") ||ProgramaPrincipal.getModificando().startsWith("buitre") ){
            ProgramaPrincipal.escena5();
            
        }else if(ProgramaPrincipal.getModificando().startsWith("delfin") || ProgramaPrincipal.getModificando().startsWith("tiburon") ||ProgramaPrincipal.getModificando().startsWith("tortuga") ){
            ProgramaPrincipal.escena4();
        }
        
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        talimentado.setEditable(false);
        tedat.setEditable(false);
    }
}
