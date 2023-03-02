/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciklusok;

/**
 *
 * @author tegze
 */
public class Szamok {

    public static void main(String[] args) {
        String szoveg = "ismetlodessel";
        int db = 0;
        if (szoveg == "ismetlodessel") {
            for (int k = 2; k < 5; k++) {
                for (int j = 2; j < 5; j++) {
                    for (int i = 2; i <= 4; i++) {
                        System.out.println(k + "" + j + "" + i);
                        db++;
                    }
                }
            }
        } else {
            for (int k = 2; k < 5; k++) {
                for (int j = 2; j < 5; j++) {
                    for (int i = 2; i <= 4; i++) {
                        if (j == k || j == i || k == i) {

                        } else {
                            System.out.println(k + "" + j + "" + i);
                            db++;
                        }
                    }
                }
            }
        }
        System.out.println(db);
    }
}
