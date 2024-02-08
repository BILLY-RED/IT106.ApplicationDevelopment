
//IrishMancera
//BSIT3A,2nd SEMESTER
//08-02-2024
//IT106-Application Development

//JAVA
//This code is intended to append to txt file, email addreses that is inputted by the user
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Manage {

    public static void Manage(String filename, String email) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename, true))) {
            writer.println(email); // Append email to file
            System.out.println("Email appended to file successfully.");
        } catch (IOException e) {
            System.err.println("Error: Unable to open file.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String filename = "account.txt"; // Name of the file to append emails
        String email;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the email to append: ");
        email = scanner.nextLine();

        Manage(filename, email);

        scanner.close();
    }
}
