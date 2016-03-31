package br.com.estatistica.teste;

import br.com.estatistica.controller.ListaContinua;
import br.com.estatistica.controller.ListaDiscreta;
import java.util.ArrayList;

/**
 *
 * @author Helder
 */
public class TesteClasses {
    public static void main(String[] args){
        ArrayList<Double> teste = new ArrayList<>();
        teste.add(10.00);
        teste.add(1.00);
        teste.add(20.00);
        teste.add(20.00);
        teste.add(20.00);
        teste.add(10.00);
        teste.add(20.00);
        teste.add(20.00);
        teste.add(1.00);
        teste.add(20.00);
        teste.add(20.00);
        teste.add(65.00);
        teste.add(20.00);
        teste.add(20.00);
        teste.add(20.00);
        teste.add(65.00);
        teste.add(65.00);
        teste.add(65.00);
        teste.add(10.00);
        teste.add(1.00);
        teste.add(250.00);
        
        System.out.println(teste);
        
        ListaDiscreta lista = new ListaDiscreta(teste);
        
        System.out.println("Rol = " + lista.getLista_Rol());
        
        System.out.println("xi = " + lista.getLista_xi());
        
        System.out.println("fi = " + lista.getLista_fi());
        
        System.out.println("fr% = " + lista.getLista_frPorcentual());
        
        System.out.println("F = " + lista.getLista_F());
        
        System.out.println("F% = " + lista.getLista_FPorcentual());
        
        System.out.println("xi*fi = " + lista.getLista_XiFi());
        
        System.out.println("Média = " + lista.getMedia());
        
         System.out.println("Xi - media * fi = " + lista.getLista_xixfi());
        
        
        
        
    }
}
