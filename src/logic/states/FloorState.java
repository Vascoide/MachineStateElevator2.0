/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logic.states;

import logic.FloorData;

/**
 *
 * @author Vasooooo
 */

public class FloorState implements IState {
    FloorData floorData;

    public FloorState(FloorData floorData) {
        this.floorData = floorData;
    }

    @Override
    public IState up() {
        if(floorData.canGoUp())
            return new FloorState(floorData);
        else
            return this;
    }

    @Override
    public IState down() {
        if(floorData.canGoDown())
            return new FloorState(floorData);
        else
            return this;
    }

    @Override
    public IState top() {
        return new FloorState(floorData);
    }

    @Override
    public IState bottom() {
        return new FloorState(floorData);
    }

    @Override
    public boolean canGoUp() {
        return floorData.canGoUp();
    }

    @Override
    public boolean canGoDown() {
        return floorData.canGoDown();
    }

    @Override
    public int getHeight() {
        return floorData.getHeight();
    }

    @Override
    public String getName() {
        return floorData.getName();
    }
    
    

    

}
