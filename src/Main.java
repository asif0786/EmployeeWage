public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome To Employee Wage Computation Program");
        // Generate random number
        int random = (int) (Math.floor(Math.random() * 10) % 2);

        if(random == 1){
            System.out.println("Employee is Present");
        }else {
            System.out.println("Employee is Absent");
        }

    }
}