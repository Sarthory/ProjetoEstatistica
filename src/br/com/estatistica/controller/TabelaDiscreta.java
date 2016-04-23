package br.com.estatistica.controller;

import java.util.Collections;

/**
 *
 * @author Helder Cruvinel
 */

public class TabelaDiscreta extends Tabela{
    
    //CONSTRUTOR QUE RECEBE COMO PARAMETRO A LISTA DO ROL
    public TabelaDiscreta(){
        super.setLista();
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

    @Override
    public void setMediana() {
        Integer posi1;        
        Double temp1 = 0.0;
        Integer somatoriaFi = 0;
        int i = 0;
        
        for(Integer lista_fiTemp : this.lista_fi){
            somatoriaFi += lista_fiTemp;
        }
        
        if((somatoriaFi % 2) == 0){
            Integer posi2;            
            Double temp2 = 0.0;
            
            posi1 = (this.getLista_Rol().size() / 2);
            posi2 = (this.getLista_Rol().size() / 2) + 1;
            
            while(temp1 == 0.0){
                if((Integer)this.getLista_F().get(i) >= posi1){
                    temp1 = (Double)this.getLista_xi().get(i);
                }
                i++;
            }
        
            i = 0;
            while(temp2 == 0.0){
                if((Integer)this.getLista_F().get(i) >= posi2){
                    temp2 = (Double)this.getLista_xi().get(i);
                }
                i++;
            }
            
            this.mediana = (temp1 + temp2) /2;
            
        }else{
            posi1 = (somatoriaFi + 1) / 2;
            
            while(temp1 == 0.0){
                if((Integer)this.getLista_F().get(i) >= posi1){
                    temp1 = (Double)this.getLista_xi().get(i);
                }
                i++;
            }
            
            this.mediana = temp1;
            
        }
        
        
        
        
        
    }
    
    public void geraDados(){
        this.setLista_xi();
        this.setLista_fi();
        super.setLista_frPorcentual();
        super.setLista_F();
        super.setLista_FPorcentual();
        super.setLista_XiFi();
        super.setMedia();
        super.setLista_xixfi();
        this.setModa();
        this.setMediana();
    }
    
    
}
