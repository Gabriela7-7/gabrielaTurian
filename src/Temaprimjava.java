import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Temaprimjava {




    public class Main  {




        public static void main (String[]args)    {
            exercitiul1();
            exercitiul2();
            exercitiul3(24,6);
            exercitiul4();
            exercitiul5();
            exercitiul6();
            exercitiul7();
            exercitiul8();
        }
        static void exercitiul1 () {
            out.println("Imi place java");
        }
        static void exercitiul2 (){
            out.println("Cursul acesta este foarte fain");
            out.println("Cursul acesta este foarte fain");
            out.println("Cursul acesta este foarte fain");
            out.println("Cursul acesta este foarte fain");
            out.println("Cursul acesta este foarte fain");
            out.println("Cursul acesta este foarte fain");
        }
        static void exercitiul3 (int varstaAna, int difvarsta ) {
            int varstaDavid =difvarsta;


            out.println(varstaDavid);
        }



        static void exercitiul4(){
            int propozitie = 0;
            out.println(propozitie);
        }

        private static void exercitiul5() {

            int a=356498;
            out.println(a=356498) ;

            String nume= "Turian";
            String Turian = null;
            out.println(nume=Turian);

            String prenume="Gabriela";
            String GABRIELA= null;
            out.println(prenume=GABRIELA);

            String numeintreg=nume+prenume;
            out.println(nume+prenume);


            int b=5;

            int d=7;

            System.out.println(true);


        }

        static void exercitiul6() {
            Object numar;
            int numar1;
            out.println(numar1 = 2);
            int numar2;
            out.println(numar2 = 3);
            Scanner scanner = new Scanner(in);
            numar1 = scanner.nextInt();
            numar2 = scanner.nextInt();
            out.println();

        }
        static void exercitiul7() {
            double numar3 = 0;
            out.println(numar3);
            out.println(numar3=4);
            out.println(numar3+5);
            out.println(numar3-12.3);

        }
        static  void exercitiul8() {
            int x=2;
            int y=12;
            //x+y ;
            x=y-x;
            y=y-x;
            out.println(x);
            out.println(y);    } }












}
