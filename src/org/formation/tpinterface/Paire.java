package org.formation.tpinterface;

public class Paire {
	
	Object premier;
	Object second;
	
	public Paire(Object a, Object b) {
		premier = a;
		second = b;
	}

	public Object getPremier() {
		return premier;
	}

	public void setPremier(Object premier) {
		this.premier = premier;
	}

	public Object getSecond() {
		return second;
	}

	public void setSecond(Object second) {
		this.second = second;
	}

}
