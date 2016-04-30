package javaapplication1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n1=0,n2=0,res=0;
     do{
         System.out.println("Digite a dezena");n1=sc.nextInt();
         System.out.println("Digite a unidade");n2=sc.nextInt();
         n1=n1*10;
         res=n1+n2;
         System.out.println("Result.:"+res);
         if(res<20){
         switch(res){
             case 1:System.out.println("um");
             break;
             case 2:System.out.println("dois");
             break;
             case 3:System.out.println("tres");
             break;
             case 4:System.out.println("quatro");
             break;
             case 5:System.out.println("cinco");
             break;
             case 6:System.out.println("seis");
             break;
             case 7:System.out.println("sete");
             break;
             case 8:System.out.println("oito");
             break;
             case 9:System.out.println("nove");
             break;
             case 10:System.out.println("dez");
             break;
             case 11:System.out.println("onze");
             break;
             case 12:System.out.println("doze");
             break;
             case 13:System.out.println("treze");
             break;
             case 14:System.out.println("quartoze");
             break;
             case 15:System.out.println("quize");
             break;
             case 16:System.out.println("dezesseis");
             break;
             case 17:System.out.println("dezesete");
             break;
             case 18:System.out.println("dezoito");
             break;
             case 19:System.out.println("dezenove");
             break;
             default:
             break;
             }
         } else {
             switch(n1){
                 case 20:System.out.print("vinte ");
                 break;
                 case 30:System.out.print("trinta ");
                 break;
                 case 40:System.out.print("quarenta ");
                 break;
                 case 50:System.out.print("cinquenta ");
                 break;
                 case 60:System.out.print("sessenta ");
                 break;
                 case 70:System.out.print("setenta ");
                 break;
                 case 80:System.out.print("oitenta ");
                 break;
                 case 90:System.out.print("noventa ");
                 break;
                 case 100:System.out.print("cento ");
                 break;
                 default:
                 break;
             }
             switch(n2){
                 case 1:System.out.println("e um ");
                 break;
                 case 2:System.out.println("e dois ");
                 break;
                 case 3:System.out.println("e tres ");
                 break;
                 case 4:System.out.println("e quatro ");
                 break;
                 case 5:System.out.println("e cinco ");
                 break;
                 case 6:System.out.println("e seis ");
                 break;
                 case 7:System.out.println("e sete ");
                 break;
                 case 8:System.out.println("e oito ");
                 break;
                 case 9:System.out.println("e nove ");
                 break;
                 default:
                 break;
         }
         }
         System.out.print("\n");
     }while(res!=0);
    }
}
