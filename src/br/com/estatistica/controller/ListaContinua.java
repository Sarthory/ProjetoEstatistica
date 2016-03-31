package br.com.estatistica.controller;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Helder Cruvinel
 */
public class ListaContinua extends Lista{
    private List<Double> listaClasses;
    private List<Double> listaPeriodo;
            
    public ListaContinua(List lista){
        super.setLista(lista);
    }

    @Override
    public void setLista_xi() {
    }

    @Override
    public void setLista_fi() {
    }
    
}
