 import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TicTacToe {
    public static void main(String[] args) {

        // Initializing local
        final String[] player = {"x"}; // Mutable reference to hold player symbol
        JFrame frame = new JFrame("Tic Tac Toe");
		frame.setResizable(false);
        // Making player indicator
        JLabel playerInd = new JLabel("Play: " + player[0]);
        playerInd.setBounds(280,100,300,100);
        frame.add(playerInd);
        playerInd.setFont(new Font("Arial", Font.PLAIN,30));
		
        //creating our title
        JLabel title = new JLabel("Tic Tac Toe");
        title.setBounds(250,50,0,0);
        title.setFont(new Font("Arial",Font.ITALIC,25));
        frame.add(title);
	

        // Creating buttons
        JButton plot1 = new JButton(" ");
        JButton plot2 = new JButton(" ");
        JButton plot3 = new JButton(" ");
        JButton plot4 = new JButton(" ");
        JButton plot5 = new JButton(" ");
        JButton plot6 = new JButton(" ");
        JButton plot7 = new JButton(" ");
        JButton plot8 = new JButton(" ");
        JButton plot9 = new JButton(" ");

        //setting plot fonts
        plot1.setFont(new Font("Arial",Font.PLAIN,30));
        plot2.setFont(new Font("Arial",Font.PLAIN,30));
        plot3.setFont(new Font("Arial",Font.PLAIN,30));
        plot4.setFont(new Font("Arial",Font.PLAIN,30));
        plot5.setFont(new Font("Arial",Font.PLAIN,30));
        plot6.setFont(new Font("Arial",Font.PLAIN,30));
        plot7.setFont(new Font("Arial",Font.PLAIN,30));
        plot8.setFont(new Font("Arial",Font.PLAIN,30));
        plot9.setFont(new Font("Arial",Font.PLAIN,30));




        // Positioning buttons (plots)
        plot1.setBounds(200, 200, 50, 50);
        plot2.setBounds(300, 200, 50, 50);
        plot3.setBounds(400, 200, 50, 50);
        plot4.setBounds(200, 300, 50, 50);
        plot5.setBounds(300, 300, 50, 50);
        plot6.setBounds(400, 300, 50, 50);
        plot7.setBounds(200, 400, 50, 50);
        plot8.setBounds(300, 400, 50, 50);
        plot9.setBounds(400, 400, 50, 50);

        // Event handling

        // Making initial winning false
        final boolean[] win = {false};

        //making swapped player variable
        plot1.addActionListener(e -> {
            if(plot1.getText().equals(" ")){
                player[0] = change(player[0], plot1, playerInd);
                if (checkwin(plot1, plot2, plot3,plot4,plot5,plot6,plot7,plot8,plot9)) {
                    String winplay = "x";
                    if(player[0].equals("x")){
                        winplay = "o";
                    }else{
                        winplay = "x";
                    }
                    JButton restart = new JButton("Restart");
                    restart.setBounds(20,300,100,30);
                    
                    frame.add(restart);
                    playerInd.setText(winplay +  " Wins!");
                }
            }
            plot1.setEnabled(false);
            
        });
        plot2.addActionListener(e -> {
            if(plot2.getText().equals(" ")){
                player[0] = change(player[0], plot2, playerInd);
                if (checkwin(plot1, plot2, plot3,plot4,plot5,plot6,plot7,plot8,plot9)) {
                    String winplay = "x";
                    if(player[0].equals("x")){
                        winplay = "o";
                    }else{
                        winplay = "x";
                    }     
                     JButton restart = new JButton("Restart");
                    restart.setBounds(20,300,100,30);
                    frame.add(restart);
                    playerInd.setText(winplay +  " Wins!");
                }
            }
            plot2.setEnabled(false);
        });
        plot3.addActionListener(e -> {
            if(plot3.getText().equals(" ")){
                player[0] = change(player[0], plot3, playerInd);
                if (checkwin(plot1, plot2, plot3,plot4,plot5,plot6,plot7,plot8,plot9)) {
                    String winplay = "x";
                    if(player[0].equals("x")){
                        winplay = "o";
 
                    }else{
                        winplay = "x";
                    }
                    JButton restart = new JButton("Restart");
                    restart.setBounds(20,300,100,30);
                    frame.add(restart);
                    playerInd.setText(winplay +  " Wins!");
                }
            }
            plot3.setEnabled(false);
        });
        plot4.addActionListener(e -> {
            if(plot4.getText().equals(" ")){
                player[0] = change(player[0], plot4, playerInd);
                if (checkwin(plot1, plot2, plot3,plot4,plot5,plot6,plot7,plot8,plot9)) {
                    String winplay = "x";
                    if(player[0].equals("x")){
                        winplay = "o";
                    }else{
                        winplay = "x";
                    }
                    JButton restart = new JButton("Restart");
                    restart.setBounds(20,300,100,30);
                    frame.add(restart);
                    playerInd.setText(winplay +  " Wins!");            }
            }
            plot4.setEnabled(false);    });
        plot5.addActionListener(e -> {
            if(plot5.getText().equals(" ")){
                player[0] = change(player[0], plot5, playerInd);
                if (checkwin(plot1, plot2, plot3,plot4,plot5,plot6,plot7,plot8,plot9)) {
                    String winplay = "x";
                    if(player[0].equals("x")){
                        winplay = "o";
                    }else{
                        winplay = "x";
                    }
                    JButton restart = new JButton("Restart");
                    restart.setBounds(20,300,100,30);
                    frame.add(restart);
                    playerInd.setText(winplay +  " Wins!");            }
            }
            plot5.setEnabled(false);  });
        plot6.addActionListener(e -> {
            if(plot6.getText().equals(" ")){
                player[0] = change(player[0], plot6, playerInd);
                if (checkwin(plot1, plot2, plot3,plot4,plot5,plot6,plot7,plot8,plot9)) {
                    String winplay = "x";
                    if(player[0].equals("x")){
                        winplay = "o";
                    }else{
                        winplay = "x";
                    }
                    JButton restart = new JButton("Restart");
                    restart.setBounds(20,300,100,30);
                    frame.add(restart);
                    playerInd.setText(winplay +  " Wins!");         }
            }
            plot6.setEnabled(false); });
        plot7.addActionListener(e -> {
            if(plot7.getText().equals(" ")){
                player[0] = change(player[0], plot7, playerInd);
                if (checkwin(plot1, plot2, plot3,plot4,plot5,plot6,plot7,plot8,plot9)) {
                    String winplay = "x";
                    if(player[0].equals("x")){
                        winplay = "o";
                    }else{
                        winplay = "x";
                    }
                    JButton restart = new JButton("Restart");
                    restart.setBounds(20,300,100,30);
                    frame.add(restart);
                    playerInd.setText(winplay +  " Wins!");             }
            }
            plot7.setEnabled(false); });
        plot8.addActionListener(e -> {
            if(plot8.getText().equals(" ")){
                player[0] = change(player[0], plot8, playerInd);
                if (checkwin(plot1, plot2, plot3,plot4,plot5,plot6,plot7,plot8,plot9)) {
                    String winplay = "x";
                    if(player[0].equals("x")){
                        winplay = "o";
                    }else{
                        winplay = "x";
                    }
                    JButton restart = new JButton("Restart");
                    restart.setBounds(20,300,100,30);
                    frame.add(restart);
                    playerInd.setText(winplay +  " Wins!");               
                }
            }
            plot8.setEnabled(false);});
        plot9.addActionListener(e -> {
            if(plot9.getText().equals(" ")){
                player[0] = change(player[0], plot9, playerInd);
                if (checkwin(plot1, plot2, plot3,plot4,plot5,plot6,plot7,plot8,plot9)) {
                    String winplay = "x";
                    if(player[0].equals("x")){
                        winplay = "o";
                    }else{
                        winplay = "x";
                    }
                    
                    JButton restart = new JButton("Restart");
                    restart.setBounds(20,300,100,30);
                    frame.add(restart);
                    playerInd.setText(winplay +  " Wins!");             }
            }
            plot9.setEnabled(false);     });

        // Checking win
        if (win[0]) {
            playerInd.setText("Wins");
        }

        // *there are 3 winning situations, (1)when a symbol matched the pattern in diagonally, horizontally or vertically */

        // Initializing frame
        frame.setSize(600,600);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Adding plots to frame
        frame.add(plot1);
        frame.add(plot2);
        frame.add(plot3);
        frame.add(plot4);
        frame.add(plot5);
        frame.add(plot6);
        frame.add(plot7);
        frame.add(plot8);
        frame.add(plot9);
    }

    // Method to change plot text
    public static String change(String player, JButton plot, JLabel label) {
        String playerMove = player;
        plot.setText(playerMove);
        String out = " ";
        if (player.equals("x")) {
            player = "o";
            plot.setBackground(Color.red);
        } else if (player.equals("o")) {
            player = "x";
            plot.setBackground(Color.blue);
        }
        label.setText("Play: " + player + out);
        return player;
    }

    public static boolean checkwin(JButton plot1, JButton plot2, JButton plot3,JButton plot4,JButton plot5,JButton plot6,JButton plot7,JButton plot8,JButton plot9) {
        String text1 = plot1.getText();
        String text2 = plot2.getText();
        String text3 = plot3.getText();
        String text4 = plot4.getText();
        String text5 = plot5.getText();
        String text6 = plot6.getText();
        String text7 = plot7.getText();
        String text8 = plot8.getText();
        String text9 = plot9.getText();
        //checking winning of x
        if (text1.equals("x") && text2.equals("x") && text3.equals("x")) {
            return true;
        }
        if (text4.equals("x") && text5.equals("x") && text6.equals("x")) {
            return true;
        }
        if (text7.equals("x") && text8.equals("x") && text9.equals("x")) {
            return true;
        }
        if (text1.equals("x") && text5.equals("x") && text9.equals("x")) {
            return true;
        }
        if (text3.equals("x") && text5.equals("x") && text7.equals("x")) {
            return true;
        }
        if (text1.equals("x") && text4.equals("x") && text7.equals("x")) {
            return true;
        }
        if (text2.equals("x") && text5.equals("x") && text8.equals("x")) {
            return true;
        }
        if (text3.equals("x") && text6.equals("x") && text9.equals("x")) {
            return true;
        }

        //checking winning o
        if (text1.equals("o") && text2.equals("o") && text3.equals("o")) {
            return true;
        }
        if (text4.equals("o") && text5.equals("o") && text6.equals("o")) {
            return true;
        }
        if (text7.equals("o") && text8.equals("o") && text9.equals("o")) {
            return true;
        }
        if (text1.equals("o") && text5.equals("o") && text9.equals("o")) {
            return true;
        }
        if (text3.equals("o") && text5.equals("o") && text7.equals("o")) {
            return true;
        }
        if (text1.equals("o") && text4.equals("o") && text7.equals("o")) {
            return true;
        }

        
        if (text2.equals("o") && text5.equals("o") && text8.equals("o")) {
            return true;
        }
        if (text3.equals("o") && text6.equals("o") && text9.equals("o")) {
            return true;
        }


        return false;
    }
    public static void setcol(JButton plot1, JButton plot2, JButton plot3,JButton plot4,JButton plot5,JButton plot6,JButton plot7,JButton plot8,JButton plot9){
        String text1 = plot1.getText();
        String text2 = plot2.getText();
        String text3 = plot3.getText();
        String text4 = plot4.getText();
        String text5 = plot5.getText();
        String text6 = plot6.getText();
        String text7 = plot7.getText();
        String text8 = plot8.getText();
        String text9 = plot9.getText();
        if (text1.equals("x") && text2.equals("x") && text3.equals("x")) {
            plot1.setBackground(Color.green);
            plot2.setBackground(Color.green);
            plot3.setBackground(Color.green);
        }
        if (text4.equals("x") && text5.equals("x") && text6.equals("x")) {
        }
        if (text7.equals("x") && text8.equals("x") && text9.equals("x")) {
        }
        if (text1.equals("x") && text5.equals("x") && text9.equals("x")) {
        }
        if (text3.equals("x") && text5.equals("x") && text7.equals("x")) {
        }
        if (text1.equals("x") && text4.equals("x") && text7.equals("x")) {
        }
        if (text2.equals("x") && text5.equals("x") && text8.equals("x")) {
        }
        if (text3.equals("x") && text6.equals("x") && text9.equals("x")) {
        }

        //checking winning o
        if (text1.equals("o") && text2.equals("o") && text3.equals("o")) {
        }
        if (text4.equals("o") && text5.equals("o") && text6.equals("o")) {
        }
        if (text7.equals("o") && text8.equals("o") && text9.equals("o")) {
        }
        if (text1.equals("o") && text5.equals("o") && text9.equals("o")) {
        }
        if (text3.equals("o") && text5.equals("o") && text7.equals("o")) {
        }
        if (text1.equals("o") && text4.equals("o") && text7.equals("o")) {
        }
        if (text2.equals("o") && text5.equals("o") && text8.equals("o")) {
        }
        if (text3.equals("o") && text6.equals("o") && text9.equals("o")) {
        }
    }
}