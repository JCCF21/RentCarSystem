package modelo;
import java.util.Scanner;


public class Client extends User {

  public Client(){
        super();
    }
    
    @Override
    public void showList(Database database, Scanner scanner){
      System.out.println("\n1.Ver Vehiculos\t\t2. Rentar Vehiculo");
      System.out.println("3. Retornar Vehiculo\t\t4. Ver mis Rentas");
      System.out.println("5. Actualizar Mi Informacion");
      System.out.println("6. Salir\n");
    }
}
