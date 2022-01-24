package edu.uno.ar.geometria;

public class Triangulo extends Figura{
	
	private Punto vert1;
	private Punto vert2;
	private Punto vert3;
	private double areaTri;

	public Triangulo(Punto vert1, Punto vert2, Punto vert3) {
		this.vert1 = vert1;
		this.vert2 = vert2;
		this.vert3 = vert3;
	}

	public Punto getVert1() {
		return vert1;
	}

	public Punto getVert2() {
		return vert2;
	}

	public Punto getVert3() {
		return vert3;
	}

	public double getAreaTri() {
		return areaTri;
	}
	
	public void setVert1(Punto vert1) {
		this.vert1 = vert1;
	}

	public void setVert2(Punto vert2) {
		this.vert2 = vert2;
	}

	public void setVert3(Punto vert3) {
		this.vert3 = vert3;
	}

	public void setAreaTri(double areaTri) {
		this.areaTri = areaTri;
	}

	public double calcularArea() {
		return areaTri = Math.abs(vert1.getPuntoX() * (vert2.getPuntoY() - vert3.getPuntoY()) + vert2.getPuntoX() * (vert3.getPuntoY() - vert1.getPuntoY()) + vert3.getPuntoX() * (vert1.getPuntoY() - vert2.getPuntoY())) / 2 ;
	}
	
	public String toString() {
		return "TRIANGULO," + vert1.getPuntoX() + "," + vert1.getPuntoY() + "," + vert2.getPuntoX() + "," + vert2.getPuntoY() + "," + vert3.getPuntoX() + "," + vert3.getPuntoY();
	}
	
	public void desplazarFigura(double x, double y) {
		vert1.setPunto(vert1.getPuntoX() + x,vert1.getPuntoY() + y);
		vert2.setPunto(vert2.getPuntoX() + x,vert2.getPuntoY() + y);
		vert3.setPunto(vert3.getPuntoX() + x,vert3.getPuntoY() + y);
	}

	@Override
	public int compareTo(Figura otroArea) {
		return Double.compare(otroArea.calcularArea(), this.calcularArea());
	}
	
	
	public boolean TparaleloX() {
		boolean par1 = CompararDouble.sonIguales(vert1.getPuntoY(),vert2.getPuntoY());
		boolean par2 = CompararDouble.sonIguales(vert1.getPuntoY(),vert3.getPuntoY());
		boolean par3 = CompararDouble.sonIguales(vert2.getPuntoY(),vert3.getPuntoY());
		
		if (par1 || par2 || par3) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public boolean TparaleloY() {
		boolean par1 = CompararDouble.sonIguales(vert1.getPuntoX(),vert2.getPuntoX());
		boolean par2 = CompararDouble.sonIguales(vert1.getPuntoX(),vert3.getPuntoX());
		boolean par3 = CompararDouble.sonIguales(vert2.getPuntoX(),vert3.getPuntoX());
		
		if (par1 || par2 || par3) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
