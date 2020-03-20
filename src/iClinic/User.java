package iClinic;

public class User {
    private String userID;
    private String name;
    private Boolean privileges;
    public User(String userID, String name, Boolean privileges){
        this.userID=userID;
        this.name=name;
        this.privileges=privileges;
    }
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getPrivileges() {
        return privileges;
    }

    public void setPrivileges(Boolean privileges) {
        this.privileges = privileges;
    }






}
