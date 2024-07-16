/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maxxhill.goalSetter;

/**
 *
 * @author Matt
 */
public class Goal {
    private boolean isComplete;
    private String description;
    private String name;
    
    public Goal(boolean isComplete, String description, String name){
        this.isComplete = isComplete;
        this.description = description;
        this.name = name;
        System.out.println("Goal Created!");
    }
    
    
}
