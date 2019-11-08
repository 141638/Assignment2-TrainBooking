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
public class BSTTrain  {
    
    NodeTrain root;
    public BSTTrain() {root = null;}
    public BSTTrain(Train tr){
        root.tr = tr;
    }
////////////////     
    void add(Train tr){
        root = addrec(root,tr);
    }
    NodeTrain addrec(NodeTrain root, Train tr) { 

        if (root == null) { 
            return new NodeTrain(tr);
        } 
        if (tr.getTcode().compareTo(root.tr.getTcode())< 0 ) 
            root.left = addrec(root.left, tr); 
        else if (tr.getTcode().compareTo(root.tr.getTcode())>0 ) 
            root.right = addrec(root.right, tr); 
        return root; 
    }   
////////////////     
    boolean deleteNode(String x) { 
        if(searchRec(root,x)!=null){
            root = remove(root,x); 
            return true;
        }
            else return false;    
        
    }
    NodeTrain remove(NodeTrain root,String x){
        if(root == null){
            return root;    
        }
            
        if(x.compareTo(root.tr.getTcode())<0) root.right = remove(root.right,x);
        else if(x.compareTo(root.tr.getTcode())>0) root.left = remove(root.left,x);
        else{
            if(root.left == null){
                return root.right;
            }
            if(root.right == null){
                return root.left;
            }
            root.tr = minObject(root.right);
            root.right = remove(root.right,root.tr.getTcode());
        }
        return root;
    }
    Train minObject(NodeTrain root) { 
        Train min = root.tr; 
        while (root.left != null) { 
            min = root.left.tr; 
            root = root.left; 
        } 
        return min; 
    } 
////////////////    
    boolean search(String x){
        NodeTrain p = searchRec(root,x);
        if(p!= null){
            p.tr.display();
            return true;
        }
        else return false;
    }
    NodeTrain searchRec(NodeTrain curr, String x){
        if(curr == null){
            return null;
        }
        else{
            
            if(x.compareTo(curr.tr.getTcode())<0)
                return(searchRec(curr.left,x));
            else if(x.compareTo(curr.tr.getTcode())>0)
                return(searchRec(curr.right,x));
            else
                return curr;
            
        }
    }    
////////////////
    void printInOrder(){
        inOrder(root);
    }
    void inOrder(NodeTrain root){
        if(root != null) {
            inOrder(root.left);
            System.out.println("");
            root.tr.display();
            inOrder(root.right);
        }
    }
//////////////// 
    int c = 0;
    int count(NodeTrain root){
        if(root != null) {
            count(root.left);
            c++;
            count(root.right);
        }
        return c;
    }
    
////////////////    
    void printBreathFirst(){
        inOrder(root);
    }
    void BreathFirst(NodeTrain root){
        if(root != null) {
            System.out.println("");
            root.tr.display();
            BreathFirst(root.left); 
            BreathFirst(root.right);
        }
    }
////////////////

}
    
    

