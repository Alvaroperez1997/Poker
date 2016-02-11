import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class Mazo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mazo
{
    //ArrayList que almacena las cartas
    private ArrayList<Carta> cartas;

    /**
     * Constructor for objects of class Mazo
     */
    public Mazo()
    {
        cartas = new ArrayList<Carta>();
        //cont es el numero de carta
        int cont = 0;
        while (cont < 13) {
            cont++;
            cartas.add(new Carta(cont, "Pícas"));
            cartas.add(new Carta(cont, "Diamantes"));
            cartas.add(new Carta(cont, "Corazones"));
            cartas.add(new Carta(cont, "Tréboles"));
        }
    }

    /**
     * Baraja las cartas del mazo
     */
    public void barajar()
    {
        Collections.shuffle(cartas);
    }

    /**
     * Devuelve el numero de cartas que quedan
     */
    public int quedan()
    {
        return cartas.size();
    }

    /**
     * retorna la primera carta del mazo y 
     * modifica el estado del mazo para reflejar que esa carta ya no se encuentra en el mazo. 
     * En caso de que no queden cartas en el mazo devuelve null
     */
    public Carta tomarPrimera()
    {
        Carta primeraCarta = null;
        if (cartas.size() != 0) {
            primeraCarta = cartas.get(0);
            cartas.remove(0);
        }
        return primeraCarta;
    }
}