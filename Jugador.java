import java.util.ArrayList;
/**
 *
 */
public class Jugador
{
    private ArrayList <Carta> cartasEnMano;
    private int id;
    

    /**
     * Constructor para la clase Jugador
     */
    public Jugador(int id)
    {
        this.id = id;
        cartasEnMano = new ArrayList <Carta>();

    }

    /**
     * Metodo que devuelve el id del jugador
     */
    public int getId()
    {
        return id;
    }

    /**
     * Metodo que agrega una carta a todas las que ya tiene el jugador
     */
    public void recibirCarta(Mazo a)//Carta darCarta
    {
        //cartasEnMano.add(darCarta.getNombre());
        //mazo.tomarPrimera()
        //Mazo.tomarPrimera();
        cartasEnMano.add(a.tomarPrimera());
    }

    /**
     * Metodo que devuelve un ArrayList con todas las cartas que el jugador tiene en la mano
     */
    public ArrayList <Carta> cartasQueTieneEnLaMano()
    {
        return cartasEnMano;
    }
}

