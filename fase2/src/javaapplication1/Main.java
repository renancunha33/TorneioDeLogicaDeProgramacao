package javaapplication1;
public class Main {
    public static void main(String[] args) {
       int num=1;
        for(int i=0;i<30;i++){
            num=num+999;
            if(num==4000||num==8000||num==12000||num==16000||num==20000||num==24000||num==28000){
                 System.out.println("     ***Onuki***");
            }else{
            switch(num){
                case 1000:System.out.println("           um");
                break;
                case 2000:System.out.println("         dois");
                break;
                case 3000:System.out.println("         tres");
                break;
                case 5000:System.out.println("        cinco");
                break;
                case 6000:System.out.println("         seis");
                break;
                case 7000:System.out.println("         sete");
                break;
                case 9000:System.out.println("         nove");
                break;
                case 10000:System.out.println("          dez");
                break;
                case 11000:System.out.println("         onze");
                break;
                case 13000:System.out.println("        treze");
                break;
                case 14000:System.out.println("     quatorze");
                break;
                case 15000:System.out.println("       quinze");
                break;
                case 17000:System.out.println("    desessete");
                break;
                case 18000:System.out.println("      dezoito");
                break;
                case 19000:System.out.println("     dezenove");
                break;
                case 21000:System.out.println("   vinte e um");
                break;
                case 22000:System.out.println(" vinte e dois");
                break;
                case 23000:System.out.println(" vinte e trez");
                break;
                case 25000:System.out.println("vinte e cinco");
                break;
                case 26000:System.out.println(" vinte e seis");
                break;
                case 27000:System.out.println(" vinte e sete");
                break;
                case 29000:System.out.println(" vinte e nove");
                break;
                case 30000:System.out.println("       trinta");
                break;
                default:break;
            }            
            } num++;
            }
        }
    }