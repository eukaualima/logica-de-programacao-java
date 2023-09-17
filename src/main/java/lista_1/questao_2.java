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
 * @since 15/09/2023
 * @details Dados os nomes e as idades de três pessoas, selecionar (mostrar) nome e idade do mais jovem caso as idades
 * sejam positivas e diferentes entre si.
 * @note Treino de lógica em Java /
 * Questões do professor Dr. Josildo Pereira da Silva, do curso de Lógica de Programação IFBA - Campus Camaçari
 **/

/*
=----------------------=
=-> Classe Principal <-=
=----------------------=
*/
public class questao_2
{
    public static void main(String [] args)
    {
        // < Declaração de variáveis >
        String nome_1, nome_2, nome_3, mais_jovem_nome, resposta_idade_1, resposta_idade_2, resposta_idade_3, resposta;
        String resposta_final;
        int idade_1, idade_2, idade_3, mais_jovem_idade;

        // < Solicita ao usuário as informações: nome e idade de 3 pessoas >
        nome_1 = JOptionPane.showInputDialog("Nome da pessoa 1:");
        resposta_idade_1 = JOptionPane.showInputDialog("Idade de " + nome_1 + ":");

        nome_2 = JOptionPane.showInputDialog("Nome da pessoa 2:");
        resposta_idade_2 = JOptionPane.showInputDialog("Idade de " + nome_2 + ":");

        nome_3 = JOptionPane.showInputDialog("Nome da pessoa 3:");
        resposta_idade_3 = JOptionPane.showInputDialog("Idade de " + nome_3 + ":");

        // < Conversão das idades de string para int >
        idade_1 = Integer.parseInt(resposta_idade_1);
        idade_2 = Integer.parseInt(resposta_idade_2);
        idade_3 = Integer.parseInt(resposta_idade_3);

        // < Escolhe o mais jovem >
        if ((idade_1 != idade_2 && idade_2 != idade_3) && (idade_1 >= 0 && idade_2 >= 0 && idade_3 >= 0))
        {
            if (idade_1 < idade_2 && idade_1 < idade_3)
            {
                resposta = nome_1 + ", que possui " + idade_1 + " anos.";
            }
            else if (idade_2 < idade_1 && idade_2 < idade_3)
            {
                resposta = nome_2 + ", que possui " + idade_2 + " anos.";
            }
            else if (idade_3 < idade_1 && idade_3 < idade_2)
            {
                resposta = nome_3 + ", que possui " + idade_3 + " anos.";
            }
            else
            {
                resposta = "As idades devem ser diferentes entre si.";
            }
        }
        else
        {
            resposta = "As idades devem ser diferentes entre si.";
        }

        resposta_final = "Pessoas informadas:\n" + nome_1 + " (" + idade_1 + " anos)\n"
                        + nome_2 + " (" + idade_2 + " anos)\n"
                        + nome_3 + " (" + idade_3 + " anos)\n\n"
                        + "Mais jovem:\n" + resposta;
        // < Envia ao usuário a resposta final >
        JOptionPane.showMessageDialog(null, resposta_final, "Quem é o mais jovem?", 1);
    }
}
