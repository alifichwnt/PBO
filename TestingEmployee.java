public class TestingEmployee {
    public static void main(String[] args){
        //deklarasi objek employee
        //Employee emp2 = new Employee(ds);
        Employee emp = new Employee(1,"Ibnu","Rivansyah",5000);
        //output objek employee
        System.out.println("Employee Id : "+emp.getID());
        System.out.println("First Name : "+emp.getfirstName());
        System.out.println("Last Name : "+emp.getlastName());
        System.out.println("Full Name : "+emp.getName());
        System.out.println("Salary : Rp. "+emp.getSalary());
        System.out.println("Annual Salary : Rp."+emp.getAnnualSalary());
        //ubah salary dan outputkan
        emp.setSalary(100000);
        System.out.println("Update Salary : Rp."+emp.getSalary());
        System.out.println("Annual salary: Rp. "+emp.getAnnualSalary());

        //persen nambah salary
        int raisePersent = 10;
        emp.raiseSalary(raisePersent);
        System.out.println("Update Salary After Percent : Rp."+emp.getSalary());
        System.out.println("Annual salary After percent: Rp. "+emp.getAnnualSalary());

        //output info
        System.out.println(emp.toString());

    }
}
