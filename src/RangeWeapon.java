public class RangeWeapon extends Weapon {
    static double Damege = 10;
    static double AttackSpeed = 10;
    static double Ammo = 5;
    static double Accuracy = 0.5;
    static double Strength = 100;
    static  double Ammunation = Ammo;
    public static double damageDiling()
    {

        double DamegeDiling = Damege * AttackSpeed * Accuracy;
        Strength--;
        Ammo--;
        if (Ammo == 0) {
            System.out.println("Требуется перезарядка" +" "+ Ammo);
            Ammo = Reload();
        }
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
    public static double Reload() {
        Ammo = Ammunation;
        System.out.println("Перезарядка произведена. Количество потронов" +" "+ Ammo);
        return (Ammo);
    }
    public static void сheckTheConditionOfTheWeapon()
    {
        System.out.println("Количество патронов в магазине" +" "+ Ammo);
        System.out.println("Прочность оружия" +" "+ Strength);
    }
}
