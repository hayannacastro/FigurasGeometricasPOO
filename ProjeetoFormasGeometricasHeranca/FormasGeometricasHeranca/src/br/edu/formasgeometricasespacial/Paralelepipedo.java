package br.edu.formasgeometricasespacial;
public class Paralelepipedo extends figuraEspacial{
   
	private double comprimento;
    private double largura;
    private double altura;

    public Paralelepipedo() {
    	comprimento = 0;
    	largura = 0;
    	altura = 0;
    	
    } 
    
    public void setComprimento(double Comprimento) {
        comprimento = Comprimento;
    }
    
    public double getComprimento() {
        return comprimento;
    }
    
    public void setLargura(double Largura) {
        largura = Largura;
    } 
    
    public double getLargura() {
        return largura;
    } 
    
    public void setAltura(double Altura) {
        altura = Altura;
    } 
    
    public double getAltura() {
        return altura;
    } 
    
    public void calcAreaBase() {
    	areaBase = comprimento * largura;
    } 
    
    public void calcDiagonal() {
    	double diagonal = Math.sqrt((comprimento * comprimento) + (altura * altura) + (largura * largura));
    } 
    
    public void calcAreaTotal() {
    	areaTotal = 2 * (comprimento * largura + comprimento * altura + largura  * altura);
    } 
    
    public void calcVolume() {
        volume = comprimento * largura * altura;
    } 
    
    public void calcAreaTotalBase(double AreaTotalBase) {
		areaTotalBase = AreaTotalBase;
	}
    
    public void calcArea(double Area) {
		area = Area;
	}
    
    public void calcAltura(double Altura) {
		altura = Altura;
	}
}