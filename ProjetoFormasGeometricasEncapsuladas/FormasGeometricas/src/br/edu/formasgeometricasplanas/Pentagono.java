package br.edu.formasgeometricasplanas;
public class Pentagono {
    
	private double perimetro;
    private double apotema;
    private double area;

    public Pentagono() {
    	perimetro = 0;
    	apotema = 0;
    	area = 0;
    	
    } public void setPerimetro(double Perimetro) {
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
	public void mostrarArea() {
        System.out.println("Área: " + area);
    } 
	
	public double getArea() {
        System.out.println("Área com retorno: " + area);
        return area;
    }
}