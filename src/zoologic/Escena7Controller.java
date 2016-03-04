
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
public class Escena7Controller implements Initializable{
    /**
    * atributs FXML
    */
    @FXML
    private TextField moneytienda;
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
    * mètode que crea una vida per a la instància de l'animal que hem comprat
    * després l'afegeix a la llista d'animals (del seu medi) 
    */
    public void leoncomprado(){
        Terrestre TerrestreList=Terrestre.getInstance();
        Leon Leon1 = Leon.getInstance1();
        Leon Leon2 = Leon.getInstance2();
        Leon Leon3 = Leon.getInstance3();
        Leon Leon4 = Leon.getInstance4();
        Leon Leon5 = Leon.getInstance5();
        
        if(Leon1.getEdat()==0){
            Leon1.vida(Leon1);
            TerrestreList.add(Leon1);
        }else if(Leon2.getEdat()==0){
            Leon2.vida(Leon2);
            TerrestreList.add(Leon2);
        }else if(Leon3.getEdat()==0){
            Leon3.vida(Leon3);
            TerrestreList.add(Leon3);
        }else if(Leon4.getEdat()==0){
            Leon4.vida(Leon4);
            TerrestreList.add(Leon4);
        }else if(Leon5.getEdat()==0){
            Leon5.vida(Leon5);
            TerrestreList.add(Leon5);
        }
    }
    /**
    * mètode que crea una vida per a la instància de l'animal que hem comprat
    * després l'afegeix a la llista d'animals (del seu medi) 
    */
    public void elefantecomprado(){
        Terrestre TerrestreList=Terrestre.getInstance();
        Elefante Elefante1 = Elefante.getInstance1();
        Elefante Elefante2 = Elefante.getInstance2();
        Elefante Elefante3 = Elefante.getInstance3();
        Elefante Elefante4 = Elefante.getInstance4();
        Elefante Elefante5 = Elefante.getInstance5();
        
        if(Elefante1.getEdat()==0){
            Elefante1.vida(Elefante1);
            TerrestreList.add(Elefante1);
        }else if(Elefante2.getEdat()==0){
            Elefante2.vida(Elefante2);
            TerrestreList.add(Elefante2);
        }else if(Elefante3.getEdat()==0){
            Elefante3.vida(Elefante3);
            TerrestreList.add(Elefante3);
        }else if(Elefante4.getEdat()==0){
            Elefante4.vida(Elefante4);
            TerrestreList.add(Elefante4);
        }else if(Elefante5.getEdat()==0){
            Elefante5.vida(Elefante5);
            TerrestreList.add(Elefante5);
        }
    }
    /**
    * mètode que crea una vida per a la instància de l'animal que hem comprat
    * després l'afegeix a la llista d'animals (del seu medi) 
    */
    public void monocomprado(){
        Terrestre TerrestreList=Terrestre.getInstance();
        Mono Mono1 = Mono.getInstance1();
        Mono Mono2 = Mono.getInstance2();
        Mono Mono3 = Mono.getInstance3();
        Mono Mono4 = Mono.getInstance4();
        Mono Mono5 = Mono.getInstance5();
        
        if(Mono1.getEdat()==0){
            Mono1.vida(Mono1);
            TerrestreList.add(Mono1);
        }else if(Mono2.getEdat()==0){
            Mono2.vida(Mono2);
            TerrestreList.add(Mono2);
        }else if(Mono3.getEdat()==0){
            Mono3.vida(Mono3);
            TerrestreList.add(Mono3);
        }else if(Mono4.getEdat()==0){
            Mono4.vida(Mono4);
            TerrestreList.add(Mono4);
        }else if(Mono5.getEdat()==0){
            Mono5.vida(Mono5);
            TerrestreList.add(Mono5);
        }
    }
    /**
    * mètode que crea una vida per a la instància de l'animal que hem comprat
    * després l'afegeix a la llista d'animals (del seu medi) 
    */
    public void lorocomprado(){
        Volador VoladorList=Volador.getInstance();
        Loro Loro1 = Loro.getInstance1();
        Loro Loro2 = Loro.getInstance2();
        Loro Loro3 = Loro.getInstance3();
        Loro Loro4 = Loro.getInstance4();
        Loro Loro5 = Loro.getInstance5();
        
        if(Loro1.getEdat()==0){
            Loro1.vida(Loro1);
            VoladorList.add(Loro1);
        }else if(Loro2.getEdat()==0){
            Loro2.vida(Loro2);
            VoladorList.add(Loro2);
        }else if(Loro3.getEdat()==0){
            Loro3.vida(Loro3);
            VoladorList.add(Loro3);
        }else if(Loro4.getEdat()==0){
            Loro4.vida(Loro4);
            VoladorList.add(Loro4);
        }else if(Loro5.getEdat()==0){
            Loro5.vida(Loro5);
            VoladorList.add(Loro5);
        }
    }
    /**
    * mètode que crea una vida per a la instància de l'animal que hem comprat
    * després l'afegeix a la llista d'animals (del seu medi) 
    */
    public void pelicanocomprado(){
        Volador VoladorList=Volador.getInstance();
        Pelicano Pelicano1 = Pelicano.getInstance1();
        Pelicano Pelicano2 = Pelicano.getInstance2();
        Pelicano Pelicano3 = Pelicano.getInstance3();
        Pelicano Pelicano4 = Pelicano.getInstance4();
        Pelicano Pelicano5 = Pelicano.getInstance5();
        
        if(Pelicano1.getEdat()==0){
            Pelicano1.vida(Pelicano1);
            VoladorList.add(Pelicano1);
        }else if(Pelicano2.getEdat()==0){
            Pelicano2.vida(Pelicano2);
            VoladorList.add(Pelicano2);
        }else if(Pelicano3.getEdat()==0){
            Pelicano3.vida(Pelicano3);
            VoladorList.add(Pelicano3);
        }else if(Pelicano4.getEdat()==0){
            Pelicano4.vida(Pelicano4);
            VoladorList.add(Pelicano4);
        }else if(Pelicano5.getEdat()==0){
            Pelicano5.vida(Pelicano5);
            VoladorList.add(Pelicano5);
        }
    }
    /**
    * mètode que crea una vida per a la instància de l'animal que hem comprat
    * després l'afegeix a la llista d'animals (del seu medi) 
    */
    public void buitrecomprado(){
        Volador VoladorList=Volador.getInstance();
        Buitre Buitre1 = Buitre.getInstance1();
        Buitre Buitre2 = Buitre.getInstance2();
        Buitre Buitre3 = Buitre.getInstance3();
        Buitre Buitre4 = Buitre.getInstance4();
        Buitre Buitre5 = Buitre.getInstance5();
        
        if(Buitre1.getEdat()==0){
            Buitre1.vida(Buitre1);
            VoladorList.add(Buitre1);
        }else if(Buitre2.getEdat()==0){
            Buitre2.vida(Buitre2);
            VoladorList.add(Buitre2);
        }else if(Buitre3.getEdat()==0){
            Buitre3.vida(Buitre3);
            VoladorList.add(Buitre3);
        }else if(Buitre4.getEdat()==0){
            Buitre4.vida(Buitre4);
            VoladorList.add(Buitre4);
        }else if(Buitre5.getEdat()==0){
            Buitre5.vida(Buitre5);
            VoladorList.add(Buitre5);
        }
    }
    /**
    * mètode que crea una vida per a la instància de l'animal que hem comprat
    * després l'afegeix a la llista d'animals (del seu medi) 
    */
    public void delfincomprado(){
        Acuatico AcuaticoList=Acuatico.getInstance();
        Delfin Delfin1 = Delfin.getInstance1();
        Delfin Delfin2 = Delfin.getInstance2();
        Delfin Delfin3 = Delfin.getInstance3();
        Delfin Delfin4 = Delfin.getInstance4();
        Delfin Delfin5 = Delfin.getInstance5();
        
        if(Delfin1.getEdat()==0){
            Delfin1.vida(Delfin1);
            AcuaticoList.add(Delfin1);
        }else if(Delfin2.getEdat()==0){
            Delfin2.vida(Delfin2);
            AcuaticoList.add(Delfin2);
        }else if(Delfin3.getEdat()==0){
            Delfin3.vida(Delfin3);
            AcuaticoList.add(Delfin3);
        }else if(Delfin4.getEdat()==0){
            Delfin4.vida(Delfin4);
            AcuaticoList.add(Delfin4);
        }else if(Delfin5.getEdat()==0){
            Delfin5.vida(Delfin5);
            AcuaticoList.add(Delfin5);
        }
    }
    /**
    * mètode que crea una vida per a la instància de l'animal que hem comprat
    * després l'afegeix a la llista d'animals (del seu medi) 
    */
    public void tiburoncomprado(){
        Acuatico AcuaticoList=Acuatico.getInstance();
        Tiburon Tiburon1 = Tiburon.getInstance1();
        Tiburon Tiburon2 = Tiburon.getInstance2();
        Tiburon Tiburon3 = Tiburon.getInstance3();
        Tiburon Tiburon4 = Tiburon.getInstance4();
        Tiburon Tiburon5 = Tiburon.getInstance5();
        
        if(Tiburon1.getEdat()==0){
            Tiburon1.vida(Tiburon1);
            AcuaticoList.add(Tiburon1);
        }else if(Tiburon2.getEdat()==0){
            Tiburon2.vida(Tiburon2);
            AcuaticoList.add(Tiburon2);
        }else if(Tiburon3.getEdat()==0){
            Tiburon3.vida(Tiburon3);
            AcuaticoList.add(Tiburon3);
        }else if(Tiburon4.getEdat()==0){
            Tiburon4.vida(Tiburon4);
            AcuaticoList.add(Tiburon4);
        }else if(Tiburon5.getEdat()==0){
            Tiburon5.vida(Tiburon5);
            AcuaticoList.add(Tiburon5);
        }
    }
    /**
    * mètode que crea una vida per a la instància de l'animal que hem comprat
    * després l'afegeix a la llista d'animals (del seu medi) 
    */
    public void tortugacomprado(){
        Acuatico AcuaticoList=Acuatico.getInstance();
        Tortuga Tortuga1 = Tortuga.getInstance1();
        Tortuga Tortuga2 = Tortuga.getInstance2();
        Tortuga Tortuga3 = Tortuga.getInstance3();
        Tortuga Tortuga4 = Tortuga.getInstance4();
        Tortuga Tortuga5 = Tortuga.getInstance5();
        
        if(Tortuga1.getEdat()==0){
            Tortuga1.vida(Tortuga1);
            AcuaticoList.add(Tortuga1);
        }else if(Tortuga2.getEdat()==0){
            Tortuga2.vida(Tortuga2);
            AcuaticoList.add(Tortuga2);
        }else if(Tortuga3.getEdat()==0){
            Tortuga3.vida(Tortuga3);
            AcuaticoList.add(Tortuga3);
        }else if(Tortuga4.getEdat()==0){
            Tortuga4.vida(Tortuga4);
            AcuaticoList.add(Tortuga4);
        }else if(Tortuga5.getEdat()==0){
            Tortuga5.vida(Tortuga5);
            AcuaticoList.add(Tortuga5);
        }
    }
   /**
    * mètode FXML que compra un lleó 
    */     
    @FXML
    private void comprarleon(ActionEvent event) {
        Jugador Jugando = Jugador.getInstance();    
        if(Jugando.getDinero()>=600 && Jugando.getLeones()<5){
            Jugando.setDinero(Jugando.getDinero()-600);
            Jugando.setLeones(Jugando.getLeones()+1);
            moneytienda.setText(Integer.toString((int) Jugando.getDinero()));            
            switch(Jugando.getLeones()){
                case 1:  
                    leoncomprado();
                    break;
                case 2:
                    leoncomprado();
                    break;
                case 3:
                    leoncomprado();
                    break;
                case 4:
                    leoncomprado();
                    break;
                case 5:
                    leoncomprado();
                    break;
            }
        }
    }
    /**
    * mètode FXML que compra un elefant
    */ 
    @FXML
    private void comprarelefante(ActionEvent event) {
        Jugador Jugando = Jugador.getInstance();    
        if(Jugando.getDinero()>=800 && Jugando.getElefantes()<5){
            Jugando.setDinero(Jugando.getDinero()-800);
            Jugando.setElefantes(Jugando.getElefantes()+1);
            moneytienda.setText(Integer.toString((int) Jugando.getDinero()));
            switch(Jugando.getElefantes()){
                case 1:  
                    elefantecomprado();
                    break;
                case 2:
                    elefantecomprado();
                    break;
                case 3:
                    elefantecomprado();
                    break;
                case 4:
                    elefantecomprado();
                    break;
                case 5:
                    elefantecomprado();
                    break;
            }            
        }
    }
    /**
    * mètode FXML que compra un mico
    */ 
    @FXML
    private void comprarmono(ActionEvent event) {
        Jugador Jugando = Jugador.getInstance();    
        if(Jugando.getDinero()>=250 && Jugando.getMonos()<5){
            Jugando.setDinero(Jugando.getDinero()-250);
            Jugando.setMonos(Jugando.getMonos()+1);
            moneytienda.setText(Integer.toString((int) Jugando.getDinero()));
            switch(Jugando.getMonos()){
                case 1:  
                    monocomprado();
                    break;
                case 2:
                    monocomprado();
                    break;
                case 3:
                    monocomprado();
                    break;
                case 4:
                    monocomprado();
                    break;
                case 5:
                    monocomprado();
                    break;
            }   
        }
    }
    /**
    * mètode FXML que compra un lloro 
    */ 
    @FXML
    private void comprarloro(ActionEvent event) {
        Jugador Jugando = Jugador.getInstance();    
        if(Jugando.getDinero()>=125 && Jugando.getLoros()<5){
            Jugando.setDinero(Jugando.getDinero()-125);
            Jugando.setLoros(Jugando.getLoros()+1);
            moneytienda.setText(Integer.toString((int) Jugando.getDinero()));
            switch(Jugando.getLoros()){
                case 1:  
                    lorocomprado();
                    break;
                case 2:
                    lorocomprado();
                    break;
                case 3:
                    lorocomprado();
                    break;
                case 4:
                    lorocomprado();
                    break;
                case 5:
                    lorocomprado();
                    break;
            }     
        }
    }
    /**
    * mètode FXML que compra un pelican
    */ 
    @FXML
    private void comprarpelicano(ActionEvent event) {
        Jugador Jugando = Jugador.getInstance();    
        if(Jugando.getDinero()>=200 && Jugando.getPelicanos()<5){
            Jugando.setDinero(Jugando.getDinero()-200);
            Jugando.setPelicanos(Jugando.getPelicanos()+1);
            moneytienda.setText(Integer.toString((int) Jugando.getDinero()));
            switch(Jugando.getPelicanos()){
                case 1:  
                    pelicanocomprado();
                    break;
                case 2:
                    pelicanocomprado();
                    break;
                case 3:
                    pelicanocomprado();
                    break;
                case 4:
                    pelicanocomprado();
                    break;
                case 5:
                    pelicanocomprado();
                    break;
            }   
        }
    }
    /**
    * mètode FXML que compra un buitre
    */ 
    @FXML
    private void comprarbuitre(ActionEvent event) {
        Jugador Jugando = Jugador.getInstance();    
        if(Jugando.getDinero()>=350 && Jugando.getBuitres()<5){
            Jugando.setDinero(Jugando.getDinero()-350);
            Jugando.setBuitres(Jugando.getBuitres()+1);
            moneytienda.setText(Integer.toString((int) Jugando.getDinero()));
            switch(Jugando.getBuitres()){
                case 1:  
                    buitrecomprado();
                    break;
                case 2:
                    buitrecomprado();
                    break;
                case 3:
                    buitrecomprado();
                    break;
                case 4:
                    buitrecomprado();
                    break;
                case 5:
                    buitrecomprado();
                    break;
            }               
        }
    }
   /**
    * mètode FXML que compra un dofi
    */ 
    @FXML
    private void comprardelfin(ActionEvent event) {
        Jugador Jugando = Jugador.getInstance();    
        if(Jugando.getDinero()>=500 && Jugando.getDelfines()<5){
            Jugando.setDinero(Jugando.getDinero()-500);
            Jugando.setDelfines(Jugando.getDelfines()+1);
            moneytienda.setText(Integer.toString((int) Jugando.getDinero()));
            switch(Jugando.getDelfines()){
                case 1:  
                    delfincomprado();
                    break;
                case 2:
                    delfincomprado();
                    break;
                case 3:
                    delfincomprado();
                    break;
                case 4:
                    delfincomprado();
                    break;
                case 5:
                    delfincomprado();
                    break;
            }      
        }
    }
    /**
    * mètode FXML que compra un tauro
    */ 
    @FXML
    private void comprartiburon(ActionEvent event) {
        Jugador Jugando = Jugador.getInstance();    
        if(Jugando.getDinero()>=950 && Jugando.getTiburones()<5){
            Jugando.setDinero(Jugando.getDinero()-950);
            Jugando.setTiburones(Jugando.getTiburones()+1);
            moneytienda.setText(Integer.toString((int) Jugando.getDinero()));
            switch(Jugando.getTiburones()){
                case 1:  
                    tiburoncomprado();
                    break;
                case 2:
                    tiburoncomprado();
                    break;
                case 3:
                    tiburoncomprado();
                    break;
                case 4:
                    tiburoncomprado();
                    break;
                case 5:
                    tiburoncomprado();
                    break;
            }      
        }
    }
    /**
    * mètode FXML que compra una tortuga
    */ 
    @FXML
    private void comprartortuga(ActionEvent event) {
        Jugador Jugando = Jugador.getInstance();    
        if(Jugando.getDinero()>=80 && Jugando.getTortugas()<5){
            Jugando.setDinero(Jugando.getDinero()-80);
            Jugando.setTortugas(Jugando.getTortugas()+1);
            moneytienda.setText(Integer.toString((int) Jugando.getDinero()));
            switch(Jugando.getTortugas()){
                case 1:  
                    tortugacomprado();
                    break;
                case 2:
                    tortugacomprado();
                    break;
                case 3:
                    tortugacomprado();
                    break;
                case 4:
                    tortugacomprado();
                    break;
                case 5:
                    tortugacomprado();
                    break;
            }      
        }
    }
    /**
    * mètode FXML per tornar a l'escena del mapa
    */
    @FXML
    private void volvermapa(ActionEvent event) {
        ProgramaPrincipal.escena2();
    }
    /**
    * quan es carrega l'escena, s'asigna els diners del jugador en el camp pertinent 
    */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Jugador Jugando = Jugador.getInstance();
        moneytienda.setText(Integer.toString((int) Jugando.getDinero()));
        moneytienda.setEditable(false);
    }
}
