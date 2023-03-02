/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciklusok;

/**
 *
 * @author tegze
 */
public class sarkanyok {
    public static void main(String[] args) {
        int maxX = 145/7;
        int maxY = 145/11;
        int oszthatoHet = 0;
        System.out.println(maxX);
        System.out.println(maxY);
        for (int i = 11; i < 145; i+=11) {
            if(i%7 == 0){
                oszthatoHet = i;
            }
        }
        System.out.println(oszthatoHet);
    }
    
}
