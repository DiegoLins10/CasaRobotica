//@Author Diego Lins

public class Som {

	private int volume;
	private boolean somLigado = false;
	
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public boolean isSomLigado() {
		return somLigado;
	}
	public void setSomLigado(boolean somLigado) {
		this.somLigado = somLigado;
	}
    
    public void setAumentarVolume(){
        this.volume += 1;
    }

    public void setDiminuirVolume(){
        this.volume -= 1;
    }
	
	
	}