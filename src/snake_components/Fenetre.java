package snake_components;

import javax.swing.*;
import java.awt.*;



/*Creation de la fenetre qui contiendra la jeu Snake
*
* */
final class Fenetre {

    public static void fenSnake(){
        JFrame fenSnake = new JFrame();
//        JPanel color = new JPanel();

        fenSnake.setTitle("The Snaaake");
        fenSnake.setSize(500,500);
        fenSnake.setLocationRelativeTo(null);


        fenSnake.getContentPane().setBackground(Color.lightGray);
        fenSnake.setVisible(true);
    }
}
