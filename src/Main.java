import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int value = 0;
        int choise = -1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Выберете оружие");
            System.out.println("1 - AK-15");
            System.out.println("2 - Нож бабочка");
            System.out.println("0 - Выход");
            choise = ReadChoice.readChice();
            switch (choise) {
                case 1:
                    value = 1;
                    break;
                case 2:
                    value = 2;
                    break;
                case 0:System.exit(0);
                    break;
                default:System.out.println("нет такого пункта меню");
            }
            if(value == 1)
            {
                Poligon Soldat = new Poligon();
                Soldat.RangeAttackDummy();
                RangeWeapon.weaponRepeair();
                Poligon.сheckTheConditionOfTheRangeWeaponWeapon();


            }
            if(value == 2)
            {
                Poligon Soldat = new Poligon();
                Soldat.MeleeAttackDummy();
                MeleeWeapon.weaponRepeair();
                Poligon.сheckTheConditionOfTheMeleeWeaponWeapon();
            }
        }while (choise !=0);
    }
}