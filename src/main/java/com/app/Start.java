package com.app;

public class Start {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.id = 1;
        emp1.code = 1460;
        emp1.name = "علي";
        emp1.salary = 17320.75;
        emp1.master = "دكتوراه";



        Employee emp2 = new Employee();
        emp2.id = 2;
        emp2.code = 1590;
        emp2.name = "فهد";
        emp2.salary = 12000.75;
        emp2.master = "دكتوراه";


        Employee emp3 = new Employee();
        emp3.id = 3;
        emp3.code = 1475;
        emp3.name = "عمر";
        emp3.salary = 9000;
        emp3.master = "ماجستير";


        Employee emp4 = new Employee();
        emp4.id = 4;
        emp4.code = 1212;
        emp4.name = "سامي";
        emp4.salary = 11462;
        emp4.master = "دبلوم عالي";


        Employee emp5 = new Employee();
        emp5.id = 5;
        emp5.code = 1010;
        emp5.name = "سلمان";
        emp5.salary = 11500;
        emp5.master = "ابتدائي";


        Employee emp6 = new Employee();
        emp6.id = 6;
        emp6.code = 7565;
        emp6.name = "سالم";
        emp6.salary = 7588.50;
        emp6.master = "دبلوم";


        Employee emp7 = new Employee();
        emp7.id = 7;
        emp7.code = 4451;
        emp7.name = "فيصل";
        emp7.salary = 4000;
        emp7.master = "بكالوريوس";

        Employee emp8 = new Employee();
        emp8.id = 8;
        emp8.code = 5214;
        emp8.name = "فايز";
        emp8.salary = 7600;
        emp8.master = "متوسط";


        Employee emp9 = new Employee();
        emp9.id = 9;
        emp9.code = 5555;
        emp9.name = "حجي";
        emp9.salary = 11320.75;
        emp9.master = "ثانوي";


        Employee emp10 = new Employee();
        emp10.id = 10;
        emp10.code = 4444;
        emp10.name = "يوسف";
        emp10.salary = 90320.75;
        emp10.master = "دبلوم";


        Employee[] arar = new Employee[10];
        arar[0] = emp1;
        arar[1] = emp2;
        arar[2] = emp3;
        arar[3] = emp4;
        arar[4] = emp5;
        arar[5] = emp6;
        arar[6] = emp7;
        arar[7] = emp8;
        arar[8] = emp9;
        arar[9] = emp10;

        for (int i=0 ; i<10 ; i++){

            System.out.println(arar[i].name);
            System.out.println(arar[i].salary);
            System.out.println(arar[i].code);
            System.out.println(arar[i].id);
            System.out.println(arar[i].master);
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
        }


    }
}
