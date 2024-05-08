public class barkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(false,1));
    }

    public static boolean shouldWakeUp(boolean isBarking,int hourOfDay){
        boolean giveSignal = false;
        if(isBarking){
            if (hourOfDay < 0 || hourOfDay > 23){
                giveSignal = false;
            }
            else if(hourOfDay < 8 || hourOfDay > 22){
                giveSignal = true;
            }
        }

        return giveSignal;
    }
}

