package br.edu.formasgeometricasplanas;
public class Quadrado {
    
	private double lado;
    private double area;

    public Quadrado() {
    	lado = 0;
    	area = 0;
    	
    } public void setLado(double Lado) {
        lado = Lado;
        
    } public double getLado() {
        return lado;
        
    } public void calcArea() {
        area = lado * lado;
        
    } public void mostrarArea() {
        System.out.println("Área: " + area);
        
    } public double getArea() {
        System.out.println("Área com retorno: " + area);
        return area;
    }
}

