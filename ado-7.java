import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Main{
    
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
        
        ArrayList<String> alternativa = new ArrayList<String>();
        
        String a = " Algoritimos e Programação I";
        String b = " Fundamentos de Administração";
        String c = " Matemática Para TI ";
        String d = " Desenvolvimento de Logíca";
        String e = " Conceitos de Computação.";
        boolean acertou = false;
        
        alternativa.add(a);
        alternativa.add(b);
        alternativa.add(c);
        alternativa.add(d);
        alternativa.add(e);
        do {
        Collections.shuffle(alternativa);
        
        
        System.out.println("a." + alternativa.get(0));
        System.out.println("b." + alternativa.get(1));
        System.out.println("c." + alternativa.get(2));
        System.out.println("d." + alternativa.get(3));
        System.out.println("e." + alternativa.get(4));
        
        
        System.out.print("\nResposta: ");
        String resposta = sc.next();
        
        switch(resposta){
            case "a": 
                if (alternativa.get(0) == d){
                    System.out.println("\nResposta Correta.\n");
                    acertou = true;
                }
                else{
                    System.out.println("\nResposta Incorreta.\n");
                }
                break;
            case "b":
                if (alternativa.get(1) == d){
                    System.out.println("\nResposta Correta.\n");
                    acertou = true;
                }
                else{
                    System.out.println("\nResposta Incorreta.\n");
                }
                break;
            case "c":
                if (alternativa.get(2) == d){
                    System.out.println("\nResposta Correta.\n");
                    acertou = true;
                }
                else{
                    System.out.println("\nResposta Incorreta.\n");
                }
                break;
            case "d":
                if(alternativa.get(3) == d){
                    System.out.println("\nResposta Correta.\n");
                    acertou = true;
                }
                else {
                    System.out.println("\nResposta Incorreta.\n");
                }
                break;
            case "e":
                if (alternativa.get(4) == d){
                    System.out.println("\nResposta Correta.\n");
                    acertou = true;
                }
                else{
                    System.out.println("\nResposta Incorreta.\n");
                }
                break;
            } 
        } while (!acertou);
    }
}