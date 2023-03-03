public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the DMV!");
        int number = (int)Math.floor(Math.random() * 199);
        int miracle = (int)Math.floor(Math.random() * 100);
        System.out.println("You are number :"+ number);
        int callingNumber = number +1;

        if(number == 199){
            callingNumber = 1;
        }
        while(callingNumber != number){
            callingNumber++;
            System.out.println("Now helping number: "+callingNumber);
            if(callingNumber > 199){
                callingNumber = 0;
            }

        }
        if(miracle == 7) {System.out.println("Alright, everything is here, you are all set!");}
        else {
            System.out.println("You FOOL! You are missing half of the documents... BYE BYE! WA HA HA HA!");
        }
    }
}