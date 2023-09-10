import java.util.Scanner;

public class Gradecal {
    public static void displayNotification() {
        System.out.println();
        System.out.println("=======================POINTS YOU SHOULD REMEMBER========================");
        System.out.println();
        System.out.println("-> ||MAXIMUM MARKS SHOULD NOT BE LESS THAN `0` AND MORE THAN `100`.||");
        System.out.println("-> ||MINIMUM MARKS TO PASS IN EACH SUBJECT IS `33`.||");
        System.out.println("-> ||MINIMUM 40% SHOULD BE OBTAINED OF TOTAL MARKS.||");
        System.out.println("-> ||GRADING PATTERN BE LIKE.||");
        System.out.println();
        System.out.println("     * 100 - 90 --->  GRADE A+");
        System.out.println("     *  89 - 80 --->  GRADE A");
        System.out.println("     *  79 - 70 --->  GRADE B+");
        System.out.println("     *  69 - 60 --->  GRADE B");
        System.out.println("     *  59 - 50 --->  GRADE C");
        System.out.println("     *  49 - 40 --->  GRADE D");
        System.out.println("     *  39 -  0 --->  FAIL");
    }

    public static void printGrades(int grade, int passMark) {
        if (passMark == 0) {
            System.out.println("FAIL");
            return;
        }
        switch (grade) {
            case 10:
                System.out.println(" YOU GOT --> A+ Grade");
                break;
            case 9:
                System.out.println(" YOU GOT --> A+ Grade");
                break;
            case 8:
                System.out.println(" YOU GOT --> A Grade");
                break;
            case 7:
                System.out.println(" YOU GOT --> B+ Grade");
                break;
            case 6:
                System.out.println(" YOU GOT--> B Grade");
                break;
            case 5:
                System.out.println(" YOU GOT--> C Grade");
                break;
            case 4:
                System.out.println(" YOU GOT --> D Grade");
                break;
        }
    }

    public static void main(String[] args) {

        displayNotification();

         int Subjects;
         Scanner sn = new Scanner(System.in);
         System.out.println("ENTER THE NUMBER OF SUBJECTS =>");
         Subjects = sn.nextInt();        
         float marks[] = new float[Subjects];

         System.out.println("ENTER MARKS OF EACH SUBJECT: ");

             float total= 0;
             int passMark= 1;
 
         for (int i = 0; i < Subjects; i++) {           
            marks[i] = sn.nextFloat();
         
            if (marks[i] > 100 || marks[i] < 0) {
                System.out.println("PlEASE ENTER VALID MARK");
                marks[i--] = 0;
                continue;
            }
           
            total += marks[i];
          
            if (marks[i] < 33) {
                passMark = 0;
            }
        }

        float averagePercetage = (total / Subjects);

        printGrades((int) (averagePercetage / 10), passMark);
    }
}