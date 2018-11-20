/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author Admin
 */
public class Model {
    
    
    public Model() {
        
    }
    
    public void addSixButtonsToPanel(JPanel panel, JButton[][] buttons) {
        for (int i = 0; i < 2; i ++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton("Button: [" + i + "][" + j + "]");
                buttons[i][j].setBackground(Color.blue);
                panel.add(buttons[i][j]);
            }
        }
        panel.validate();
        panel.repaint();
  
    }
    
    //test asm 11/19 207am
}
