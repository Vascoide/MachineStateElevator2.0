/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logic;

import java.util.Scanner;

/**
 *
 * @author Vasooooo
 */

public class ElevatorCreator {
    int highest;
    int lowest;
    
    public Elevator create(){
        
        
        
        lowest = getLowest() * -1;
        highest = getHighest();
        
        Elevator elevator = new Elevator();
        
        for(int i = 0; i <= lowest + highest; i++){
            if(i == 0)
                elevator.add((lowest + i), true, false);
            else if (i == highest)
                elevator.add((lowest + i), false, true);
            else
                elevator.add((lowest + i), true, true);
        }
        
        elevator.install();
        
        return elevator;
    }

    private int getLowest() {
        int number;
        
        Scanner s = new Scanner(System.in);
        
        do{
            System.out.println("Please the number of floors beneath ground floor (at least 1)");
            
            number = s.nextInt();
        }while(number < 1);
        
        return number;
    }

    private int getHighest() {
        int number;
        
        Scanner s = new Scanner(System.in);
        
        do{
            System.out.println("Please the number of floors above ground floor (at least 1)");
            
            number = s.nextInt();
        }while(number < 1);
        
        return number;
    }
    
    
}
