import java.util.HashMap;
import java.util.Scanner;

public class Students {
    /*objectives:
            1. The user shall inform this programming on the number of
               students whose results are to be keyed in
            2. For each set of mark the user shall insert a name
               this name will be used as a key for the students average grade
            3. A summation of the student's marks shall be done and the result graded.*/

    Scanner scanner = new Scanner(System.in);
    HashMap<String, String> marks_ID = new HashMap<>();

    public void getdata(){
        System.out.println("Enter the size of student population: ");
        int size = scanner.nextInt();

        // set the array
        int[][] marks = new int[size][5];
        String[] studentNames = new String[size];

        for (int n=0;n<size;n++){
            Scanner take = new Scanner(System.in);
            System.out.println("Enter name of student" + (n+1) + ": ");
            String name = take.nextLine();
            studentNames[n]= name;
            int sum=0;
            for(int x=0;x<5;x++){
                System.out.println("Key in marks for subject" + (x+1) + ": ");
                marks[n][x] = take.nextInt();
                sum+=marks[n][x]; //summation
            }
            sum/=5;
            String grade;
            if (sum<40) {
                grade = "E";
            }
            else if (sum<50){
                grade ="D";
            }
            else if (sum<60){
                grade ="C";
            }
            else if (sum<70){
                grade ="B";
            }
            else{
                grade ="A";
            }
            marks_ID.put(name,grade);
        }
    }
    public void displayAll(){
        System.out.println("List of students with their respective grades\n");
        for(String key : marks_ID.keySet()){
            System.out.println(key + "\t" + marks_ID.get(key));
        }
    }
}
