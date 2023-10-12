import javax.xml.crypto.Data;

abstract class Weapon {
    public static double Damege;
    public static double AttackSpeed;
    public static double Strength;
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
        System.out.println("Оружие починено");
        Strength = 100;
        return Strength;
    }
    public static void сheckTheConditionOfTheWeapon()
    {
        System.out.println("Прочность оружия" +" "+ Strength);
    }
}
