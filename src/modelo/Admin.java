package modelo;


public class Admin extends User{
    public Admin(){
        super();
    }
    
    @Override
    public void showList(){
      System.out.println("\n1. Agregar Nuevo Vehiculo\t\t2. Ver Vehiculos");
      System.out.println("3. Modificar Vehiculo\t\t4. Remover Vehiculos");
      System.out.println("5. agregar Nuevo Administrador\t\t6. Mostar Historial de Rentas");
      System.out.println("7. Salir\n");
      
    }
}
