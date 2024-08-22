package dip;

public class Main {
	 public static void main(String[] args) {
         MessageService emailService = new EmailService();
         MessageService smsService = new SMSService();

         MyApplication app = new MyApplication(emailService);
         app.processMessage("Hello via Email!");

         app = new MyApplication(smsService);
         app.processMessage("Hello via SMS!");
     }
}
