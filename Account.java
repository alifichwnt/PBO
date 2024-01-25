public class Account {
    String id;
    String name;
    int balance=0;
    int amount;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    String getID() {
        return this.id;
    }

    String getName() {
        return this.name;
    }

    int getBalance() {
        return this.balance;
    }

    int credit(int amount) {
        this.balance = amount;
        return this.balance;
    }

    int debit(int amount) {
        if (this.amount <= this.balance) {
            this.amount = amount - balance;          
        } else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }

    int transferTo(Account another, int amount) {
        if (this.amount <= this.balance) {
            // Mengurangkan saldo dari akun saat ini
            this.balance -= amount;
    
            // Menambahkan saldo ke akun lainnya
            another.balance += amount;

        } else {
            System.out.println("Amount exceeded balance");
            // Mengembalikan saldo tanpa perubahan karena transfer tidak berhasil
        }
        return this.balance;
    }
    

    public String toString() {
        return "Account[id=" + id + ", name=" + getName() + ", balance=" + getBalance() + "]";
    }
}