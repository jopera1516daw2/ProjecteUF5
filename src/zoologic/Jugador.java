
package zoologic;
/**
 * 
 * @author Jordi Oscar
 */
/**
 * classe que correspon a un jugador
 */
public class Jugador {
    /**
    * atributs
    */
    private static Jugador instance;
    private String nombre;
    private String edat;
    private String sexo;
    private int dinero=500;
    private int leones=0;
    private int monos=0;
    private int elefantes=0;
    private int pelicanos=0;
    private int buitres=0;
    private int loros=0;
    private int tiburones=0;
    private int tortugas=0;
    private int delfines=0;
    /**
    * mètode constructor que asigna els valors als atributs
    * @param nombre indica el nom del jugador
    * @param edat indica l'edat del jugador
    * @param sexo indica el sexe del jugador
    */
    private Jugador(String nombre, String edat, String sexo){
        this.nombre=nombre;
        this.edat=edat;
        this.sexo=sexo;
    }
    /**
    * mètode estatic que crea una instància de Jugador si no existeix y retorna la instància en qüestió
    */
    public static Jugador getInstance(){
        if (instance == null){
            instance=new Jugador("","","");
        }
        return instance;
    }
    /**
    * metode que retorna el nom del jugador
    * @return nombre
    */
    public String getNombre() {
        return nombre;
    }
    /**
    * metode que asigna el nom del jugador
    * @param nombre indica el nom del jugador
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
    * metode que retorna l'edat del jugador
    * @return edat
    */
    public String getEdat() {
        return edat;
    }
    /**
    * metode que asigna l'edat del jugador
    * @param edat indica l'edat del jugador
    */
    public void setEdat(String edat) {
        this.edat = edat;
    }
    /**
    * metode que retorna el sexe del jugador
    * @return sexo
    */
    public String getSexo() {
        return sexo;
    }
    /**
    * metode que asigna el sexe del jugador
    * @param sexo indica el sexe del jugador
    */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    /**
    * metode que retorna els diners del jugador
    * @return dinero
    */
    public int getDinero() {
        return dinero;
    }
    /**
    * metode que asigna els diners del jugador
    * @param dinero indica els diners del jugador
    */
    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
    /**
    * metode que retorna el nombre d'animals total
    * @return leones
    */
    public int getAnimales() {
        int animales=leones+elefantes+monos+buitres+loros+pelicanos+delfines+tiburones+tortugas;
        return animales;
    }
    /**
    * metode que retorna el nombre de lleons del jugador
    * @return leones
    */
    public int getLeones() {
        return leones;
    }
    /**
    * metode que asigna el nombre de lleons del jugador
    * @param leones indica el nombre de lleons del jugador
    */
    public void setLeones(int leones) {
        this.leones = leones;
    }
    /**
    * metode que retorna el nombre de micos del jugador
    * @return monos
    */
    public int getMonos() {
        return monos;
    }
    /**
    * metode que asigna el nombre de micos del jugador
    * @param monos indica el nombre de micos del jugador
    */
    public void setMonos(int monos) {
        this.monos = monos;
    }
    /**
    * metode que retorna el nombre de elefants del jugador
    * @return elefantes
    */
    public int getElefantes() {
        return elefantes;
    }
    /**
    * metode que asigna el nombre de elefants del jugador
    * @param elefantes indica el nombre de elefants del jugador
    */
    public void setElefantes(int elefantes) {
        this.elefantes = elefantes;
    }
    /**
    * metode que retorna el nombre de pelicans del jugador
    * @return pelicanos
    */
    public int getPelicanos() {
        return pelicanos;
    }
    /**
    * metode que asigna el nombre de pelicans del jugador
    * @param pelicanos indica el nombre de pelicans del jugador
    */
    public void setPelicanos(int pelicanos) {
        this.pelicanos = pelicanos;
    }
    /**
    * metode que retorna el nombre de buitres del jugador
    * @return buitres
    */
    public int getBuitres() {
        return buitres;
    }
    /**
    * metode que asigna el nombre de buitres del jugador
    * @param buitres indica el nombre de buitres del jugador
    */
    public void setBuitres(int buitres) {
        this.buitres = buitres;
    }
    /**
    * metode que retorna el nombre de lloros del jugador
    * @return loros
    */
    public int getLoros() {
        return loros;
    }
    /**
    * metode que asigna el nombre de lloros del jugador
    * @param loros indica el nombre de lloros del jugador
    */
    public void setLoros(int loros) {
        this.loros = loros;
    }
    /**
    * metode que retorna el nombre de taurons del jugador
    * @return tiburones
    */
    public int getTiburones() {
        return tiburones;
    }
    /**
    * metode que asigna el nombre de taurons del jugador
    * @param tiburones indica el nombre de taurons del jugador
    */
    public void setTiburones(int tiburones) {
        this.tiburones = tiburones;
    }
    /**
    * metode que retorna el nombre de tortugues del jugador
    * @return tortugas
    */
    public int getTortugas() {
        return tortugas;
    }
    /**
    * metode que asigna el nombre de tortugues del jugador
    * @param tortugas indica el nombre de tortugues del jugador
    */
    public void setTortugas(int tortugas) {
        this.tortugas = tortugas;
    }
    /**
    * metode que retorna el nombre de dofins del jugador
    * @return delfines
    */
    public int getDelfines() {
        return delfines;
    }
    /**
    * metode que asigna el nombre de dofins del jugador
    * @param delfines indica el nombre de dofins del jugador
    */
    public void setDelfines(int delfines) {
        this.delfines = delfines;
    }
    
    
}
