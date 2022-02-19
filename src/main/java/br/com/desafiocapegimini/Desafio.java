package br.com.desafiocapegimini;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * DESAFIO DE PROGRAMAÇÃO - ACADEMIA CAPGEMINI
 *
 * @author Ernane
 */
public class Desafio {

    /**
     * Questão 01
     *
     * @param n
     * @return String
     */
    public static String Questao01(int n) {
        String retorno = "";
        int iEspaco = n - 1;
        int iAsterisco = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < iEspaco; j++) {
                retorno += " ";
            }
            iEspaco--;
            for (int j = 0; j < iAsterisco; j++) {
                retorno += "*";
            }
            iAsterisco++;
            retorno += "\n";
        }
        return retorno;
    }

    /**
     * Questão 02
     *
     * @param senha
     * @return int
     */
    public static int Questao02(String senha) {
        int retorno = 6-senha.length();
        return retorno;
    }
    
    /**
     * Questão 02b
     *
     * @param senha
     * @return String
     */
    public static boolean Questao02b(String senha) {
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[!#@$%&])(?=.*[0-9])(?=.*[a-z]).{6,12}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(senha);
        return matcher.find();
    }
    
    /**
     * Questão 03
     *
     * @param palavra
     * @return int
     */
    public static int Questao03(String palavra) {
        
        //Primeiro vamos adicinar as palavras ao array
        ArrayList<String> lst = new ArrayList<>();
        for (int i = 0; i < palavra.length(); i++) {
            for (int j = (i+1); j <= palavra.length(); j++) {
                if(j < palavra.length() || i > 0){
                    lst.add(palavra.substring(i, j));
                }
            }
        }
        
        //Agora vamos agrupar os pares de palavras
        int aux = 0;
        for (int i = 0; i < lst.size(); i++) {
            for (int j = 0; j < lst.size(); j++) {
                if(j>i){
                    //Verificar se os pares de palavras são anagramas
                    if(Anagrama(lst.get(i), lst.get(j))){
                        //Se for anagrama, adicionar 1 a variável aux
                        aux++;
                    }
                }
            }
        }
        return aux;
    }
    
    /**
     * Anagrama
     *
     * @param palavra1
     * @param palavra2
     * @return boolean
     */
    public static boolean Anagrama(String palavra1, String palavra2) {
        //Se o tamanho da palavra for diferente não é um anagrama. 
        if (palavra1.length() != palavra2.length()){
            return false;
        }
        
        //tranfromar as palvras em arrays para ordenar
        char[] arr1 = palavra1.toCharArray();
        char[] arr2 = palavra2.toCharArray();
        
        //Ordenar os arrays para poder comparar de forma simples
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        //cria as novas strings baseadas nos arrays ordenados
        String palavra_ordenada1 = new String(arr1);
        String palavra_ordenada2 = new String(arr2);
        
        return palavra_ordenada1.equals(palavra_ordenada2);
    }

    public static void main(String[] args) {
        boolean aux = true;
        System.out.println("* DESAFIO DE PROGRAMAÇÃO - ACADEMIA CAPGEMINI *");
        System.out.println("Ernane da Mata Souza");
        Scanner myObj = new Scanner(System.in);
        do {
            System.out.println("Selecione a questão");
            System.out.println("1 - para a primeira questão.");
            System.out.println("2 - para a segunda questão.");
            System.out.println("3 - para a terceira questão.");
            System.out.println("4 - para a segunda questão (DLC).");
            System.out.println("0 - para encerrar o programa.");
            System.out.println("\n");
            
            String flag = myObj.nextLine();
            switch (flag){
            case "0":
                aux=false;
                break;
            case "1":
                System.out.println("Questão 1 - Digite a entrada: ");
                int quest1 = Integer.parseInt(myObj.nextLine());
                System.out.println(Questao01(quest1));
                System.out.println("\n######################");
                break;
            case "2":
                System.out.println("Questão 2 - Digite a entrada: ");
                String quest2 = myObj.nextLine();
                System.out.println(Questao02(quest2));
                System.out.println("\n######################");
                break;
            case "3":
                System.out.println("Questão 3 - Digite a entrada: ");
                String quest3 = myObj.nextLine();
                System.out.println(Questao03(quest3));
                System.out.println("\n######################");
                break;
            case "4":
                System.out.println("Questão 2 b (DLC) - Digite a entrada: ");
                String quest4 = myObj.nextLine();
                System.out.println(Questao02b(quest4));
                System.out.println("\n######################");
                break;
            }
        } while (aux);
        myObj.close();
    }
}
