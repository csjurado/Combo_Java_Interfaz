import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class monedas {
    private JTextField origenTF;
    private JTextField destinoTF;
    private JComboBox origenCB;
    private JComboBox destinoCB;
    private JButton convertirBTN;
    private JLabel orgineTXT;
    private JLabel destinoTXT;
    private JLabel auxiliarTXT;
    private JPanel mainPanel;
    private JLabel auxiliar2TXT;


    public monedas() {
        origenCB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                auxiliarTXT.setText(""+origenCB.getSelectedItem());
            }
        });
        destinoCB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                auxiliar2TXT.setText(""+destinoCB.getSelectedItem());
            }
        });

        convertirBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (origenCB.getSelectedItem().toString()=="Dólares"){
                    double [] tarifas= {2036.79,447400,100,96.37,82.14};
                    double tarifasSeleccionada=tarifas[destinoCB.getSelectedIndex()];
                    double resultado = Double.parseDouble(origenTF.getText())*tarifasSeleccionada/100;
                    destinoTF.setText(String.format("%.2f",resultado));
                }
                if((origenCB.getSelectedItem().toString()=="Pesos (MX)")){
                    double [] tarifas= {100000000,21060985500.00,4909698.30,4674923.40,4032607.21};
                    double tarifasSeleccionada=tarifas[destinoCB.getSelectedIndex()];
                    double resultado = Double.parseDouble(origenTF.getText())*tarifasSeleccionada/100000000;
                    destinoTF.setText(String.format("%.2f",resultado));
                }
                if((origenCB.getSelectedItem().toString()=="Pesos (Col)")){
                    double [] tarifas= {465300.89,100,22844.87,21752,46,18763.76};
                    double tarifasSeleccionada=tarifas[destinoCB.getSelectedIndex()];
                    double resultado = Double.parseDouble(origenTF.getText())*tarifasSeleccionada/100000000;
                    destinoTF.setText(String.format("%.2f",resultado));
                }
                if((origenCB.getSelectedItem().toString()=="Franco Suizo")){
                    double [] tarifas= {2139.07,450509.72,105.02,100,86.26};
                    double tarifasSeleccionada=tarifas[destinoCB.getSelectedIndex()];
                    double resultado = Double.parseDouble(origenTF.getText())*tarifasSeleccionada/100;
                    destinoTF.setText(String.format("%.2f",resultado));
                }
                if((origenCB.getSelectedItem().toString()=="Libra Esterlina")){
                    double [] tarifas= {2479.78,522266.89,121.75,115.93,100};
                    double tarifasSeleccionada=tarifas[destinoCB.getSelectedIndex()];
                    double resultado = Double.parseDouble(origenTF.getText())*tarifasSeleccionada/100;
                    destinoTF.setText(String.format("%.2f",resultado));
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("monedas");
        frame.setContentPane(new monedas().mainPanel);
        frame.setTitle("CONVERTIDOR DE MONEDAS");
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
