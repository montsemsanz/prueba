/**
 * Esta clase representa automóviles.
 * 
 */
public class Coche
{
    private String modelo; // Ford Focus, Citroen X-Sara, ...
    private String color;
    private int numeroPuertas;
    private int año;

    /**
     * Constructor para los objetos de la clase Coche.
     * @param  queModelo el modelo del coche
     * @param  queColor el color del coche
     * @param  queAño el año de fabricación del coche
     * 
     */
    public Coche(String queModelo, String queColor, int queAño, int cuantasPuertas)   {
        modelo = queModelo;
        color = queColor;
        año = queAño;
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
     * cambiar el año del coche
     *  
     */
    public void setAño(int queAño)   {
        año = queAño;
    } 

    /**
     * visualizar la información del coche
     */
    public void print()   {
        System.out.println("Modelo " + modelo + "\nAño " + año + 
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
     * devolver el año del coche
     *  
     */
    public int getAño()   { 
        return año;
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
            this.año == unCoche.getAño() &&
            this.numeroPuertas == unCoche.getPuertas();
    }


}
