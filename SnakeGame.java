public class SnakeGame
{
    private Canvas lienzo;
    private Snake snake;
    private static final int ALTO_LIENZO = 500;
    private static final int ANCHO_LIENZO = 450;
    /**
     * Constructor for objects of class SnakeGame
     */
    public SnakeGame()
    {
        lienzo = new Canvas("Snake Game",ALTO_LIENZO,ANCHO_LIENZO);        
    }
    
    /**
     * Crea y dibuja la serpiente en el lienzo
     */
    public void drawSnake() {
        snake = new Snake(ALTO_LIENZO,ANCHO_LIENZO);
        lienzo.erase();
        snake.dibujar(lienzo);
    }
    
    /**
     * Hace que laserpiente se mueva de manera aleatoria
     */
    public void animatedSnake() {
        while(snake.mover()) {
            lienzo.wait(50);
            lienzo.erase();  
            snake.dibujar(lienzo);
        }
        lienzo.drawString("GAME OVER",205,200);
    }
    
    /**
     * Pinta una serie de galletas de forma aleatoria por la pantalla
     */
    public void startGame() {
        
    }
}
