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

    public int getOwn_x;
    public int getOwn_y;
    public static Robot fox = new Fox(10, 10, "10,5", "5,15");
    public static Robot wolf = new Wolf(10, 10, "5,15", "10,5");
    public String arena_size;

    public int getGetOwn_x() {
        return getOwn_x;
    }

    public void setGetOwn_x(int getOwn_x) {
        this.getOwn_x = getOwn_x;
    }

    public int getGetOwn_y() {
        return getOwn_y;
    }

    public void setGetOwn_y(int getOwn_y) {
        this.getOwn_y = getOwn_y;
    }

    public String getArena_size() {
        return arena_size;
    }

    public void setArena_size(String arena_size) {
        this.arena_size = arena_size;
    }

    public int scannertrap() {
        Scanner sc = new Scanner(System.in);
        int trap = sc.nextInt();
        return trap;
    }

    public void getRecovery(String spliting, int animal) {

        
        String[] array = spliting.split(",");
        if (animal == 1) {
            getOwn_x = Integer.parseInt(array[0]);
            getOwn_y = Integer.parseInt(array[1]);
            wolf.setOwn_position(String.valueOf(getOwn_x) + "," + String.valueOf(getOwn_y));

        } else if (animal == 2) {
            getOwn_x = Integer.parseInt(array[0]);
            getOwn_y = Integer.parseInt(array[1]);
            fox.setOwn_position(String.valueOf(getOwn_x) + "," + String.valueOf(getOwn_y));
        }

    }

    public static void main(String[] args) throws InterruptedException {
        MAIN m = new MAIN();

        Screen screen = TerminalFacade.createScreen();
        screen.startScreen();
        m.getRecovery(fox.getOwn_position(), 1);
        screen.putString(m.getOwn_x, m.getOwn_y, fox.toString(), Terminal.Color.WHITE, Terminal.Color.BLACK);
        m.getRecovery(wolf.getOwn_position(), 2);
        screen.putString(m.getOwn_x, m.getOwn_y, wolf.toString(), Terminal.Color.WHITE, Terminal.Color.BLACK);
        screen.refresh();

        boolean keypressed = true;
        while (keypressed) {
            Key key = screen.readInput();

            while (key == null) {
                key = screen.readInput();
            }
            System.out.println("key pressed" + key.getKind().toString());

            switch (key.getKind()) {

                case Escape:
                    screen.stopScreen();
                    System.exit(0);
                    break;
                case ArrowRight:
                    screen.clear();
                    screen.putString(m.getOwn_x + 1, m.getOwn_y, wolf.toString(), Terminal.Color.WHITE, Terminal.Color.BLACK);
                    wolf.getOwn_armor();
                    screen.refresh();
                    break;

            }

        }

    }
}
