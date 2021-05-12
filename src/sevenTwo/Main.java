package sevenTwo;

public class Main {
    public static void main(String[] args){
        Elefant e = new Elefant("Elefant");
        Nashorn n = new Nashorn("Nashorn");
        Delfin d = new Delfin("Delfin");
        Wal w = new Wal("Wal");

        Tier t;

        t = e;
        t.steckbrief();
        System.out.println();

        t = n;
        t.steckbrief();
        System.out.println();

        t = d;
        t.steckbrief();
        System.out.println();

        t = w;
        t.steckbrief();
        System.out.println();
    }
}
