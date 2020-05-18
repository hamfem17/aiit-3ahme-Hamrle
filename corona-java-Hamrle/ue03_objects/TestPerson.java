package ue03_objects;


public class TestPerson
{
    public TestPerson() throws CloneNotSupportedException
    {
        Person p1 = new Person("Donald", "Duck");
        Person p2 = (Person)p1.clone();
        System.out.println(p1 + " " + p2);
        p2.setFirstname("Boris");
        System.out.println(p1 + " " + p2);
    }
    
    
    public static void main(String[] args) throws CloneNotSupportedException
    {
        new TestPerson();
    }
}


// Video Zeit = 17:18