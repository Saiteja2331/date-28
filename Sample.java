package date28;
class RBIBank {
    
    int balance;

    public RBIBank(int balance) {
        this.balance = balance;
    }

    void deposit(int amt) {
        this.balance = this.balance + amt;
        System.out.println("Successfully deposited... Amount: " + amt);
    }

    void withdraw(int amt) {
        this.balance = this.balance - amt;
        System.out.println("Successfully withdrawn... Amount: " + amt);
    }

    void checkBalance() {
        System.out.println("From RBI available balance: " + this.balance);
    }
}

class SBIBank extends RBIBank {
    
    public SBIBank(int balance) {
        super(balance);
    }

    @Override
    void deposit(int amt) {
        if (amt < 50000) {
            this.balance = this.balance + amt;
            System.out.println("From SBI, successfully deposited... Amount: " + amt);
        } else {
            System.out.println("From SBI, deposit limit exceeded. Max limit: 50000");
        }
    }

    @Override
    void withdraw(int amt) {
        if (amt < 50000) {
            this.balance = this.balance - amt;
            System.out.println("From SBI, successfully withdrawn... Amount: " + amt);
        } else {
            System.out.println("From SBI, withdrawal limit exceeded. Max limit: 50000");
        }
    }
}

class ICICIBank extends RBIBank {
    
    public ICICIBank(int balance) {
        super(balance);
    }

    @Override
    void deposit(int amt) {
        this.balance = this.balance + amt;
        System.out.println("From ICICI, successfully deposited... Amount: " + amt);
    }

    @Override
    void withdraw(int amt) {
        this.balance = this.balance - amt;
        System.out.println("From ICICI, successfully withdrawn... Amount: " + amt);
    }
}

class HDFCBank extends RBIBank {
    
    public HDFCBank(int balance) {
        super(balance);
    }

    @Override
    void deposit(int amt) {
        if (amt > 10000) {
            this.balance = this.balance + amt;
            System.out.println("From HDFC, successfully deposited... Amount: " + amt);
        } else {
            System.out.println("From HDFC, deposit amount should be greater than 10000.");
        }
    }

    @Override
    void withdraw(int amt) {
        if (amt <= 50000) {
            this.balance = this.balance - amt;
            System.out.println("From HDFC, successfully withdrawn... Amount: " + amt);
        } else {
            System.out.println("From HDFC, withdrawal limit exceeded. Max limit: 50000");
        }
    }
}

public class Sample {
    public static void main(String[] args) {
        
        SBIBank sbi = new SBIBank(100000);
        sbi.checkBalance();
        sbi.deposit(30000);
        sbi.withdraw(20000);
        sbi.deposit(60000);
        sbi.withdraw(60000);
        sbi.checkBalance();
        
        ICICIBank icici = new ICICIBank(50000);
        icici.checkBalance();
        icici.deposit(20000);
        icici.withdraw(10000);
        icici.checkBalance();
        
        HDFCBank hdfc = new HDFCBank(20000);
        hdfc.checkBalance();
        hdfc.deposit(15000);
        hdfc.withdraw(25000);
        hdfc.deposit(8000);
        hdfc.checkBalance();
    }
}
//ouput:From RBI available balance: 100000
//From SBI, successfully deposited... Amount: 30000
//From SBI, successfully withdrawn... Amount: 20000
//From SBI, deposit limit exceeded. Max limit: 50000
//From SBI, withdrawal limit exceeded. Max limit: 50000
//From RBI available balance: 110000
//From RBI available balance: 50000
//From ICICI, successfully deposited... Amount: 20000
//From ICICI, successfully withdrawn... Amount: 10000
//From RBI available balance: 60000
//From RBI available balance: 20000
//From HDFC, successfully deposited... Amount: 15000
//From HDFC, successfully withdrawn... Amount: 25000
//From HDFC, deposit amount should be greater than 10000.
//From RBI available balance: 10000
