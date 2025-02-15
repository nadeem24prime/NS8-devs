import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
/**
 * Snake
 */


public class Snake extends JPanel implements ActionListener,KeyListener {
    int bw;
    int bh;
    int tile = 25;

    //snake
    Tile head;
    ArrayList<Tile> body;

    //food
    Tile food;
    Random random;

    //game logic
    Timer gameloop;
    int vx;
    int vy;
    boolean gameover = false;

    int delay = 100;




    Snake(int bw,int bh){
        this.bh =bh;
        this.bw = bw;
        setPreferredSize(new Dimension(this.bw,this.bh));
        setBackground(Color.black);
        head = new Tile(5,5);
        food = new Tile(10, 10);
        random = new Random();
        placefood();
        addKeyListener(this);
        setFocusable(true);

        gameloop = new Timer(delay, this);
        gameloop.start();

        vx = 0;
        vy = 0;

        body = new ArrayList<>();
    }

    class Tile {
        int x;
        int y;
        Tile(int x, int y){
            this.x = x;
            this.y = y;

        }
    }

    public void paint(Graphics g){
        super.paint(g);
        draw(g);
    }
    public void  draw(Graphics g){
        for (int i = 0; i < bw/tile; i++){
            g.drawLine(i*tile, 0, i*tile, bh);
            g.drawLine(0, i*tile, bw, i*tile);
        }
        //food
        g.setColor(Color.red);
        g.fillRect(food.x*tile,food.y*tile , tile, tile);

        //head
        g.setColor(Color.green);
        g.fillRect(head.x *tile, head.y*tile, tile, tile);

        //title

        

        //snake body
        for (int i =0; i < body.size(); i++){
            Tile part = body.get(i);
            g.fill3DRect(part.x * tile, part.y * tile,  tile, tile,true);
        }

        //score
        g.setFont(new Font("Arial",Font.PLAIN,22));
        g.drawString("SnakeGame By NS8", 220, 30);

        if (gameover) {
            g.setColor(Color.red);
            g.drawString("game over! score :" + String.valueOf(body.size()), tile -16, tile);
            Color out = new Color(10,30,90);
            setBackground(out);
        }else{
            g.drawString("score: " + String.valueOf(body.size()), tile - 16, tile);
        }
    }
    public void placefood(){
         food.x = random.nextInt(bw/tile);
         food.y = random.nextInt(bh/tile);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        move();
        repaint();
        if (gameover) {
            gameloop.stop();
        }
    }
    public void move(){
        //eat food
        if (collide(head, food)) {
            body.add(new Tile(food.x, food.y));
            placefood();
        }
        //snake
        for (int i = body.size()-1; i >= 0; i--){
            Tile part = body.get(i);
            if (i == 0) {
                part.x = head.x;
                part.y = head.y;
            }
            else {
                Tile ppart = body.get(i-1);
                part.x = ppart.x;
                part.y = ppart.y;
            }
        }        


        head.x += vx;
        head.y += vy;

        //gameover logic
        for(int i =0; i < body.size(); i++){
            Tile part = body.get(i);
            if (collide(head, part)) {
                gameover = true;
            }
        }
        if (head.x * tile < 0  || head.x*tile > bw || head.y*tile < 0 || head.y*tile > bh) {
            gameover =true;
        }

    }
    public boolean collide(Tile t1,Tile t2){
        return  t1.x == t2.x && t1.y == t2.y;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_W && vy != 1) {
            vx =0;
            vy = -1;
        }
        else if (e.getKeyCode() == KeyEvent.VK_DOWN|| e.getKeyCode() == KeyEvent.VK_S  && vy != -1) {
            vx = 0;
            vy =1 ;
        }
        else if (e.getKeyCode() == KeyEvent.VK_LEFT  || e.getKeyCode() == KeyEvent.VK_A && vx != 1 ) {
            vx = -1;
            vy = 0;
        }
        else if (e.getKeyCode() == KeyEvent.VK_RIGHT  || e.getKeyCode() == KeyEvent.VK_D && vx != -1) {
            vx = 1;
            vy =0 ;
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
    }

    
}