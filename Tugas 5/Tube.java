/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aria
 */
public class Tube {


    public double R,H;
    
    Tube(){
        radius = 1;
        height =1;
    }
    
    Tube(double rad,double t){
        radius = rad;
        height = t;
    }
    
    public void SetCyl(double R,double H){
        radius = R;
        height = H;
    }
    
    public double Volume(){
        double volume;
        volume = Math.PI * radius * radius * height;
        return volume;
    }
    
    public double Area(){
        double area;
        area = Math.PI * radius * radius;
        return area;
    }
    
    public void Radius(double R){
        radius = R;
    }
    
    public void Height(double H){
        height = H;
    }
}
