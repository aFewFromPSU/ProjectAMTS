/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.*;

/**
 *
 * @author Adam S Miller
 */
public class View {
    
    public Frame1 frame1;
    
    public View () {
        
        //create JFrame
        //frame1 = new Frame1();
        
        JFrame newFrame = new JFrame("hello");
        newFrame.setSize(700, 600);
        JPanel newPanel = new JPanel();
        JButton newButton = new JButton("new button");
        newPanel.add(newButton);
        newFrame.add(newPanel);
        newFrame.setVisible(true);
        newPanel.setVisible(true);
        newFrame.validate();
        newFrame.repaint();
          
    }
    
    public JFrame getFrame1() {
        return frame1;
    }
    
    public JPanel getPanel1() {
        return frame1.getPanel1();
    }
    
}
