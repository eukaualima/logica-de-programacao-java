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
 * @details Desenvolva um algoritmo computacional que faça 5 perguntas para uma pessoa sobre um crime.
 * As perguntas são:
 *         a. "Telefonou para a vítima?"
 *         b. "Devia dinheiro para a vítima?"
 *         c. "Esteve no local do crime?"
 *         d. "Mora perto da vítima?"
 *         e. "Já trabalhou com a vítima?"
 * O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se a pessoa responder
 * positivamente a duas questões ela deve ser classificada como "Suspeita", entre três e quatro como "Cúmplice" e
 * cinco como "Assassino". Caso contrário, ele será classificado como "Inocente".
 * @note Treino de lógica em Java / Questões do professor Dr. Josildo Pereira da Silva, do curso de Lógica de
 * Programação IFBA - Campus Camaçari
 **/

/*
=----------------------=
=-> Classe Principal <-=
=----------------------=
*/
public class questao_5
{
    public static void main(String[] args)
    {
        // < Declaração de variáveis >
        String titulo, resposta;
        int qt_positivas = 0;

        // < Definição do título das janelas >
        titulo = "Programa Confidencial";

        // < Entrada de dados e contagem de respostas positivas >
        resposta = JOptionPane.showInputDialog(null, "Escreva APENAS \"sim\" ou \"não\" para a pergunta abaixo.\n\nTelefonou para a vítima?", titulo, 3);
        if (resposta.equalsIgnoreCase("sim"))
        {
            qt_positivas++;
        }

        resposta = JOptionPane.showInputDialog(null, "Escreva APENAS \"sim\" ou \"não\" para a pergunta abaixo.\n\nDevia dinheiro para a vítima?", titulo, 3);
        if (resposta.equalsIgnoreCase("sim"))
        {
            qt_positivas++;
        }

        resposta = JOptionPane.showInputDialog(null, "Escreva APENAS \"sim\" ou \"não\" para a pergunta abaixo.\n\nEsteve no local do crime?", titulo, 3);
        if (resposta.equalsIgnoreCase("sim"))
        {
            qt_positivas++;
        }

        resposta = JOptionPane.showInputDialog(null, "Escreva APENAS \"sim\" ou \"não\" para a pergunta abaixo.\n\nMora perto da vítima?", titulo, 3);
        if (resposta.equalsIgnoreCase("sim"))
        {
            qt_positivas++;
        }

        resposta = JOptionPane.showInputDialog(null, "Escreva APENAS \"sim\" ou \"não\" para a pergunta abaixo.\n\nJá trabalhou com a vítima?", titulo, 3);
        if (resposta.equalsIgnoreCase("sim"))
        {
            qt_positivas++;
        }

        // < Verificação da inocência do entrevistado >
        if (qt_positivas == 2)
        {
            JOptionPane.showMessageDialog(null, "Você é considerado(a) suspeito!!", titulo, 2);
        }
        else if (qt_positivas >= 3 && qt_positivas <= 4)
        {
            JOptionPane.showMessageDialog(null, "Você é considerado(a) cúmplice!!", titulo, 2);
        }
        else if (qt_positivas == 5)
        {
            JOptionPane.showMessageDialog(null, "Você é considerado(a) assassino(a)!!!!!!!!!", titulo, 2);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Você é considerado(a) inocente!", titulo, 2);
        }
    }
}
