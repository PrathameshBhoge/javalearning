package learnjava.basic;


import java.util.Scanner;

public class string_methods {

      public static void main(String [] args){
          Scanner sc = new Scanner(System.in);



           //String str =sc.nextLine();
          //String str="     Sandy    ";
            String str = "Pratu";
          str.length();
          str.toLowerCase();
          str.toUpperCase();
          str.trim();
          str.substring(1);
          str.substring(2 ,5);
          str.replace('r','a');
          str.startsWith("Pra");
          str.endsWith("t");
          str.charAt(3);
          str.indexOf('u');
          str.equals("Pratu");
          str.equalsIgnoreCase("pratu");
          System.out.println(str.substring(2));



          //Escape sequece
          //  \n- newLine  \t-tab   \'-singleQuote   \\-Backslash
      }


}
