/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estatistica.util;

import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Helder
 */
public class GraficoDiscreta extends JPanel{

    public GraficoDiscreta() throws HeadlessException {
        
        DefaultCategoryDataset pieDataSet = new DefaultCategoryDataset();
        
        pieDataSet.addValue(new Integer(10), "A", "teste");
        pieDataSet.addValue(new Integer(20), "B", "teste");
        pieDataSet.addValue(new Integer(5), "C", "teste");
        pieDataSet.addValue(new Integer(50), "D", "teste");
        pieDataSet.addValue(new Integer(8), "E", "teste");
        
        JFreeChart grafico = ChartFactory.createBarChart3D("Teste", null, null, pieDataSet);
        
        this.add(new ChartPanel(grafico));
        
    }
    
    public static void main(String[] args){
        new GraficoDiscreta().setVisible(true);
    }
    
}
