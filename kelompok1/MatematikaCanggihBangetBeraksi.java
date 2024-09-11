/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kelompok1;

/**
 *
 * @author UseR
 */
public class MatematikaCanggihBangetBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MatematikaCanggihBanget Mcb = new MatematikaCanggihBanget();
        
                Mcb.pertambahan(10, 10);
                
                Mcb.perkalian(50, 10);
                
                Mcb.pengurangan(10, 5);
           
                Mcb.modulus(9, 2);
                
                Mcb.pembagian(10,5);
      
                Mcb.pertambahanTiga(10,20,30);
                
                System.out.println("Hasil pertambahan tiga: " + Mcb.pertambahanTiga(10, 20, 30));
                        

    }
    
}
