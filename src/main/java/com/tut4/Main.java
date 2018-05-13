package com.tut4;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        //أنشاء كائن من الكلاس Scanner لاخذ البيانات من المستخدم
        Scanner scanner = new Scanner(System.in);



        while (true) {
            System.out.println("//////////////////بداية العملية ///////////////////");
            System.out.println("ادخل اسم الموظف: ");
            String name = scanner.nextLine();

            System.out.println("ادخل راتب الموظف: ");
            Double salary = scanner.nextDouble();

            System.out.println("ادخل اضافي الموظف: ");
            Double overtime = scanner.nextDouble();

            //انشاء كائن جديد أو سجل جديد من الكلاس Contact وتخزين قيمة name فيها ومن ثم ادخالها لكائن الموظف
            Contact contact = new Contact();
            contact.setName(name);

            //أنشاء كائن من الموظف مستخدما البيانات السابقة
            Employee employee = new Employee();
            employee.setSalary(salary);
            employee.setOvertime(overtime);
            employee.setContact(contact);

            System.out.println("الخصم  = " + employee.getHasem());
            System.out.println("المكافأة  = " + employee.getMokafaa());
            System.out.println("إجمالي الراتب  = " + employee.getTotal());
            System.out.println("التقدير  = " + employee.getTakdeer());
            System.out.println("//////////////////نهاية العملية ///////////////////");
            scanner.nextLine();
        }

    }
}
