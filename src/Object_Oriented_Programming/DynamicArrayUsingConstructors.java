package Object_Oriented_Programming;

public class DynamicArrayUsingConstructors {
    public static class StudentData{
        String name;
        int rno;
        int[] marks;

        StudentData(int s){
            marks=new int[s];
        }

        StudentData(int[] arr){
            marks=arr;
        }

        void print(){
            System.out.println("Name: "+name);
            System.out.println("Roll No: "+rno);
            for (int i=0; i<marks.length; i++){
                System.out.println("Marks in Subject "+(i+1)+": "+marks[i]);
            }
        }
    }
    public static void main(String[] args) {
        StudentData s1 = new StudentData(4);
        s1.name="Ujjawal Ranjan";
        s1.rno=43001;
        s1.marks[0]=82;
        s1.marks[1]=88;
        s1.marks[2]=92;
        s1.marks[3]=85;
        s1.print();

        int[] array = {95, 81, 87};
        StudentData s2 = new StudentData(array);
        s2.name = "Mayank Singh Sajwan";
        s2.rno=42991;
        s2.print();
        s2.marks[1]=84;
        System.out.println("Marks after updation: ");
        s2.print();
    }
}
