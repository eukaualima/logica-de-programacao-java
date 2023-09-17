package lista_1;

/*
=-----------------=
=-> Importações <-=
=-----------------=
*/
import javax.swing.*;

/*
=---------------=
=-> Cabeçalho <-=
=---------------=
*/
/**
 * @author Kauã dos Santos Lima
 * @since 17/09/2023
 * @details Dados os três valores a, b, c quaisquer para os lados de um triângulo.  Uma vez que esses valores sejam positivos,
 * verificar se os mesmos formam realmente um triângulo, e se essa condição for verdadeira, indicar qual o tipo do
 * triângulo: isósceles, escaleno, equilátero. E no caso de ser triangulo escaleno informar se é retângulo ou não.
 * @note Treino de lógica em Java / Questões do professor Dr. Josildo Pereira da Silva, do curso de Lógica de
 * Programação IFBA - Campus Camaçari
 **/

/*
=----------------------=
=-> Classe Principal <-=
=----------------------=
*/
public class questao_7
{
    public static void main(String [] args)
    {
        // < Declaração de variáveis >
        String titulo, resposta;
        float a, b, c, modulo_1, modulo_2, modulo_3, temp;

        // < Definição do título para as janelas >
        titulo = "Verificador de triângulos";

        // < Entrada de dados >
        resposta = JOptionPane.showInputDialog(null, "Valores informados:\na = ?\nb = ?\nc = ?\n\nInforme a:", titulo, 3);
        a = Float.parseFloat(resposta);

        resposta = JOptionPane.showInputDialog(null, "Valores informados:\na = " + a + "\nb = ?\nc = ?\n\nInforme b:", titulo, 3);
        b = Float.parseFloat(resposta);

        resposta = JOptionPane.showInputDialog(null, "Valores informados:\na = " + a + "\nb = " + b + "\nc = ?\n\nInforme c:", titulo, 3);
        c = Float.parseFloat(resposta);

        // < Definição dos módulos >
        temp = b - c;
        modulo_1 = Math.abs(temp);

        temp = a - c;
        modulo_2 = Math.abs(temp);

        temp = a - b;
        modulo_3 = Math.abs(temp);

        // < Verificação de triângulo >
        if (a > 0 && b > 0 && c > 0)
        {
            /** VERIFICAR A EXISTÊNCIA DO TRIÂNGULO, REGRA:
             * | b - c | < a < b + c
             * | a - c | < b < a + c
             * | a - b | < c < a + b
             */
            if ((a < (b + c) && modulo_1 < a) || (b < (a + c) && modulo_2 > b) || (c < (a + b) && modulo_3 > c))
            {
                // Triângulo isósceles
                if (a + b == c || a + c == b || b + c == a)
                {
                    JOptionPane.showMessageDialog(null, "Valores informados:\na = " + a + "\nb = " + b + "\nc = " + c + "\n\nTriângulo Isósceles.", titulo, 1);
                }
                else if (a != b && a != c && b != c) // Triângulo escaleno
                {
                    if (a + b == 90 || a + c == 90 || b + c == 90) // Triângulo escaleno retângulo
                    {
                        JOptionPane.showMessageDialog(null, "Valores informados:\na = " + a + "\nb = " + b + "\nc = " + c + "\n\nTriângulo Escaleno Retângulo.", titulo, 1);
                    }
                    else // Triângulo escaleno
                    {
                        JOptionPane.showMessageDialog(null, "Valores informados:\na = " + a + "\nb = " + b + "\nc = " + c + "\n\nTriângulo Escaleno.", titulo, 1);
                    }
                }
                else // Triângulo equilátero
                {
                    JOptionPane.showMessageDialog(null, "Valores informados:\na = " + a + "\nb = " + b + "\nc = " + c + "\n\nTriângulo Equilátero.", titulo, 2);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Valores informados:\na = " + a + "\nb = " + b + "\nc = " + c + "\n\nOs valores informados não formam um triângulo.\nRegras para a existência de um triângulo:\n| b - c | < a < b + c\n| a - c | < b < a + c\n| a - b | < c < a + b", titulo, 2);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Valores informados:\na = " + a + "\nb = " + b + "\nc = " + c + "\n\nInforme apenas números positivos.", titulo, 2);
        }
    }
}