//@Author Diego Lins

public class Luz {


	private boolean ligado = false;

	public Luz(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
}