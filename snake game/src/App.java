/**
 * App
 * 
 * 
 */
import javax.swing.*;
public class App {

    public static void main(String[] args) throws Exception{
     
        int boardw = 600;
        int boardh = boardw;

        JFrame frame = new JFrame("NS8 Snake");
        frame.setVisible(true);
        frame.setSize(boardw,boardh);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        Snake game = new Snake(boardw, boardh);
        frame.add(game);
        frame.pack();
        game.requestFocus();


    }
}