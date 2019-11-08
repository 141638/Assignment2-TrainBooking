/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2.trainbooking;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class FileTrain {

    static Scanner sc = new Scanner(System.in);
    
    void save(NodeTrain p){
        
    }
    public static void outputFile(BSTTrain bstt,FileWriter out,NodeTrain p ) throws IOException{
        
        if(p!=null){
            outputFile(bstt, out,p.left);

            String tcode = p.tr.getTcode().toString();
            out.write(tcode+"|");
            String trainName = p.tr.getTrainName().toString();
            out.write(trainName+"|");
            String seat = String.valueOf(p.tr.getSeat());
            out.write(seat+"|");
            String booked = String.valueOf(p.tr.getBooked());
            out.write(booked+"|");
            String departTime = String.valueOf(p.tr.getDepartTime());
            out.write(departTime+"|");
            String departPlace = p.tr.getDepartPlace().toString();
            out.write(departPlace+"|");

            outputFile(bstt, out,p.right);
            
            
        }
        

    }

    public static void saveDataToFile(BSTTrain bstt) throws IOException{
        while(true){
            System.err.println("Do you want to create a new save file?(Y/N)");
            boolean answer;
            String c = sc.nextLine();
            if("y".equals(c)||"Y".equals(c)) answer = true;
            else answer = false;
            System.out.print("Enter the file name to save data : ");
            String nameFile = sc.nextLine().trim();
            if(answer == true){
                    File file = new File(nameFile);
                    file.createNewFile();
                    java.io.File listFile = new java.io.File(nameFile);
                    Scanner readList = new Scanner(listFile);
                    FileWriter out;
                    out = new FileWriter(nameFile);
                    if (file.exists()){
                        System.err.println("<File is created>");
                        FileTrain.outputFile(bstt,out,bstt.root);
                        out.flush();
                        out.close();
                        System.err.println("<Saved Successfully!>");
                        break;
                    }
                    else{
                        System.err.println("<File already exists!>");
                    }
            }
            else{
                try{
                    java.io.File listFile = new java.io.File(nameFile);
                    Scanner readList = new Scanner(listFile);
                    FileWriter out;
                    out = new FileWriter(nameFile);
                    FileTrain.outputFile(bstt,out,bstt.root);
                    out.flush();
                    out.close();
                    System.err.println("<Saved Successfully!>");
                    break;
                }
                catch(Exception e){}System.err.println("<Your file doesn't exist. Please re-input!>");
        }
    }
    }
}
