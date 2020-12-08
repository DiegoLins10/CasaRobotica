//@Author Diego Lins

public class ArCondicionado {

	private boolean arLigado = false;
	private int temperatura;
	public boolean isArLigado() {
		return arLigado;
	}
	public void setArLigado(boolean arLigado) {
		this.arLigado = arLigado;
	}
	public int getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	
	public void setAumentarTempe(){
        this.temperatura += 1;
    }

    public void setDiminuirVoTempe(){
        this.temperatura -= 1;
    }
	
}