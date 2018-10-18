/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller1;

import LinearDataStructures.Node;

/**
 *
* @author Cristhian Javier Ruiz Leon
 *         ID: 597465
 */
public class sleeping_dragons implements Node {

    String dragon="dragon";
    int diasDurmiendo=0;
    int diasEntrenando=0;
    
    sleeping_dragons next = null;
    
    public sleeping_dragons(int Durmiendo, int Entrenando)
    {
        this.diasDurmiendo = Durmiendo;
        this.diasEntrenando = Entrenando;
    }
    
    @Override
    public void setNext(Node node) 
    {
        next =(sleeping_dragons)node;
    }
    
    @Override
    public Node getNext() {
        return next;
    }
   
    @Override
    public boolean isEqual(Node node) {
        return false;
    }

    @Override
    public boolean isLessThan(Node node) {
        return false;    
    }
    
    public String toString()
    {
        return this.dragon + diasDurmiendo+" "+diasEntrenando;
    }

    @Override
    public Node clone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}