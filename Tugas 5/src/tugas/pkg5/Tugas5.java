/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas.pkg5;
import java.util.Scanner;
/**
 *
 * @author Aria
 */

public class Tugas5
{
 public static void main(String[] args) {
       Cyl cyl = new cyl();
       
       System.out.println("default ");
        System.out.println("Radius = "+cyl.radius);
        System.out.println("Height = "+cyl.height);
        System.out.println("Area = "+cyl.Area());
        System.out.println("Volume = "+cyl.Volume());

 //    buatlah program di file terpisah untuk membuat object daari class Tabung tersebut – object
//pertama dengan radius 5 dan tinggi 10 dan yang lain dengan radius 7.5 dan tinggi 15.5.
//Tampilkan radius, tinggi, luas alas dan volume tabung  
   
       cyl.SetCyl(5,10) ;

        System.out.println("Radius = "+cyl.radius);
        System.out.println("Height = "+cyl.height);
        System.out.println("Area = "+cyl.Area());
        System.out.println("Volume = "+cyl.Volume());

       cyl.SetCyl(7.5,15.5) ;

        System.out.println("Radius = "+cyl.radius);
        System.out.println("Height = "+cyl.height);
        System.out.println("Are = "+cyl.Area());
        System.out.println("Volume = "+cyl.Volume());
    }

}
