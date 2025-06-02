package br.edu.formasgeometricasplanas;
public class Quadrado extends FiguraPlana{
    private double lado;

    public Quadrado() {
    	lado = 0;
    	
    } 
    
    public void setLado(double Lado) {
        lado = Lado;
    }
    
    public double getLado() {
        return lado;
    } 
    
    public void calcArea() {
        area = lado * lado;
    }
}