/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logic;

/**
 *
 * @author Vasooooo
 */

public class FloorData {
    int height;
    boolean canGoUp;
    boolean canGoDOwn;

    public FloorData(int height, boolean canGoUp, boolean canGoDOwn) {
        this.height = height;
        this.canGoUp = canGoUp;
        this.canGoDOwn = canGoDOwn;
    }
    
    public int getHeight(){
        return height;
    }

    public boolean canGoUp() {
        return canGoUp;
    }

    public boolean canGoDown() {
        return canGoDOwn;
    }
    
    public String getName(){
        if(height == 0)
            return "You're at the ground floor!!";
        else
            return "You are the " + ordinal(height) + ((height < 0) ? " underground": "") + " floor!!";
    }
    
    private String ordinal(int number){
        
        if(number < 0)
            number = -number;
        
        int mod100 = number % 100;
        int mod10 = number % 10;
        
        if(mod10 == 1 && mod100 != 11) {
            return number + "st";
        } else if(mod10 == 2 && mod100 != 12) {
            return number + "nd";
        } else if(mod10 == 3 && mod100 != 13) {
            return number + "rd";
        } else {
            return number + "th";
        }
    }
    
}
