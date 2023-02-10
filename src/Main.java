import java.time.LocalDate;
public class Main {

    public static void main(String[] args) {
        // Input for methods, for testing purposes
        int year = 2003;        // Task#1 input
        int oS = 0;             // Task#2 input
        int deviceYear = 2021;  // Task#2 input
        int distance = 50;      // Task#3 input


        System.out.println("Task#1 Is Year Leap:");
        isYearLeap(year);

        System.out.println("Task#2 Suggest Version:");
        getVersion(oS,deviceYear);

        System.out.println("Task#3 Bank card delivery:");
        int days = deliverCard(distance);
        System.out.println("\tYour card will be delivered in " + days + ((days==1)?" day":" days"));

    }

    public static void isYearLeap(int year){
        if ((year%4==0)&&(year%100!=0)||(year%400==0)){
            System.out.println("\t"+ year + " — високосный год\n");
        }else {
            System.out.println("\t"+ year + " — не високосный год\n");
        }
    }

    public static void getVersion(int clientOS, int deviceYear){
        int currentYear = LocalDate.now().getYear();

        String tempStr = (deviceYear < currentYear)?"\tУстановите облегченную версию приложения ":"\tУстановите версию приложения "; // if (deviceYear < currentYear) than suggest lite version
        String osName = (clientOS == 0)?"для iOS по ссылке\n":"для Android по ссылке\n"; // 0 - iOS, 1 - Android

        System.out.println(tempStr + osName);
    }

    public static int deliverCard(int deliveryDistance) {
        int deliveryTime = 1; // Less than 20 km 1 day delivery

        if (deliveryDistance>20){
            deliveryTime++;
        }
        if((deliveryDistance>60) && (deliveryDistance<=100)){
            deliveryTime++;
        }
        if(deliveryDistance>100){
            deliveryTime = -1;
        }
        return deliveryTime;
    }
}
