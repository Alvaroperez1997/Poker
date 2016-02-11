import java.util.ArrayList;
import java.util.Collections;
/**
 * 
 */
public class Juego
{ 
    //Atributo en el cual metemos parametros de tipo jugador  para los jugadores.
    private ArrayList <Jugador> jugadores;
    //Atributo en el cual metemos los jugadores que va a ver en el juego.
    private int numJugadores;
    //Atributo de tipo mazo que nos sirve para invocar o crear un objeto mazo.
    private Mazo mazo;
    /**
     * Constructor for objects of class Juego
     */
    public Juego(int numJugadores)
    {
        //Inicializamos la variable jugadores
        jugadores = new ArrayList <Jugador>();
        //Inicializamos la variable mazo
        mazo = new Mazo();
        int cont = 1;

        //Si el numero de jugadores es menor que 2 o mayor que 8 se inicializa el juego con 4 jugadores.
        if (numJugadores > 2 && numJugadores < 8)
        {
            while (cont <= numJugadores){
                this.numJugadores = numJugadores;
                jugadores.add(new Jugador(cont));
                cont = cont + 1;
            }
        }
        else 
        {
            while (cont <= 4)
            {
                this.numJugadores = 4;
                jugadores.add(new Jugador(cont));
                cont = cont + 1;
            }
        }
    }

    /**
     * Metodo que reparte las cartas del mazo hasta que se acaben o hasta que queden menos cartas que jugadores una vez que ha repartido a todos.
     */
    public void repartir()
    {
        int cont = 1;//Contador para dar una carta a los jugadores tantos como haya.
        mazo.barajar();
        int contCartas = 0;//Contador de vueltas por cada vez que ha dado una carta a todos los jugadores.
        //Si hay cartas en el mazo
        if (mazo.quedan()>0){
            while(mazo.quedan() >= (jugadores.size() - (cont-1)) && (contCartas != 5)) {
                jugadores.get(cont - 1).recibirCarta(mazo);
                if (cont == jugadores.size()){
                    cont = 0;
                    contCartas++;
                }
                cont++;

            }
        }
        else{
            System.out.println(mazo.tomarPrimera()); //Si no hay cartas en el mazo imprime null.
        }
    }

    public void mostrarCartas()
    {
        for(Jugador jugador : jugadores)//Recorre cada jugador del juego
        {
            System.out.println( "El id del jugador es: " + jugador.getId() + " Y tiene las cartas: ");
            ArrayList<Carta> listCartas = jugador.cartasQueTieneEnLaMano();//Variable para guardar la lista del ArrayList de las cartas que tiene cada jugador
            for(Carta carta : listCartas) { //Recorre cada carta que tiene el jugador en la mano
                System.out.println(carta.getNombre());//Imprime el nombre de cada carta por pantalla guardado en la variable carta del for
            }
        }
    }


}
