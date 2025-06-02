package br.edu.formasgeometricasespacial;
public class Cubo extends figuraEspacial {
    private double aresta;
    
    public Cubo() {
        aresta = 0; 
        
    } 
    
    public void setAresta(double Aresta) {
		aresta = Aresta;
	} 
    
    public double getAresta() {
		return aresta;
	} 
    
    public void calcAreaBase() {
	 areaBase = aresta * aresta;
	} 
    
    public void calcAreaLateral() {
     areaLateral = 4 * (aresta * aresta);
	} 
    
    public void calcAreaTotal() {
    areaTotal = 6 * (aresta * aresta);
	} 
    
    public void calcVolume() {
	 volume = aresta * aresta * aresta;
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