/**
 * Esta clase representa autom�viles.
 * 
 */
public class Coche
{
    private String modelo; // Ford Focus, Citroen X-Sara, ...
    private String color;
    private int numeroPuertas;
    private int a�o;

    /**
     * Constructor para los objetos de la clase Coche.
     * @param  queModelo el modelo del coche
     * @param  queColor el color del coche
     * @param  queA�o el a�o de fabricaci�n del coche
     * 
     */
    public Coche(String queModelo, String queColor, int queA�o, int cuantasPuertas)   {
        modelo = queModelo;
        color = queColor;
        a�o = queA�o;
        numeroPuertas = cuantasPuertas;
    }

    /**
     * cambiar el modelo del coche
     *  
     */
    public void setModelo(String  queModelo)    {
        modelo = queModelo;
    }   

    /**
     * cambiar el color del coche
     *  
     */
    public void setColor(String queColor)  {
        color = queColor;
    }     

    /**
     * cambiar el a�o del coche
     *  
     */
    public void setA�o(int queA�o)   {
        a�o = queA�o;
    } 

    /**
     * visualizar la informaci�n del coche
     */
    public void print()   {
        System.out.println("Modelo " + modelo + "\nA�o " + a�o + 
            "\nColor " + color + "\nPuertas " + numeroPuertas + ".");
    }    

    /**
     * devolver el modelo del coche
     *  
     */
    public String getModelo()   { 
        return modelo;
    }

    /**
     * devolver el color del coche
     *  
     */
    public String getColor()  { 
        return color;
    }

    /**
     * devolver el a�o del coche
     *  
     */
    public int getA�o()   { 
        return a�o;
    }
    
    /**
     * 
     */
    public int getPuertas() {
        return numeroPuertas;
    }

    /**
     * 
     *
     * @param  unCoche el coche a comparar con el actual
     * @return true si los coches que se comparan son iguales   
     */
    public boolean igualQue(Coche unCoche)   {

        return this.modelo.equals(unCoche.getModelo()) &&
            this.color.equals(unCoche.getColor()) &&
            this.a�o == unCoche.getA�o() &&
            this.numeroPuertas == unCoche.getPuertas();
    }


}
