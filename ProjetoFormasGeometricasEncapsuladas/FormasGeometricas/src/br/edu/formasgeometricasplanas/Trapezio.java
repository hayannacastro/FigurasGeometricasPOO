package br.edu.formasgeometricasplanas;

public class Trapezio {
   
	private double maiorBase;
    private double menorBase;
    private double altura;
    private double area;

    public Trapezio() {
    	maiorBase = 0;
    	menorBase = 0;
    	altura = 0;
    	area = 0;
    }
    
    public void setMaiorBase(double MaiorBase) {
        maiorBase = MaiorBase;
    } 
    
    public double getMaiorBase() {
		return maiorBase;
	}
    
	
	public void setMenorBase(double MenorBase) {
        menorBase = MenorBase;
    }
	
	public double getMenorBase() {
		return menorBase;
	}

	public void setAltura(double Altura) {
        altura = Altura;
	}
        
     public double getAltura() {
		return altura;
	   
    } 
    public void calcArea() {
        area = ((maiorBase + menorBase) * altura) / 2;
        
    } 
    public void mostrarArea() {
        System.out.println("Área: " + area);
        
    } 
    public double getArea() {
        System.out.println("Área com retorno: " + area);
        return area;
    }
}