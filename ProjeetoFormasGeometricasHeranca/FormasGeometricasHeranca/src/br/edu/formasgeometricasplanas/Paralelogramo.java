package br.edu.formasgeometricasplanas;
public class Paralelogramo extends FiguraPlana{
    private double base;
    private double altura;

    public Paralelogramo() {
    	base = 0;
    	altura = 0;
    	
    } 
    
    public void setBase(double Base) {
        base = Base;
    } 
    
    public double getBase() {
        return base;
    }
    
    public void setAltura(double Altura) {
        altura = Altura;
    } 
    
    public double getAltura() {
        return altura;
    } 
    
    public void calcArea() {
        area = base * altura;
    }
}