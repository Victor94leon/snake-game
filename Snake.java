import java.awt.Color;
import java.util.ArrayList;
public class Snake
{
    private int altoLienzo;
    private int anchoLienzo;
    private ArrayList<Segment> segmentos;
    private int SEGMENTOS_INICIALES = 3;
    private static final int DIFERENCIA_DE_GRADOS_ENTRE_DIRECCIONES = 90;
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
     * Dibuja la serpiente en el lienzo
     */
    public void dibujar(Canvas lienzo) {
        
    }
}