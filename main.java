public class Main{
    public static void main (String [] args) throws Exception{
        Cliente cliente= new Cliente();
        cliente.setNombre("Indra");
        cliente.setCiudad("Madrid");
        cliente.setPresupuesto(10000)
        System.out.println("El cliente es "+cliente.getNombre());
        System.out.println("El presupuesto es "+cliente.getPresupuesto());
        System.out.println("La ciudad es "+cliente.getCiudad());
        cliente.setCiudad("Sevilla");
        System.out.println("Ahora la ciudad es "+cliente.getCiudad());
        
        System.out.println("El cliente "+cliente.getNombre()+" en "+cliente.getCiudad()+" tiene un presupuesto de "+cliente.Presupuesto());
         Cliente cliente2= new Cliente();
        cliente2.setNombre("Vass");
        cliente2.setCiudad("Valencia");
        cliente2.setPresupuesto(12000)
        System.out.println("El cliente "+cliente2.getNombre() +" en "+cliente2.getCiudad()+" y tiene un presupuesto de "+cliente2.getPresupuesto());
        
    }
}
