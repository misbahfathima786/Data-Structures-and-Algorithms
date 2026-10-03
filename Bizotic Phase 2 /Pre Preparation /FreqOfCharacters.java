import java.util.*;

public class FreqOfCharacters {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Map<Character , Integer> freq = new HashMap<>();

      System.out.print("Enter a string : ");
      String str = sc.nextLine();

      for(char ch : str.toCharArray()) {
        freq.put(ch , freq.getOrDefault(ch , 0)+1);
      }
      
      System.out.println(freq);
      sc.close();
    }
}
