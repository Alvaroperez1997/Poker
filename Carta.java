
/**
 * Write a description of class Carta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carta
{
    // Valor de la carta
    private int valor;
    // Palo de la carta
    private String palo;

    /**
     * Constructor for objects of class Carta
     */
    public Carta(int valor, String palo)
    {
        //Se asignan los atributos a un objeto Carta
        this.valor = valor;
        this.palo = palo;
    }

    /**
     * Nombre de la carta
     */
    public String getNombre()
    {
        //Cambia los valores 1, 11, 12 y 13 por una cadena de la baraja francesa
        String numero = valor + "";
        if (valor == 1) {
            numero = "As";
        }
        if (valor == 11) {
            numero = "J";
        }
        if (valor == 12) {
            numero = "Q";
        }
        if (valor == 13) {
            numero = "K";
        }
        String cartaEspecial = numero + " de " + palo;
        return cartaEspecial;
    }
    
    /**
     * Devuelve el valor de la carta
     */
    public int getValor()
    {
        return valor;
    }
    
    /**
     * Devuelve el palo de la carta
     */
    public String getPalo()
    {
        return palo;
    }
}
