package zoologic;
/**
 * 
 * @author Jordi Oscar
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/**
 * classe genèrica d'un animal acuàtic que hereta d'Animal i implementa de Iterable
 */
public class Acuatico<A> extends Animal implements Iterable{
    /**
    * atributs
    * un atribut instancia
    * un atribut HashSet
    */
    private static Acuatico instance;
    private Set<A> acuaticos= new  HashSet();
    /**
    * mètode estatic que crea una instància de Acuatic si no existeix y retorna la instància en qüestió
    */
    public static Acuatico getInstance(){
        if(instance==null){
            instance=new Acuatico("",0,false);
        }
        return instance;
    }
    /**
    * mètode constructor que implementa el constructor de Animal(super)
    * @param genero indica el genere
    * @param edat indica l'edat
    * @param alimentado indica si esta alimentat
    */ 
    public Acuatico(String genero, int edat, boolean alimentado) {
        super(genero, edat, alimentado);
    }
    /**
    * mètode per afegir un objecte A (acuátic) al HashSet
    * @param objeto instancia d'objecte A
    */ 
    public void add(A objeto) {
        acuaticos.add(objeto);
    }
    /**
    * mètode per eliminar un objecte A (acuátic) del HashSet
    * @param objeto instancia d'objecte A
    */ 
    public void remove(A objeto ) {
        acuaticos.remove(objeto);
        Musica Musica = new Musica();
        Musica.reproducirMuerte();
    }
    /**
    * mètode que retorna el tamany del HasSet
    * @return acuaticos.size()
    */ 
    public int getNum(){
        return acuaticos.size();
    }
    /**
    * mètode Iterator
    */
    @Override
    public Iterator iterator() {
        return acuaticos.iterator();
    }
    /**
    * mètode morir que estableix l'edat de l'animal a 0
    * @param a instancia de un animal
    */
    @Override
    public void morir(Animal a){
        a.setEdat(0);
    }
    
}