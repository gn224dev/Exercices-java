
import java.util.Scanner;
public class MainApp {
    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);
            System.out.print("Veuillez saisir une phrase :) ");
            String phrase = sc.nextLine();
            System.out.println("Voici la phrase saisi : " + phrase.toUpperCase());
          
            int cpt = 0;
            for(int i=0; i < phrase.length(); i++){
                char c = phrase.charAt(i);
                String a = "a";
                if(c == 'a' || c == 'A' && phrase.contains(a)){
                    cpt ++;
                }
            }
            System.out.println("Nous avons "+ cpt + " 'a' " + "dans la phrase"); 
            System.out.println(phrase.replaceAll( "a" ,"*")); 
            if (phrase.length() >= 12) {
                System.out.println("Il y'a => (" + phrase.substring(4 ,11) +") entre le 5em et le 12em caractères !"); 
            }else{
                System.out.println("Il n'ya pas de content entre le 5em et le 12em caractères !"); 
            }
            
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
       
           
            
       
          
      

        

    }

  
    
}
