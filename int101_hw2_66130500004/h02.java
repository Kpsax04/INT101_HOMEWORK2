public class h02 {

 
    public static void main(String[] args) {
        work01Utilitor();
        work02Person();
        work03Account();
        
    }
    
 

    static void work01Utilitor() {
        Utilitor uti=new Utilitor();
        System.out.println("work01\ntestString \t"+uti.testString("testString"));
        System.out.println("testPositive \t"+uti.testPositive(10));
        System.out.println("computeIsbn10 \t"+uti.computeIsbn10(974472362));
    }

 

    static void work02Person() {
       Person per1=new Person("today","hungry");
       System.out.println("\nwork02\ntoString \t"+per1.toString());
       Person per2=new Person("tomorrow","eat");
       System.out.println("toString \t"+per2);
       System.out.println("equals  \t"+per1.equals(per2));
    }

 

    static void work03Account() {
    Person per1=new Person("today","hungry");
       Person per2=new Person("tomorrow","eat");
       Account ac1=new Account(per1);
       ac1.deposit(100);
       System.out.println("\nwork03\ndeposit \t"+ac1.getBalance());
       ac1.withdraw(20);
       System.out.println("withdraw \t"+ac1.getBalance());
       Account ac2=new Account(per2);
       ac1.transfer(20, ac2);
       System.out.println("withdraw \t"+ac1.getBalance());
       System.out.println("deposit \t"+ac2.getBalance());
       System.out.println("toString \t"+ac1.toString());
       System.out.println("equals  \t"+ac1.equals(ac2));
    }
}
 