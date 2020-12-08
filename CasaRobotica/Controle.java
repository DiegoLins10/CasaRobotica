//@Author Diego Lins

import javax.swing.JOptionPane;

public class Controle {

	public static void main(String[] args) {

		int ligada = JOptionPane.showConfirmDialog(null,"Deseja ligar a luz?", " ",JOptionPane.YES_NO_OPTION);
		 if(JOptionPane.YES_OPTION == ligada){

			Luz luz = new Luz(true);
			JOptionPane.showMessageDialog(null,"Luz: " + luz.isLigado());       //Diego Lins
		}
		String ligadoAr = JOptionPane.showInputDialog("Deseja ligar o Arcondicionado?(sim/não)?");
		if (ligadoAr.equalsIgnoreCase("Sim")) {

			ArCondicionado ar = new ArCondicionado();
			String tempeAr = JOptionPane.showInputDialog("Digite a Temperatura:");
			int intTemp = Integer.parseInt(tempeAr);
			ar.setTemperatura(intTemp);

			JOptionPane.showMessageDialog(null, "A Temperatura é: " + intTemp);
			String aumentarAr = JOptionPane.showInputDialog("Deseja aumentar ou diminuir a temperatura?(+/-)? sair(s)");
			while((aumentarAr.equalsIgnoreCase("s") == false)) {
				    if(aumentarAr.equalsIgnoreCase("+")) {
					ar.setAumentarTempe();
					JOptionPane.showMessageDialog(null, "A Temperatura : " + ar.getTemperatura());
					aumentarAr = JOptionPane.showInputDialog("Deseja aumentar ou diminuir a temperatura?(+/-)? sair(s)");
				}
				    else if(aumentarAr.equalsIgnoreCase("-")) {
					ar.setDiminuirVoTempe();
					JOptionPane.showMessageDialog(null, "A Temperatura : " + ar.getTemperatura());
					aumentarAr = JOptionPane.showInputDialog("Deseja aumentar a temperatura?(sim/não)? sair(s)");
				}
				    else {
				    	JOptionPane.showMessageDialog(null, "A Temperatura : " + ar.getTemperatura());
				    }
			}

		}
		String somLigado = JOptionPane.showInputDialog("Deseja ligar o Som?(sim/não)?");
		if (somLigado.equalsIgnoreCase("Sim")) {

			Som som = new Som();
			String somVol = JOptionPane.showInputDialog("Digite o volume: ");
			int intSom = Integer.parseInt(somVol);
			som.setVolume(intSom);
			
			JOptionPane.showMessageDialog(null, "O volume é: " + intSom);
			String aumentarSom = JOptionPane.showInputDialog("Deseja aumentar ou diminuir o som?(+/-)? sair(s)");
			while(aumentarSom.equalsIgnoreCase("s") == false) {
				JOptionPane.showMessageDialog(null, "o Volume : " + som.getVolume());
				
				if(aumentarSom.equalsIgnoreCase("+")) {
					som.setAumentarVolume();
					JOptionPane.showMessageDialog(null, "o Volume : " + som.getVolume());
					aumentarSom = JOptionPane.showInputDialog("Deseja aumentar ou diminuir o som?(+/-)? sair(s)");
				}else if(aumentarSom.equalsIgnoreCase("-")) {
					som.setDiminuirVolume();
					JOptionPane.showMessageDialog(null, "O volume : " + som.getVolume());
					aumentarSom = JOptionPane.showInputDialog("Deseja aumentar ou diminuir o som?(sim/não)? sair(s)");
				}else {
					JOptionPane.showMessageDialog(null, "O volume : " + som.getVolume());
				}
			} 
			

		}
	}
}
