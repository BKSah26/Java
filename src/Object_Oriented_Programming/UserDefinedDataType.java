package Object_Oriented_Programming;

public class UserDefinedDataType {
    public static class Student{
        String name;
        int RollNo;
        double CGPA;
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Gopal Balyan";
        s1.RollNo = 42321;
        s1.CGPA = 7.2;

        Student s2 = new Student();
        s2.name = "Siddharth Singh";
        s2.RollNo = 42751;
        s2.CGPA = 6.5;

        Student s3 = new Student();
        s3.name = "Amit Poonia";
        s3.RollNo = 42098;
        s3.CGPA = 8.5;

        System.out.println("Name: "+ s1.name);
        System.out.println("Roll No: "+ s1.RollNo);
        System.out.println("CGPA: "+ s1.CGPA);
    }
}
