package br.edu.formasgeometricasplanas;
public class Triangulo extends FiguraPlana{
    private double base;
    private double altura;

    public Triangulo() {
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
        area = (base * altura) / 2;
    }
}