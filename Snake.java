import java.awt.Color;
import java.util.ArrayList;
public class Snake
{
    private int altoLienzo;
    private int anchoLienzo;
    private static final Color COLOR_SERPIENTE = Color.BLACK;
    private ArrayList<Segment> segmentos;
    private int SEGMENTOS_INICIALES = 3;
    private static final int MARGEN_LIENZO = 10;
    /**
     * Constructor for objects of class Snake
     */
    public Snake(int altoLienzo,int anchoLienzo)
    {
        this.altoLienzo = altoLienzo;
        this.anchoLienzo = anchoLienzo;
    }

    /**
     * Método para borrar el lienzo
     */
    public void borrar(Canvas lienzo) {
        lienzo.erase();
    }
    
    
}