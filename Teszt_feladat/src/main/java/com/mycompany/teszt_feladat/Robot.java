/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.teszt_feladat;

/**
 *
 * @author ludanyi.tamas
 */
public class Robot {
    int enemy_armor;
    int own_armor;
    String arena_size;
    String opponent_position;
    String own_position;

    public Robot(int enemy_armor, int own_armor, String arena_size, String opponent_position, String own_position) {
        this.enemy_armor = enemy_armor;
        this.own_armor = own_armor;
        this.arena_size = arena_size;
        this.opponent_position = opponent_position;
        this.own_position = own_position;
    }

 
   
   

    public int getEnemy_armor() {
        return enemy_armor;
    }

    public int getOwn_armor() {
        return own_armor;
    }

    public String getArena_size() {
        System.out.println(arena_size);
        return arena_size;
    }

    public String getOpponent_position() {
        return opponent_position;
    }

    public String getOwn_position() {
        return own_position;
    }
    
    
    
    
}
