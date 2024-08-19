import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculadora {
    private JRadioButton soma;
    private JRadioButton Menos;
    private JRadioButton Divisao;
    private JRadioButton Multiplicacao;
    private JTextField valor1;
    private JTextField valor2;
    public JButton calcular;
    private JLabel LabelResultado;
    public JPanel painel_calculadora;


    public calculadora() {

        calcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try{
                    double num1 = Double.parseDouble(valor1.getText());
                    double num2 = Double.parseDouble(valor2.getText());
                    double Resultado = 0;

                    if(soma.isSelected()) {
                        Resultado = num1 + num2;
                    } else if (Menos.isSelected()) {
                        Resultado = num1 - num2;
                    } else if (Multiplicacao.isSelected()) {
                        Resultado = num1 * num2;
                    } else if (Divisao.isSelected()) {
                        if(num2 != 0 ){
                            Resultado = num1 / num2;
                        } else {
                            LabelResultado.setText("Erro: Divisão por zero");
                            return;
                        }
                    }
                LabelResultado.setText("Resultado:" + Resultado);
                } catch (NumberFormatException ex) {
                    LabelResultado.setText("Erro: Entrada invalida");
                }
            }

        });
    }
}
