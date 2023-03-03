package org.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.logging.*;

class Main {
    static Logger l= Logger.getLogger("com.api.jar");
    static Scanner sc = new Scanner(System.in);
    static void bankaccount() {
        try {
            l.info("Account Holders Name:");
            String name = sc.next();
            l.info("Account Number:");
            long accnumber = sc.nextLong();
            l.info("Account Holder Balance:");
            long balance = sc.nextLong();
            Account acc = new Account(name, accnumber, balance);
            while (true) {
                l.info("1.Deposit");
                l.info("2.withdrwal");
                l.info("3.Balance");
                l.info("4.Exit");
                l.info("Enter Your Choice");
                int a = sc.nextInt();
                if (a == 1) {
                    l.info("Enter the amount to be deposit");
                    long deeposit = sc.nextLong();
                    acc.deposit(deeposit);
                } else if (a == 2) {
                    l.info("Enter the amount to be withdrawal");
                    long withdrawalAmount = sc.nextLong();
                    acc.withdrawal(withdrawalAmount);
                } else if (a == 3) {
                    acc.accbalance();
                } else if(a==4){
                    l.info("Exit");
                    break;
                }
                else{
                    l.info("invalid choice");
                }
            }
        }
        catch(Exception e){
            l.info("something went Wrong in giving input "+e);
        }
    }

    static void basicshape() {
        try{
            while(true){
                l.info("1.Triangle");
                l.info("2.Rectangle");
                l.info("3.circle");
                l.info("4.Exit");
                l.info("enter the shape type:");
                String shapetype=sc.next();
                shapetype=shapetype.toLowerCase();
                if(shapetype.equals("triangle")){
                    l.info("enter the side1");
                    double side1=sc.nextDouble();
                    l.info("enter the side2");
                    double side2=sc.nextDouble();
                    l.info("enter the side3");
                    double side3=sc.nextDouble();
                    l.info("enter the height");
                    double height=sc.nextDouble();
                    l.info("enter the base");
                    double base=sc.nextDouble();
                    Basicshape t=new Basicshape(side1,side2,side3,base,height);
                    double x=t.areA(shapetype);
                    String xa="the area of triangle:"+x;
                    l.info(xa);
                    double y=t.perimeteR(shapetype);
                    String ya="the perimeter of triangle:"+y;
                    l.info(ya);
                }
                else if(shapetype.equals("rectangle")){
                    l.info("enter the length");
                    double length=sc.nextDouble();
                    l.info("enter the breadth");
                    double breadth=sc.nextDouble();
                    Basicshape re=new Basicshape(length,breadth);
                    double z=re.areA(shapetype);
                    String za="the area of rectangle:"+z;
                    l.info(za);
                    double k=re.perimeteR(shapetype);
                    String ka="the perimeter of rectangle:"+k;
                    l.info(ka);
                }
                else if(shapetype.equals("circle")){
                    l.info("enter the radius");
                    double radius=sc.nextDouble();
                    Basicshape c=new Basicshape(radius);
                    double q=c.areA(shapetype);
                    String qa="the area of circle:"+q;
                    l.info(qa);
                    double i=c.perimeteR(shapetype);
                    String ia="the perimeter of circle:"+i;
                    l.info(ia);
                }
                else if(shapetype.equals("exit")){
                    l.info("Exit");
                    break;
                }
                else{
                    l.info("invalid choice");
                }
            }
        }
        catch(Exception e){
            l.info("Something went wrong in giving the input "+e);
        }
    }

    static void studentgpa() {
        try{
            l.info("Enter the student name:");
            String studentname=sc.next();
            l.info("Enter your Grade:");
            char gradelevel=sc.next().charAt(0);
            l.info("Enter your GPA:");
            float gpa=sc.nextFloat();
            Student s=new Student(studentname,gradelevel,gpa);
            while(true){
                l.info("1.Upadte");
                l.info("2.Display");
                l.info("3.Exit");
                int a= sc.nextInt();
                if(a==1){
                    l.info("Enter your GPA");
                    float gPA=sc.nextFloat();
                    s.updateGPA(gPA);
                }
                else if(a==2){
                    String z=s.displayGPa();
                    l.info(z);
                }
                else if(a==3){
                    l.info("Exit");
                    sc.nextLine();
                    break;
                }
                else{
                    l.info("invalid choice");
                }
            }
        }
        catch(Exception e){
            l.info("Something went wrong in giving input "+e);
        }
    }

