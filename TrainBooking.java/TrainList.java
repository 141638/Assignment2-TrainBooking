/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2.trainbooking;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import sun.security.util.Length;

/**
 *
 * @author admin
 */
public class TrainList extends Train {
   
    CheckInput ci = new CheckInput();
    Scanner sc = new Scanner(System.in);    
    FileTrain ft = new FileTrain();
    private static BufferedReader openFile(String nameFile) throws IOException {
        try {
            return new BufferedReader(new FileReader(nameFile));
        } catch (FileNotFoundException e) {
            throw new IOException("File [" + nameFile + "] not found.", e);
        }
    }
    private static String readFile(BufferedReader reader) throws IOException {
        StringBuffer sb = new StringBuffer();
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }
        return sb.toString();
    }
    
    private static void readObjects(String fileContents, BSTTrain bstt ) {
        
        
        String[] parts = fileContents.split("\\|");
        for(int i = 0, length = parts.length;i<length; i+=6){               
            
            String tc = parts[i];
            String tn = ((i+1) < length ? parts[i+1] : "");
            int s = ((i+2) < length ? Integer.parseInt(parts[i+2]) : -1);
            int b = ((i+3) < length ? Integer.parseInt(parts[i+3]) : -1);
            double dt = ((i+4) < length ? Double.parseDouble(parts[i+4]) : -1);
            String dp = ((i+5) < length ? parts[i+5] : "");
            bstt.add(new Train(tc, tn, s, b, dt, dp));
        }
    }
    void Train1(BSTTrain bstt) throws FileNotFoundException{
        System.out.println("---- Load data from file ----");
        while(true){
            System.out.print("Enter the file name to load data : ");
            Scanner sc = new Scanner(System.in);
            String nameFile = sc.nextLine();

            BufferedReader reader;
            try {
                reader = openFile(nameFile);
            } catch (IOException e) {
                System.out.println(e.getMessage());
                return;
            }

            String fileContents;
            try {
                fileContents = readFile(reader);
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
                return;
            }
                readObjects(fileContents,bstt);
                break;
        }
        System.err.println("Data input completed!");
    }
    
    void Train2(BSTTrain bstt){
        
        System.out.println("----Input & Add to the head ----");
        System.out.print("Enter train code: ");
        tcode = sc.next();
        System.out.print("Enter train name: ");
        trainName = sc.next();
        System.out.print("Enter seat: ");
        seat = ci.CheckInput1(seat);
        System.out.print("Enter booked seat: ");
        booked = ci.CheckInput1(booked);
        System.out.print("Enter depart time: ");
        departTime = ci.CheckInput2(departTime);
        System.out.print("Enter depart place: ");
        departPlace = sc.next();
        
        bstt.add(new Train(tcode, trainName, seat, booked, departTime, departPlace));
    }
    
    void Train3(BSTTrain bstt) throws IOException {

        System.out.println("---- In-order traverse ----");
        bstt.printInOrder();
        
    }
    
    void Train4(BSTTrain bstt) throws IOException{
        System.out.println("---- Breadth-first traverse ----");
        bstt.printBreathFirst();
    }
    
    void Train5(File f,BSTTrain bstt) throws IOException{
        String c;
        System.out.println("---- In-order traverse to file ----");
        FileTrain.saveDataToFile(bstt);
        
    }
    
    @SuppressWarnings("null")
    void Train6(BSTTrain bstt){
        
        System.out.println("---- Search By Tcode ----");
        String x = sc.nextLine();
        boolean check =  bstt.search(x);
        if(!check) System.err.println("Value not found!");
    }
    
    void Train7(BSTTrain bstt){
        System.out.println("---- Delete By Tcode ----");
        String x = sc.nextLine();
        boolean check =  bstt.deleteNode(x);
        if(check) System.err.println("Found and removed!");
        else System.err.println("Value not found!");
        
    }
    
    void Train8(BSTTrain bstt){
        System.err.println("Sorry, this function is not available til this time.");
        System.err.println("May be it will be developed in the future(or not).");
        System.err.println("But still, thank you for trying to use "+"'Simply Blance'"+" function!!");
        
    }
    
    void Train9(BSTTrain bstt){
        System.out.println("---- Count Number Of Trains ----");
        System.out.println(" Number of Trains: "); 
        System.out.println(bstt.count(bstt.root));
        
    }
}

    


    

