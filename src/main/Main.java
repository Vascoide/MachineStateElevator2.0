package main;

import logic.ElevatorCreator;
import ui.text.UIElevator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Vasooooo
 */
public class Main {
    public static void main(String[] args) {
        ElevatorCreator elevator = new ElevatorCreator();
        UIElevator TUI = new UIElevator(elevator.create());
        
        TUI.run();
    }

}
