package br.edu.formasgeometricasplanas;
public class Circulo extends FiguraPlana{
    private double raio;

    public Circulo() {
    	raio = 0;
    	
    } 
    
    public void setRaio(double Raio) {
        raio = Raio;
    } 
    
    public double getRaio() {
        return raio;
    }
    
    public void calcArea() {
        area = Math.PI * raio * raio;
    }
}