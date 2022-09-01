package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import entities.Tiempo;

import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JLabel lblApellido;
	private JTextField txtLU;
	private JTextField txtApellido;
	private JTextField txtNombre;
	private JTextField txtEmail;
	private JTextField txtGithub;
	private JLabel lblImagen;
	private Tiempo time;
	private JLabel lblTiempo;

	public SimplePresentationScreen(Student studentData) 
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		this.studentData = studentData;
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	
		
		init();
		
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentación");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(615, 250));
		setResizable(false);
		setContentPane(contentPane);
		
		
		
		setLocationRelativeTo(null);
		
	}
	
	private void init() {
		
		// Tabbed Pane to student personal data
		contentPane.setLayout(null);
		
		lblImagen = new JLabel("Foto");
		lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
		lblImagen.setBounds(445, 32, 144, 168);
		ImageIcon imagen = new ImageIcon(SimplePresentationScreen.class.getResource(studentData.getPathPhoto()));
		Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_DEFAULT));
		lblImagen.setIcon(icono);
		contentPane.add(lblImagen);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 430, 174);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		tabInformation.setLayout(null);
		
		lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Arial", Font.PLAIN, 14));
		lblApellido.setBounds(10, 38, 76, 14);
		tabInformation.add(lblApellido);
		
		JLabel lblLU = new JLabel("LU");
		lblLU.setFont(new Font("Arial", Font.PLAIN, 14));
		lblLU.setBounds(10, 13, 46, 14);
		tabInformation.add(lblLU);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNombre.setBounds(10, 63, 64, 14);
		tabInformation.add(lblNombre);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Arial", Font.PLAIN, 14));
		lblEmail.setBounds(10, 88, 46, 14);
		tabInformation.add(lblEmail);
		
		JLabel lblGithubUrl = new JLabel("Github URL");
		lblGithubUrl.setFont(new Font("Arial", Font.PLAIN, 14));
		lblGithubUrl.setBounds(10, 113, 76, 14);
		tabInformation.add(lblGithubUrl);
		
		txtLU = new JTextField();
		txtLU.setEditable(false);
		txtLU.setBounds(90, 11, 325, 20);
		tabInformation.add(txtLU);
		txtLU.setColumns(10);
		txtLU.setText(Integer.toString(studentData.getId()));
		
		txtApellido = new JTextField();
		txtApellido.setEditable(false);
		txtApellido.setColumns(10);
		txtApellido.setBounds(90, 36, 325, 20);
		tabInformation.add(txtApellido);
		txtApellido.setText(studentData.getLastName());
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		txtNombre.setBounds(90, 61, 325, 20);
		tabInformation.add(txtNombre);
		txtNombre.setText(studentData.getFirstName());
		
		txtEmail = new JTextField();
		txtEmail.setEditable(false);
		txtEmail.setColumns(10);
		txtEmail.setBounds(90, 86, 325, 20);
		tabInformation.add(txtEmail);
		txtEmail.setText(studentData.getMail());
		
		txtGithub = new JTextField();
		txtGithub.setEditable(false);
		txtGithub.setColumns(10);
		txtGithub.setBounds(90, 111, 325, 20);
		tabInformation.add(txtGithub);
		txtGithub.setText(studentData.getGithubURL());
		contentPane.add(tabbedPane);
		
		lblTiempo = new JLabel("Aquiva el tiemop");
		lblTiempo.setBounds(5, 190, 405, 14);
		contentPane.add(lblTiempo);
		
		mostrarTiempo();
	}
	
	private void mostrarTiempo()
	{
		time = new Tiempo();
		lblTiempo.setText(" Esta Ventana fue generada " + time.GetDia() +" a las " + time.GetHora());
	}
}
