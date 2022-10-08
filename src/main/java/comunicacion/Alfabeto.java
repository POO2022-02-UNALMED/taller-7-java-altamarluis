/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comunicacion;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class Alfabeto extends Pictograma{
    private ArrayList <String> letras = new ArrayList();
    private String interpretacion;
    
    
    public Alfabeto(String a, ArrayList<String> b, String c){
        super(a);
        letras = b;
        interpretacion = c;
    }
    
    
    @Override
    public String toString(){
        return String.join(", ", letras);
    }
    
    public int cantidadLetras(){
        return letras.size();
    }
    
    
    public ArrayList<String> getLetras(){
        return letras;
    }
    @Override
    public String interpretacion(){
        return interpretacion;
    }
    
    
    public void setLetras(ArrayList<String> i){
        letras = i;
    }
    
    public void setInterpretacion(String i){
        interpretacion = i;
        
    }
    
}
