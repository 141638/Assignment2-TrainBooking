/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2.trainbooking;

import java.util.Comparator;
import java.util.Scanner;


public class BookingList {
    Scanner sc = new Scanner(System.in);
    CheckInput ci = new CheckInput();
    
    void BL1(BSTTrain bstt, LinkedList2 l2,LinkedList3 l3){
        String s,s2;
        int m = 0;
        NodeTrain n;
        NodeC n2;
        
        System.out.println("---- Input data ----");
        System.out.print("Enter train code: ");
        s = sc.next();
        System.out.print("Enter customer code: ");
        s2 = sc.next();
        System.out.print("Enter number of seats to be booked: ");
        m = ci.CheckInput1(m);
        
        n = bstt.searchRec(bstt.root, s);
        n2 = l2.NodeSearch(s2, l2);
        
        if(!bstt.search(s)||!l2.search()){
            System.err.println("Data not accepted!!");
        }
        if(l3.search()) System.out.println("Data not accepted!");
        if(bstt.search(s) && l2.search()){
            if(n.tr.getBooked() == n.tr.getSeat())
                System.err.println("The train is exhausted!!");
            else if(n.tr.getBooked()<n.tr.getSeat()){
                if(m<=(n.tr.getSeat()-n.tr.getBooked())){
                    System.err.println("Data accepted!"); 
                    l3.addToTail(s, s2, m);
                }
            }
                
        }
    }
        
    void BL2(LinkedList3 l){
        System.out.println("---- Display Data ----");
        l.printList(l);
    } 
    
    void BL3(LinkedList3 l){
        System.out.println("---- Sort by tcode and ccode ----");
        l.mergeSort(l.head);
        System.err.println("Sort Completed!!");
    }
    
    
        
}
