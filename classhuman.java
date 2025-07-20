package OOPS;

public class classhuman {
    public static class Student{
        int rolno;
       private String name;

        Student(int rolno, String name){
            this.rolno = rolno;
            this.name =name;
        }
    }
    public static void main(String[] args) {
       
        Student kunal = new Student(1, "Kunal Kushwaha");
        kunal.rolno = 19;
        kunal.name = "Kunal Kushwaha";
        System.out.println(kunal.rolno + " " + kunal.name);
    }
}
