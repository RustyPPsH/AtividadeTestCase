package calculadora;

import javax.swing.JOptionPane;
import calculadora.Calculadora;

public class Main {
    public static void main(String[] args) {
        
        String opcao = "";
        Calculadora calculadora = new Calculadora();

        while (!opcao.equals("9")) {
            opcao = JOptionPane.showInputDialog("1 - Leitura \n2 - Soma \n3 - Subtração \n4 - Produto \n5 - Divisão \n9 - Sair");

            switch (Integer.parseInt(opcao)) {
                case 1:
                    calculadora.setValorA(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A: ")));
                    calculadora.setValorB(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B: ")));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Resultado: " + calculadora.getAdicao());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Resultado: " + calculadora.getSubtracao());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Resultado: " + calculadora.getProduto());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Resultado: " + calculadora.getDivisao());
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }

        }
    }
}