package MenuUtama;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author asus
 */
public class Admin {
    
    private String email;
    private int idUser;
    private String userName;
    private String password;

    public Admin(String email, int idUser, String userName, String password) {
        this.email = email;
        this.idUser = idUser;
        this.userName = userName;
        this.password = password;
    }

    // Getter methods
    public String getEmail() {
        return email;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    // Setter methods
    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
