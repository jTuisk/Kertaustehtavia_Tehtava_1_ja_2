import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name = "N/A";
        System.out.println("Kirjoita nimesi:");
        name = scanner.nextLine();
        name = cleanUpName(name);
        System.out.println(reverseName(name));
        System.out.println(checkPalindrome(name));
    }

    static String cleanUpName(String name){
        String cleanName = "";
        name.toLowerCase();
        cleanName = name.replaceAll("[^a-zA-Z -]", "");
        return cleanName;
    }
    static String reverseName(String name){
        String reversedName = "";
        for(int i = name.length()-1; name.length() != reversedName.length(); i--){
            reversedName += name.charAt(i);
        }
        return reversedName;
    }

    static String checkPalindrome(String name){
        if(name.equals(reverseName(name)))
            return "Nimi on palindromi";

        return "Nimi ei ole palindromi";
    }
}
