
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String  a , b , c ;
        
        a = scanner.next();
        b = scanner.next();
        c = scanner.next();
        
        if (a.equals("vertebrado")){
            if (b.equals("ave")){
                if (c.equals("carnivoro")){
                    System.out.println("aguia");
                }else{
                    System.out.println("pomba");
                }
            }
        }if(b.equals("mamifero")){
            if(c.equals("onivoro")){
                System.out.println("homem");
            }else{
                System.out.println("vaca");
            }
        }
        if (a.equals("invertebrado")){
            if (b.equals("inseto")){
                if (c.equals("hematofago")){
                    System.out.println("pulga");
                }else{
                    System.out.println("lagarta");
                }
             }
        }if(b.equals("anelideo")){
            if (c.equals("hematofago")){
                System.out.println("sanguessuga");
            }else{
                System.out.println("minhoca");
            }
        }
        
        
    }
}
