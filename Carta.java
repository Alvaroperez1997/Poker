
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
        this.valor = valor;
        this.palo = palo;
    }

    /**
     * Nombre de la carta
     */
    public String getNombre()
    {
        String cartaEspecial = null;
        if (valor == 1) {
            cartaEspecial = "As";
        }
        if (valor == 11) {
            cartaEspecial = "J";
        }
        if (valor == 12) {
            cartaEspecial = "Q";
        }
        if (valor == 13) {
            cartaEspecial = "K";
        }
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
