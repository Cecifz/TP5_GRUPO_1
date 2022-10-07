package TP5;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelAgregar extends JPanel {
    private DefaultListModel<Pelicula> listModel;
	private static final long serialVersionUID = 1L;
	private JButton btnAceptar;
	private JComboBox<String> cbGeneros;
	private JLabel lblIdAutomatico;
	private JTextField textFieldNombre;
	
	public PanelAgregar() {
		setLayout(null);
		
		JLabel lblID = new JLabel("ID");
		lblID.setBounds(90, 63, 46, 14);
		add(lblID);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(90, 98, 46, 14);
		add(lblNombre);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setBounds(90, 135, 46, 14);
		add(lblGenero);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(201, 95, 181, 20);
		add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		JLabel lblIdAutomatico = new JLabel();
		lblIdAutomatico.setBounds(200, 63, 181, 14);
		
		add(lblIdAutomatico);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(92, 179, 187, 23);
		add(btnAceptar);
		
		cbGeneros = new JComboBox();
		cbGeneros.setBounds(201, 131, 181, 23);
		add(cbGeneros);
		
	}
	public void setDefaultListModel(DefaultListModel<Pelicula> listModelRecibido) 
	{
		this.listModel = listModelRecibido;
	}
}