package iClinic;

public class GetDocument {
    private int documentNumber;
    private User user;
    private boolean edit;

    public GetDocument(int documentNumber, User user, boolean edit){
        this.documentNumber = documentNumber;
        this.user=user;
        this.edit=edit;
    }

    public int getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(int documentNumber) {
        this.documentNumber = documentNumber;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isEdit() {
        return edit;
    }

    public void setEdit(boolean edit) {
        this.edit = edit;
    }
}
