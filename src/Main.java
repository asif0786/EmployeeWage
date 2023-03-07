public class Main {
    public static void main(String[] args) {

        // Generate random number
        int random = (int)(Math.random() * 2) + 0;
        int FDHour = 8;
        int WPHour = 20;
        if(random == 1){
            int  DEWage = FDHour * WPHour;
            System.out.println("Daily Employee Wage = Rs."+DEWage);
        }else {
            System.out.println("Employee is Absent");
        }

    }
}