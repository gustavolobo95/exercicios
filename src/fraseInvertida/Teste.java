package fraseInvertida;
import java.util.Locale;
import java.util.Scanner;
public class Teste {
public static void main(String[] args) {
	
	final String[] messages = {
	        "Ana",
	        "hannah",
	        "",
	        "O lobo ama o bolo",
	        "A Daniela ama a lei? Nada!",
	        "Ande logo, ela vale o gol, Edna!",
	        "o bolo é gostoso"
	    };

	    for (String message : messages) {
	      System.out.printf("%s -> %s%n", message, isPalindrome(message));
	    }
	  }

	  private static boolean isPalindrome(final String message) {
	    final String cleanMessage = message.replaceAll("\\W", "");
	    return new StringBuilder(cleanMessage).reverse().toString().equalsIgnoreCase(cleanMessage);
	  }
    
}
