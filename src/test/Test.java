/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import beans.DevData;
import services.Service;
/**
 *
 * @author user
 */
public class Test {
static boolean  s;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DevData d = new DevData();
        Service se = new Service();
        /*System.out.println(se.findMax());*/
        
         /*se.insert(new DevData("ALAMI","Lundi",1));
         se.insert(new DevData("WAFI","Lundi",2));
        se.insert(new DevData("SLAMI","Mardi",9));*/
      /* Service se = new Service();
       s=se.create();
       System.out.println(s);*/
    }
    
}
