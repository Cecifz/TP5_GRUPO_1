package TP5;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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
		lblIdAutomatico.setBounds(200, 63, 181, 14);
		add(lblIdAutomatico);
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Boolean encontrado = false;
				if(!textFieldNombre.getText().trim().equals(""))
					if(cbGeneros.getSelectedIndex() > 0)
					{
						for (int i = 0; i < listModel.getSize(); i++)
						
							if(listModel.getElementAt(i).getNombrePelicula().trim().toLowerCase().equals(textFieldNombre.getText().trim().toLowerCase()) &&
							   listModel.getElementAt(i).getCategoria().getId()==cbGeneros.getSelectedIndex()
							 )
								encontrado=true;
						if(!encontrado)
						{
							pelicula = new Pelicula();
							lblIdAutomatico.setText(Integer.toString(pelicula.getId()));
							pelicula.setNombrePelicula(textFieldNombre.getText());
							pelicula.setCategoria(cbGeneros.getSelectedIndex(),cbGeneros.getSelectedItem().toString());
							listModel.addElement(pelicula);
							textFieldNombre.setText(null) ;
							cbGeneros.setSelectedIndex(0);
						}
						else
							JOptionPane.showMessageDialog(null,"Ya Existe la pélicula en ese género");
					}
					else
						JOptionPane.showMessageDialog(null,"No se eligió género");
				else
				{
					if(!(cbGeneros.getSelectedIndex() > 0))
						JOptionPane.showMessageDialog(null,"No se completó el campo Nombre de pélicula ni se eligió el género");
					else
					JOptionPane.showMessageDialog(null,"No se completó el campo Nombre de pélicula");
				}
			}
		});
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