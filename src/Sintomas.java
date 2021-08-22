import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Sintomas extends JPanel {
	private ImageIcon imgCovid;
	private JLabel jlCovid;
	
	public Sintomas() {
		Componentes();
		Eventos();
	}

	public void Componentes() {
		setLayout(null);
		imgCovid = new ImageIcon("Sintomas.jpg");
		jlCovid = new JLabel(imgCovid);
		jlCovid.setBounds(0, 0, 564, 297);
		add(jlCovid);
	}
	
	public void Eventos() {
		
	}
	
}
