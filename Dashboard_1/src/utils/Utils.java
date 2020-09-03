/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.List;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Utils {

    public Utils() {
    }
    
    public static void printSelectBox(JComboBox<String> combo,Vector data ,int start,int plus){
          List<String> key = (List<String>) data.get(0);
          List<String> values = (List<String>) data.get(1);
          int index=start;
          for (int i = 0; i <values.size()/key.size(); i++) {
            combo.addItem(values.get(index));
            index+=plus;
         }
         
        
    }
    public static void printTable(DefaultTableModel model ,  Vector data,int plus){
       List<String> key = (List<String>) data.get(0);
        List<String> values = (List<String>) data.get(1);
        
        System.out.println("Cantidad de columnas :"+values.size()/key.size());
         for (int i = 0; i < key.size(); i++) {
              model.addColumn(key.get(i).toUpperCase());
        }
         int index=0;
         for (int i = 0; i < values.size()/key.size(); i++) {
             if(plus==4){
                model.addRow(new Object[]{values.get(index),values.get(index+1),values.get(index+2),values.get(index+3) });     
             }
             else{
                model.addRow(new Object[]{values.get(index),values.get(index+1) });  
             }
            
             index+=plus;
        }
    }
}
