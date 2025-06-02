package br.edu.formasgeometricasplanas;
public class Hexagono extends FiguraPlana{
    private double lado;

    public Hexagono() {
    	lado = 0;
    	
    } 
    
    public void setLado(double Lado) {
        lado = Lado;
    } 
    
    public double getLado() {
    	return lado;
    }
    
    public void calcArea() {
        area = (3 * Math.sqrt(3) * (lado * lado)) / 2;
    }
}