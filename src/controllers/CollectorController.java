/*
 * File: CollectorController.java
 * Created Date: 2021-09-24 10:42:41
 * Author: Sallai Andras
 * Github: https://github.com/andteki
 * -----
 * Last Modified: 2021-09-24
 * Modified By: Sallai Andras
 * -----
 * Copyright (c) 2021 Sallai Andras
 * 
 * GNU GPL v2
 * Last Modified: 2022-11-21
 * Modified By: Tóth Júlia
 */

package controllers;

import java.util.ArrayList;

import models.Page;
import views.MainWindow;


public class CollectorController extends MainController {

    public CollectorController(MainWindow mainWindow) {
        super(mainWindow);

        mainWindow.pasteButton.addActionListener(event -> {
            System.out.println("beillesztés");
            mainWindow.urlField.paste();
        });
        mainWindow.startButton.addActionListener(event -> {
            
            String utvonal = mainWindow.urlField.getText();
            if (utvonal.isEmpty()) {
                utvonal = "https://index.hu";
            }
            
            Page page = new Page();
            page.setUrl(utvonal);
            ArrayList<String> words = page.getContent();

            for (String word : words) {
                if (mainWindow.wordsModel.indexOf(word) < 0) {
                    mainWindow.wordsModel.addElement(word);
                }
            }
            Integer wordCount = mainWindow.wordsModel.getSize();
            mainWindow.statusBar.setContent("Szavak: " + wordCount.toString());
        });

    }
}
