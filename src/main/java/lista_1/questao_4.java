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
 * @details Dados valores de três notas, o total de aulas ministradas, e o número de faltas de um estudante em uma
 * disciplina qualquer deve-se verificar a sua situação final: Aprovado, Reprovado por falta ou Reprovado por média.
 * A média para aprovação é 7,0 e o limite de faltas é 25% do total de aulas ministradas. A reprovação por falta
 * ocorrerá mesmo que o estudante tenha média suficiente para aprovação.
 * @note Treino de lógica em Java / Questões do professor Dr. Josildo Pereira da Silva, do curso de Lógica de
 * Programação IFBA - Campus Camaçari
 **/

/*
=----------------------=
=-> Classe Principal <-=
=----------------------=
*/
public class questao_4
{
    public static void main(String [] args)
    {
        // < Declaração de variáveis >
        String resposta, titulo;
        float nota_1, nota_2, nota_3, media, somatorio, faltas_porcentagem, aulas_ministradas, faltas_aluno, arredondar_faltas, arredondar_media;

        // < Definição do título da janela >
        titulo = "Verificação de Aprovação do Aluno";

        // < Entrada de Dados >
        resposta = JOptionPane.showInputDialog(null, "Primeira nota do aluno:", titulo, 3);
        nota_1 = Float.parseFloat(resposta);

        resposta = JOptionPane.showInputDialog(null, "Segunda nota do aluno:", titulo, 3);
        nota_2 = Float.parseFloat(resposta);

        resposta = JOptionPane.showInputDialog(null, "Terceira nota do aluno:", titulo, 3);
        nota_3 = Float.parseFloat(resposta);

        resposta = JOptionPane.showInputDialog(null, "Total de aulas ministradas:", titulo, 3);
        aulas_ministradas = Float.parseFloat(resposta);

        resposta = JOptionPane.showInputDialog(null, "Total de faltas do aluno:", titulo, 3);
        faltas_aluno = Float.parseFloat(resposta);

        // < Calcula a média do aluno >
        somatorio = nota_1 + nota_2 + nota_3;
        if (somatorio == 0)
        {
            media = 0;
        }
        else
        {
            media = somatorio / 3;
        }

        // < Calcula a porcentagem de faltas >
        faltas_porcentagem = (faltas_aluno / aulas_ministradas) * 100;

        // < Arredonda os valores para o usuário visualizar melhor >
        arredondar_faltas = (float)Math.round(faltas_porcentagem);
        arredondar_media = (float)Math.round(media);

        // < Verificar situação final do aluno: Aprovado, Reprovado por falta ou Reprovado por média>
        if (faltas_porcentagem > 25)
        {
            JOptionPane.showMessageDialog(null, "Aluno reprovado por falta!\nMédia: "+ arredondar_media +"\nFaltou: " + arredondar_faltas + "%.", titulo, 1);
        }
        else if (media >= 7)
        {
            JOptionPane.showInputDialog(null, "Aluno aprovado!\nMédia: " + arredondar_media + "\nFaltou: " + arredondar_faltas + "%", titulo, 1);
        }
        else
        {
            JOptionPane.showInputDialog(null, "Aluno reprovado!\nMédia: " + arredondar_media + "\nFaltou: " + arredondar_faltas + "%", titulo, 1);
        }
    }
}
