package TP5;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {
    private JPanel contentPanel;
    private static DefaultListModel<Pelicula> listModel;

    public VentanaPrincipal(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPanel = new JPanel();
        listModel= new DefaultListModel<Pelicula>();
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu menu = new JMenu("Películas");
        menuBar.add(menu);
        JMenuItem menuItemAgregar = new JMenuItem("Agregar");
        menuItemAgregar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		contentPanel.removeAll();
        		PanelAgregar panel = new PanelAgregar();
        		panel.setDefaultListModel(listModel);
        		contentPanel.add(panel);
        		contentPanel.repaint();
        		contentPanel.revalidate();
        	}
        });
        menu.add(menuItemAgregar);
        JMenuItem menuItemListar = new JMenuItem("Listar");
        menuItemListar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		contentPanel.removeAll();
        		PanelListar panel = new PanelListar();
        		panel.setListModel(listModel);
        		contentPanel.add(panel);
        		contentPanel.repaint();
        		contentPanel.revalidate();
        	}
        });
        menu.add(menuItemListar);
        contentPanel = new JPanel();
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPanel.setLayout(new BorderLayout(0,0));
        setContentPane(contentPanel);     

    }

}

