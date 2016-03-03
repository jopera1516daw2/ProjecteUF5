package zoologic;
/**
 * 
 * @author Jordi Oscar
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * classe genèrica d'un animal acuàtic que hereta d'Animal i implementa de Iterable
 */
public class Volador<V> extends Animal implements Iterable{
    private static Volador instance;
    private List<V> voladores= new ArrayList();
    /**
    * mètode estatic que crea una instància de Volador si no existeix y retorna la instància en qüestió
    */
    public static Volador getInstance(){
        if(instance==null){
            instance=new Volador("",0,false);
        }
        return instance;
    }
    /**
    * mètode constructor que implementa el constructor de Animal(super)
    * @param genero indica el genere
    * @param edat indica l'edat
    * @param alimentado indica si esta alimentat
    */ 
    public Volador(String genero, int edat, boolean alimentado) {
        super(genero, edat, alimentado);
    } 
    /**
    * mètode per afegir un objecte V (volador) al ArrayList
    * @param objeto instancia d'objecte V
    */     
    public void add(V objeto ) {
        voladores.add(objeto);
    }
    /**
    * mètode per eliminar un objecte V (volador) del ArrayList
    * @param objeto instancia d'objecte V
    */
    public void remove(V objeto ) {
        voladores.remove(objeto);
        Musica Musica = new Musica();
        Musica.reproducirMuerte();
    }
    /**
    * mètode que retorna el tamany del ArrayList
    * @return terrestres.size()
    */     
    public int getNum(){
        return voladores.size();
    }
    /**
    * mètode Iterator
    */
    public Iterator iterator() {
        return voladores.iterator();
    }
    /**
    * mètode morir que estableix l'edat de l'animal a 0
    * @param a instancia de un animal
    */
    public void morir(Animal a){
        a.setEdat(0);
    }
    
    
}