import java.util.Scanner;
class InnerAdmission {
        static int seatAvailable;
        String name;
        int score;

        static void setSeatAvailability(int seats) {
            seatAvailable = seats;
        }
        static void admitApplicant(String applicantName, int applicantScore) {
            boolean isEligible = applicantScore >= 60;
            if (isEligible) {
                if (seatAvailable > 0) {
                    InnerAdmission applicant = new InnerAdmission();
                    applicant.name = applicantName;
                    applicant.score = applicantScore;

                    seatAvailable--; // Decrease static seat count

                    System.out.println(applicant.name + " admitted");
                } else {
                    System.out.println(applicantName + " rejected: No seats available");
                }
            } else {
                System.out.println(applicantName + " rejected: Insufficient score");
            }
        }    
}





public class Admission {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of seats: ");
        int seats = sc.nextInt();
        InnerAdmission.setSeatAvailability(seats);
        System.out.println("Enter number of applicants: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter applicant " + (i + 1) + " name: ");
            String name = sc.nextLine();
            System.out.println("Enter applicant " + (i + 1) + " score: ");
            int score = sc.nextInt();
            sc.nextLine();
            InnerAdmission.admitApplicant(name, score);
        }
        sc.close();
    }

}


/**
 * College Admission System
 * Description
College Admission System
Scenario:
Develop a system where:
A College has a static seat capacity.
Each Applicant has instance variables: name and score.
Use local variables to decide admission based on merit (score >= 60).

Sample Input:
College.setTotalSeats(2);
College.admitApplicant("Ava", 75);
College.admitApplicant("Liam", 45);
College.admitApplicant("Noah", 80);

Expected Output:
Ava admitted
Liam rejected: Insufficient score
Noah admitted
Examples
Example 1:

Input

Enter total number of seats: 1
Enter number of applicants: 2
Enter applicant 1 name: James
Enter applicant 1 score: 89
Enter applicant 2 name: Kim
Enter applicant 2 score: 75
Output

James admitted
Kim rejected: No seats available
Example 2:

Input

Enter total number of seats: 0
Enter number of applicants: 1
Enter applicant 1 name: Elisha
Enter applicant 1 score: 50
Output

Elisha rejected: Insufficient score
Explanation

Admission based on score >= 60; total seats decrease after each admission
Constraints
Use static variable for seats, instance variable for applicants, local variable to check admission based on score
 */