public class MeleeWeapon extends Weapon
{
    static double Damege = 5;
    static double AttackSpeed = 20;
    static double Strength = 100;
    public static double damageDiling()
    {
        double DamegeDiling = Damege * AttackSpeed;
        Strength--;
        if (Strength <= 0)
        {
            System.out.println("Требуется ремонт оружия" +" "+ Strength);
            Strength = weaponRepeair();
        }
        return DamegeDiling;
    }

    public static double weaponRepeair()
    {
        if (Strength == 100)
        {
            System.out.println("Орижие цело ремонт не требуется" +" "+ Strength);
        }
        else
        {
            Strength = 100;
            System.out.println("Ремонт произведен. состояние оружия" +" "+ Strength);
        }
        return Strength;
    }
    public static void сheckTheConditionOfTheWeapon()
    {
        System.out.println("Прочность оружия" +" "+ Strength);
    }
}
