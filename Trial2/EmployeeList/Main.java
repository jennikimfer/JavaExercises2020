package EmployeeList;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        Employee[] employees = new Employee[0];
        Manager[] managers = new Manager[0];
        //ArrayList<Employee> employees = new ArrayList<Employee>();
        //ArrayList<Manager> managers = new ArrayList<Manager>();
        boolean hasEmployee = false;
        
        while(true){
            System.out.print("\nWould you like to (a) create an employee or (b) access a record? ");
            String choiceInit = scanString();

            if(choiceInit.equals("a")){
                System.out.print("\nEnter their name: ");
                String name = scan.next();
                System.out.print("Enter their position: ");
                String position = scanString();
                System.out.print("Enter their salary: ");
                double salary = scan.nextDouble();
                System.out.print("Enter their branch: ");
                String branch = scan.next();

                if(position.equals("employee")){
                    Employee emp = new Employee(name, position, salary);
                    employees = addEmployee(employees, emp);
                    //employees.add(emp);
                    hasEmployee = true;
                } else if(position.equals("manager")){
                    Manager man = new Manager(name, position, branch, salary);
                    managers = addManager(managers, man);
                    //managers.add(man);
                    hasEmployee = true;
                }

            } else if(choiceInit.equals("b")){
                if(hasEmployee == false){
                    System.out.println("\nYou must first create an employee.");
                    continue;
                }
                while(true){
                    System.out.print("\nEnter their name: ");
                    String nameUser = scan.next();
                    Employee employee = registeredE(employees, nameUser);
                    Manager manager = registeredM(managers, nameUser);
                    //Employee employee = registeredEList(employees, nameUser);
                    //Manager manager = registeredMList(managers, nameUser); 
                    if(employee != null){
                        System.out.println("\n" + employee.toString());
                        break;
                    } else if(manager != null){
                        System.out.println("\n" + manager.toString());
                        break;
                    } else{
                        System.out.println("\n" + nameUser + " is not a valid employee.");
                        System.out.println("Enter a valid name.");
                        continue;                       
                    }

                }
            }

            System.out.print("\nWould you like to (a) exit or (b) continue? ");
            String choiceEnd = scanString();
            if(choiceEnd.equals("a")){
                break;
            }
        }
        System.out.println("\nExited.");
    }

    public static String scanString(){
        return scan.next().toLowerCase();
    }

    public static Employee[] addEmployee(Employee[] e, Employee emp){
        int length = e.length;
        int size = length + 1;
        Employee[] temp = new Employee[size];
        for(int i=0; i<length; i++){
            temp[i] = e[i];
        }
        temp[length] = emp;
        return temp;
    }

    public static Manager[] addManager(Manager[] m, Manager man){
        int length = m.length;
        int size = length + 1;
        Manager[] temp = new Manager[size];
        for(int i=0; i<length; i++){
            temp[i] = m[i];
        }
        temp[length] = man;
        return temp;
    }

    public static Employee registeredE(Employee[] e, String name){
        Employee temp = null;
        for(Employee emp: e){
            if(emp.getName().equals(name)){
                temp = emp;
            }
        }
        return temp;
    }

    public static Manager registeredM(Manager[] m, String name){
        Manager temp = null;
        for(Manager man: m){
            if(man.getName().equals(name)){
                temp = man;
            }
        }
        return temp;
    }

    public static Employee registeredEList(ArrayList<Employee> e, String name){
        Employee temp;
        for(int i = 0; i < e.size(); i++){
            temp = e.get(i);
            if(temp.getName().equals(name)){
                return temp;
            }
        }
        temp = null;
        return temp;
    }

    public static Manager registeredMList(ArrayList<Manager> m, String name){
        Manager temp = null;
        for(int i = 0; i < m.size(); i++){
            temp = m.get(i);
            if(temp.getName().equals(name)){
                return temp;
            }
        }
        temp = null;
        return temp;
    }

}
