//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
  ArrayList<Integer> Lista = new ArrayList<>();
  Lista.add(1);
  Lista.add(4);
  Lista.add(7);
  Lista.add(10);
        System.out.println("Lista anterior: ");

        /*
        Este é o foreach, muito mais recomendado!!!
        for (int k:Lista){
            System.out.print(k + " ");
        }

         */
     for (int i=0; i<Lista.size(); i++) {
         System.out.print(Lista.get(i) + " ");
     }
   //Lista sem o 4:

        Lista.remove(Integer.valueOf(4));
        System.out.println(" Lista sem o número 4: ");

        for (int k:Lista){
            System.out.print(k + " ");
        }
        if(Lista.contains(4)){
            System.out.println("O elemento 4 continua na lista!!!");

        }
        else {
            System.out.println("... O elemento 4 não pertence mais a lista.");
        }
    }
}