    static void databaseconnectionpool() {
        l.info("Enter connection:");
        String connection=sc.next();
        Databaseconnectioon sv=Databaseconnectioon.getInstance(connection);
        while(true) {
            try {
                l.info("1.New Connection");
                l.info("2.Terminate connection");
                l.info("3.Exit");
                l.info("Enter your operation or choice");
                int op = sc.nextInt();
                if (op == 1) {
                    l.info("Enter new connection");
                    String s=sc.next();
                    sv.connection(s);
                }
                else if (op == 2) {
                    sv.closeconnection();
                }
                else if(op==3) {
                    l.info("Exit");
                    sc.nextLine();
                    break;
                }
                else{
                    l.info("invalid choice:choose correct option");
                }
            }
            catch(Exception e) {
                l.info("something Wrong "+ e);
            }
        }
    }

    static void basicpointclone() {
        try {
            l.info("enter the value x :");
            int xaxis = sc.nextInt();
            l.info("enter the value y:");
            int yaxis = sc.nextInt();
            l.info("enter the value x1:");
            int xaxis1 = sc.nextInt();
            l.info("enter the value y1:");
            int yaxis1 = sc.nextInt();
            l.info("checking whether two points are equal or not:");
            Basicpoint bp = new Basicpoint(xaxis, yaxis);
            String a = bp.eqqual(xaxis1, yaxis1);
            l.info(a);
            l.info("After cloning:");
            Basicpoint bp1 = (Basicpoint) bp.clone();
            String b = bp.eqqual(bp1.x, bp1.y);
            l.info(b);
        }
        catch(Exception e){
            l.info("something wrong "+e);
        }
    }

