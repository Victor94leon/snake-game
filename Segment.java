import java.awt.Color;
public class Segment
{
    private int posicionX;
    private int posicionY;
    private int direccion;
    private Color color;
    public static final int LONGITUD_SEGMENTO = 50;
    private static final int DIFERENCIA_DE_GRADOS_ENTRE_DIRECCIONES = 90;
    private final static int DERECHA = 0;
    private final static int ARRIBA = 1;
    private final static int IZQUIERDA = 2;
    private final static int ABAJO = 3;
    /**
     * Constructor for objects of class Segment
     */
    public Segment(int posicionX, int posicionY, int direccion, Color color)
    {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.direccion = direccion;
        this.color = color;
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
            posicionFinalX -= LONGITUD_SEGMENTO;
        }
        else if(direccion==DIFERENCIA_DE_GRADOS_ENTRE_DIRECCIONES*IZQUIERDA){
            posicionFinalX += LONGITUD_SEGMENTO;
        }
        return posicionFinalX;
    }

    /**
     * Devuelve la posición y del segmento
     */
    public int getPosicionFinalY() {
        int posicionFinalY = posicionY;
        if(direccion==DIFERENCIA_DE_GRADOS_ENTRE_DIRECCIONES*ARRIBA) {
            posicionFinalY -= LONGITUD_SEGMENTO;
        }
        else if(direccion==DIFERENCIA_DE_GRADOS_ENTRE_DIRECCIONES*ABAJO) {
            posicionFinalY += LONGITUD_SEGMENTO;
        }
        return posicionFinalY;
    }

    /**
     * Método para dibujar un segmento en el lienzo
     */
    public void dibujar(Canvas lienzo)     {
      lienzo.setForegroundColor(color);
      lienzo.drawLine(posicionX,posicionY,getPosicionFinalX(),getPosicionFinalY());
    }

    /**
     * Comprueba si un segmento colisiona con otro
     */
    public boolean colisiona(Segment segmento) {
        return (posicionX == segmento.getPosicionFinalX() && posicionY == segmento.getPosicionFinalY());
    }

    public void borrar(Canvas lienzo)
    {
        lienzo.setForegroundColor(lienzo.getBackgroundColor());
        lienzo.drawLine(posicionX,posicionY,getPosicionFinalX(),getPosicionFinalY());
    }
}
