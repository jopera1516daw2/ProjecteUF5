package zoologic;
/**
 * 
 * @author Jordi Oscar
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/**
 * classe genèrica d'un animal acuàtic que hereta d'Animal i implementa de Iterable
 */
public class Terrestre<T> extends Animal implements Iterable{
    /**
    * atributs
    * un atribut instancia
    * un atribut LinkedList
    */
    private static Terrestre instance;
    private List<T> terrestres= new LinkedList();
    /**
    * mètode estatic que crea una instància de Terrestre si no existeix y retorna la instància en qüestió
    */
    public static Terrestre getInstance(){
        if(instance==null){
            instance=new Terrestre("",0,false);
        }
        return instance;
    }
    /**
    * mètode constructor que implementa el constructor de Animal(super)
    * @param genero indica el genere
    * @param edat indica l'edat
    * @param alimentado indica si esta alimentat
    */ 
    public Terrestre(String genero, int edat, boolean alimentado) {
        super(genero, edat, alimentado);
    }
    /**
    * mètode per afegir un objecte T (terrestre) al HashSet
    * @param objeto instancia d'objecte T
    */ 
    public void add(T objeto ) {
        terrestres.add(objeto);
    }
    /**
    * mètode per eliminar un objecte T (terrestre) del HashSet
    * @param objeto instancia d'objecte T
    */
    public void remove(T objeto ) {
        terrestres.remove(objeto);
        Musica Musica = new Musica();
        Musica.reproducirMuerte();
    }
    /**
    * mètode que retorna el tamany del LinkedList
    * @return terrestres.size()
    */ 
    public int getNum(){
        return terrestres.size();
    }
    /**
    * mètode Iterator
    */
    public Iterator iterator() {
        return terrestres.iterator();
    }
    /**
    * mètode morir que estableix l'edat de l'animal a 0
    * @param a instancia de un animal
    */
    public void morir(Animal a){
        a.setEdat(0);
    }
    
}