/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2.trainbooking;

/**
 *
 * @author admin
 */
public class NodeTrain  {
    Train tr = new Train();
    
    NodeTrain left,right;
      
    NodeTrain(Train tr){
        this.tr = tr;
        left = right = null;
    }
}
