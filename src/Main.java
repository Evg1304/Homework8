public class Main {
    public static void main(String[] args) {
    printIsLeap( 2020);
    }
        private static void printIsLeap(int year){
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("Год високосный.");
            } else {
                System.out.println("Год не високосный.");
            }
        }
        private static void printMessage(int clientOS, int clientDeviceYear){
            if (clientDeviceYear < 2015 ){
                System.out.println("Установите облегченную версию приложения");
            }
            else {
                System.out.println("Установите  версию приложения");
            }

            if ( clientOS == 1){
                System.out.println("для Android по ссылке.");
            }
            else {
                System.out.println("для IOS по ссылке.");
            }
        }
        private static void printCalculate(int distance){
            int start = 20;
            int step = 40;
            int result1 = 1;
            if (distance >= start){
                result1 = Math.abs(distance-start)/step+2;
            }
            System.out.println("Потребуется дней: " + result1);

        }
}