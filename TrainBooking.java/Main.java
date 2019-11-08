/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2.trainbooking;



import java.io.IOException;
import java.io.*;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) throws IOException {
        
        boolean check;
        FileTrain ft = new FileTrain();
        CheckInput ci = new CheckInput();
        BSTTrain bstt = new BSTTrain();
        LinkedList2 list2 = new LinkedList2();
        LinkedList3 list3 = new LinkedList3();
        TrainList tr = new TrainList();
        CustomerList cs = new CustomerList();
        BookingList bl = new BookingList();
        File f = new File("D:\\TrainBooking\\trainlist2.txt");
        Scanner sc = new Scanner(System.in);

        int n = 0;
        do{    
            System.out.println("\n-----Train Booking Menu-----");
            System.out.println("1. Train List");
            System.out.println("2. Customer List");
            System.out.println("3. Booking List");
            System.out.println("0. Exit");
            System.out.print("Option: ");
            n = ci.CheckInput1(n);

            switch(n){
               
                case 1:{
                    
                    System.out.println("----Train List----");
                    System.out.println("1. Load Data From File");
                    System.out.println("2. Input & Insert Data");
                    System.out.println("3. In-order traverse");
                    System.out.println("4. Breadth-first traverse");
                    System.out.println("5. In-order traverse to file");
                    System.out.println("6. Search By Tcode");
                    System.out.println("7. Delete By Tcode");
                    System.out.println("8. Symply Balancing");
                    System.out.println("9. Count Number Of Train");
                    System.out.print("Your option: ");
                    n = ci.CheckInput1(n);
                    
                    switch(n){
                        
                        case 1:{
                            tr.Train1(bstt);
                            break;
                        }
                        
                        case 2:{
                            tr.Train2(bstt);
                            break;
                        }
                        
                        case 3:{
                            
                            tr.Train3(bstt);
                            break;
                        }
                        
                        case 4:{
                            tr.Train4(bstt);
                            break;
                        }
                        
                        case 5:{
                            tr.Train5(f,bstt);
                            break;
                        }
                        
                        case 6:{
                            tr.Train6(bstt);
                            break;
                        }
                        
                        case 7:{
                            tr.Train7(bstt);
                            break;
                        }
                        
                        case 8:{
                            tr.Train8(bstt);
                            break;
                        }
                        case 9:{
                            tr.Train9(bstt);
                            break;
                        }
                    }
                    break;
                    
                } 
            
                case 2:{
                    System.out.println("----Customer List----");
                    System.out.println("1. Load Data From File");
                    System.out.println("2. Input & Add To The End");
                    System.out.println("3. Display Data");
                    System.out.println("4. Save Customer List Data");
                    System.out.println("5. Search By Ccode");
                    System.out.println("6. Delete By Ccode");
                    System.out.print("Your option: ");
                    n = ci.CheckInput1(n);
                    
                    switch(n){
                        case 1:{
                            cs.CL1(list2);
                            break;
                        }
                        case 2:{
                            cs.CL2(list2);
                            break;
                        }
                        
                        case 3:{
                            cs.CL3(list2);
                            break;
                        }
                        
                        case 4:{
                            cs.CL4(list2);
                            break;
                        }
                        
                        case 5:{
                            cs.CL5(list2);
                            break;
                        }
                        
                        case 6:{
                            cs.CL6(list2);
                            break;
                        }
                    }
                    break;
                }
                
                case 3:{
                    System.out.println("----Booking List----");
                    System.out.println("1. Input Data");
                    System.out.println("2. Display Data Width Available Seat");
                    System.out.println("3. Sort By Tcode & Ccode");
                    n = ci.CheckInput1(n);
                    
                    switch(n){
                        case 1:{
                            bl.BL1(bstt, list2, list3);
                            break;
                        }
                        case 2:{
                            bl.BL2(list3);
                            break;
                        }
                        
                        case 3:{
                            try {
                                bl.BL3(list3);
                            } catch (Exception e) {
                                System.out.println("If this line appears, maybe there are some mistakes in my algorithm!?");
                            }
                            break;
                        }
                    }
                }
                
            }
        }
        while(n!=0);
    }    
    
}
