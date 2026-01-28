// Q1: Encapsulation & Validation (No subclass required)

class Student {
    private int id;
    private String name;
    private double cgpa;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getCgpa() { return cgpa; }
    public void setCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 4.0)
            this.cgpa = cgpa;
        else
            System.out.println("Invalid CGPA!");
    }
}

public class Q1Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setId(101);
        s.setName("Imran");
        s.setCgpa(3.5);
        s.setCgpa(5.0); // invalid
        System.out.println(s.getName() + " " + s.getCgpa());
    }
}
