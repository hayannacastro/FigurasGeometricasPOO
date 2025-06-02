package br.edu.formasgeometricasplanas;
public class Hexagono {
   
	private double lado;
    private double area;

    public Hexagono() {
    	lado = 0;
    	area = 0;
    	
    } public void setLado(double Lado) {
        lado = Lado;
        
    } public void calcArea() {
        area = (3 * Math.sqrt(3) * (lado * lado)) / 2;
        
    } public void mostrarArea() {
        System.out.println("Área: " + area);
        
    } public double getArea() {
        System.out.println("Área com retorno: " + area);
        return area;
    }
}