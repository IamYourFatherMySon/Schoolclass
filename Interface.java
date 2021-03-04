import java.util.Scanner;

public class Interface extends SchoolClass{

    Scanner sc = new Scanner(System.in);
    String eingabe;

    public void start() {

        System.out.println("Willkommen zur TBZ");
        System.out.println("(1) Klassen anzeigen");
        System.out.println("(2) Schüler hinzufügen");
        System.out.println("(3) Lehrer hinzufügen");
        System.out.println("(4) Exit");


    }

    public void decision(){
        eingabe = sc.next();
        while(!(eingabe.equals("4"))){

            if(eingabe.equals("2")){
                addStudent();
            } else if(eingabe.equals("3")){

            } else if(eingabe.equals("1")){
                ShowClassroom();
            }
            start();
        }


    }




}
