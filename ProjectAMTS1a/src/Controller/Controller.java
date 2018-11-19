/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Model;
import View.View;

/**
 *
 * @author Admin
 */
public class Controller {
    
    private final Model model1;
    private final View view1;
    
    public Controller (Model model, View view) {
        
        this.model1 = model;
        this.view1 = view;
        
        model1.addSixButtonsToPanel(view1.getPanel1(), view1.frame1.getButtons());
        view1.frame1.validate();
        view1.frame1.repaint();
        
    }
    
    
    
}
