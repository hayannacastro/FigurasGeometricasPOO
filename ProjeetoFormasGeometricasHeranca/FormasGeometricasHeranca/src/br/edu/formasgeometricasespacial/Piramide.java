package br.edu.formasgeometricasespacial;
public class Piramide extends figuraEspacial{
	private double lado;
	private double ladoBase;
	private double altura;

    public Piramide() {
    	lado = 0;
    	ladoBase = 0;
    	altura = 0;
    	
    } 
    
    public void setLado(double Lado) {
    	lado = Lado;
    } 
    
    public double getLado() {
    	return lado;
    }
    
    public void setLadoBase(double LadoBase) {
    	ladoBase = LadoBase;
    }
    
    public double getLadoBase() {
    	return ladoBase;
    } 
    
    public void setAltura(double Altura) {
    	altura = Altura;
    }
    
    public double getAltura() {
    	return altura;
    } 
    
    public void calcAreaBase() {
    	areaBase = lado * lado;
    }
    
    public void calcAreaLateral() {
    	areaLateral = 4 * (ladoBase * altura) / 2;
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