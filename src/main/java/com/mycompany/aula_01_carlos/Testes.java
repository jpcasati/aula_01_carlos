/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula_01_carlos;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author jpcasati
 */
public class Testes {
    
    public static void main(String[] args) {
        
//        Date data1 = new Date();
//        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        
//        
//        Calendar cal = new GregorianCalendar();
//        
//        cal.setTime(data1);
//        
//        cal.add(Calendar.MONTH, -6);
//        
//        Date data2 = cal.getTime();
//        
//        System.out.println(sdf.format(data1));
//        
//        System.out.println(sdf.format(data2));


        Calendar c1 = new GregorianCalendar();
        
        c1.set(Calendar.DAY_OF_MONTH, 1);
        c1.set(Calendar.MONTH, Calendar.FEBRUARY);
        c1.set(Calendar.YEAR, 2022);

        Calendar c2 = new GregorianCalendar();
        
        c2.set(Calendar.MONTH, Calendar.FEBRUARY);
        c2.set(Calendar.YEAR, 2022);
        int dia = c2.getActualMaximum(Calendar.DAY_OF_MONTH);
        c2.set(Calendar.DAY_OF_MONTH, dia);
        
        System.out.println(sdf.format(c1.getTime()));
        System.out.println(sdf.format(c2.getTime()));


    }
    
}
