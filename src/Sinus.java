import java.util.Scanner;

public class Sinus
{
    public void sinus(double argument, int dokladnosc){
        int potDz=1;
        double rezultat=0, point=0;
        for(int i=0; i<=dokladnosc; i++){
            if(i==0){
                point=argument;
                rezultat+=point;
                potDz+=2;
            }else{
                point= Math.pow(-1, i) * Math.abs(point) * Math.pow(argument,2)/(potDz*(potDz-1)); //Math.pow(-1,i) - z jakiem znakiem bedzie kolejna zmienna
                                                                                                    //Math.abs(point) - modul z dannej zmiennej , bo znak zaleze od Math.pow(-1,i)
                                                                                                    //* Math.pow(argument,2)/(potDz*(potDz-1)) - kolejne mnozenie poprzedniego, zeby znie pisac ponownie wszuystkie faktorialy i potegi
                rezultat+=point;
                potDz+=2; 
            }
        }
        System.out.println("Resultat: " + rezultat);
        System.out.println("Ruznica: " + (Math.sin(argument) - rezultat));
    }
    public static void main(String[] args) {
       Sinus sin = new Sinus();
       Scanner scan = new Scanner(System.in);
       System.out.println("W czym chcesz:\n1.radiany \n2. stopni" );
       int wybor = scan.nextInt();
        System.out.println("Podaj argument:");
        double argument = scan.nextDouble();
       if(wybor==2)
           argument= Math.toRadians(argument);
        System.out.println("Podaj dokladnosc:");
        int dokladnosc = scan.nextInt();
        sin.sinus(argument,dokladnosc);
    }
}
