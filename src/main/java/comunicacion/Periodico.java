
package comunicacion;


public class Periodico extends Escrito{
    private String fecha;
    private String primicia;
    private String interpretacion;
    
    
    public Periodico(String o, String a, String b, int c, String d, String e, String f){
        super(o, a, b, c);
        fecha = d;
        primicia = e;
        interpretacion = f;
    }
        
    
    @Override
    public String toString(){
        String r = super.resumen() + "\n";
		r += fecha + "\n";
		r += primicia;
		return  r;
    }

    @Override
    public int palabrasTotales(int i){
        return 10*super.getPaginas()*i;
    }
    
    
    public String getFecha(){
        return fecha;
    }
    
    public String getPrimicia(){
        return primicia;
    }
    
    @Override
    public String interpretacion(){
        return interpretacion;
    }
    
    
    public void setFecha(String i){
        fecha = i;
    }
    
    public void setPrimicia(String i){
        primicia = i;
    }
    
    public void setInterpretacion(String i){
        interpretacion = i;
    }
}
