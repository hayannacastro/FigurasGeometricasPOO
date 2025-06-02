package br.edu.formasgeometricasespacial;
public class Esfera {
    
	private double raio;
    private double area;
    private double volume;

    public Esfera() {
    	raio = 0;
    	area = 0;
    	volume = 0;
    	
    } 
    
    public void setRaio(double Raio) {
        raio = Raio;
    } 
    
    public double getRaio() {
        return raio;
    } 
    
    public void calcArea() {
    	area = 4 * Math.PI * (raio * raio);
    } 
    
    public void calcVolume() {
        volume = (4 / 3) * Math.PI * (raio  * raio * raio);
    } 
    
    public void mostrarArea() {
    	System.out.println("Área da Esfera: " + area);
    } 
    
    public void mostrarVolume() {
        System.out.println("Volume da Esfera: " + volume);
    } 
    
    public double getArea() {
    	System.out.println("Área da Esfera com Retorno: " + area);
        return area;
    } 
    
    public double getVolume() {
    	System.out.println("Volume da Esfera com Retorno: " + volume);
    	return volume;
    }
}