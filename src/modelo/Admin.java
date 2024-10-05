package modelo;

import java.util.Scanner;

import Controlador.AddNewAdmin;


public class Admin extends User{

  private Operaciones[] operacion = new Operaciones[] {new AddNewAdmin()};

    public Admin(){
        super();
    }
    
    @Override
    public void showList(Database database, Scanner scanner){
      System.out.println("\n1. Agregar Nuevo Vehiculo\t\t2. Ver Vehiculos");
      System.out.println("3. Modificar Vehiculo\t\t4. Remover Vehiculos");
      System.out.println("5. agregar Nuevo Administrador\t\t6. Mostar Historial de Rentas");
      System.out.println("7. Salir\n");

      int i = scanner.nextInt();
      operacion[i].operaciones(database, scanner, this);
      
    }
}
