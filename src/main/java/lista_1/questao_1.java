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
 * @since 15/09/2023
 * @details Dado a idade de um indivíduo informe sua classificação de período de vida considerando a seguinte tabela:
 * |     Idade   |   Período de vida   |
 * --------------|----------------------
 * | 0 à 9       |        Infância     |
 * | 10 à 14     |   Pré-adolescência  |
 * | 15 à 21     |      Adolescência   |
 * | 22 à 64     |        Adulto       |
 * | Acima de 64 |        Idoso        |
 * -------------------------------------
 * @note Treino de lógica em Java / Questões do professor Dr. Josildo Pereira da Silva, do curso de Lógica de Programação IFBA - Campus Camaçari
 **/

/*
=----------------------=
=-> Classe Principal <-=
=----------------------=
*/
public class questao_1
{
    public static void main(String[] args)
    {
        // < Variáveis locais >
        int idade;
        String idade_resposta, periodo_resposta;

        // < Coleta a resposta do usuário >
        idade_resposta = JOptionPane.showInputDialog("Informe a idade:");

        // < Transforma a idade recebida por String para Inteiro >
        idade = Integer.parseInt(idade_resposta);

        // < Operações de decisão para verificar o período de idade do valor informado >
        if (idade >= 0 && idade <= 9)
        {
            periodo_resposta = "Infância";
        }
        else if (idade >= 10 && idade <= 14)
        {
            periodo_resposta = "Pré-adolescência";
        }
        else if (idade >= 15 && idade <= 21)
        {
            periodo_resposta = "Adolescência";
        }
        else if (idade >= 22 && idade <= 64)
        {
            periodo_resposta = "Adulto";
        }
        else if (idade > 64)
        {
            periodo_resposta = "Idoso";
        }
        else
        {
            periodo_resposta = "Idade inválida";
        }

        // < Mostra uma mensagem na tela com o período escolhido pela operação de decisão >
        JOptionPane.showMessageDialog(null, periodo_resposta, "Definição de Período de Vida", 1);
    }
}