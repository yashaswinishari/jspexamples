package Bean;

public class Employees {

    protected String firstName;
    protected String lastName;
    protected String address;

    public String getAddress() {
        address = "Delhi";
        return address;
    }

    public String getLastName() {
        lastName = "Singh";
        return lastName;
    }

    public String getFirstName() {
        firstName = "Komal";
        return firstName;
    }
}