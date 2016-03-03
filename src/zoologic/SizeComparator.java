
package zoologic;
/**
 * 
 * @author Jordi Oscar
 */
import java.util.Comparator;
/**
 * classe comparator que compara Animals. Implementa de Comparator
 */
public class SizeComparator implements Comparator<Animal>{
    /**
    * mètode que compara dos llistes d'animals segons el número d'animals que tenen cada un
    * @return 1 si la llista 2 conté més animals que la 1
    * @return -1 si la llista 2 conté més animals que la 1
    * @return 0 si tenen el mateix nombre
    */
    @Override
    public int compare(Animal o1, Animal o2) {
        if (o1.getNum() < o2.getNum()){
            return 1;
        }else if (o1.getNum() > o2.getNum()){
            return -1;
        }else{
            return 0;
        }
    } 
}
