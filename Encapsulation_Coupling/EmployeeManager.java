package Encapsulation_Coupling;

public class EmployeeManager {
    
    public class registerEmployer{
            public void registerEmployee(String name) {
        System.out.println("Registering employee: " + name);
        }
    }

    public class calculateSalary {

        public double calculateSalary(double baseSalary) {
        return baseSalary * 1.2;
        }
    }

    public class sendWelcomeEmail{
         public void sendWelcomeEmail(String email) {
        System.out.println("Sending welcome email to " + email);
    }
    }
}
