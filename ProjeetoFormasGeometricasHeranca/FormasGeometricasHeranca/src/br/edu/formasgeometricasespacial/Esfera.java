package br.edu.formasgeometricasespacial;
public class Esfera extends figuraEspacial{
    private double raio;

    public Esfera() {
    	raio = 0;
    	
    } public void setRaio(double Raio) {
        raio = Raio;
    } public double getRaio() {
        return raio;
    } public void calcArea() {
    	area = 4 * Math.PI * (raio * raio);
    } public void calcVolume() {
        volume = (4 / 3) * Math.PI * (raio  * raio * raio);
    } public void calcAreaTotal(double AreaTotal) {
		areaTotal = AreaTotal;
	} public void calcDiagonal(double Diagonal) {
		diagonal = Diagonal;
	} public void calcAreaTotalBase(double AreaTotalBase) {
		 areaTotalBase = AreaTotalBase;
	} public void calcAltura( double Altura) {
		altura = Altura;
	}
}