package org.formation.tpinterface;

public class PaireG<T> {

	T premier;
	T second;
	
	public PaireG(T a, T b) {
		premier = a;
		second = b;
	}

	public T getPremier() {
		return premier;
	}

	public void setPremier(T premier) {
		this.premier = premier;
	}

	public T getSecond() {
		return second;
	}

	public void setSecond(T second) {
		this.second = second;
	}
}
