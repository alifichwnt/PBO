public class TestingAccount {
    public static void main(String[] args){
        //deklarasi objek Account
        //Employee Acc1 = new Account(ds);

        Account Acc1 = new Account("222212857","Rizky Alif",250000);
        Account Acc2 = new Account("222212892","Syawaludin",300000);
        //output objek Account1
        System.out.println("Id Account : "+Acc1.getID());
        System.out.println("Full Name : "+Acc1.getName());
        System.out.println("Balance : Rp. "+Acc1.getBalance());

        //output objek Account2
        System.out.println("Id Account : "+Acc2.getID());
        System.out.println("Full Name : "+Acc2.getName());
        System.out.println("Balance : Rp. "+Acc2.getBalance());

        //Transferto
        Acc1.transferTo(Acc2,50000);
        System.out.println("Transfer Rp.50000 ke Account2");
        System.out.println("Account1 balance: " + Acc1.getBalance());
        System.out.println("Account2 balance: " + Acc2.getBalance());
        
        //output info
        System.out.println(Acc1.toString());
        System.out.println(Acc2.toString());
    }
}
    

