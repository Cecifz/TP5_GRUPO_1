package TP5;

public class Principal {

    public static void main(String[] args) {

        try {
            VentanaPrincipal vPrinc = new VentanaPrincipal();
            vPrinc.setVisible(true);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
