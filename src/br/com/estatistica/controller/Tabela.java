package br.com.estatistica.controller;

/**
 *
 * @author Helder Cruvinel
 */

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class Tabela {
    
    //DECLARAÇÃO DAS LISTAS QUE SERÃO UTILIZADAS PELAS CLASSES FILHAS ListaContinua E ListaDiscreta
    private List<Double> listaRol;              //ROL COM OS DADOS A SEREM ANÁLISADOS
    private List<Double> lista_xi;              //LISTA COM OS VALORES DA VARIÁVEL PESQUISADA
    protected List<Integer> lista_fi;              //LISTA COM A FRENQUÊNCIA SIMPLES DOS VALORES DA VARIÁVEL PESQUISADA
    private List<Double> lista_frPorcentual;    //LISTA COM A FRENQUÊNCIA RELATIVA PORCENTUAL DOS VALORES DA VARIÁVEL PESQUISADA
    private List<Integer> lista_F;               //LISTA COM A FRENQUÊNCIA ACUMULADA DOS VALORES DA VARIÁVEL PESQUISADA
    private List<Double> lista_FPorcentual;     //LISTA COM A FRENQUÊNCIA PORCENTUAL ACUMULADA DOS VALORES DA VARIÁVEL PESQUISADA
    private List<Double> lista_xifi;            //LISTA COM O PRODUTO DE xi POR fi
    private List<Double> lista_xixfi;           //LISTA PARA CALCULO DA VARIÂNCIA DE CADA ITEM
    private Double media;
    private List<Double> moda;
    protected Double mediana;
    
    
     /*
     *  CRIA TODAS AS LISTAS DO TIPO ARRAYLIST
     *  QUE SERÃO UTILIZADAS NO SISTEMA E ORDENA 
     *  A LISTA DO ROL
     */
    protected void setLista(List rol){
        listaRol = rol;
        Collections.sort(listaRol);
        this.lista_xi = new ArrayList<>();
        this.lista_fi = new ArrayList<>();
        this.lista_frPorcentual = new ArrayList<>();
        this.lista_F = new ArrayList<>();
        this.lista_FPorcentual = new ArrayList<>();
        this.lista_xifi = new ArrayList<>();
        this.lista_xixfi = new ArrayList<>();
        this.moda = new ArrayList<>();
    }
    
     //MÉTODO PARA RETORNAR A LISTA_ROL PARA UTILIZAÇÃO
    public List getLista_Rol(){
        return this.listaRol;
    }
    
    
    
    //MÉTODO PARA RETORNAR A LISTA_XI PARA UTILIZAÇÃO
    public List getLista_xi(){
        return this.lista_xi;
    }
    
    /*  
    *   MÉTODO ABSTRATO DELEGANDO
    *   PARA CADA OBJETO FILHO
    *   A RESPONSABILIDADE DE IMPLEMENTAR O MÉTODO
    *   VISTO QUE PARA CADA LISTA O ALGORITMO É DIFERENTE
    */
    public abstract void setLista_xi();
    
    //MÉTODO PARA ADICIONA ITENS NA LISTA_XI PARA UTILIZAÇÃO
    public void addLista_xi(Double num){
        this.lista_xi.add(num);
    }
    
    
    
    //MÉTODO PARA RETORNAR A LISTA_FI PARA UTILIZAÇÃO
    public List getLista_fi(){
        return this.lista_fi;
    }
    
    //MÉTODO PARA SETAR A LISTA_FI PARA UTILIZAÇÃO
    public abstract void setLista_fi();
    
    //MÉTODO PARA ADICIONA ITENS NA LISTA_XI PARA UTILIZAÇÃO
    public void addLista_fi(Integer i, Integer num){
        this.lista_fi.add(i, num);
    }
    
    
    
    //MÉTODO QUE RETORNA A LISTA DE FR%
    public List getLista_frPorcentual(){
        return this.lista_frPorcentual;
    }
    
    //MÉTODO PARA SETAR A LISTA DE FR PORCENTUAL
    public void setLista_frPorcentual(){
        //CALCULO DE FR%
        for(int count = 0; count < this.lista_fi.size(); count++){
            double fr = Math.round(((this.lista_fi.get(count))*100)/this.listaRol.size());
            this.lista_frPorcentual.add(count, fr);
        }
    }
    
    
    
    //MÉTODO QUE RETORNA A LISTA DE F
    public List getLista_F(){
        return this.lista_F;
    }
    
    //MÉTODO PARA SETAR A LISTA_F
    public void setLista_F(){
        //CALCULO DE F
        int soma = 0;
        for(int count = 0; count < this.lista_fi.size(); count++){
            soma += this.lista_fi.get(count);
            this.lista_F.add(count, soma);
        }
    }
    
    
    
    //MÉTODO QUE RETORNA A LISTA DE F
    public List getLista_FPorcentual(){
        return this.lista_FPorcentual;
    }
    
    //MÉTODO PARA SETAR A LISTA_F
    public void setLista_FPorcentual(){
        //CALCULO DE F%
        Double somaperc = 0.0;
        for(int count = 0; count < this.lista_frPorcentual.size(); count++){
            somaperc += this.lista_frPorcentual.get(count);
            this.lista_FPorcentual.add(count, somaperc);
        }
    }
    
    
    
    //MÉTODO QUE RETORNA LISTA_XIFI
    public List getLista_XiFi(){
        return this.lista_xifi;
    }
    
    //MÉTODO QUE SETA A LISTA_XIFI
    public void setLista_XiFi(){
        for(int i = 0; i < this.lista_fi.size(); i++){
            this.lista_xifi.add(i, (this.lista_xi.get(i) * this.lista_fi.get(i)));
        }
    }
    
    
    
    //MÉTODO QUE RETORNA A MÉDIA
    public Double getMedia(){
        return this.media;
    }
    
    //MÉTODO QUE CALCULA A MÉDIA
    public void setMedia(){
        Double somatoriaXiFi = 0.0, somatoriaFi = 0.0;
        for(int i = 0; i < this.lista_fi.size(); i++){
            somatoriaXiFi += this.lista_xifi.get(i);
            somatoriaFi += this.lista_fi.get(i);
        }
        
        //FAZ O ARREDONDAMENTO DAS CASAS DECIMAIS
        BigDecimal bd = new BigDecimal(somatoriaXiFi / somatoriaFi).setScale(2, RoundingMode.HALF_EVEN);
        
        this.media = bd.doubleValue();
    }
    
    
    
    //MÉTODO QUE RETORNA A LISTA_XIXFI
    public List getLista_xixfi(){
        return this.lista_xixfi;
    }
    
    //MÉTODO QUE SETA A LISTA_XIXFI
    public void setLista_xixfi(){
        Double xixfi = 0.0;
        BigDecimal bd;
        for(int i = 0; i < this.lista_xi.size(); i++){
            xixfi = Math.pow((this.lista_xi.get(i) - this.media), 2)*this.lista_fi.get(i);
            bd = new BigDecimal(xixfi).setScale(2, RoundingMode.HALF_EVEN);
            this.lista_xixfi.add(i, bd.doubleValue());            
        }
    }
    
    
    
    //MÉTODO PARA RETORNO DA MODA
    public List getModa(){
        return this.moda;
    }
    
    //MÉTODO PARA CALCULO DA MODA
    public void setModa(){
        Integer temp = this.lista_fi.get(0);
        
        for (Integer lista_temp : this.lista_fi) {
            if(lista_temp > temp){
                temp = lista_temp;
            }
        }
        
        for(int i = 0; i < this.lista_fi.size(); i++){
            if(this.lista_fi.get(i).equals(temp)){
                this.moda.add(this.lista_xi.get(i));
            }
        }
    }
    
    
    
    //MÉTODO ABSTRATO DELGANDO PARA CLASSES FILHAS PARA CALCULAR A MEDIANA
    public abstract void setMediana();
    
    //MÉTODO ABSTRATO DELGANDO PARA CLASSES FILHAS PARA RETORNAR A MEDIANA
    public Double getMediana(){
        return this.mediana;
    }
}
