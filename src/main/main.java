/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controller.LNCCController;
import model.LNCCModel;
import view.LNCCView;

/**
 *
 * @author plmin
 */

// COMPLETED
public class main {

    public static void main(String[] args) {
        LNCCModel model = new LNCCModel();
        LNCCView view = new LNCCView();
        LNCCController controller = new LNCCController(model, view);

        // Prompt user to enter the content 
        String userInput = controller.getUserInput();

        // Process the content
        controller.processUserInput(userInput);
    }
}
