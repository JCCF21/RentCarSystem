package modelo;

import java.util.Scanner;


public abstract class User {
    private int ID;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String password;
    
    
    
    public int getID(){
        return ID;
    }
    public void setID(int id){
        this.ID = id;
    }
    
    public String getFirstName(){
       return firstName;
    }
    public void setFirstName(String name){
        this.firstName = name;
    }
    
    public String getLastName(){
        return lastName;
       
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public String getEmail(){
        return email;
       
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
       
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    
    public abstract void showList(Database database, Scanner scanner);
        
}
