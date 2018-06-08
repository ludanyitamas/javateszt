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
    int[][] arena_size;
    int[][] opponent_position;
    int[][] own_position;

    public Robot(int enemy_armor, int own_armor, int[][] arena_size, int[][] opponent_position, int[][] own_position) {
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

    public int[][] getArena_size() {
        return arena_size;
    }

    public int[][] getOpponent_position() {
        return opponent_position;
    }

    public int[][] getOwn_position() {
        return own_position;
    }
    
    
    
    
}
