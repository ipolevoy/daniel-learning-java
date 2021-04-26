package hw13;

public class DisplayMessage implements Runnable {
   private String message;
   private int count = 0;
   
   public DisplayMessage(String message) {
      this.message = message;
   }
   
   public void run() {
      while(true) {

         try {
            Thread.sleep(300);
            System.out.println(message + " " + count++);

            if(count > 50){
               break;
            }

         } catch (InterruptedException ignore) {}

      }
   }
}
