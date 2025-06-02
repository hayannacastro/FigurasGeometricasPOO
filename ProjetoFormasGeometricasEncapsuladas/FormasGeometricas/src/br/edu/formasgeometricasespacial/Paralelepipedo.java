package br.edu.formasgeometricasespacial;
public class Paralelepipedo {
    
	private double comprimento;
    private double largura;
    private double altura;
    private double areaBase;
    private double areaTotal;
    private double diagonal;
    private double volume;

    public Paralelepipedo() {
    	comprimento = 0;
    	largura = 0;
    	altura = 0;
    	areaBase = 0;
    	areaTotal = 0;
    	diagonal = 0;
    	volume = 0;
    	
    } 
    
	public void setDiagonal(double Diagonal) {
		diagonal = Diagonal;
	}
	
	public double getDiagonal() {
		return diagonal;
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
    	diagonal = Math.sqrt((comprimento * comprimento) + (altura * altura) + (largura * largura));
    } 
    
    public void calcAreaTotal() {
    	areaTotal = 2 * (comprimento * largura + comprimento * altura + largura  * altura);
    } 
    
    public void calcVolume() {
        volume = comprimento * largura * altura;
    } 
    
    public void mostrarAreaBase() {
        System.out.println("Área da Base: " + areaBase);
    } 
    
    public void mostrarAreaTotal() {
        System.out.println("Área Total: " + areaTotal);
    } 
    
    public void mostrarVolume() {
        System.out.println("Volume: " + volume);
    }
    
    public double getAreaBase() {
    	System.out.println("Área da base com retorno: " + areaBase);
        return areaBase;
    }
    
    public double getAreaTotal() {
    	System.out.println("Área Total com retorno: " + areaTotal);
        return areaTotal;
    } 
    
    public double getVolume() {
    	System.out.println("Volume com retorno: " + volume);
        return volume;
    }
}