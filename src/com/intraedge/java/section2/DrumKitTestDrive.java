/**
 * Unscramble the program to print this output to the console:
 * bang bang ba-bang
 * ding ding da-ding
 */



class DrumKitTestDrive {
    public static void main(String args[]) {


        DrumKit d = new DrumKit();

        if (d.snare == true) {
            d.playSnare();
        }

        d.snare = false;

        d.playSnare();
        d.playTopHat();
    }
}

 class DrumKit {
     boolean topHat = true;
     boolean snare = true;
     void playTopHat() {
         System.out.println("ding ding da-ding");
     }

     void playSnare() {
         if (this.snare) {

             System.out.println("bang bang ba-bang");
         }
     }

 }