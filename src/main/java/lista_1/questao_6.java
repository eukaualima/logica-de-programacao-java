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
 * @details Dado um número inteiro positivo qualquer, verificar se ele possui cinco dígitos. Em
 * caso afirmativo, decidir se esse número é palíndromo ímpar (número palíndromo é
 * aquele que é igual quando lido nas duas direções: esquerda-direita ou direita-
 * esquerda). Exemplos de números palíndromos ímpares: 98589, 73137 e 10801.
 * @note Treino de lógica em Java / Questões do professor Dr. Josildo Pereira da Silva, do curso de Lógica de
 * Programação IFBA - Campus Camaçari
 **/

/*
=----------------------=
=-> Classe Principal <-=
=----------------------=
*/
public class questao_6
{
    public static void main(String [] args)
    {
        // < Declaração de variáveis >
        String resposta, titulo;
        int numero, u, d, m, dm;

        // < Definição do título para as janelas >
        titulo = "Verificador de números palíndromos";

        // < Entrada de dados >
        resposta = JOptionPane.showInputDialog(null, "Informe um número de 5 dígitos:", titulo, 3);
        numero = Integer.parseInt(resposta);

        // < Fragmenta o número >
        u = numero % 10;
        d = (numero / 10) % 10;
        m = (numero / 1000) % 10;
        dm = numero / 10000;

        // < Verifica se é palíndromo ímpar >
        if (numero >= 10000 && numero <= 99999)
        {
            if (numero % 2 != 0)
            {
                if (u == dm && d == m)
                {
                    JOptionPane.showMessageDialog(null, numero + " é um palíndromo ímpar!", titulo, 1);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Não é um palíndromo ímpar!", titulo, 2);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Não é um palíndromo ímpar!", titulo, 2);
            }
        }
    }
}
