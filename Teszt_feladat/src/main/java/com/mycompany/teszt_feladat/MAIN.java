/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.teszt_feladat;

import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.terminal.Terminal;


/**
 *
 * @author ludanyi.tamas
 */
public class MAIN {
    
    
    public static void main(String[] args) throws InterruptedException {
        Screen screen = TerminalFacade.createScreen();
        screen.startScreen();
        screen.readInput();
        screen.putString(5, 5, "Robot HArc", Terminal.Color.BLUE, Terminal.Color.WHITE);
        screen.refresh();
        Thread.sleep(3000);
        System.exit(0);
        
       Robot r = new Robot(10, 10, "5,2", "1,3", "4,6");
        r.getArena_size();
        
    }
}
