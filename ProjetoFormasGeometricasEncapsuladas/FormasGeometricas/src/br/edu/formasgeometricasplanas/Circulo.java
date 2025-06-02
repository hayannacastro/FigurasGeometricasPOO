package br.edu.formasgeometricasplanas;
public class Circulo {
    
	private double raio;
    private double area;

    public Circulo() {
    	raio = 0;
    	area = 0;
    	
    } public void setRaio(double Raio) {
        raio = Raio;
        
    } public double getRaio() {
        return raio;
        
    } public void calcArea() {
        area = Math.PI * raio * raio;
        
    } public void mostrarArea() {
        System.out.println("Área: " + area);
        
    } public double getArea() {
        System.out.println("Área com retorno: " + area);
        return area;
    }
}