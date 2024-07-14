import java.util.Stack;

public class  Account {


        private String id;
        private String name;
        private int balance;

        public Account(String id, String name, int balance) {
            this.setID(id);
            this.setName(name);
            this.setBalance(balance);
        }

        public String getID() {
            return this.id;
        }

        public void setID(String id) {
            this.id = id;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getBalance() {
            return this.balance;
        }

        public void setBalance(int balance) {
            this.balance = balance;
        }

        public void credit(int amount) {
            this.setBalance(this.getBalance() + amount);
        }

        public void debit(int amount) {
            if (this.getBalance() >= amount) {
                this.setBalance(this.getBalance() - amount);
            } else {
                System.out.println("your bank balance is not enough to perform a debit transaction");
            }
        }

        public void transferTo(Account otherAccount, int amount) {
            if (this.getBalance() >= amount) {
                this.setBalance(this.getBalance() - amount);
                otherAccount.setBalance(otherAccount.getBalance() + amount);
            } else {
                System.out.println("Insufficient funds.");
            }
        }

        public String toString() {
            return "Account ID: " + this.getID() + ", Name: " + this.getName() + ", Balance: " + this.getBalance();
        }
    }