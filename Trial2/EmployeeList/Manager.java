package EmployeeList;

public class Manager{
    
    public String name;
    public String position;
    public String branch;
    public double salary;

    public Manager(String name, String position, String branch, double salary){
        this.name = name;
        this.position = position;
        this.branch = branch;
        this.salary = salary;
    }

    public void changeSalary(double percent){
        if(percent > 0){
            salary = salary*(1+percent/100);
        } else if(percent < 0){
            salary = salary*(1-percent/100);
        }
    }
    
    public void changeBranch(String branch){
        this.branch = branch;
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
        return name + ": Manager, $" + salary + "/year, " + branch + " Branch";
    }
}