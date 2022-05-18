package one.digitalinnovation.gof.comportamento;

import one.digitalinnovation.gof.strategy.Comportamento;

public class Robo {
	
	private Comportamento comportamento;

	public void setComportamento(Comportamento comportamento) {
		this.comportamento = comportamento;
	}
	
	public void mover() {
		comportamento.mover();
	}
}
