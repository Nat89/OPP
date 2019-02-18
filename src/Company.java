import model.Employee;

public class Company {
    Employee employees [] = new Employee[10];
    int index = 0;
    private Object args;

    public  void addEmployee (
            String name,
            String lastname,
            String PESEL,
            String birth_date,
            String empl_date,
            double salary_net) {
        // utworzenie obiektu pracownika

        // wyswietlenie danych zapisanego pracownika

        Employee pracownik1 = new Employee(name, lastname, PESEL, birth_date, empl_date, salary_net);
        // zapisanie pracownika do listy pracownikow

        employees[index] = pracownik1;
        index++;

        // wyświetlenie danych zapisanego pracownika
        System.out.println("Dodano pracownika: " + pracownik1);
    }
//    public void getAllEmployes () {
//
//        }
        public Employee getEmployeeByPESEL (String PESEL_search) {
            for (int i = 0; i < index; i++) {
                if (employees[i].PESEL.equals(PESEL_search)) {
                    return employees[i];
                }
            }
            return null;
        }
        public void setSalary(String PESEL_search, double newSalary){
            for (int i = 0; i < index; i++) {
                if (employees[i].PESEL.equals(PESEL_search)) {
                    employees[i].salary_net = newSalary;
                }
            }
            }

            // public Employee getEmployeeByPesel (StringPesel)
            // public void setSalary(String PESEL, double newSalary);

        public static void main(String[] args) {


        Company c = new Company();
        c.addEmployee("Magda", "Kowa", "12345678", "2000-09-12", "2019-01-20", 3000);
        c.addEmployee("Nati", "Now", "457643366", "1990-09-23", "2016-09-12", 12000);
                c.addEmployee("Basia", "Lak", "26468592", "1988-09-12", "2009-12-02", 45000);

            System.out.println(c.getEmployeeByPESEL("26468592"));
            System.out.println(c.getEmployeeByPESEL("26592"));

    }

}
