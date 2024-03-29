import java.math.BigDecimal;
import java.util.Scanner;

public class Proj_1_Sinus {

    public static void method(int wybor, double argument, int doklad) {
        double znac=argument;
        if (wybor == 2)
            argument = argument * (2 * Math.PI/360);

        System.out.print("Sin(" + znac + ") z dokladnisciu " + doklad + " = ");
        double wynik = argument;
        double rezult = argument;
        for (int i = 2, potega = 3; i <= doklad; i++, potega += 2) {
            wynik = Math.abs(wynik) * Math.pow(argument, 2) / ((potega - 1) * potega);
            if (i % 2 == 0) rezult -= wynik;
            else rezult += wynik;
  /*          if(i%2==0) {
                wynik = Math.abs(wynik)*Math.pow(argument,2)/((potega-1)*potega);
                rezult-=wynik;
            }
            else if(potega==1){
                wynik=Math.pow(argument,potega)/potega;
                rezult+=wynik;
            }else{
              wynik  = Math.abs(wynik)*Math.pow(argument,2)/ ((potega-1)*potega);
              rezult+=wynik;
            }
        }
*/
        }
        System.out.println(rezult);
        BigDecimal resultat = new BigDecimal(Math.sin(argument)).subtract(new BigDecimal(rezult));
//      double res= Math.sin(argument) - rezult;
        System.out.println("Roznica  miedze wbudowanej funkcijej " + Math.sin(argument) + " i wynikiem  " + rezult + " = " + resultat);
    }

    public static void main(String[] args) {
        System.out.println("Wybiez:\n1. radians \n2. degree");
        Scanner scanner= new Scanner(System.in);
        int wybor= scanner.nextInt();
        System.out.println("Podaj argument");
        int argument= scanner.nextInt();
        System.out.println("Podaj z jakiej dokladnosciu:");
        int doklad = scanner.nextInt();
        method(wybor,argument, doklad);
    }
}
