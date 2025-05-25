package bai1_composite_3;

public class Main {
    public static void main(String[] args) {
        EmployeeComponent dev1 = new Employee("Tran Tuan Minh", "Developer");
        EmployeeComponent dev2 = new Employee("Tran Dich Hang", "Developer");

        Manager devManager = new Manager("Vuong Nguyen", "Dev Manager");
        devManager.add(dev1);
        devManager.add(dev2);

        EmployeeComponent tester = new Employee("Nguyen Vuong Linh", "Tester");

        Manager ceo = new Manager("Tran Thuy Tien", "CEO");
        ceo.add(devManager);
        ceo.add(tester);

        ceo.showDetails("");
    }
}

