package Controlador;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import modelo.Database;
import modelo.Operaciones;
import modelo.User;

public class AddNewAdmin implements Operaciones {

    @Override
    public void operaciones(Database database, Scanner scanner, User user) {
        System.out.print("Ingrese su Nombre: ");
        String firstName = scanner.next();
        System.out.print("Ingrese su Apellido: ");
        String lastName = scanner.next();
        System.out.print("Ingrese su email: ");
        String email = scanner.next();
        System.out.print("Ingrese su Numero Telefonico: ");
        String phoneNumber = scanner.next();
        System.out.print("Ingrese su contrasenia: ");
        String password = scanner.next();
        System.out.print("Confirme su contrasenia: ");
        String confirmPassword = scanner.next();

        while(!password.equals(confirmPassword)){
            System.out.println("ERROR....Contrasenia diferentes.");
            System.out.print("Ingrese su contrasenia: ");
            password = scanner.next();
            System.out.print("Confirme su contrasenia: ");
            confirmPassword = scanner.next();
        }
        int acctype = 1;

        try {
            
                ResultSet result = database.getStatement().executeQuery("SELECT COUNT(*);");
                result.next();
                int ID = result.getInt("COUNT(*)") - 1;


                String insert = "  INSERT INTO users (ID,FirstName,LastName,Email, PhoneNumber,Password,Type ) VALUES" +"('"+ID+"','"+firstName+"','"+lastName+"','"+email+"','"+phoneNumber+"','"+password+"','"+acctype+"';";
                database.getStatement().execute(insert);
                System.out.println("Cuenta de Administrador creadad Exitosamente! ");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }            

 
}
