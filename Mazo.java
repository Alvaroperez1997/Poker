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
    //Crea una arrayList de tipo Carta que almacena objetos de tipo Carta llamada cartas
    private ArrayList<Carta> cartas;

    /**
     * Constructor for objects of class Mazo
     */
    public Mazo()
    {
        //Se inicializa la arrayList
        cartas = new ArrayList<Carta>();
        //cont es el numero de carta
        int cont = 0;
        //Crea 52 objetos Cartas y las almacena en la ArrayList cartas
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
        //Baraja aleatoriamente las cartas
        Collections.shuffle(cartas);
    }

    /**
     * Devuelve el numero de cartas que quedan
     */
    public int quedan()
    {
        //numero de cartas que quedan en la baraja
        return cartas.size();
    }

    /**
     * retorna la primera carta del mazo y 
     * modifica el estado del mazo para reflejar que esa carta ya no se encuentra en el mazo. 
     * En caso de que no queden cartas en el mazo devuelve null
     */
    public Carta tomarPrimera()
    {
        //Si quedan cartas en el mazo devuelve la primera carta de la arrayList cartas
        //Sino devuelve null
        Carta primeraCarta = null;
        if (cartas.size() != 0) {
            primeraCarta = cartas.get(0);
            cartas.remove(0);
        }
        return primeraCarta;
    }
}
