public class Poligon
{
    static double hp = 1000;
    public static void RangeAttackDummy()
    {
        hp = hp - RangeWeapon.damageDiling();
        if (hp <= 0)
        {
            System.out.println("Манекен уничтожен");
            hp = Dummy.replacingTheDummy(hp);
        }
        System.out.println("Манекен поврежден" +" "+ hp);
    }
    public static void сheckTheConditionOfTheRangeWeaponWeapon()
    {
        RangeWeapon.сheckTheConditionOfTheWeapon();
    }

    public static void сheckTheConditionOfTheMeleeWeaponWeapon()
    {
        MeleeWeapon.сheckTheConditionOfTheWeapon();
    }
    public static void MeleeAttackDummy()
    {
        hp = hp - MeleeWeapon.damageDiling();
        if (hp <= 0)
        {
            System.out.println("Манекен уничтожен");
            hp = Dummy.replacingTheDummy(hp);
        }
        System.out.println("Манекен поврежден" +" "+ hp);
    }

    public static void replacementDummy(){
        Dummy.replacingTheDummy(hp);
    }
}
