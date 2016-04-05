import java.awt.Color;
public class Segment
{
    private int posicionX;
    private int posicionY;
    private int direccion;
    private Color color =  Color.BLACK;;
    private int LONGITUD_DEL_SEGMENTO = 4 ;
    /**
     * Constructor for objects of class Segment
     */
    public Segment(int posicionX, int posicionY, int direccion)
    {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.direccion = direccion;
    }
}
