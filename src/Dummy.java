public class Dummy {
    public static double displayTheDummy()
    {
        double hp = 1000;
        return (hp);
    }
    public static double replacingTheDummy(double hp)
    {
        if (hp >= 1000)
        {
            System.out.println("Манекен цел. Замена не нужна");
        }
        else if (hp < 1000)
            hp = displayTheDummy();
            System.out.println("Манекен сменен"+" "+ hp);
        return(hp);
    }
}
