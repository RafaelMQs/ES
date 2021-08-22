import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class main extends JFrame{
	JLabel jlLogo, jlInterroga1, jlInterroga2, jlInterroga3, jlInterroga4, jlInvi;
	ImageIcon imgLogo, imgInterroga;
	JButton btnOQ, btnSintomas, btnOrienta, btnConduta;
	
	Container c1;
	ImageIcon imgCovid;
	JLabel jlCovid;
	JMenuBar menuBar;
	JMenu menuCovid;
	JMenuItem miInicio, miOq, miSin, miOrient, miCondu, miSair; 
	
	
	public main() {
		Componentes();
		Eventos();
	}
	
	public void Componentes() {
		c1 = getContentPane();
		
		menuBar = new JMenuBar(); // Barra do menu
		menuBar.setForeground(Color.BLACK);
		menuBar.setBackground(Color.WHITE);

		menuCovid = new JMenu("Topicos - Covid"); //Menu COVID
		
		miInicio = new JMenuItem("Inicio"); // Topico: o que é?
		miInicio.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.CTRL_MASK)); // Tecla de Atalho
		miInicio.setMnemonic('I'); // Sublinhado
		
		miOq = new JMenuItem("O que é ?"); // Topico: o que é?
		miOq.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK)); // Tecla de Atalho
		miOq.setMnemonic('O'); // Sublinhado
		
		miSin = new JMenuItem("Sintomas"); // Topico: Sintomas
		miOrient = new JMenuItem("Orientações - 1"); // Topico: Orientações - 1
		miCondu = new JMenuItem("Condutas para Infectados"); // Topico: Orientações - 1
		
		miSair = new JMenuItem("Sair"); // Topico: Sair
		miSair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK)); // Tecla de Atalho
		miSair.setMnemonic('S'); // Sublinhado
		
		// Add tudo na tela
		menuBar.add(menuCovid);
		menuCovid.add(miInicio);
		menuCovid.add(miOq);
		menuCovid.add(miSin);
		menuCovid.add(miOrient);
		menuCovid.add(miCondu);	
		menuCovid.add(miSair);	
		
		setJMenuBar(menuBar);
		
		//Adicionando Tela Principal
		//Definindo fundo e logo
		imgLogo = new ImageIcon("LogoCovid.jpg");
		jlLogo = new JLabel(imgLogo);
		jlLogo.setBounds(0, 0, 564, 200);
		c1.add(jlLogo);	
		
		
		
		
		
		//Definindo o Interrogação que fica do lado do botão
		imgInterroga = new ImageIcon("Interrogacao.png");
		jlInterroga1 = new JLabel(imgInterroga);
		jlInterroga1.setBounds(70, 250, 32, 32);
		c1.add(jlInterroga1);
		
		//Definindo botão para ir para a classe Oqé
		btnOQ = new JButton("O Que é COVID");
		btnOQ.setBounds(100, 250 ,150 ,32);
		btnOQ.setBackground(Color.WHITE);
		btnOQ.setFocusable(false);
		btnOQ.setFont(new Font("Arial", Font.BOLD, 14));
		btnOQ.setForeground(Color.BLACK);
		c1.add(btnOQ);
		
		
		
		
		
		//Definindo o Interrogação que fica do lado do botão
		jlInterroga2 = new JLabel(imgInterroga);
		jlInterroga2.setBounds(280, 250, 32, 32);
		c1.add(jlInterroga2);
		
		//Definindo botão para ir para a classe Sintomas
		btnSintomas = new JButton("Sintomas da Covid");
		btnSintomas.setBounds(310, 250 ,170 ,32);
		btnSintomas.setBackground(Color.WHITE);
		btnSintomas.setFocusable(false);
		btnSintomas.setFont(new Font("Arial", Font.BOLD, 14));
		btnSintomas.setForeground(Color.BLACK);
		c1.add(btnSintomas);
		
		
		
		
		
		jlInterroga3 = new JLabel(imgInterroga);
		jlInterroga3.setBounds(70, 320, 32, 32);
		c1.add(jlInterroga3);
		
		//Definindo botão para ir para a classe Sintomas
		btnConduta = new JButton("Condutas");
		btnConduta.setBounds(100, 320 ,150 ,32);
		btnConduta.setBackground(Color.WHITE);
		btnConduta.setFocusable(false);
		btnConduta.setFont(new Font("Arial", Font.BOLD, 14));
		btnConduta.setForeground(Color.BLACK);
		c1.add(btnConduta);
		
		
		
		
		
		jlInterroga4 = new JLabel(imgInterroga);
		jlInterroga4.setBounds(280, 320, 32, 32);
		c1.add(jlInterroga4);
		
		//Definindo botão para ir para a classe Sintomas
		btnOrienta = new JButton("Orientações");
		btnOrienta.setBounds(310, 320 ,170 ,32);
		btnOrienta.setBackground(Color.WHITE);
		btnOrienta.setFocusable(false);
		btnOrienta.setFont(new Font("Arial", Font.BOLD, 14));
		btnOrienta.setForeground(Color.BLACK);
		c1.add(btnOrienta);
		//Definindo botão Invisivel para desbugar o resto
		jlInvi = new JLabel();
		jlInvi.setVisible(false);
		c1.add(jlInvi);		
		
	}
	
	public void Eventos() {
		//Evento do menu sair
		miSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0); // Fecha
			}
		});
		
		//Evento do menu O que é
		miOq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Oqé tela1 = new Oqé(); // Chama a classe tela1
				setSize(580, 500); // Redimensiona
				setLocationRelativeTo(null); // Coloca o JFrame no centro
				setTitle("O Que é - COVID"); // Muda o titulo da janela
				c1.removeAll(); // Remove tudo do container
				c1.add(tela1); // Adiciona
				c1.validate(); // Valida?
			}
		});
		
		//Evento do menu Sintomas
		miSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sintomas tela1= new Sintomas(); // Chama a classe tela1
				setSize(580, 359); // Redimensiona
				setLocationRelativeTo(null); // Coloca o JFrame no centro
				setTitle("Sintomas - COVID"); // Muda o titulo da janela
				c1.removeAll(); // Remove tudo do container
				c1.add(tela1); // Adiciona
				c1.validate(); // Valida?
			}
		});
		
		
		//Evento do menu Inicio
		miInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setSize(579, 500); // Redimensiona
				setLocationRelativeTo(null); // Coloca o JFrame no centro
				setTitle("Inicio - COVID"); // Muda o titulo da janela
				c1.removeAll(); // Remove tudo do container
				c1.add(jlLogo); // Adiciona
				c1.add(jlInterroga1); // Adiciona
				c1.add(btnOQ); // Adiciona
				c1.add(jlInterroga2);
				c1.add(btnSintomas); // Adiciona
				c1.add(jlInterroga3);
				c1.add(btnConduta);
				c1.add(jlInterroga4);
				c1.add(btnOrienta);
				c1.add(jlInvi); // Adiciona
				c1.validate(); // Valida?
			}
		});
		
		
		//Evento do botão O que é
		btnOQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Oqé tela1 = new Oqé(); // Chama a classe tela1
				setSize(580, 500); // Redimensiona
				setLocationRelativeTo(null); // Coloca o JFrame no centro
				setTitle("O Que é - COVID"); // Muda o titulo da janela
				c1.removeAll(); // Remove tudo do container
				c1.add(tela1); // Adiciona
				c1.validate(); // Valida?
			}
		});
		
		//Evento do botão Sintomas
		btnSintomas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sintomas tela1 = new Sintomas(); // Chama a classe tela1
				setSize(580, 359); // Redimensiona
				setLocationRelativeTo(null); // Coloca o JFrame no centro
				setTitle("Sintomas - COVID"); // Muda o titulo da janela
				c1.removeAll(); // Remove tudo do container
				c1.add(tela1); // Adiciona
				setSize(580, 359); // Redimensiona
				c1.validate(); // Valida?
				
			}
		});
		
		btnOrienta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Orienta tela1 = new Orienta(); // Chama a classe tela1
				setSize(365, 334); // Redimensiona
				setLocationRelativeTo(null); // Coloca o JFrame no centro
				setTitle("Orientações - COVID"); // Muda o titulo da janela
				c1.removeAll(); // Remove tudo do container
				c1.add(tela1); // Adiciona
				c1.validate(); // Valida?
				
			}
		});
		
		btnConduta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Conduta tela1 = new Conduta(); // Chama a classe tela1
				setSize(530, 590); // Redimensiona
				setLocationRelativeTo(null); // Coloca o JFrame no centro
				setTitle("Condutas - COVID"); // Muda o titulo da janela
				c1.removeAll(); // Remove tudo do container
				c1.add(tela1); // Adiciona
				c1.validate(); // Valida?
				
			}
		});
		
		miOrient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Orienta tela1= new Orienta(); // Chama a classe tela1
				setSize(365, 334); // Redimensiona
				setLocationRelativeTo(null); // Coloca o JFrame no centro
				setTitle("Orientações - COVID"); // Muda o titulo da janela
				c1.removeAll(); // Remove tudo do container
				c1.add(tela1); // Adiciona
				c1.validate(); // Valida?
			}
		});
		
		miCondu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Conduta tela1= new Conduta(); // Chama a classe tela1
				setSize(530, 590); // Redimensiona
				setLocationRelativeTo(null); // Coloca o JFrame no centro
				setTitle("Condutas - COVID"); // Muda o titulo da janela
				c1.removeAll(); // Remove tudo do container
				c1.add(tela1); // Adiciona
				c1.validate(); // Valida?
			}
		});
		
	}
	
	public static void main (String args[]) {
		main frame = new main();
		frame.setTitle("Cartilha COVID");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(579, 480);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
	
	}
}