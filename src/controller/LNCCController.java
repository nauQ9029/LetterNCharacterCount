/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Map;
import java.util.Scanner;
import model.LNCCModel;
import view.LNCCView;

/**
 *
 * @author plmin
 */
public class LNCCController {

    private LNCCModel model;
    private LNCCView view;
    private Scanner scanner;

    public LNCCController(LNCCModel model, LNCCView view) {
        this.model = model;
        this.view = view;
        this.scanner = new Scanner(System.in);
    }

    public String getUserInput() {
        System.out.println("Enter your content:");
        return scanner.nextLine();
    }

    public void processUserInput(String input) {
        model.processInput(input);
        Map<String, Integer> wordCountMap = model.getWordCountMap();
        Map<Character, Integer> letterCountMap = model.getLetterCountMap();
        view.displayFormattedResults(wordCountMap, letterCountMap);
    }
}
