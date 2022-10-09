
package comunicacion;


public class Tesis extends Escrito{
    private String idea;
    private String[] argumentos;
    private String conclusion;
    private String referencias;
    private String interpretacion;
    
    public Tesis(String o, String a, String b, int c, String d, String[] l, String e, String f, String g){
        super(o, a, b, c);
        idea = d;
        argumentos = l;
        conclusion = e;
        referencias = f;
        interpretacion = g;
    }
        
    
    @Override
    public String toString(){
        String r = super.resumen() + "\n";
		r += idea + "\n";
		r += argumentos.length + "\n";
		r += conclusion + "\n";
                r += referencias;
		return  r;
    }
    
    @Override
    public int palabrasTotales(int i){
        return 5*super.getPaginas()*i;
    }

    
    public String getIdea(){
        return idea;
    }
    
    public String[] getArgumentos(){
        return argumentos;
    }
    
    public String getConclusion(){
        return conclusion;
    }
    
    public String getReferencias(){
        return referencias;
    }
    
    @Override
    public String interpretacion(){
        return interpretacion;
    }
    
    
    public void setIdea(String i){
        idea = i;
    }
    
    public void setArgumentos(String[] i){
        argumentos = i;
    }
    
    public void setConclusion(String i){
        conclusion = i;
    }
    
    public void setReferencias(String i){
        referencias = i;
    }
    
    public void setInterpretacion(String i){
        interpretacion = i;
    }
    
}
