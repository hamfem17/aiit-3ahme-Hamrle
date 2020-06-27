package ue03_objects;

import java.util.Objects;


public class Person implements Cloneable
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
    public Person clone()
    {
        try
        {
            //return new Person(firstname, surname);
            return (Person)super.clone();
        }catch (Exception ex)
        {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.firstname);
        hash = 79 * hash + Objects.hashCode(this.surname);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (!Objects.equals(this.firstname, other.firstname)) {
            return false;
        }
        if (!Objects.equals(this.surname, other.surname)) {
            return false;
        }
        return true;
    }

 
}
