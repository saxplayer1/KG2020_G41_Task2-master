package com.Shalitkin;

import com.Shalitkin.graphics.MainWindow;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow();
        mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainWindow.setSize(800,600);
        mainWindow.setVisible(true);

    }
}
