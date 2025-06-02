package br.edu.formasgeometricasplanas;
public class Losango {
   
	private double maiorDiagonal;
    private double menorDiagonal;
    private double area;

    public Losango() {
    	maiorDiagonal = 0;
    	menorDiagonal = 0;
    	area = 0;
    	
    } public void setMaiorDiagonal(double MaiorDiagonal) {
        maiorDiagonal = MaiorDiagonal;
        
    } public double getMaiorDiagonal() {
        return maiorDiagonal;
        
    } public void setMenorDiagonal(double MenorDiagonal) {
        menorDiagonal = MenorDiagonal;
        
    } public double getMenorDiagonal() {
        return menorDiagonal;
        
    } public void calcArea() {
        area = (maiorDiagonal * menorDiagonal) / 2;
        
    } public void mostrarArea() {
        System.out.println("Área: " + area);
        
    } public double getArea() {
        System.out.println("Área com retorno: " + area);
        return area;
    }
}
