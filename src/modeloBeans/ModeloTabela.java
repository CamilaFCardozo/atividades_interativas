/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBeans;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class ModeloTabela extends AbstractTableModel{

 
    private ArrayList linhas=null;// Array simples pode armazenar qualquer objeto
    private String[]colunas=null;
    
    
    public ModeloTabela(ArrayList lin, String[] col){
        setLinhas(lin);
        setColunas(col);

    }
           /**
         * @return the linhas
         */
        public ArrayList getLinhas() {
            return linhas;
        }

        /**
         * @param linhas the linhas to set
         */
        public void setLinhas(ArrayList linhas) {
            this.linhas = linhas;
        }

        /**
         * @return the colunas
         */
        public String[] getColunas() {
            return colunas;
        }

        /**
         * @param colunas the colunas to set
         */
        public void setColunas(String[] colunas) {
            this.colunas = colunas;
        }
        
        public int getColumnCount(){
            return colunas.length;
        
        }
         public int getRowCount(){
            return linhas.size();
        
        }
         public String getColumnRanking(int numCol){
             return colunas[numCol];
         
         }
         public Object getValueAt(int numLin, int numCol){//Monta nossa tabela
             Object[] linha = (Object[])getLinhas().get(numLin);
             return linha[numCol];
         
         }
           public String getColumnName(int columnIndex) {
        // Retorna o conteúdo do Array que possui o nome das colunas
        // no índice especificado.
        return colunas[columnIndex];
    };


}
