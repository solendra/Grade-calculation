/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solendra.gradecalculation.util;

/**
 *
 * @author solendra
 */
public class Grade {
    
    public int percent(int eng, int math, int sci, int nep){
        int total=1;
       total=((eng+math+sci+nep)/4);
   
        
        return total;
    }
    
   
    
}
