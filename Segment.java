import java.awt.Color;
public class Segment
{
    private int posicionX;
    private int posicionY;
    private int direccion;
    private Color color =  Color.BLACK;;
    public int LONGITUD_DEL_SEGMENTO = 4;
    private static final int DIFERENCIA_DE_GRADOS_ENTRE_DIRECCIONES = 90;
    private final static int DERECHA = 0;
    private final static int ARRIBA = 1;
    private final static int IZQUIERDA = 2;
    private final static int ABAJO = 3;
    /**
     * Constructor for objects of class Segment
     */
    public Segment(int posicionX, int posicionY, int direccion)
    {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.direccion = direccion;
    }

    /**
     * Devuelve la posicion x del segmento
     */
    public int getPosicionInicialX() {
        return posicionX;
    }

    /**
     * Devuelve la posición y del segmento
     */
    public int getPosicionInicialY() {
        return posicionY;
    }

    /**
     * Devuelve la dirección del segmento
     */
    public int getDireccion() {
        return direccion;        
    }

    /**
     * Devuelve la posición X del segmento
     */
    public int getPosicionFinalX() {
        int posicionFinalX = posicionX;
        if(direccion==DIFERENCIA_DE_GRADOS_ENTRE_DIRECCIONES*DERECHA) {
            posicionFinalX -= LONGITUD_DEL_SEGMENTO;
        }
        else if(direccion==DIFERENCIA_DE_GRADOS_ENTRE_DIRECCIONES*IZQUIERDA){
            posicionFinalX += LONGITUD_DEL_SEGMENTO;
        }
        return posicionFinalX;
    }

    /**
     * Devuelve la posición y del segmento
     */
    public int getPosicionFinalY() {
        int posicionFinalY = posicionY;
        if(direccion==DIFERENCIA_DE_GRADOS_ENTRE_DIRECCIONES*ARRIBA) {
            posicionFinalY -= LONGITUD_DEL_SEGMENTO;
        }
        else if(direccion==DIFERENCIA_DE_GRADOS_ENTRE_DIRECCIONES*ABAJO) {
            posicionFinalY += LONGITUD_DEL_SEGMENTO;
        }
        return posicionFinalY;
    }

    /**
     * Método para dibujar un segmento en el lienzo
     */
    public void dibujar(Canvas lienzo) {
        lienzo.setForegroundColor(color);
        if (direccion==0) {
            lienzo.drawLine(posicionX,posicionY,(posicionX - LONGITUD_DEL_SEGMENTO),posicionY);
        }
        else if(direccion==90) {
            lienzo.drawLine(posicionX,posicionY,posicionX,(posicionY - LONGITUD_DEL_SEGMENTO));
        }
        else if(direccion==180) {
            lienzo.drawLine(posicionX,posicionY,(posicionX + LONGITUD_DEL_SEGMENTO),posicionY);
        }
        else {
            lienzo.drawLine(posicionX,posicionY,posicionX,(posicionY - LONGITUD_DEL_SEGMENTO));
        }
    }

    /**
     * Método para borrar un segmento
     */
    public void borrar(Canvas lienzo) {
        lienzo.erase();
    }
}
