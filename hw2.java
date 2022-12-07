//Напишите метод, который принимает на вход строку (String) и
//определяет является ли строка палиндромом (возвращает boolean значение).
public class hw2{

    public static void main(String[] args) {
        System.out.println(isPalindrome("aboba"));
        System.out.println(isPalindrome("ротор"));
        System.out.println(isPalindrome("2002"));
        System.out.println(isPalindrome("amogus"));
    }

    public static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(new StringBuffer(str).reverse().toString());
    }
}
