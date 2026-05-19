package Project;

import java.io.*;
import java.util.Scanner;

public class Bank {

    private Account[] customers = new Account[5];
    private int count = 0;
    Scanner sc = new Scanner(System.in);

    private String adminName = "Haris";
    private String pin = "12345";

    Bank(){
        load();
    }

    void createAcc (){

        if(count < customers.length){
            System.out.print("Enter Account Number : ");
            String accNo = sc.nextLine();

            for (int i = 0; i < count; i++) {
                if (customers[i].getAccountNumber().equals(accNo)) {
                    System.out.println("Account number already exists");
                    return;
                }
            }

            System.out.print("Enter Name : ");
            String name = sc.nextLine();
            System.out.print("Enter Pin : ");
            String pin = sc.nextLine();
            System.out.print("Choose Option (1: Current 2: Saving)");
            int type = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Balance : ");
            double balance = sc.nextDouble();

            sc.nextLine();

            if(type == 1){
                System.out.print("Enter OverLimit : ");
                double overLimit = sc.nextDouble();

                sc.nextLine();

                Account customer  = new CurrentAccount(accNo, name, balance, pin, overLimit);
                customers[count++]  = customer;
                System.out.println("Current Account created successfully");
                save();

            }else if (type == 2) {
                System.out.print("Enter Interest : ");
                double interest = sc.nextDouble();
                sc.nextLine();

                Account customer = new SavingAccount(accNo, name, balance, pin, interest);
                customers[count++] = customer;
                System.out.println("Saving Account created successfully");
                save();

            } else {
                System.out.println("Error: Invalid Account Type selected.");
            }
        }else{
            System.out.println("Limit Reached");
        }


    }

    void login(){
        System.out.print("Enter Account Number : ");
        String accNo = sc.nextLine();
        System.out.print("Enter Pin : ");
        String pin = sc.nextLine();
        for(int i =0; i < count; i++){
            if(customers[i].getAccountNumber().equals(accNo) && customers[i].authentication(pin)){
                transaction(customers[i]);
                return;
            }
        }
        System.out.println("Enter Valid Account or Pin");
    }

    void transaction(Account customers){
        while(true){
            System.out.print("1 : Deposit");
            System.out.print("2 : Withdraw");
            System.out.print("3 : Check Balance");
            System.out.print("4 : Transfer");
            System.out.print("5 : Logout");

            int option = sc.nextInt();

            sc.nextLine();

            switch(option){
                case 1:{
                    System.out.print("Enter Amount to deposit");
                    double amount = sc.nextDouble();
                    sc.nextLine();
                    customers.deposit(amount);
                    System.out.println("Deposit SuccessFully");
                    save();
                    break;
                }
                case 2:{
                    System.out.print("Enter Amount to withdraw");
                    double amount = sc.nextDouble();
                    sc.nextLine();
                    customers.withdraw(amount);
                    System.out.println("WithDraw SuccessFully");
                    save();
                    break;
                }
                case 3:{
                    System.out.print("Balance : " + customers.getBalance());
                    break;
                }
                case 4:{
                    transfer(customers);
                    break;
                }
                case 5:
                    return;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        }
    }

    void transfer(Account sender){
        System.out.print("Enter Account to transfer");
        String account = sc.nextLine();
        System.out.print("Enter amount to transfer");
        double amount = sc.nextDouble();
        sc.nextLine();

        if(amount <= 0){
            System.out.println("Invalid amount");
            return;
        }

        for(int i = 0; i < count; i++){
            if(customers[i].getAccountNumber().equals(account)){
                if(sender.getBalance() >= amount){
                    sender.withdraw(amount);
                    customers[i].deposit(amount);
                    System.out.println("Transfer Successfully");
                    save();
                    return;
                }else{
                    System.out.println("Insufficient Balance");
                    return;
                }
            }
        }
        System.out.println("Account Not Found");
    }

    void adminView(){
        System.out.print("Enter Name : ");
        String adminName = sc.nextLine();
        System.out.print("Enter pin : ");
        String pin = sc.nextLine();
        if(adminName.equals(this.adminName) && pin.equals(this.pin)){
            System.out.println("Account No, Name, Type, Balance, Extras");
            for(int i = 0; i < count; i++){
                System.out.println(customers[i]);
            }
        }else{
            System.out.println("Invalid Details");
        }
    }

    void start(){
        boolean value = true;
        while (value) {

            System.out.println("1: Create Account");
            System.out.println("2: Login");
            System.out.println("3: Admin View");
            System.out.println("4: Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    createAcc();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    adminView();
                    break;
                case 4:
                    value = false;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

    void save(){
        try(BufferedWriter buffWrite = new BufferedWriter(new FileWriter("haris.csv"))){
            buffWrite.write("Account , Name, Type, Balance, Pin, Interest & OverDraft\n");
            for(int i = 0; i < count; i++){
                buffWrite.write(customers[i].forSave() + "\n");
            }
        } catch (IOException e) {
            System.out.print("Handled Exception");
        }
    }

    void load(){
        File file = new File("haris.csv");
        if (!file.exists()) return;
        try(BufferedReader buffRead = new BufferedReader(new FileReader(file))){
            String line;
            buffRead.readLine();
            while((line = buffRead.readLine() )!= null){
                String[] data = line.split(",");
                String acc = data[0];
                String name = data[1];
                String type = data[2];
                double balance = Double.parseDouble(data[3]);
                String pin = data[4];
                double interest = Double.parseDouble(data[5]);
                if(type.equals("Saving")){
                    Account customer = new SavingAccount(acc,name,balance,pin, interest);
                    customers[count++] = customer;
                }else{
                    Account customer = new CurrentAccount(acc,name,balance,pin, interest);
                    customers[count++] = customer;
                }
            }
        }catch (IOException e) {
            System.out.print("Handled Exception");
        }
    }
}
