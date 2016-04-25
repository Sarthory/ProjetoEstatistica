package br.com.estatistica.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Helder Cruvinel
 */
public class TabelaContinua extends Tabela{
    private double at;
    private int k;
    private int ic;
    private List<Integer> Classes;
    private List<List<Double>> Periodo;
    
    
            
    public TabelaContinua(){
        super.setLista();
        this.Classes = new ArrayList<>();
        this.Periodo = new ArrayList<>();
    }
    
    
    
    //MÉTODO PARA RETORNAR A VARIÁVEL AT
    public Double getAt(){
        return this.at;
    }
    
    //MÉTODO PARA SETAR A VARIÁVEL AT
    private void setAt(){
        
        Double xMax = (Double)super.getLista_Rol().get((super.getLista_Rol().size()) - 1);
        Double xMin = (Double)super.getLista_Rol().get(0);
        this.at = xMax - xMin;
        System.out.println("*******TESTE AQUI TESTE******* AT " + this.at);
        
    }
    
    
    
    //MÉTODO PARA RETORNAR A VARIÁVEL K
    public Integer getK(){
        return this.k;
    }
    
    //MÉTODO PARA SETAR A VARIÁVEL K
    private void setK(){
        
        this.k = ((Double)Math.sqrt(super.getLista_Rol().size())).intValue();
        System.out.println("*******TESTE AQUI TESTE******* K " + this.k);
        
    }
    
    
    
     //MÉTODO PARA RETORNAR A VARIÁVEL IC
    public Integer getIc(){
        return this.ic;
    }
    
    //MÉTODO PARA SETAR A VARIÁVEL IC
    private void setIc(){
        int i = 0, j = 0;
        int kTemp;
        double atTemp;
        double resultTempDouble;
        int resultTempInteger;
        
        kTemp = this.k;
        atTemp = this.at;
        
        ++atTemp;
        --kTemp;
        
        System.out.println("KTemp = " + kTemp);
        System.out.println("ATTemp = " + atTemp);
        
        
        
        while(i != 4){
            i++;
            while(j != 3){ 
                
                resultTempDouble = atTemp / kTemp;
                resultTempInteger = (int)resultTempDouble;
                
                if(resultTempDouble == resultTempInteger){
                    
                    this.ic = resultTempInteger;
                    i = 4;
                    j = 3;
                    System.out.println("\n\n*******************TESTANDO***************");
                    System.out.println("K = " + this.k);
                    System.out.println("AT = " + this.at);
                    System.out.println("KTemp = " + kTemp);
                    System.out.println("ATTemp = " + atTemp);
                    System.out.println("RESULTTEMPDOUBLE = " + resultTempDouble);
                    System.out.println("RESULTTEMPINTEGER = " + resultTempInteger);
                    System.out.println("IC = " + this.ic);
                    
                }else{
                    kTemp++;
                    j++;
                }                
            }
            j = 0;
            kTemp -= 3;
            atTemp++;      
        }
        System.out.println("*******TESTE AQUI TESTE******* IC " + this.ic);
    }
    
    
    
    //MÉTODO PARA RETORNO DA LISTA DE CLASSES
    public List getClases(){        
        return this.Classes;
    }
    
    //MÉTODO PARA SETAR A LISTA DE CLASSES
    public void setClasses(){
        Integer i;
        
        for(i = 0; i < this.k; i++){
            this.Classes.add(i+1);
        }
        Collections.sort(this.Classes);
        System.out.println("*****************TESTANDO******************");
        System.out.println("LISTA DE CLASSES = " + this.Classes.toString());
    }
    
    
    
    
    //MÉTODO PARA RETORNAR LISTA DE PERIODOS
    public List getPeriodo(){
        return this.Periodo;
    }
    
    //MÉTODO PARA SETAR LISTA DE PERIODOS
    public void setPeriodo(){
        int i;
        ArrayList<Double> listaTemp;
        double varTemp = (Double)super.getLista_Rol().get(0);
        
        for(i = 0; i < this.k; i++){
            
            listaTemp = new ArrayList<>();
            listaTemp.add(0, varTemp);
            listaTemp.add(1, (varTemp+=8));
            
            this.Periodo.add(listaTemp);
        }
        
        System.out.println("*****************TESTANDO******************");
        System.out.println("LISTA DE CLASSES = " + this.Periodo.toString());
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

    @Override
    public void geraDados() {
        this.setAt();
        this.setK();
        this.setIc();
        this.setClasses();
        this.setPeriodo();
    }
    
}
