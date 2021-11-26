public class Cliente{
    private String nombre;
    private float presupuesto;
    private String ciudad;
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setPresupuesto(float presupuesto){
        this.presupuesto=presupuesto;
    }
    public float getPresupuesto(){
        return this.presupuesto;
    }
    public void setCiudad(String ciudad){
        this.ciudad=ciudad;
    }
    public String getCiudad(){
        return this.ciudad;
    }
    
}
