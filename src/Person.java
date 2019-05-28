public class Person {
    String firstName;
    String lastName;
    int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastname) {
        this.lastName = lastname;
    }

    public void setAge(int age) {
        if (age < 0 && age > 100) {
            this.age = 0;
        }
        this.age = age;
    }

    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        } else {
            return false;
        }
    }
    public String getFullName(){
        String fullName = firstName+lastName;
        if(firstName.isEmpty()&&lastName.isEmpty())
        {
            return " ";
        }
        else if(firstName.isEmpty())
        {
            return lastName;
        }
        if(lastName.isEmpty())
        {
            return firstName;
        }
        return fullName;
    }

    public static void main(String[] args)
    {
        Person person = new Person();
        person.setFirstName("Smith");
        person.setLastName(" ");
        person.setAge(18);
        System.out.println("fullname = "+person.getFullName());
        System.out.println("teen = "+person.isTeen());

    }
    }
