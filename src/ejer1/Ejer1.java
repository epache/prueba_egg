/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1;

import ejer1.entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class Ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * public int ISBN; public String titulo; public String autor; public
         * int pagina;
         */
        Scanner read = new Scanner(System.in);
        Libro L1 = new Libro();
        Libro L2 = new Libro();
        System.out.println("ingresar datos L1");
        L1.ingresardatos();
        System.out.println("ingresar datos L2");
        L2.ingresardatos();
        System.out.println("datos L1");
        L1.devolverdatos();
        System.out.println("datos L2");
        L2.devolverdatos();
    }
}
