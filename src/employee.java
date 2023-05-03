class employee {
       int FDH,TWD,WPH, salary, PTH,random;
        //double random;

        public int Random()
        {
            random = (int)Math.floor(Math.random()* 3 + 0);
            return random;
        }
        public int DailyWage()
        {
        salary = WPH * FDH;
        return salary;
       }

        public int FullTimeSalary()
        {
        salary = WPH * FDH * TWD;
        return salary;
        }

        public int PartTimeSalary()
        {
        salary = WPH * PTH * TWD;
        return salary;
        }

    public static void main(String[] args) {
        employee e1 = new employee();
        e1.FDH = 8;
        e1.PTH = 4;
        e1.WPH = 20;
        e1.TWD = 20;
        System.out.println(e1.Random());
        System.out.println("Daily Wage of Employee is : "+e1.DailyWage());
        switch (e1.random){
            case 0:
                System.out.println("Employee is Absent");
                break;
            case 1:
                System.out.println("Monthly Full Time Employee Wage = Rs."+e1.FullTimeSalary());
                break;
            case 2:
                System.out.println("Monthly Part Time Employee Wage = Rs."+e1.PartTimeSalary());
                break;
        }
    }
}

