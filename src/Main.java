public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the DMV!");
        int number = (int)Math.floor(Math.random() * 99);
        System.out.println("You are number :"+ number);
        int callingNumber = number +1;

        if(number == 99){
            callingNumber = 1;
        }
        while(callingNumber != number){
            callingNumber++;
            System.out.println("Now helping number: "+callingNumber);
            if(callingNumber > 99){
                callingNumber = 0;
            }

        }
        System.out.println("You idiot, you are missing half of the documents... NEXT!");
    }
}