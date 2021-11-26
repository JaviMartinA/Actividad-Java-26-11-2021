public class Main{
    public static void main (String [] args) throws Exception{
        Cliente cliente= new Cliente();
        cliente.setNombre("Carmelo");
        cliente.setApellido("Escribano");
        cliente.setCiudad("Madrid");
        System.out.println("El cliente es "+cliente.getNombre());
        System.out.println("El apellido es "+cliente.getApellido());
        System.out.println("La ciudad es "+cliente.getCiudad());
        cliente.setCiudad("Sevilla");
        System.out.println("Ahora la ciudad es "+cliente.getCiudad());
        cliente.setEmpresa("Indra");
        System.out.println("El cliente "+cliente.getNombre()+" "+cliente.getApellido()+" está trabajando en "+cliente.getEmpresa()+" en "+cliente.getCiudad()+" y tiene un presupuesto de 10.000 euros");
         Cliente cliente2= new Cliente();
        cliente2.setNombre("Diego");
        cliente2.setApellido("Gomez");
        cliente2.setCiudad("Valencia");
        cliente2.setEmpresa("Vass");
        System.out.println("El cliente "+cliente2.getNombre() +" "+ cliente2.getApellido()+" está trabajando en "+cliente2.getEmpresa()+" en "+cliente2.getCiudad()+" y tiene un presupuesto de 12.000 euros");
        
    }
}
