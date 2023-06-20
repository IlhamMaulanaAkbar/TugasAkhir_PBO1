/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataSet;
import java.util.ArrayList;
/**
 *
 * @author asus
 */
public class dataSetAdmin {
    private ArrayList<String> email;
    private ArrayList<Integer> idUser;
    private ArrayList<String> userName;
    private ArrayList<String> password;
    
    public dataSetAdmin(){
        email = new ArrayList<String>();
        idUser = new ArrayList<Integer>();
        userName = new ArrayList<String>();
        password = new ArrayList<String>();
    }
    
    public void tambahEmail (String value){
        email.add(value);
    }
    
    public ArrayList<String> getdataSetemail(){
        return this.email;
    }
    
    public void tambahidUser (int x){
        idUser.add(x);
    }
    
    public ArrayList<Integer> getdataSetidUser(){
        return this.idUser;
    }
    
    public void tambahuserName (String value){
        userName.add(value);
    }
    
    public ArrayList<String> getdataSetuserName(){
        return this.userName;
    }
    
    public void tambahpassword(String value){
        password.add(value);
    }
    
    public ArrayList<String> getdataSetpassword(){
        return this.password;
    }
    
    public void tambahAdmin(String email, int idUser, String userName, String password){
        this.email.add(email);
        this.idUser.add(idUser);
        this.userName.add(userName);
        this.password.add(password);
    }
}
