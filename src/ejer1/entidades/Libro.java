/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1.entidades;

import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class Libro {

    public int ISBN;
    public String titulo;
    public String autor;
    public int pagina;
    public double codigobarras;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int pagina) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.pagina = pagina;
    }

    public void ingresardatos() {
        Scanner read = new Scanner(System.in);
        System.out.println("ISBN");
        ISBN = read.nextInt();
        System.out.println("titulo");
        titulo = read.next();
        System.out.println("autor");
        autor = read.next();
        System.out.println("pagina");
        pagina = read.nextInt();
    }

    public void devolverdatos() {
        System.out.println(+ISBN + " " + titulo + " " + autor + " " + pagina + " ");
    }

}
