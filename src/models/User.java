package models;


public class User {

    private String id_user;
    private String username;
    private String email;

    private String passwordUser;

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    public User(String username, String email, String passwordUser) {
        this.username = username;
        this.email = email;
        this.passwordUser=passwordUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}