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

            }
        }
    }
}





