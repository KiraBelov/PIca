import javax.swing.JOptionPane;

public class Belovinceva_pica {

	public static void main(String[] args) {
		int darbibas = JOptionPane.showOptionDialog(null, "Atlas�t darb�bu:", "Darb�ba",
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
				new String[]{"Pievienot jaunu pas�t�jumu", "Pas�t�jumu saraksts"}, "Pievienot jaunu pas�t�jumu");
		switch(darbibas){
		case 0:
			String nosauk = JOptionPane.showInputDialog("Ievad�t klienta nosaukumu:");
			String taur = JOptionPane.showInputDialog("Ievadiet klienta t�lru�a numuru:");
			String email = JOptionPane.showInputDialog("Ievad�t klienta e-pastu:");
			String[] piccNosak = {"Margarita", "Djabola", "�etri sieri", "Ar j�ras velt�m", "Neapoles", "Kalcone"};
			double[] piccCena = {2.30, 2.50, 4.20, 4.30, 3.10, 2.50};
			
			break;
			
		case 1:
			
			break;
			
		}
	}

}
