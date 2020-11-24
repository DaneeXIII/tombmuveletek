/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tombmuveletek;

/**
 *
 * @author szark
 */
import java.util.Scanner;
public class Tombmuveletek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("2 tömb, amely elemszámát a felhasználó adja meg (1 és 1000 közötti számok)");
        Scanner bemenet;
        bemenet = new Scanner(System.in);
        int ossz1=0;
        int ossz2=0;
        int sorOssz;
        int szam;
        
        System.out.print("Adja meg, hány elem legyen a tömbökben: ");
            szam = bemenet.nextInt();
        System.out.println("");
        int tomb1[] = new int [szam]; 
        int tomb2[] = new int [szam]; 
        
        for (int i = 0; i < szam; i++) {
            tomb1[i] = (int) (Math.random()*999)+1;
            ossz1=ossz1+tomb1[i];
            tomb2[i] = (int) (Math.random()*999)+1;
            ossz2=ossz2+tomb2[i];
        }
        
         for (int i = 0; i < szam; i++) {
            sorOssz = tomb1[i]+tomb2[i];
            System.out.print("A tömbök "+(i+1) + ". elemei: " + (String.format("%,3d", tomb1[i])+" + "));
            System.out.print(String.format("%,3d", tomb2[i])+" = ");
            System.out.println(String.format("%,5d",sorOssz));
        }
         
        System.out.println("\nAz első oszlop elemeinek összege: "+String.format("%,5d",ossz1));
        System.out.println("A második oszlop elemeinek összege: "+String.format("%,5d",ossz2));
    bemenet.close();
    }
}