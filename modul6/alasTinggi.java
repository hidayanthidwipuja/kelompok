/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul6;
import java.util.Scanner;

/**
 *
 * @author UseR
 */
public class alasTinggi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); 
        double alas, tinggi; 
        
        System.out.print("Masukkan alas: ");
	alas = input.nextDouble();

        System.out.print("Tinggi: ");
	tinggi = input.nextDouble();

        double luas = (alas * tinggi)/2;
        
	System.out.println("Luas Segitiga : " + luas);
    }
}