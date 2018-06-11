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
public class Wolf extends Robot implements Robotok{
    
    private String color;
    public int enemy_armor;
    public int own_armor;
    public String opponent_position;
    public String own_position;
    
    public Wolf(int enemy_armor, int own_armor, String opponent_position, String own_position, String color) {
        super(enemy_armor, own_armor, opponent_position, own_position);
                this.color = color;
                this.enemy_armor = enemy_armor;
                this.own_armor = own_armor;
                this.opponent_position = opponent_position;
                this.own_position = own_position;
                
    }

    
    

    public Wolf(int enemy_armor, int own_armor, String opponent_position, String own_position) {
        this(enemy_armor, own_armor, opponent_position, own_position,"as");
    }

    @Override
    public void waiting() {
    }

    @Override
    public void attack_in_that_direction() {
    }

    @Override
    public void defend_in_that_direction() {
    }

    @Override
    public void trap_in_that_direction() {
    }

    @Override
    public String toString() {
        return "Wolf csicska";
    }

  
     
    
}
