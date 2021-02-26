public class EmployeeOne
{
    int identity;
    double salary=0.0;
    public employee(int Id) {
        this.Id = identity;
    }

    public EmployeeOne() {
    }

    double calTax(){
        if(this.salary > 500000.00 && this.salary < 1000000)
            return this.salary*0.1;
        elseif(this.salary>1000000.00 && this.salary < 1500000)
        return this.salary*0.2;
        else
            return this.salary*0.3;
        for(int number=0;number<10;number++){
        }
    }

}