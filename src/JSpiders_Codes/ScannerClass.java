import java.util.Scanner;
class Student{
    int id;
    String name;
    int age;

    //Constructor
    Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    //Method to display student details
    void display(){
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }
}


class ScannerClass{
    public static void main(String[] args) {
        //Object Student with id, name, aage
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        System.out.print("Enter Student NAME: ");
        String name = sc.next();
        System.out.print("Enter Student AGE: ");
        int age = sc.nextInt();
        Student student = new Student(id, name, age);
        student.display();
        sc.close();

        
    }
}