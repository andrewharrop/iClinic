package iClinic;

public class GetImage {
    private int imageNumber;
    private User user;

    public GetImage(int imageNumber, User user){
        this.imageNumber = imageNumber;
        this.user = user;
    }

    public int getImageNumber() {
        return imageNumber;
    }

    public void setImageNumber(int imageNumber) {
        this.imageNumber = imageNumber;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
