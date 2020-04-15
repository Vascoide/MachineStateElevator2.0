/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui.text;

import java.util.Scanner;
import logic.Elevator;

/**
 *
 * @author Vasooooo
 */

public class UIElevator {
    Elevator elevator;
    boolean end;

    public UIElevator(Elevator elevator) {
        this.elevator = elevator;
    }
    
    public void run() {
        while (!end) {
            awaitButton();
        }
    }
    
    private void awaitButton(){
        System.out.println("Elevator 2.0");
        System.out.println(elevator.getFloorName());
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("U - Up");
        System.out.println("D - Down");
        System.out.println("T - Top Floor");
        System.out.println("B - Bottom Floor");
        System.out.println("Q - Quit");
        System.out.println("Insert option");
        
        char op = sc.next().charAt(0);
        
        switch(op){
            case 'U':
                elevator.up();
                break;
            case 'D':
                elevator.down();
                break;
            case 'T':
                elevator.top();
                break;
            case 'B':
                elevator.bottom();
                break;
            case 'Q':
                end = true;
                break;
        }
    }
}
