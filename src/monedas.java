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


    public monedas() {
        origenCB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            auxiliarTXT.setText(""+origenCB.getSelectedItem());
            }
        });
        convertirBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double [] tarifas= {2046.03,447400,100,96.37};
                double tarifasSeleccionada=tarifas[destinoCB.getSelectedIndex()];
                double resultado = Double.parseDouble(origenTF.getText())*tarifasSeleccionada/100;
                destinoTF.setText(""+resultado);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("monedas");
        frame.setContentPane(new monedas().mainPanel);
        frame.setTitle("CONVERTIDOR DE MONEDAS");
        frame.setSize(700,600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
