package Object_Oriented_Programming;

class Students{
    String name;
    private int rno;
    double cgpa;

    //Setter
    void setRNo(int x){
        rno = x;
    }

    //Getter
    private void print(){
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rno);
        System.out.println("CGPA: "+cgpa);
    }
    public void newPrint(){
        print();
    }
}

public class PrivateKeyword {
    public static void main(String[] args) {
        Students s1 = new Students();
        //s1.print();
        //Since print() is a private method, it cannot be called.
        s1.newPrint();

        s1.name="Arpit Bhandari";
        s1.cgpa=8.9;
        s1.setRNo(45);
        s1.newPrint();
    }
}
