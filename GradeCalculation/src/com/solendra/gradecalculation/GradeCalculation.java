/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solendra.gradecalculation;

import com.solendra.gradecalculation.util.Grade;
import java.util.Scanner;

/**
 *
 * @author solendra
 */
public class GradeCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input=new Scanner(System.in);
        
        while(true){
        System.out.println("Enter English Marks");
        int eng=input.nextInt();
        if(eng<32){
            System.out.println("You are fail");
            break;
            }
        
        System.out.println("Enter Maths Marks");
        int math=input.nextInt();
        if(math<32){
            System.out.println("You are fail");
            break;
            }
     
                
        System.out.println("Enter Science Marks");
        int sci=input.nextInt();
        if(sci<32){
            System.out.println("You are fail");
            break;
            }
        
        System.out.println("Enter Nepali Marks");
        int nep=input.nextInt();
        if(nep<32){
            System.out.println("You are fail");
            break;
            }
        
        int percent=percentCalc(eng,math,sci,nep);
        System.out.println("The percent is: " + percent);
        
        if(percent>=80){
            System.out.println("Grade is Distinction");
        }
        else if((percent <80) && (percent>=60)){
            System.out.println("Grade is First division");}
        else if ((percent <60) && (percent>=50)){
                System.out.println("Grade is second division");
        }
        else if ((percent <50) && (percent>=40)){
                System.out.println("Grade is Third division");
        }
        else if ((percent <40) && (percent>=32)){
                System.out.println("Grade is Pass division");
        }
     
           System.out.println("Do You want to continue [Y/N]");
          
          if(input.next().equalsIgnoreCase("n")){
          System.exit(0);}
          
      }
            
         
    
        
        
    }
        
      private static int percentCalc(int eng, int math, int sci, int nep)
      {
      Grade g=new Grade();
      int  percent=1;
      percent=g.percent(eng, math, sci, nep);
              
       return percent;
      }  
      
      
    }

    

