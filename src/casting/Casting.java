/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casting;

/**
 *
 * @author ulisses
 */
public class Casting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte bite;
        short sort;
        int inteiro;
        long longo;
        float flutuante;
        double dobro ;
        
        System.out.println("--------------------------------------------");
        System.out.println("|            CASTING - widening            |");
        System.out.println("--------------------------------------------");
        
        bite  = 50;
        
        System.out.println("byte: " + bite);
        sort = bite;
        System.out.println("short: " + sort);
        inteiro = sort;
        System.out.println("int: " + inteiro);
        longo = inteiro;
        System.out.println("long: " + longo);
        flutuante = longo;
        System.out.println("float: " + flutuante);
        dobro = flutuante;
        System.out.println("double: " + dobro);
        
        System.out.println("--------------------------------------------");
        System.out.println("|            CASTING - Narrowing           |");
        System.out.println("--------------------------------------------");
        
        dobro = -1000265165626854965168465168498689465196846516156.6519896156849816159849615684498;
        
        System.out.println("double: " + dobro);
        flutuante = (float)dobro;
        System.out.println("float: " + flutuante);
        longo = (long)flutuante;
        System.out.println("long: " + longo);
        inteiro = (int)longo;
        System.out.println("int: " + inteiro);
        sort = (short)inteiro;
        System.out.println("short: " + sort);
        bite = (byte)sort;
        System.out.println("byte: " + bite);
        
        
    }
    
}
