package api;

public class Lab21May25_EmployeePOJO {
    private int Id;
    private String name;
    private double salary;
    public void Lab21May25_EmployeePOJO(int id, String name, double salary){
        this.Id= id;
        this.name= name;
        this.salary= salary;
    }
    public void Lab21May25_EmployeePOJO(){}

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //Optional : toString() for easy display

    public String toString(){
        return "Employee{id = "+ Id+", name : '"+name+"' , salary = "+salary+"}";
    }
}
