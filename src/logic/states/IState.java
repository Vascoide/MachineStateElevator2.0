/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic.states;

/**
 *
 * @author Vasooooo
 */
public interface IState {
    public IState up();
    public IState down();
    public IState top();
    public IState bottom();
    public boolean canGoUp();
    public boolean canGoDown();
    public int getHeight();
}
