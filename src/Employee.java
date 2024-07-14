public class Employee {


        private String id;
        private String name;
        private int salary;

        public Employee(String id, String name, int salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public String getID() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public int getSalary() {
            return this.salary;
        }

        public int getAnnualSalary() {
            return this.salary * 12;
        }

        public void raisedSalary(int percent) {
            this.salary += (this.salary * percent) / 100;
        }

        public String toString() {
            return "Employee (id: " + this.id + ", name: " + this.name + ", salary: " + this.salary + ")";
        }
    }