    static void studenttestgpa() {
        ArrayList<StudentTest> k = new ArrayList<>();
        try {
            l.info("Enter the no of students:");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                l.info("Enter student name:");
                String name = sc.next();
                l.info("Enter student age:");
                int age = sc.nextInt();
                l.info("Enter student gpa:");
                double gpa = sc.nextDouble();
                k.add(new StudentTest(name, age, gpa));
            }
        } catch (Exception e) {
            l.info("Something went wrong" + e);
        }
        for (StudentTest s : k) {
            l.info(s.getStudentname() + " " + s.getStudentage() + " " + s.getStudentgpa());
        }
        Collections.sort(k, new Sortedgpa());
        l.info("After sorting:");
        for (StudentTest s : k) {
            l.info(s.getStudentname() + " " + s.getStudentage() + " " + s.getStudentgpa());
        }
    }

    static void creditcardclone() {
        try {
            l.info("name:");
            String naMe = sc.next();
            l.info("credit card number:");
            long creditcardnumber = sc.nextLong();
            sc.nextLine();
            l.info("Expiry Date:");
            String expirationdate = sc.nextLine();
            l.info("Enter the new person credit card number:");
            long c1 = sc.nextLong();
            l.info("checking whether two credit card numbers same or not");
            Basiccreditcard ba = new Basiccreditcard(naMe, creditcardnumber, expirationdate);
            ba.compare(c1);
            l.info("After cloning");
            Basiccreditcard ba1 = (Basiccreditcard) ba.clone();
            String k = ba.equally(ba1);
            l.info(k);
        } catch (Exception e) {
            l.info("invalid input " + e);
        }
    }

    static void simplecalculator(){
        Simplecalculator k = new Simplecalculator();
        try {
            l.info("Enter the num1:");
            double n1 = sc.nextDouble();
            l.info("Enter the num2:");
            double n2 = sc.nextDouble();
            double num1 = k.setnum1(n1);
            double num2 = k.setnum2(n2);
            boolean t = true;
            while (t) {
                l.info("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
                l.info("Enter your choice: ");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        Addition add = new Addition();
                        String ad = "Addition of two element: " + add.calculate(num1, num2);
                        l.info(ad);
                        break;
                    case 2:
                        Subtraction sub = new Subtraction();
                        String su = "Subtraction of two elements: " + sub.calculate(num1, num2);
                        l.info(su);
                        break;
                    case 3:
                        Multiplication mul = new Multiplication();
                        String mu = "Multiplication of two elements: " + mul.calculate(num1, num2);
                        l.info(mu);
                        break;
                    case 4:
                        Division div = new Division();
                        String di = "Division of two elements: " + div.calculate(num1, num2);
                        l.info(di);
                        break;
                    case 5:
                        t = false;
                        break;
                    default:
                        l.info("invalid choice: choose correct option");
                }
            }
        } catch (Exception e) {
            l.info("" + e);
        }
    }

    static void contactsoperations() {
        ContactsOp op = new ContactsOp();
        int ch;
        try {
            boolean k = true;
            while (k) {
                l.info("1.AddContact\n2.DeleteContact\n3.SearchContact\n4.PrintContact\n5.Exit");
                l.info("Enter your choice:");
                 ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        l.info("Enter your name");
                        String name = sc.next();
                        l.info("Enter your Phonenumber");
                        String phoneno = sc.next();
                        l.info("Enter your email");
                        String email = sc.next();
                        op.addingContact(name, phoneno, email);
                        break;
                    case 2:
                        l.info("Enter your Phonenumber to delete");
                        String phoneNo = sc.next();
                        op.deletingContact(phoneNo);
                        break;
                    case 3:
                        l.info("Enter your Phonenumber to search");
                        String phoneNO = sc.next();
                        op.searchingContact(phoneNO);
                        break;
                    case 4:
                        op.printingContact();
                        break;
                    case 5:
                        l.info("Exit");
                        k = false;
                        break;
                    default:
                        l.info("invalid choice");

                }
            }
        } catch (Exception e) {
            l.info("" + e);
        }
    }

    static void wordfrequencyinfile() {
        HashMap<String, Integer> hash = new HashMap<String, Integer>();
        try {
            String s = "C:/Users/Tringapps-User12/Documents/frequencyfile/text.txt";
            File fi = new File(s);
            Scanner sc = new Scanner(fi);
            while (sc.hasNext()) {
                String word = sc.next();
                if (hash.containsKey(word)) {
                    hash.put(word, hash.get(word) + 1);
                } else {
                    hash.put(word, 1);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        l.info("Before Sorting:");
        l.log(Level.INFO, () -> "" + hash);
        l.info("After Sorting:");
        ArrayList<Map.Entry<String, Integer>> k = new ArrayList<>(hash.entrySet());
        Collections.sort(k, (a, b) -> b.getValue().compareTo(a.getValue()));
        l.log(Level.INFO, () -> "" + k);
        for (Map.Entry<String, Integer> i : k) {
            String f = i.getKey() + " -> " + i.getValue();
            l.info(f);
        }
    }

    static void tictactoegame() {
        try {
            l.info("Enter the Dimension");
            TicTacToe obj = new TicTacToe();
            int dimension = sc.nextInt();
            char[][] board = obj.assignBoard(dimension);
            int count = 0;
            boolean k = true;
            while (k) {
                String j=(count%2==0) ? "player 1 turn" : "player 2 turn";
                l.info(j);
                boolean t = true;
                int row = 0;
                int col = 0;
                while (t) {
                    l.info("Enter row");
                    row = sc.nextInt();
                    l.info("Enter col");
                    col = sc.nextInt();
                    t = false;
                }
                if (obj.setplayer(board, row, col, count) == 0) {
                    break;
                }
                obj.printBoard(board);
                if (obj.winGame(board, row, col) == 1) {
                    String h = (count%2==0) ? "Player1 is win" : "player2 is win";
                    l.info(h);
                    k = false;
                }
                count++;
                if (count == dimension * dimension) {
                    l.info("Game is drawn");
                    k = false;
                }
            }
        }
        catch(Exception e){
            l.info("Something went wrong"+e);
        }
    }
    static void hashmap(){
        HashMap<String, String> hash=new HashMap<String, String>();
        hash.put("England","London");
        hash.put("India","Delhi");
        hash.put("USA","Washington DC");
        hash.put("Germany","Berlin");
        l.log(Level.INFO,()->""+hash);
        l.info(hash.get("USA"));
        hash.remove("Germany");
        l.log(Level.INFO,()->""+hash);
        l.log(Level.INFO,()->""+hash.size());
        l.info("Printing Keys:");
        for(String i:hash.keySet()){
            l.info(i);
        }
        l.info("Printing values:");
        for(String i:hash.values()){
            l.info(i);
        }
        hash.replace("India","NewDelhi");
        l.log(Level.INFO,()->""+hash);
        Iterator<String> it=hash.keySet().iterator();
        while(it.hasNext()){
            String s=it.next();
            l.info(s);
        }
        hash.clear();
        l.log(Level.INFO,()->""+hash);
    }
    static void hashsett(){
        HashSet<String> hashset=new HashSet<String>();
        hashset.add("Benz");
        hashset.add("BMW");
        hashset.add("Volvo");
        hashset.add("swift");
        l.log(Level.INFO,()->""+hashset);
        l.log(Level.INFO,()->""+hashset.contains("TATA"));
        hashset.remove("Benz");
        l.log(Level.INFO,()->""+hashset);
        l.log(Level.INFO,()->""+hashset.size());
        l.log(Level.INFO,()->""+hashset.clone());
        l.log(Level.INFO,()->""+hashset.isEmpty());
        l.info("printing elements");
        for(String i:hashset){
            l.info(i);
        }
        l.info("printing the elements By using iterator");
        Iterator<String> k=hashset.iterator();
        while(k.hasNext()){
            String s=k.next();
            l.info(s);
        }
        hashset.clear();
        l.log(Level.INFO,()->""+hashset);
    }
    static void treeset(){
        TreeSet<String> tree =new TreeSet<String>();
        tree.add("C");
        tree.add("Java");
        tree.add("Python");
        tree.add("C++");
        tree.add("Javascript");
        l.log(Level.INFO,()->""+tree);
        l.log(Level.INFO,()->""+tree.size());
        tree.remove("C");
        l.log(Level.INFO,()->""+tree);
        l.log(Level.INFO,()->""+tree.isEmpty());
        l.log(Level.INFO,()->""+tree.contains("C"));
        l.log(Level.INFO,()->""+tree.clone());
        l.info("Printing elements");
        for(String i:tree){
            l.info(i);
        }
        l.info("Printing the elements by using iterator");
        Iterator<String> k=tree.iterator();
        while(k.hasNext()){
            String s=k.next();
            l.info(s);
        }
        tree.clear();
        l.log(Level.INFO,()->""+tree);
    }

    public static void main(String[] args) {
        Logger l = Logger.getLogger("com.api.jar");
        Scanner sc = new Scanner(System.in);
        boolean k = true;
        while (k) {
            l.info("1.SimpleBankAccount\n2.BasicShape\n3.StudentGPA\n4.Databaseconnectionpool\n5.Basicpointclone\n6.Creditcardclone\n7.StudentTestGPAsort\n8.Simplecalculator\n9.ContactOperations\n10.Wordfrequencyinfile\n11.TicTacToeGame\n12.Hashmap\n13.Hashset\n14.Treeset\n15.Exit");
            l.info("Enter your choice");
            int choice = sc.nextInt();
//            sc.nextLine();
            switch (choice) {
                case 1:
                    Main.bankaccount();
                    break;
                case 2:
                    Main.basicshape();
                    break;
                case 3:
                    Main.studentgpa();
                    break;
                case 4:
                    Main.databaseconnectionpool();
                    break;
                case 5:
                    Main.basicpointclone();
                    break;
                case 6:
                    Main.creditcardclone();
                    break;
                case 7:
                    Main.studenttestgpa();
                    break;
                case 8:
                    Main.simplecalculator();
                    break;
                case 9:
                    Main.contactsoperations();
                    break;
                case 10:
                    Main.wordfrequencyinfile();
                    break;
                case 11:
                    Main.tictactoegame();
                    break;
                case 12:
                    Main.hashmap();
                    break;
                case 13:
                    Main.hashsett();
                    break;
                case 14:
                    Main.treeset();
                    break;
                case 15:
                    k = false;
                    break;
                default:
                    l.info("invalid choice: choose correct option");
            }
        }
    }
}