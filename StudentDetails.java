import java.util.Scanner;

class Student{
    String name;
    int age ;
    double []marks;

    void setName(String nameOfStudent){
        this.name = nameOfStudent;
    }

    void setAge(int ag){
        this.age = ag;
    }

    void setMarks(int n){
        this.marks = new double[n];
    }

    void display (){
        System.out.println(this.name + "  " + this.age );
    }
} 

public class StudentDetails {
    public static void main(String [] args){
        Student[] s = new Student[1];
Scanner scanner = new Scanner(System.in);

        for(int i = 0 ;i<1;i++){
            s[i] = new Student();
            System.out.println("Enter name for student " + (i+1) + ":");
            String name = scanner.nextLine();
            s[i].setName(name);
            System.out.println("Enter age for student " + (i+1) + ":");
            int age = scanner.nextInt();
            s[i].setAge(age);
            
            System.out.println(s[i].name);
            scanner.nextLine();
        }

        s[0].display();
    }
}
