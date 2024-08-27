public class Main {

    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
    }

    private static boolean hasTeen(int num1, int num2, int num3) {

        if (num1 < num3) ;

        else {
            return false;
        }
            if (num3 > num2) ;

            else {
                return true;
            }

        return false;
    }

}