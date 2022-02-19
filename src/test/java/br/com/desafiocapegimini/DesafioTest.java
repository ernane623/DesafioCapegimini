package br.com.desafiocapegimini;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ernane
 */
public class DesafioTest {

    /**
     * Test of Questão 01 method, of class Desafio.
     */
    @org.junit.jupiter.api.Test
    public void testQuestao01() {
        System.out.println("Questão 01");
        int iQtd = 6;
        String expResult = "     *\n    **\n   ***\n  ****\n *****\n******\n";
        String result = Desafio.Questao01(iQtd);
        System.out.println(result);
        assertEquals(expResult, result);
        System.out.println("\n######################");
    }
    
    /**
     * Test of Questão 02 method, of class Desafio.
     */
    @org.junit.jupiter.api.Test
    public void testQuestao02() {
        System.out.println("Questão 02");
        String senha = "Ya3";
        int expResult = 3;
        int result = Desafio.Questao02(senha);
        System.out.println(result);
        assertEquals(expResult, result);
        System.out.println("\n######################");
    }
    
    /**
     * Test of Questão 02 b (DLC) method, of class Desafio.
     */
    @org.junit.jupiter.api.Test
    public void testQuestao02b() {
        System.out.println("Questão 02b");
        String senha = "Ya3&ab";
        boolean expResult = true;
        boolean result = Desafio.Questao02b(senha);
        System.out.println(result);
        assertEquals(expResult, result);
        System.out.println("\n######################");
    }
    
    /**
     * Test of Questão 03 method, of class Desafio.
     */
    @org.junit.jupiter.api.Test
    public void testQuestao03a() {
        System.out.println("Questão 03 a");
        String palavra = "ovo";
        int expResult = 2;
        int result = Desafio.Questao03(palavra);
        System.out.println(palavra +" : "+result);
        assertEquals(expResult, result);
        System.out.println("\n######################");
    }
    
    /**
     * Test of Questão 03 method, of class Desafio.
     */
    @org.junit.jupiter.api.Test
    public void testQuestao03b() {
        System.out.println("Questão 03 b");
        String palavra = "ifailuhkqq";
        int expResult = 3;
        int result = Desafio.Questao03(palavra);
        System.out.println(palavra +" : "+result);
        assertEquals(expResult, result);
        System.out.println("\n######################");
    }
    
}
