package br.edu.formasgeometricasespacial;
public class Cone extends figuraEspacial{
    private double raio;
    private double geratriz;
    private double altura;

    public Cone() {
    	raio = 0;
    	geratriz = 0;
    	altura = 0;
    	
    } 
    
    public void setRaio(double Raio) {
		raio = Raio;
	} 
    
    public double getRaio() {
		return raio;
	}  
    
    public void setGeratriz(double Geratriz) {
		geratriz = Geratriz;
	} 
    
    public double getGeratriz() {
		return geratriz;
	}  
    
    public void setAltura(double Altura) {
		altura = Altura;
	} 
    
    public double getAltura() {
		return altura;
	} 
    
    public void calcAreaBase() {
		areaBase = Math.PI * (raio * raio);
	} 
    
    public void calcAreaLateral() {
		areaLateral = Math.PI * raio * geratriz;
	} 
    
    public void calcAreaTotal() {
		areaTotal = areaBase + areaLateral;
	} 
    
    public void calcVolume() {
		volume = (1 / 3) * areaBase * altura;
	} 
    
    public void calcArea(double Area) {
		area = Area;
	} 
    
    public void calcDiagonal(double Diagonal) {
		diagonal = Diagonal;
	} 
    
    public void calcAreaTotalBase(double AreaTotalBase) {
		areaTotalBase = AreaTotalBase;
	} 
    
    public void calcAltura(double Altura) {
		altura = Altura;
	}
}
