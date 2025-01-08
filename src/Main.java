import it.altro.epicode.CicloWhile;
import it.epicode.ClasseUno;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {





    public static boolean stringaPariDispari (String test){
      int x =test.length() % 2;
      boolean a= false;
        if(x==0){
            System.out.println(!a);
            return !a;
        }else{

            System.out.println(a); return a;}

    }

    public static void annoBisestile(int anno){

    }


    public static void main(String[] args) {
stringaPariDispari("ciao");
        ClasseUno number= new ClasseUno();
        number.stampa(2);
        System.out.println("inserire un testo");
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();

        CicloWhile abc=new CicloWhile();
abc.stampareCaratteri(text);





    }
}