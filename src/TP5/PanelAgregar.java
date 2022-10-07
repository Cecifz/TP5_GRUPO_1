package TP5;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelAgregar extends JPanel {
    private DefaultListModel<Pelicula> listModel;
	private static final long serialVersionUID = 1L;
	private JButton btnAceptar;
	private JComboBox<String> cbGeneros;
	private JLabel lblID;
	private JLabel lblNombre;
	private JLabel lblGenero;
	private JLabel lblIdAutomatico;
	private JTextField textFieldNombre;
	private Pelicula pelicula;
	
	public PanelAgregar() {
		setLayout(null);
		//Labels
		lblID = new JLabel("ID");
		lblID.setBounds(90, 63, 46, 14);
		add(lblID);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(90, 98, 46, 14);
		add(lblNombre);
		
		lblGenero = new JLabel("Genero");
		lblGenero.setBounds(90, 135, 46, 14);
		add(lblGenero);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(201, 95, 181, 20);
		add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		lblIdAutomatico = new JLabel();
		pelicula = new Pelicula();
		lblIdAutomatico.setText(Integer.toString(pelicula.getId()));
		lblIdAutomatico.setBounds(200, 63, 181, 14);
		
		add(lblIdAutomatico);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(92, 179, 187, 23);
		add(btnAceptar);
		
		cbGeneros = new JComboBox<String>();
		cbGeneros.addItem("Seleccione un genero");
		cbGeneros.addItem("Terror");
		cbGeneros.addItem("Accion");
		cbGeneros.addItem("Suspenso");
		cbGeneros.addItem("Romantica");
		
		cbGeneros.setBounds(201, 131, 181, 23);
		add(cbGeneros);
		
	}
	public void setDefaultListModel(DefaultListModel<Pelicula> listModelRecibido) 
	{
		this.listModel = listModelRecibido;
	}
}