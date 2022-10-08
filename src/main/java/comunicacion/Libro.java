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
public class Libro extends Escrito{
    private String co_autor;
    private String editorial;
    private String edicion;
    private String interpretacion;
    
    
    public Libro(String o, String a, String b, int c, String d, String e, String f, String g){
        super(o, a, b, c);
        co_autor = d;
        editorial = e;
        edicion = f;
        interpretacion = g;
    }
    
    
    @Override
    public String toString(){
        String r = super.resumen() + "\n";
		r += co_autor + "\n";
		r += editorial + "\n";
		r += edicion;
		return  r;
    }
    
    @Override
    public int palabrasTotales(int i){
        return 2*super.getPaginas()*i;
    }
    
    public String getCo_autor(){
        return co_autor;
    }
    
    public String getEditorial(){
        return editorial;
    }
    
    public String getEdicion(){
        return edicion;
    }
    
    @Override
    public String interpretacion(){
        return interpretacion;
    }
    
    
    public void setCo_autor(String i){
        co_autor = i;
    }
    
    public void setEditorial(String i){
        editorial = i;
    }
    
    public void setEdicion(String i){
        edicion = i;
    }
    
    public void setInterpretacion(String i){
        interpretacion = i;
    }

}
