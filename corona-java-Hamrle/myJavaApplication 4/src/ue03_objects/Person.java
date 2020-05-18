package ue03_objects;


public class Person extends Object implements Cloneable
{
    private String firstname;
    private final String surname;

    public Person(String firstname, String surname)
    {
        if(firstname == null || firstname.isBlank())
        {
            throw new IllegalArgumentException("invalid firstname");
        }
        if(surname == null || surname.isBlank())
        {
            throw new IllegalArgumentException("invalid surname");
        }
        
        this.firstname = firstname;
        this.surname = surname;
    }

    public String getFirstname()
    {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname()
    {
        return surname;
    }

    @Override
    public String toString()
    {
        return surname + " " + firstname;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
