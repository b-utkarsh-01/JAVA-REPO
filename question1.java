import java.util.Scanner;
import javax.swing.JOptionPane;

public class question1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //declareing subject array
        String []subject = {"ds","cgm","ada","java"};

        //declaring marks aaray
        double []marks= new double[4];

        //declaring grade
        String grade="0";

        //geting input of marks of each subject by user
        for(int i=0;i<subject.length;i++){
            System.out.print("Enter marks of "+ subject[i] + ":- ");
            marks[i] = scan.nextDouble();
        }

        double total = 0;
        double percent = 0;

        //genrating percentage
        for(int i = 0; i<subject.length;i++){
            total += marks[i];
            percent = (total/400)*100;
        }
        
        //else if statment for grade
        System.out.println();
        if(percent<=20){
            grade = "F--";
        }
        else if((percent>20)&&(percent<=30)){
            grade ="F-";
        }
        else if((percent>30)&&(percent<=50)){
            grade = "B++";
        }
        else if((percent>50)&&(percent<=70)){
            grade = "A";
        }
        else if((percent>70)&&(percent<=90)){
                grade = "A+";
        }
        else if(percent>90){
                grade = "A++";
        }

        //dialog box for output
        JOptionPane.showMessageDialog(null,
        "Your grade is :-" + grade +"\n\n"+
        "Your marks in " + subject[0] + " is:- " + marks[0] + "\n"+
        "Your marks in " + subject[1] + " is:- " + marks[1] + "\n" + 
        "Your marks in " + subject[2] + " is:- " + marks[2] + "\n" + 
        "Your marks in " + subject[3] + " is:- " + marks[3] + "\n");

        if(percent<=50){
            JOptionPane.showMessageDialog(null,"Padhle bache");
        }
        scan.close();
    }
}