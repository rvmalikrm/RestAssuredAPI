package api;

public class PojoExample {
    public static void main(String[] args) {
        Lab21May25_EmployeePOJO pojoobj= new Lab21May25_EmployeePOJO();
        pojoobj.setId(101);
        pojoobj.setName("Ravi");
        pojoobj.setSalary(200000d);
        System.out.println("Employee Name : " + pojoobj.getName());
        System.out.println(pojoobj);
    }
}
