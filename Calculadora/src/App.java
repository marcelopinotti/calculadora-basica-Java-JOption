import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        String numero1String = JOptionPane.showInputDialog("Qual o primeiro número?");
        String numero2String = JOptionPane.showInputDialog("Qual o segundo número?");
        String operacao = JOptionPane.showInputDialog("Escolha uma das opções:\n1-Soma\n2-Subtração"+
        "\n3-Divisão\n4-Multiplicação\n5-Número par\n6-Potência");

        double num1 = Double.parseDouble(numero1String), num2 = Double.parseDouble(numero2String);

        double resultado = 0;
        boolean divisoesRestoZero = num1 % num2 == 0;
        String mensagem = "";

        
        if ((operacao.equals("3") || operacao.equals("5")) && num2 == 0) {
            JOptionPane.showMessageDialog(null, "Não se divide número por zero");
        }

        else {
            switch (operacao) {
                
                case "1":
                    resultado = num1 + num2;
                    break;
                case "2":
                    resultado = num1 - num2;
                    break;
                case "3":
                    resultado = num1 / num2;
                    break;
                case "4":
                    resultado = num1 * num2;
                    break;
                case "5":
                    if (divisoesRestoZero) {
                        mensagem = "O número é par.";
                    }
                    else {
                        mensagem = "O resultado dessa operação é ímpar, e o resto da divisão é: " + (num1%num2);
                    }
                    JOptionPane.showMessageDialog(null, mensagem);
                    return;
                case "6":
                resultado = 1;
                for (int i=0;i<(int)num2;i++) {
                    resultado *= num1;
                }
                mensagem = "O resultado da potência é: " + resultado;
                JOptionPane.showMessageDialog(null, mensagem);
                return;
            }

                boolean maisDeTresCasas = (resultado * 1000) % 1 != 0;
                String resultadoFormatado = String.format("%.3f", resultado);
                
                
                if (maisDeTresCasas) {
                    mensagem = "O resultado dessa operação é,aproximadamente: ~" + resultadoFormatado;
                } else {
                    mensagem = "O resultado dessa operação é: " + resultado;
                }
                
                JOptionPane.showMessageDialog(null, mensagem);
        }
    }
}
