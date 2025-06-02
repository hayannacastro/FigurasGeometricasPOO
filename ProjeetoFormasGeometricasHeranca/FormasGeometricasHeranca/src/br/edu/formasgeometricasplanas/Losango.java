package br.edu.formasgeometricasplanas;
public class Losango extends FiguraPlana{
    private double maiorDiagonal;
    private double menorDiagonal;

    public Losango() {
    	maiorDiagonal = 0;
    	menorDiagonal = 0;
    	
    }
    
    public void setMaiorDiagonal(double MaiorDiagonal) {
        maiorDiagonal = MaiorDiagonal;
    } 
    
    public double getMaiorDiagonal() {
        return maiorDiagonal;
    }
    
    public void setMenorDiagonal(double MenorDiagonal) {
        menorDiagonal = MenorDiagonal;
    } 
    public double getMenorDiagonal() {
        return menorDiagonal;
    } 
    
    public void calcArea() {
        area = (maiorDiagonal * menorDiagonal) / 2;
    }
}
