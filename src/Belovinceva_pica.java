import javax.swing.JOptionPane;

public class Belovinceva_pica {

	public static void main(String[] args) {
		int choice = JOptionPane.showOptionDialog(null, "Atlas�t darb�bu:", "Darb�ba",
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
				new String[]{"Pievienot jaunu pas�t�jumu", "Pas�t�jumu saraksts"}, "Pievienot jaunu pas�t�jumu");
	}

}
