package zoologic;
/**
 * 
 * @author Jordi Oscar
 */
import java.util.Timer;
import java.util.TimerTask;
/**
 * classe Buitre que extendeix de Volador
 */
public class Buitre extends Volador{
    /**
    * atributs instancies
    */
    private static Buitre instance1;
    private static Buitre instance2;
    private static Buitre instance3;
    private static Buitre instance4;
    private static Buitre instance5;
    /**
    * mètode estatic que crea una instància de Buitre si no existeix y retorna la instància en qüestió
    */
    public static Buitre getInstance1(){
        if(instance1==null){
            instance1=new Buitre("macho",0,false);
        }
        return instance1;
    }
    /**
    * mètode estatic que crea una instància de Buitre si no existeix y retorna la instància en qüestió
    */
    public static Buitre getInstance2(){
        if(instance2==null){
            instance2=new Buitre("hembra",0,false);
        }
        return instance2;
    }
    /**
    * mètode estatic que crea una instància de Buitre si no existeix y retorna la instància en qüestió
    */
    public static Buitre getInstance3(){
        if(instance3==null){
            instance3=new Buitre("macho",0,false);
        }
        return instance3;
    }
    /**
    * mètode estatic que crea una instància de Buitre si no existeix y retorna la instància en qüestió
    */
    public static Buitre getInstance4(){
        if(instance4==null){
            instance4=new Buitre("macho",0,false);
        }
        return instance4;
    }
    /**
    * mètode estatic que crea una instància de Buitre si no existeix y retorna la instància en qüestió
    */
    public static Buitre getInstance5(){
        if(instance5==null){
            instance5=new Buitre("macho",0,false);
        }
        return instance5;
    }
    /**
    * mètode constructor que implementa el constructor de Volador(super)
    * @param genero indica el genere
    * @param edat indica l'edat
    * @param alimentado indica si esta alimentat
    */
    public Buitre(String genero, int edat, boolean alimentado) {
        super( genero, edat, alimentado);
    }
    /**
    * mètode per eliminar de la llista d'animals voladors una instància de Buitre
    * @param instance indica la instancia de Buitre que es vol eliminar
    */
    public void eliminar(Buitre instance){
        Volador VoladorList = Volador.getInstance();
        VoladorList.remove(instance);
    }
    /**
    * mètode de la vida de la instancia de Buitre. Es tracta d'una funció que es repeteix cada 10 segons.
    * cada vegada que es truca a la funció, es fan unes comprovacions de l'edat del animal:
    * si l'animal té una edat de 10,20,30,40,50,60,70,80,90 i no está alimentat, morirà
    * si l'animal té una edat de 100 morirà
    * si l'animal té una edat de 5,15,25,35,45,55,65,75,85 o 95 no estará alimentat
    * si l'animal viu, s'incrementa la seva edat en 1.
    * @param instance indica la instancia de Buitre que viurà.
    */
    public void vida(Buitre instance){ 
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
                        Jugando.setBuitres(Jugando.getBuitres()-1);
                        eliminar(instance);
                        
                    }else if((instance.getEdat()==40 || instance.getEdat()==50 || instance.getEdat()==60)  && instance.isAlimentado()==false){
                        instance.morir(instance);
                        timer.cancel();
                        Jugando.setBuitres(Jugando.getBuitres()-1);
                        eliminar(instance);
                        
                    }else if((instance.getEdat()==70 || instance.getEdat()==80 || instance.getEdat()==90)  && instance.isAlimentado()==false){
                        instance.morir(instance);
                        timer.cancel();
                        Jugando.setBuitres(Jugando.getBuitres()-1);
                        eliminar(instance);
                        
                    }else if(instance.getEdat()==100){
                        instance.morir(instance);
                        timer.cancel();
                        Jugando.setBuitres(Jugando.getBuitres()-1);
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
                    System.out.println(Jugando.getBuitres());
                }
            }, 0, 10000);
    }
}
