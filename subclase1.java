public class Subclase1 extends Base{
    private int unidades;
    private float precio;
    private boolean aprobado;
    public Subclase1(int u,float p, boolean a){
        this.unidades=u;
        this.precio=p;
        this.aprobado=a;
    }
    public void setUnidades(int unidades){
        this.unidades=unidades;
    }//cierra setUnidades
    public void setPrecio(float precio){
        this.precio=precio;
    }//cierra setPrecio
    public void setAprobado(boolean aprobado){
        this.aprobado=aprobado;
    }//cierra setAprobado
    
    public int getUnidades(){
        return this.unidades;
    }//cierra getUnidades
    public float getPrecio(){
        return this.precio;
    }//cierra getPrecio
    public boolean getAprobado(){
        return this.aprobado;
    }//cierra getAprobado
    
    
}//cierra clase
