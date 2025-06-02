package br.edu.formasgeometricasplanas;
public class Pentagono extends FiguraPlana{
    private double perimetro;
    private double apotema;

    public Pentagono() {
    	perimetro = 0;
    	apotema = 0;
    	
    } 
    
    public void setPerimetro(double Perimetro) {
        perimetro = Perimetro;
    } 
    
    public double getPerimetro() {
        return perimetro;
    }
    
    public void setApotema(double Apotema) {
        apotema = Apotema;
    }
    
    public double getApotema() {
        return apotema;
    } 
    
    public void calcArea() {
        area = (perimetro * apotema) / 2;
    }
}