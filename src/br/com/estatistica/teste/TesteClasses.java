package br.com.estatistica.teste;

import br.com.estatistica.controller.TabelaContinua;
import br.com.estatistica.controller.TabelaDiscreta;
import java.util.ArrayList;

/**
 *
 * @author Helder
 */
public class TesteClasses {
    public static void main(String[] args){
        TabelaDiscreta teste = new TabelaDiscreta();
        
        
        //DADOS PARA TESTE COM VARIAVEL DISCRETA
        teste.addLista_rol(0.00);
        teste.addLista_rol(0.00);
        teste.addLista_rol(0.00);
        teste.addLista_rol(0.00);
        teste.addLista_rol(0.00);
        teste.addLista_rol(0.00);
        teste.addLista_rol(0.00);
        teste.addLista_rol(0.00);
        teste.addLista_rol(0.00);
        teste.addLista_rol(0.00);
        teste.addLista_rol(0.00);
        teste.addLista_rol(0.00);
        teste.addLista_rol(0.00);
        teste.addLista_rol(0.00);
        teste.addLista_rol(0.00);
        teste.addLista_rol(1.00);
        teste.addLista_rol(1.00);
        teste.addLista_rol(1.00);
        teste.addLista_rol(1.00);
        teste.addLista_rol(1.00);
        teste.addLista_rol(1.00);
        teste.addLista_rol(1.00);
        teste.addLista_rol(1.00);
        teste.addLista_rol(1.00);
        teste.addLista_rol(1.00);
        teste.addLista_rol(2.00);
        teste.addLista_rol(2.00);
        teste.addLista_rol(2.00);
        teste.addLista_rol(2.00);
        teste.addLista_rol(2.00);
        teste.addLista_rol(2.00);
        teste.addLista_rol(2.00);
        teste.addLista_rol(2.00);
        teste.addLista_rol(2.00);
        teste.addLista_rol(2.00);
        teste.addLista_rol(2.00);
        teste.addLista_rol(2.00);
        teste.addLista_rol(2.00);
        teste.addLista_rol(2.00);
        teste.addLista_rol(2.00);
        teste.addLista_rol(2.00);
        teste.addLista_rol(2.00);
        teste.addLista_rol(2.00);
        teste.addLista_rol(3.00);
        teste.addLista_rol(3.00);
        teste.addLista_rol(3.00);
        teste.addLista_rol(3.00);
        teste.addLista_rol(3.00);
        teste.addLista_rol(3.00);
        teste.addLista_rol(3.00);
        teste.addLista_rol(3.00);
        teste.addLista_rol(4.00);
        teste.addLista_rol(4.00);
        teste.addLista_rol(4.00);
        teste.addLista_rol(4.00);
        teste.addLista_rol(4.00);
        teste.addLista_rol(5.00);
        teste.addLista_rol(5.00);
        teste.addLista_rol(5.00);
        teste.addLista_rol(5.00);
        


        //DADOS PARA TESTE COM VARIAVEL CONTINUA
//        teste.addLista_rol(20.00);
//        teste.addLista_rol(37.00);
//        teste.addLista_rol(40.00);
//        teste.addLista_rol(32.00);
//        teste.addLista_rol(28.00);
//        teste.addLista_rol(26.00);
//        teste.addLista_rol(25.00);
//        teste.addLista_rol(32.00);
//        teste.addLista_rol(39.00);
//        teste.addLista_rol(40.00);
//        teste.addLista_rol(50.00);
//        teste.addLista_rol(47.00);
//        teste.addLista_rol(46.00);
//        teste.addLista_rol(31.00);
//        teste.addLista_rol(24.00);
//        teste.addLista_rol(21.00);
//        teste.addLista_rol(35.00);
//        teste.addLista_rol(39.00);
//        teste.addLista_rol(38.00);
//        teste.addLista_rol(43.00);
        
        
        teste.geraDados();
        
        
        System.out.println(teste);
        
        
        System.out.println("Rol = " + teste.getLista_Rol());
        
        System.out.println("xi = " + teste.getLista_xi());
        
        System.out.println("fi = " + teste.getLista_fi());
        
        System.out.println("fr% = " + teste.getLista_frPorcentual());
        
        System.out.println("F = " + teste.getLista_F());
        
        System.out.println("F% = " + teste.getLista_FPorcentual());
        
        System.out.println("xi*fi = " + teste.getLista_XiFi());
        
        System.out.println("Xi - media * fi = " + teste.getLista_xixfi());
        
        System.out.println("Média = " + teste.getMedia());
         
        System.out.println("Moda = " + teste.getModa());
         
        System.out.println("Mediana = " + teste.getMediana());
        
//        teste.setPopulacao(true);
//        teste.setAmostra(false);
        
        System.out.println("Variância = " + teste.getVariancia());
        
        System.out.println("Desvio Padrão = " + teste.getDesvioPadrao());
        
        System.out.println("Coeficiente de variação = " + teste.getCoeficienteVariacao());
        
        
    }
}
