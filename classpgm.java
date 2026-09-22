class classpgm{ 
    String name; 
    double basicSalary, hra, da, grossSalary; 
    classpgm(String name, double basicSalary) { 
        this.name = name; 
        this.basicSalary = basicSalary; 
    } 
    void calculate() { 
        hra = basicSalary * 0.20; 
        da = basicSalary * 0.10; 
        grossSalary = basicSalary + hra + da; 
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary); 
        System.out.println("HRA: " + hra); 
        System.out.println("DA: " + da); 
        System.out.println("Gross Salary: " + grossSalary); 
    } 

    public static void main(String[] args) { 
        classpgm e = new classpgm("Rahul", 30000); 
        e.calculate(); 
    } 
} 