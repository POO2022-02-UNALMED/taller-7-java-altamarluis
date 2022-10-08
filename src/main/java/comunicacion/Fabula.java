
package comunicacion;


public class Fabula extends Escrito{
    private String ensenanza;
    private String interpretacion;
    
    
    public Fabula(String o, String a, String b, int c, String d, String e){
        super(o, a, b, c);
        ensenanza = d;
        interpretacion = e;
    }
    
    @Override
    public String toString(){
        String r = super.resumen() + "\n";
		r += ensenanza;
		return  r;
    }
    
    @Override
    public int palabrasTotales(int i){
        return super.getPaginas()*i;
    }
    
    public String getEnsenanza(){
        return ensenanza;
    }
    @Override
    public String interpretacion(){
        return interpretacion;
    }
    
    
    public void setEnsenanza(String i){
        ensenanza = i;
    }
 
    public void setInterpretacion(String i){
        interpretacion = i;
    }
}
