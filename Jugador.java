import java.util.ArrayList;
/**
 *
 */
public class Jugador
{
    //Atributo en el cual metemos parametros de tipo carta y los almacena.
    private ArrayList <Carta> cartasEnMano;
    //Atributo el cual contendra el id del jugador
    private int id;
    

    /**
     * Constructor para la clase Jugador
     */
    public Jugador(int id)
    {
        //Inicializamos la variable Id
        this.id = id;
        //Inicializamos la variable cartasEnMaNO
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
    public void recibirCarta(Mazo a)
    {
        cartasEnMano.add(a.tomarPrimera());//Metemos en el atributo cartasEnMano un objeto tipo carta,
                                            //invocando el metodo tomarPrimera que devuelve la primera carta del mazo
    }

    /**
     * Metodo que devuelve un ArrayList con todas las cartas que el jugador tiene en la mano
     */
    public ArrayList <Carta> cartasQueTieneEnLaMano()
    {
        return cartasEnMano;
    }
}

