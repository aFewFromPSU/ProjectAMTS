/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.BorderLayout;
import java.awt.Color;
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
        
        JFrame newFrame = new JFrame("The New Program");
        newFrame.setSize(700, 600);
        
        JPanel panelMain = new JPanel();
        panelMain.setVisible(true);
        newFrame.add(panelMain);
        
        JPanel panelTop = new JPanel();
        panelTop.setLayout(new BorderLayout());
        panelTop.setVisible(true);
        panelTop.setBackground(Color.white);
        
        JPanel newPanel = new JPanel();
        newPanel.setVisible(true);
        JButton newButton = new JButton("Access the Application");
        JButton newButton2 = new JButton("View/Edit Settings");
        JButton newButton3 = new JButton("About/Readme");
        newPanel.add(newButton);
        newPanel.add(newButton2);
        newPanel.add(newButton3);
        panelMain.add(newPanel, "South");
        newFrame.setVisible(true);
        
        newPanel.validate();
        newPanel.repaint();
        panelMain.validate();
        panelMain.repaint();
        
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
