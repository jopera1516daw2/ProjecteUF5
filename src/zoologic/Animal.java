package zoologic;
/**
 * 
 * @author Jordi Oscar
 */
/**
 * classe abstracta d'un animal
 */
public abstract class  Animal{
    /**
    * atributs
    */
    protected String genero;
    protected int edat;
    protected boolean alimentado=false;
    
    /**
    * mètode per crear una instancia Animal
    * @param genero indica el genere
    * @param edat indica l'edat
    * @param alimentado indica si esta alimentat
    */
    public Animal(String genero, int edat, boolean alimentado) {
        this.genero = genero;
        this.edat = edat;
        this.alimentado = alimentado;
    }
    /**
    * metode que retorna el genere del animal
    * @return genero
    */
    public String getGenero() {
        return genero;
    }
    /**
    * metode que asigna l'edat del animal
    * @param edat indica l'edat
    */
    public void setEdat(int edat) {
        this.edat = edat;
    }
    /**
    * metode que retorna l'edat del animal
    * @return genero
    */
    public int getEdat() {
        return edat;
    }
    /**
    * metode alimenta o desalimenta a l'animal
    * @param alimentado indica si estará alimentat o no
    */
    public void setAlimentado(boolean alimentado) {
        this.alimentado = alimentado;
    }
    /**
    * metode que retorna si l'animal esta alimentat o no
    * @return alimentado
    */
    public boolean isAlimentado() {
        return alimentado;
    }
    /**
     * mètodes abstractes, que s'implementaràn en cada tipus d'animal
     */
    public abstract int getNum();
    public abstract void morir(Animal a);
}
