/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import javax.swing.*; 

/**
 *
 * @author Admin
 */

public class Frame1 extends JFrame {
    
    private final int rows = 2;
    private final int cols = 3;
    private JButton[][] buttons;
    public JPanel panel1;
    public JButton button1;
    
    public Frame1() {
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 700);
        setBackground(Color.darkGray);
        
        buttons = new JButton[2][3];
        panel1 = new JPanel();
        button1 = new JButton("new button");
        button1.setBackground(Color.yellow);
        panel1.add(button1);
        panel1.setVisible(true);
        
        setVisible(true);      
        validate();
        repaint();
    }
       
    public JPanel getPanel1() {
        return panel1;
    }
    
    public JButton[][] getButtons() {
        return buttons;
    }
   
    
}
