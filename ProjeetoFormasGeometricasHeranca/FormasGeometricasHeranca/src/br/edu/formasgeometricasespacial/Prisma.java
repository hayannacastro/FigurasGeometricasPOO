package br.edu.formasgeometricasespacial;
public class Prisma extends figuraEspacial {
	private double aresta;
	private double base;
	private double lateral;

    public Prisma() {
    	aresta = 0;
    	base = 0;
    	lateral = 0;
    	
    } 
    
    public void setAresta(double Aresta) {
    	aresta = Aresta;
    } 
    
    public double getAresta() {
    	return aresta;
    } 
    
    public void setLateral(double Lateral) {
    	lateral = Lateral;
    } 
    
    public double getLateral() {
    	return lateral;
    } 
    
    public void setBase(double Base) {
    	base = Base;
    } 
    
    public double getBase() {
    	return base;
    }
    
    public void calcAreaBase() {
    	areaBase = aresta * aresta;
    }
    
    public void calcAreaLateral() {
    	areaLateral = 4 * (aresta * base);
    }
    
    public void calcAreaTotal() {
    	areaTotal = 2 * (areaBase) + areaLateral;
    } 
    
    public void calcVolume() {
    	volume = (aresta * aresta) * base;
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
