package interfaces;

public class Customer {
	private int ID;
    private String firstname;
    private String lastname;

    public Customer()
    {

    }

    public Customer(int iD, String firstname, String lastname) {
        ID = iD;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


}
