package br.com.estatistica.controller;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author Helder Cruvinel
 */

public class ListaDiscreta extends Lista{
    
    //CONSTRUTOR QUE RECEBE COMO PARAMETRO A LISTA DO ROL
    public ListaDiscreta(List lista){
        super.setLista(lista);
        this.setLista_xi();
        this.setLista_fi();
        super.setLista_frPorcentual();
        super.setLista_F();
        super.setLista_FPorcentual();
        super.setLista_XiFi();
        super.setMedia();
        super.setLista_xixfi();
    }

    //ADICIONA DADOS A LISTAXI
    @Override
    public final void setLista_xi() {  
        
        /*
        * VERIFICA SE O NUMERO DIGITADO JÁ EXISTE 
        * NA ListaDeNumeros2 E CASO NÃO EXISTA 
        * ACRESCENTA O NUMERO NESTA LISTA
        */
        for(int i = 0; i < this.getLista_Rol().size(); i++){
            if(!this.getLista_xi().contains(this.getLista_Rol().get(i))){
                this.addLista_xi((Double)this.getLista_Rol().get(i));
            }
        }
        
        Collections.sort(this.getLista_xi());
        
    }
    
    //MÉTODO PARA SETAR A LISTA_FI PARA UTILIZAÇÃO
    @Override
    public final void setLista_fi(){
        
        /*  
        *    COMPARA NUMEROS DIGITADOS COM SUA FREQUÊNCIA
        *   E ADICIONA A FREQUÊNCIA NA LISTA_FI
        */
        for(int i = 0; i < this.getLista_xi().size(); i++){
           int count = 0;
           for(int j = 0; j < this.getLista_Rol().size(); j++){
               if(this.getLista_xi().get(i).equals(this.getLista_Rol().get(j))){
                   count++;
               }
           }
           
           this.addLista_fi(i, count);
           
       }
    }
}
