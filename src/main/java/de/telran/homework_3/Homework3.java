package de.telran.homework_3;

//public class Homework3 {
//    static String str = new String("I study Basic Java!");
//    public static void handlingString(String str){
//
//
//        System.out.println(str.charAt(str.length()-2));
//
//        if (str.contains("Java")){
//            System.out.println("Строка содержит слово 'Java' это - " + str.contains("Java"));
//        } else System.out.println("Строка не содержит слово 'Java' это - " + str.contains("Java"));
//        System.out.println(str.substring(0, 14));
//        System.out.println(str.replace('a', 'o'));
//
//        System.out.println(str.toUpperCase());
//        System.out.println(str.toLowerCase());
//
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Начало работы программы");
//
//        handlingString(str);
//        System.out.println("Конец работы программы");
//
//
//    }
//}



public class Homework3 {
    public static class homework_3 {
        public static void main(String[] args) {
            String str = new String("I study Basic Java!");
            System.out.println(str);

            char c = str.charAt(str.length()-2);
            System.out.println(c);

            boolean containsJava = str.contains("Java");
            System.out.println(containsJava);

                    String str2 = str.substring(0, str.indexOf("Java")) + str.substring(str.indexOf("Java") + "Java".length());
                    System.out.println(str2);

//            // System.out.println(str.replace("Java", ""));

            //        String result = str.substring(12, 16);
            //        System.out.println(result);

            //        System.out.println(str.substring(0, 13));
            //        System.out.println(str.substring(str.length() -1));



            String replacedAtoO = str.replace('a', 'o');
            System.out.println(replacedAtoO);

            String upperCase = str.toUpperCase();
            System.out.println(upperCase);

            String lowerCase = str.toLowerCase();
            System.out.println(lowerCase);

        }
    }
}
