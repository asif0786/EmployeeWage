public class Main {
    public static void main(String[] args) {

        // Generate random number
        int random = (int)(Math.random() * 3) + 0;
        int FDHour = 8;
        int PTHour = 4;
        int WPHour = 20;
        if(random == 1){
            int  DEWage = FDHour * WPHour;
            System.out.println("Daily Full Time Employee Wage = Rs."+DEWage);
        } else if (random == 2) {
            int PTWage = PTHour * WPHour;
            System.out.println("Daily Part Time Employee Wage = Rs."+PTWage);
        } else {
            System.out.println("Employee is Absent");
        }

    }
}