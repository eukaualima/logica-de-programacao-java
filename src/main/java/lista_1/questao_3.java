package lista_1;

/*
=-----------------=
=-> Importações <-=
=-----------------=
*/
import javax.swing.JOptionPane;

/*
=---------------=
=-> Cabeçalho <-=
=---------------=
*/
/**
 * @author Kauã dos Santos Lima
 * @since 17/09/2023
 * @details Dados valores quaisquer para os coeficientes a, b, c da expressão geral de uma equação do segundo grau
 * ax² + bx + c = 0, deve-se verificar se trata ou não de uma equação do segundo grau. Em caso afirmativo deve-se
 * informar quantas raízes a equação possui e seus respectivos valores.
 * @note Treino de lógica em Java / Questões do professor Dr. Josildo Pereira da Silva, do curso de Lógica de
 * Programação IFBA - Campus Camaçari
 **/

/*
=----------------------=
=-> Classe Principal <-=
=----------------------=
*/
public class questao_3
{
    public static void main(String [] args)
    {
        // < Declaração de variáveis >
        float a, b, c, delta, x1, x2, x;
        String resposta, titulo;

        // < Definindo o título das janelas >
        titulo = "Equação do Segundo Grau";

        // < Entrada de dados >
        resposta = JOptionPane.showInputDialog(null, "Informe o coeficiente a:", titulo, 3);
        a = Float.parseFloat(resposta);

        resposta = JOptionPane.showInputDialog(null, "Informe o coeficiente b:", titulo, 3);
        b = Float.parseFloat(resposta);

        resposta = JOptionPane.showInputDialog(null, "Informe o coeficiente c:", titulo, 3);
        c = Float.parseFloat(resposta);

        // < Verifica se é uma equação do segundo grau >
        /**
         * REGRA PARA EQUAÇÃO DO SEGUNDO GRAU
         * O coeficiente a não pode ser igual a 0.
         * https://mundoeducacao.uol.com.br/matematica/equacao-2-grau.htm
         */
        if (a == 0)
        {
            JOptionPane.showMessageDialog(null, "Essa não é uma equação do segundo grau, pois a = 0.", titulo, 1);
        }
        else
        {
            /**
             * REGRAS PARA Δ:
             * Se Δ > 0, então a equação possui duas soluções reais.
             * Se Δ = 0, então a equação possui uma solução real.
             * Se Δ < 0, então a equação não possui solução real.
             * https://mundoeducacao.uol.com.br/matematica/equacao-2-grau.htm
             */
            // < Calcula o delta >
            delta = ((b * b) - 4 * a * c); // Fórmula: b² - 4ac

            // < Verifica as regras do Δ >
            if (delta >= 0) // Possui duas soluções reais ou uma solução real
            {
                // < Aplica a fórmula de Bhaskara x=−b±√Δ/2a >
                x1 = ((-b + (float)Math.sqrt(delta)) / (2 * a)); // A função sqrt utiliza o tipo double, mas como
                x2 = ((-b - (float)Math.sqrt(delta)) / (2 * a)); // a variável é do tipo float, adiciona-se (float)

                // < Imprime o resultado para o usuário >
                JOptionPane.showMessageDialog(null, a + "x² + " + b + "x + " + c + " =\nx' = " + x1 + "\nx'' = " + x2, titulo, 1);
            }
            else // Não possui uma solução real
            {
                JOptionPane.showMessageDialog(null, "Essa equação não possui uma solução real.", titulo, 1);
            }
        }
    }
}
