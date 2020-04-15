/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logic;

import java.util.ArrayList;
import java.util.List;
import logic.states.FloorState;

/**
 *
 * @author Vasooooo
 */

public class Elevator {
    List<FloorData> elevator;
    FloorState currFloor;

    public Elevator() {
        elevator = new ArrayList();
    }
    
    public void install(){
        for (int i = 0; i < elevator.size(); i++)
            if(elevator.get(i).getHeight()==0){
                changeFloor(i);
                return;
            }
    }
    
    public void add(int height, boolean canGoUp, boolean canGoDown){
        elevator.add(new FloorData(height, canGoUp, canGoDown));
    }
    
    public void up(){
        if(currFloor.canGoUp())
            changeFloor(getCurrentHeight() + 1);
        currFloor.up();
    }
    
    public void down(){
        if(currFloor.canGoDown())
            changeFloor(getCurrentHeight() - 1);
        currFloor.down();
    }
    public void top(){
        changeFloor(elevator.size()-1);
        currFloor.top();
    }
    public void bottom(){
        changeFloor(0);
        currFloor.bottom();
    }
    
    public String getFloorName(){
        return currFloor.getName();
    }
    
    private void changeFloor(int i){
        currFloor = new FloorState(elevator.get(i));
    }
    
    private int getCurrentHeight(){
        return currFloor.getHeight();
    }
}
