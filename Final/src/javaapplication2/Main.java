package javaapplication2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     String sem;
     double hr, res=0;
     System.out.println("Digite a hora atual:");
     hr=sc.nextDouble();
     System.out.println("Digite o dia da semana:");
     sem=sc.next();
     switch(sem.charAt(0)){
         case 'd':
             res=(24+24+24+24+24+24+24-hr)*60;
         break;
         case 's':
             if(sem.charAt(2)=='g')res=(24+24+24+24+24+24-hr)*60;
             else if(sem.charAt(2)=='x')res=(24+24-hr)*60;
             else res=(24-hr)*60;
         break;
         case 't':res=(24+24+24+24+24-hr)*60;
         break;
         case 'q':
             if(sem.charAt(2)=='a')res=(24+24+24+24-hr)*60;
             else res=(24+24+24-hr)*60;
         break;
         default:
         break;
     }
     System.out.print("Faltam "+res+" minutos para a proxima semana!\n");
    }
}