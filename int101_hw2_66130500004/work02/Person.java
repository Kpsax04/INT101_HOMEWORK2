public class Person {
    private static int nextId=1;
    private final int id;
    private String firstname;
    private String lastname;


    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        
        Utilitor Person=new Utilitor();
        Person.testString(firstname);
        Person.testString(lastname);
        id=nextId;
        nextId++;
    }


    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    


    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("Person [id=");
        sb.append(id);
        sb.append(", firstname=");
        sb.append(firstname);
        sb.append(", lastname=");
        sb.append(lastname);
        sb.append("]");
        return sb.toString();
    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


    

    
}
