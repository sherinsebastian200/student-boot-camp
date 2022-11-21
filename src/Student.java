import java.util.ArrayList;
import java.util.Scanner;

class stud
{
    String name;
    int rollnumber;
    String admissionnumber;
    String college;

    public stud(String name, int rollnumber, String admissionnumber, String college) {
        this.name = name;
        this.rollnumber = rollnumber;
        this.admissionnumber = admissionnumber;
        this.college = college;
    }
}
public class Student {
    public static void main(String[] args) {
        ArrayList<stud> arr = new ArrayList<stud>();
        while (true) {
            System.out.println("Select an option \n 1 - Add student \n 2 - view student details \n 3 - Search a student \n" +
                    "4 - Delete a student \n 5 - Exit");
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter student details of employee ");
                    Scanner obj = new Scanner(System.in);

                    System.out.println("Enter student name ");
                    String name = obj.next();

                    System.out.println("Enter Roll Number");
                    int roll = obj.nextInt();

                    System.out.println("Enter the Admission Number");
                    String Admissionnumber = obj.next();

                    System.out.println("Enter the College name");
                    String CollegeName = obj.next();

                    stud s = new stud(name, roll, Admissionnumber, CollegeName);
                    arr.add(s);
                    break;
                case 2:
                    System.out.println("List Student Details ");
                    for (stud stu : arr) {
                        System.out.println("Printing details of student ");
                        System.out.println(stu.name);
                        System.out.println(stu.rollnumber);
                        System.out.println(stu.admissionnumber);
                        System.out.println(stu.college);
                    }
                    break;
                case 3:
                    System.out.println("Enter the student admission number");
                    Scanner obj1 = new Scanner(System.in);
                    String adm = obj1.next();
                    for (stud e1 : arr) {
                        if (e1.admissionnumber.equals(adm)) {
                            System.out.println("Details of student with admission number " + adm + "is ");
                            System.out.println(e1.name);
                            System.out.println(e1.rollnumber);
                            System.out.println(e1.admissionnumber);
                            System.out.println(e1.college);
                            break;
                        } else {
                            System.out.println("No such student found");
                        }
                    }
                    break;






            }
        }
    }
}





