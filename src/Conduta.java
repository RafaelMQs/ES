import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Conduta extends JPanel {
	private ImageIcon imgConduta;
	private JLabel jlCovid;
	
	public Conduta() {
		Componentes();
		Eventos();
	}

	public void Componentes() {
		setLayout(null);
		imgConduta = new ImageIcon("Condutas.jpg");
		jlCovid = new JLabel(imgConduta);
		jlCovid.setBounds(0, 0, 530, 528);
		add(jlCovid);
	}
	
	public void Eventos() {
		
	}
	
}
