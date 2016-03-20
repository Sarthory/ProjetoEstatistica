package br.com.estatistica.teste;

import br.com.estatistica.controller.ListaContinua;
import br.com.estatistica.controller.ListaDiscreta;

/**
 *
 * @author Helder
 */
public class TesteClasses {
    public static void main(String[] args){
        
        ListaContinua lista = new ListaContinua();
        lista.addLista(50.50);
        System.out.println(lista.getLista());
        
        ListaDiscreta lista2 = new ListaDiscreta();
        lista2.addLista(60.60);
        System.out.println(lista2.getLista());
        
        
        
        
        
    }
}
