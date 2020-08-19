package EmployeeList;

public class Employee{

    public String name;
    public String position;
    public double salary;

    public Employee(String name, String position, double salary){
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void changeSalary(double percent){
        if(percent > 0){
            salary = salary*(1+percent/100);
        } else if(percent < 0){
            salary = salary*(1-percent/100);
        }
    }
    
    public void setSalary(double salary){
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public String getPosition(){
        return position;
    }

    public double getSalary(){
        return salary;
    }

    public String toString(){
        return name + ": Employee, $" + salary + "/year";
    }
}