public class Two {
    public static void main(String[] args) {
        double catet1 = 3;
        double catet2 = 4;

        double square = 0.5 * catet1 * catet2;
        double hipotenuza = Math.sqrt(catet1 * catet1 * catet2 * catet2);
        double perimeter = catet1 + catet2 + hipotenuza;

        System.out.println("Прямокутний трикутник з катетами:"+ catet1 + "'і'"+ catet2 + "");
        System.out.println("Площа:" +square+ "кв.од.");
        System.out.println("Периметр:"+perimeter);
    }
}

