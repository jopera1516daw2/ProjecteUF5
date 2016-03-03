
package zoologic;
/**
 * 
 * @author Jordi Oscar
 */
/**
 * classe que correspon a la Excepció Personificada i hereta de Exception
 */
public class ExcepcionPers extends Exception {
    /**
    * mètode per mostrar un missatge
    * @param mensaje indica el missatge
    */
    public ExcepcionPers(String mensaje) {
        super(mensaje);
    }
}
