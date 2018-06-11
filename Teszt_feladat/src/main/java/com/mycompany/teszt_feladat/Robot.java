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
    
    String opponent_position;
    String own_position;

    public Robot(int enemy_armor, int own_armor, String opponent_position, String own_position) {
        this.enemy_armor = enemy_armor;
        this.own_armor = own_armor;
        this.opponent_position = opponent_position;
        this.own_position = own_position;
    }

    public void setEnemy_armor(int enemy_armor) {
        this.enemy_armor = enemy_armor;
    }

    public void setOwn_armor(int own_armor) {
        this.own_armor = own_armor;
    }

    

    public void setOpponent_position(String opponent_position) {
        this.opponent_position = opponent_position;
    }

    public void setOwn_position(String own_position) {
        this.own_position = own_position;
    }

 
   
   

    public int getEnemy_armor() {
        return enemy_armor;
    }

    public int getOwn_armor() {
        return own_armor;
    }

   

    public String getOpponent_position() {
        return opponent_position;
    }

    public String getOwn_position() {
        return own_position;
    }
    
    
    
    
}
