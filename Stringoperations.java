package assignments;

public class Stringoperations {

    public static void main(String[] args) {

        String str = "  Hello Java World  ";
        
        System.out.println("Length: " + str.length());

        System.out.println("Is Empty: " + str.isEmpty());

        System.out.println("Character at index 2: " + str.charAt(2));

        System.out.println("To String: " + str.toString());

        System.out.println("Equals 'Hello': " + str.equals("Hello"));
               
        System.out.println("Compare To 'Hello': " + str.compareTo("Hello"));

        System.out.println("Contains 'Java': " + str.contains("Java"));

        System.out.println("Index of 'Java': " + str.indexOf("Java"));

         System.out.println("Last index of 'o': " + str.lastIndexOf('o'));

        System.out.println("Starts with '  He': " + str.startsWith("  He"));

         System.out.println("Ends with 'World  ': " + str.endsWith("World  "));

        
        System.out.println("Matches regex: " + str.matches(".*Java.*"));

        
        System.out.println("Substring: " + str.substring(2, 7));

        
        System.out.println("Lower case: " + str.toLowerCase());

       
        System.out.println("Trimmed string: '" + str.trim() + "'");

        
        System.out.println("Replace Java with Python: " + str.replace("Java", "Python"));

        
        String[] words = str.trim().split(" ");
        System.out.println("Split words:");
        for (String w : words) {
            System.out.println(w);
        }

     
        String joined = String.join("-", words);
        System.out.println("Joined string: " + joined);

   
        int num = 100;
        String numStr = String.valueOf(num);
        System.out.println("Value of int to String: " + numStr);

    
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println("StringBuffer: " + sb);

       
        StringBuilder sbd = new StringBuilder("Java");
        sbd.append(" Programming");
        System.out.println("StringBuilder: " + sbd);
    }
}
