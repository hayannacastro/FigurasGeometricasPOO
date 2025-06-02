package br.edu.formasgeometricasplanas;
public class Trapezio extends FiguraPlana{
    private double maiorBase;
    private double menorBase;
    private double altura;

    public Trapezio() {
    	maiorBase = 0;
    	menorBase = 0;
    	altura = 0;
    	
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
}
