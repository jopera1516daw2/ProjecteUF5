package zoologic;
/**
 * 
 * @author Jordi Oscar
 */
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;
import javax.sound.midi.MidiChannel;
/**
 * classe musica per utilitzar l'API Java-midi
 */
public class Musica {
    /**
    * atributs
    */
    private int canal = 0; 
    private int duracion = 400; 
    private int volumen = 1000; 
    /**
    * mètode que reporueix una seqüència de sons per quan l'animal deixa de estar alimentat
    */
    public void reproducirHambre() {
        try {
            Synthesizer synth = MidiSystem.getSynthesizer();
            synth.open();
            MidiChannel[] canales = synth.getChannels();
            canales[canal].noteOn( 65, volumen );
            Thread.sleep( duracion );
            canales[canal].noteOff( 65 );
            canales[canal].noteOn( 70, volumen );
            Thread.sleep( duracion*2 );
            canales[canal].noteOff( 70 );
            canales[canal].noteOn( 75, volumen );
            Thread.sleep( duracion );
            canales[canal].noteOff( 75 );
            synth.close();
        }
        catch (Exception e) {
                e.printStackTrace();
        }
    }
    /**
    * mètode que reprodueix un so per quan l'animal mor
    */
    public void reproducirMuerte() {
        try {
            Synthesizer synth = MidiSystem.getSynthesizer();
            synth.open();
            MidiChannel[] canales = synth.getChannels();
            canales[canal].noteOn( 20, volumen );
            Thread.sleep( duracion*10 );
            canales[canal].noteOff( 20 );
            synth.close();
        }
        catch (Exception e) {
                e.printStackTrace();
        }
    }
}