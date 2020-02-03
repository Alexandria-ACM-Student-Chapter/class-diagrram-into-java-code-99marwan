public class Employee {
    private int id,salary;
    private String firstName,lastName;
    public Employee(int id,String firstName,String lastName,int salary){
        this.firstName=firstName;
        this.id=id;
        this.lastName=lastName;
        this.salary=salary;
    }
    public int getID(){
        return this.id;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getName(){
        return getFirstName()+getLastName();
    }
    public int getSalary(){
        return this.salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public int getAnnualSalary(){
        return this.salary*12;
    }
    public int raiseSalary(int percent){
        this.salary=salary+(percent*salary);
        return salary;
    }
    public String toString(){
        return "Employee[id="+getID()+",name="+getName()+",salary="+getSalary()+"]";
    }
}
