package br.edu.formasgeometricasespacial;
public class Tetraedro extends figuraEspacial {
    private double aresta;

    public Tetraedro() {
    	aresta = 0;
    	areaBase = 0;
    	volume = 0;
    	
    } 
    
    public void setAresta(double Aresta) {
    	aresta = Aresta;
    } 
    
    public double getAresta() {
    	return aresta;
    } 
    
    public void calcAreaBase() {
    	areaBase = (aresta * aresta) * Math.sqrt(3) / 4;
    } 
    
    public void calcAltura() {
    	double altura = (aresta * Math.sqrt(6) / 3);
    } 
    
    public void calcVolume() {
    	volume = ((aresta * aresta * aresta) * Math.sqrt(2)) / 12;
    } 
    
    public void mostrarAreaBase() {
        System.out.println("Área da Base: " + areaBase);
    }
    
    public void mostrarVolume() {
        System.out.println("Volume: " + volume);
    } 
    
    public double getAreaBase() {
    	System.out.println("Área da base com retorno: " + areaBase);
        return areaBase;
    } 
    
    public double getVolume() {
    	System.out.println("Volume com retorno: " + volume);
        return volume;
    } 
    
    public void calcDiagonal(double Diagonal) {
		diagonal = Diagonal;
	}
    
    public void calcAreaTotalBase( double AreaTotalBase) {
		areaTotalBase = AreaTotalBase;
	} 
    
    public void calcArea(double Area) {
		area = Area;
	} 
    
    public void calcAreaTotal(double AreaTotal) {
		areaTotal = AreaTotal;
	} 
    
    public void calcAltura(double Altura) {
		altura = Altura;
	}
}
