import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Oq� extends JPanel{
	JLabel jlCovid, texto1, jlSintomas;
	 ImageIcon imgCovid, imgSintomas;
	
	public Oq�() {
		Componentes();
	}
	
	public void Componentes() {
		setLayout(null);
		texto1 = new JLabel("<html> o  <b> novo coronav�rus </b> faz parte de uma grande "
				+ "fam�lia viral que causa infec��es respirat�rias em seres humanos e em animais.</html>");
		texto1.setBounds(300, 250, 260, 100);
		texto1.setFont(new Font("Arial", Font.HANGING_BASELINE ,16));
		texto1.setForeground(Color.BLACK);
		add(texto1);
		
		imgCovid = new ImageIcon("Covid o que �.png");
		jlCovid = new JLabel(imgCovid);
		jlCovid.setBounds(0, 0, 564, 464);
		add(jlCovid);
	}
}
