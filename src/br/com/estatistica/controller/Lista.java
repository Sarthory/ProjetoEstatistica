package br.com.estatistica.controller;

/**
 *
 * @author Helder Cruvinel
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lista {
    
    //DECLARAÇÃO DA LISTA QUE SERÁ UTILIZADA PELAS CLASSES FILHAS ListaContinua E ListaDiscreta
    protected List<Double> listaPrincipal; // = new ArrayList<>();    private List<Double> listaFi;
    private List<Double> listaFrPercentual;
    private List<Double> listaF;
    private List<Double> listaFPercentual;
    
    //CONSTRUTOR PARA CRIA LISTA AUTOMATICAMENTE JUNTO COM O OBJETO
    public Lista(){
        this.setLista();
    }
    
    //CRIA OBJETO DO TIPO ARRAYLIST
    private void setLista(){
        listaPrincipal = new ArrayList<>();
    }
    
    
    //MÉTODO PARA ADICIONAR VALORES NA LISTA
    public void addLista(Double valor){
        this.listaPrincipal.add(valor);
    }
    
     //MÉTODO PARA RETORNAR A LISTA PARA UTILIZAÇÃO
    public List getLista(){
        return this.listaPrincipal;
    }
    
    //MÉTODO PARA ORDENAR A LISTA
    public void ordenaLista(){
        Collections.sort(this.listaPrincipal);
    }
    
}
