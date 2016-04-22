package br.com.estatistica.controller;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Helder Cruvinel
 */
public class TabelaContinua extends Tabela{
    private List<Integer> listaClasses;
    private List<List<Double>> listaPeriodo;
    private Integer at;
    private Integer k;
    private Integer ic;
    
            
    public TabelaContinua(List lista){
        super.setLista(lista);
    }
    
    
    
    //MÉTODO PARA RETORNO DA LISTA DE CLASSES
    public List getListaClases(){        
        return this.listaClasses;
    }
    
    //MÉTODO PARA SETAR A LISTA DE CLASSES
    public void setListaClasses(){
        Integer xMax = (Integer)super.getLista_Rol().get(((Integer)super.getLista_Rol().size()) - 1);
        Integer xMin = (Integer)super.getLista_Rol().get(0);
        Integer i = 0, j = 0;
        this.at = xMax - xMin;
        
        this.k = (int)Math.sqrt(super.getLista_Rol().size());
        
        this.k = this.k - 1;
        
        this.at = this.at + 1;
        
        while((this.at % this.k != 0) || (i == 3)){
            while((this.at % this.k != 0) || (j == 2)){
                this.k++;
                j++;
            }
            this.at++;
            i++;
        }
        
        this.ic = this.at / this.k;
        
        for(i = 1; i <= this.k; i++){
            this.listaClasses.add(i);
        }
    }
    
    
    
    //MÉTODO PARA RETORNAR LISTA DE PERIODOS
    public List getListaPeriodo(){
        return this.listaPeriodo;
    }
    
    //MÉTODO PARA SETAR LISTA DE PERIODOS
    public void setListaPeriodo(){
        Double temp;
        
        temp = (Double)super.getLista_Rol().get(0);
        
        for(int i = 0; i < this.listaClasses.size(); i++){
            this.listaPeriodo.get(i).add(0, temp);
            temp += this.ic;
            this.listaPeriodo.get(i).add(1, temp);
            
        }
    }
    
    
    
    
    @Override
    public void setLista_xi() {
    }

    @Override
    public void setLista_fi() {
    }

    @Override
    public void setMediana() {
    
    }
    
}
