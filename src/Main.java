import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name = "N/A";
        System.out.println("Kirjoita nimesi:");
        name = scanner.nextLine();
        System.out.println(reverseName(name));
    }

    static String reverseName(String name){
        String reversedName = "";
        for(int i = name.length()-1; name.length() != reversedName.length(); i--){
            reversedName += name.charAt(i);
        }
        return reversedName;
    }
}
