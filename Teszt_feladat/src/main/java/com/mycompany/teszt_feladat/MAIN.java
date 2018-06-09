/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.teszt_feladat;

import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.terminal.Terminal;
import java.awt.Event;
import static java.awt.Event.ESCAPE;
import java.util.Scanner;


/**
 *
 * @author ludanyi.tamas
 */
public class MAIN {
    public int scannertrap(){
        Scanner sc = new Scanner(System.in);
        int trap = sc.nextInt();
        return trap;
    }
    
    public static void main(String[] args) throws InterruptedException {
        MAIN m = new MAIN();
        
        Screen screen = TerminalFacade.createScreen();
        screen.startScreen();
        screen.putString(10, 10, "Wolf", Terminal.Color.WHITE, Terminal.Color.BLACK);
        screen.refresh();
        boolean keypressed = true;
        while (keypressed) {            
            Key key = screen.readInput();
            
            while (key == null) {
                key = screen.readInput();
            }    
                System.out.println("key pressed"+key.getKind().toString());
                
                switch(key.getKind()){
                    
                    case Escape :
                        screen.stopScreen();
                        System.exit(0);
                        break;
                     case ArrowRight:
                        int x = m.scannertrap();
                        int y = m.scannertrap();
                        screen.clear();
                        screen.putString(x, y, "wolf", Terminal.Color.WHITE, Terminal.Color.BLACK);
                        screen.refresh();
                        break;
                    
                    
                }
                
            
        }
        
       Robot r = new Robot(10, 10, "5,2", "1,3", "4,6");
        r.getArena_size();
        
    }
}
