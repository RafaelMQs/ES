import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Orienta extends JPanel {
	private ImageIcon imgOrienta;
	private JLabel jlCovid;
	
	public Orienta() {
		Componentes();
		Eventos();
	}

	public void Componentes() {
		setLayout(null);
		imgOrienta = new ImageIcon("Orienta.png");
		jlCovid = new JLabel(imgOrienta);
		jlCovid.setBounds(0, 0, 354, 334);
		add(jlCovid);
	}
	
	public void Eventos() {
		
	}
	
}
