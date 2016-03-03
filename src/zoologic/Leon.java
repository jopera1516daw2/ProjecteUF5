package zoologic;
/**
 * 
 * @author Jordi Oscar
 */
import java.text.DecimalFormat;
import java.util.Timer;
import java.util.TimerTask;
/**
 * classe Lleo que extendeix de Terrestre
 */
public class Leon extends Terrestre{
    /**
    * atributs instancies
    */
    private static Leon instance1;
    private static Leon instance2;
    private static Leon instance3;
    private static Leon instance4;
    private static Leon instance5;
    /**
    * mètode estatic que crea una instància de Lleo si no existeix y retorna la instància en qüestió
    */
    public static Leon getInstance1(){
        if(instance1==null){
            instance1=new Leon("macho",0,false);
        }
        return instance1;
    }
    /**
    * mètode estatic que crea una instància de Lleo si no existeix y retorna la instància en qüestió
    */
    public static Leon getInstance2(){
        if(instance2==null){
            instance2=new Leon("hembra",0,false);
        }
        return instance2;
    }
    /**
    * mètode estatic que crea una instància de Lleo si no existeix y retorna la instància en qüestió
    */
    public static Leon getInstance3(){
        if(instance3==null){
            instance3=new Leon("macho",0,false);
        }
        return instance3;
    }
    /**
    * mètode estatic que crea una instància de Lleo si no existeix y retorna la instància en qüestió
    */
    public static Leon getInstance4(){
        if(instance4==null){
            instance4=new Leon("macho",0,false);
        }
        return instance4;
    }
    /**
    * mètode estatic que crea una instància de Lleo si no existeix y retorna la instància en qüestió
    */
    public static Leon getInstance5(){
        if(instance5==null){
            instance5=new Leon("macho",0,false);
        }
        return instance5;
    }
    /**
    * mètode constructor que implementa el constructor de Terrestre(super)
    * @param genero indica el genere
    * @param edat indica l'edat
    * @param alimentado indica si esta alimentat
    */
    public Leon(String genero, int edat, boolean alimentado) {
        super( genero, edat, alimentado);
    }
    /**
    * mètode per eliminar de la llista d'animals terrestres una instància de Lleo
    * @param instance indica la instancia de Lleo que es vol eliminar
    */
    public void eliminar(Leon instance){
        Terrestre TerrestreList = Terrestre.getInstance();
        TerrestreList.remove(instance);
    }
    /**
    * mètode de la vida de la instancia de Lleo. Es tracta d'una funció que es repeteix cada 10 segons.
    * cada vegada que es truca a la funció, es fan unes comprovacions de l'edat del animal:
    * si l'animal té una edat de 10,20,30,40,50,60,70,80,90 i no está alimentat, morirà
    * si l'animal té una edat de 100 morirà
    * si l'animal té una edat de 5,15,25,35,45,55,65,75,85 o 95 no estará alimentat
    * si l'animal viu, s'incrementa la seva edat en 1.
    * @param instance indica la instancia de Lleo que viurà.
    */
    public void vida(Leon instance){ 
        Musica Musica = new Musica();
        Jugador Jugando = Jugador.getInstance();
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask()
            {
                public void run()
                {
                    if((instance.getEdat()==10 || instance.getEdat()==20 || instance.getEdat()==30)  && instance.isAlimentado()==false){
                        instance.morir(instance);
                        timer.cancel();
                        instance.setEdat(0);
                        Jugando.setLeones(Jugando.getLeones()-1);
                        eliminar(instance);
                        
                    }else if((instance.getEdat()==40 || instance.getEdat()==50 || instance.getEdat()==60)  && instance.isAlimentado()==false){
                        instance.morir(instance);
                        timer.cancel();
                        Jugando.setLeones(Jugando.getLeones()-1);
                        eliminar(instance);
                        
                    }else if((instance.getEdat()==70 || instance.getEdat()==80 || instance.getEdat()==90)  && instance.isAlimentado()==false){
                        instance.morir(instance);
                        timer.cancel();
                        Jugando.setLeones(Jugando.getLeones()-1);
                        eliminar(instance);
                        
                    }else if(instance.getEdat()==100){
                        instance.morir(instance);
                        timer.cancel();
                        Jugando.setLeones(Jugando.getLeones()-1);
                        eliminar(instance);
                        
                    }else{
                        instance.setEdat(instance.getEdat()+1);
                    }
                    
                    if((instance.getEdat()==5 || instance.getEdat()==15 || instance.getEdat()==25)  && instance.isAlimentado()==true){
                        instance.setAlimentado(false);
                        Musica.reproducirHambre();
                        
                    }else if((instance.getEdat()==35 || instance.getEdat()==45 || instance.getEdat()==55)  && instance.isAlimentado()==true){
                        instance.setAlimentado(false);
                        Musica.reproducirHambre();
                        
                    }else if((instance.getEdat()==65 || instance.getEdat()==75 || instance.getEdat()==85)  && instance.isAlimentado()==true){
                        instance.setAlimentado(false);
                        Musica.reproducirHambre();
                        
                    }else if(instance.getEdat()==95 && instance.isAlimentado()==true){
                        instance.setAlimentado(false);
                        Musica.reproducirHambre();
                    }
                    
                    System.out.println("------------------------------------------------------------------------------------");
                    System.out.println(instance.getClass().getName()+" Edat: "+instance.getEdat());
                    System.out.println(instance.getClass().getName()+" Alimentado: "+instance.isAlimentado());
                    System.out.println(Jugando.getLeones());
                }
            }, 0, 10000);
    }
}
