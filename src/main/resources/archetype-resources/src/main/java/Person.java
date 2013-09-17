package ${package};

/**
 * <p>
 * Domain object representing information about a person.
 * </p>
 *
 * @author Chris Schaefer
 */
public class Person {
    private String firstName;
    private String lastName;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return "firstName: " + firstName + ", lastName: "  + lastName;
    }
}
