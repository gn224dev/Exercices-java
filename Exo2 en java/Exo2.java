
import java.util.Arrays;
import java.util.Scanner;



public class Exo2 {

    public static void main(String [] args){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Donnez la taille du tableau :) ");
            int tailTab = sc.nextInt();
            String mot[] = new String[tailTab];
         
            System.out.print("Vuillez saisir un mot :) ");
            
            for(int i =0 ; i < tailTab ;i++ ){
                mot[i] = sc.next();
                System.out.print("Vuillez saisir un mot encore :) ");

            }
            System.out.println("Les valeurs ajoutés : " + Arrays.toString(mot));

            String premierMot = mot[0];
            String deuxiemeMot = mot[mot.length - 1];
            
            char[] trie = premierMot.toCharArray();
            char[] trie2 = deuxiemeMot.toCharArray();
            Arrays.sort(trie);
            Arrays.sort(trie2);

            System.out.println("*********Le tri alphabétique du premier mot*************");
            System.out.println(trie);
            System.out.println("*********Le tri alphabétique du deuxième mot***********");
            System.out.println(trie2);
         
        } catch (Exception e) {
            e.printStackTrace();
         }
        


        
    }
       
       
}
