/*
 * File: WordsController.java
 * Created Date: 2021-09-24 10:43:16
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

import views.MainWindow;

public class WordsController {
    MainWindow mainWindow;
    public WordsController(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
        this.mainWindow.exitButton.addActionListener(event ->{
            System.exit(0);
        });
    }
    
}