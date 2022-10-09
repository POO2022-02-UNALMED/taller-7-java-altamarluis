/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comunicacion;


/**
 *
 * @author LENOVO
 */
public class Alfabeto extends Pictograma{
    private String[] letras;
    private String interpretacion;
    
    
    public Alfabeto(String a, String[] b, String c){
        super(a);
        letras = b;
        interpretacion = c;
    }
    
    
    @Override
    public String toString(){
        return String.join(", ", letras);
    }
    
    public int cantidadLetras(){
        return letras.length;
    }
    
    
    public String[] getLetras(){
        return letras;
    }
    @Override
    public String interpretacion(){
        return interpretacion;
    }
    
    
    public void setLetras(String[] i){
        letras = i;
    }
    
    public void setInterpretacion(String i){
        interpretacion = i;
        
    }
    
}
