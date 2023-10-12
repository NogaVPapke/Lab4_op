import java.util.Scanner;

public class ReadChoice {
    public static int readChice()
    {
        Scanner scanner = new Scanner(System.in);
        int readed = -1;
        try
        {
            readed = Integer.parseInt(scanner.nextLine());
        }
        catch (NumberFormatException ex)
        {
            System.out.println("Вводите только значения пунктов меню");
            readed = readChice();
        }
        return readed;
    }
}
