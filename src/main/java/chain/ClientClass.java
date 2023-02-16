package chain;

public class ClientClass {
    public static void main(String[] args) {
        Notifier report = new SimpleReportNotifier(Priority.INFO);
        Notifier email = report.setNextNotifier(new EmailNotifier(Priority.IMPORTANT));
        Notifier sms = email.setNextNotifier(new SmsNotifier(Priority.ASAP));


        report.notifyManager("Everything is ok", Priority.INFO);
        report.notifyManager("Something is crashed", Priority.IMPORTANT);
        report.notifyManager("Everything is crashed", Priority.ASAP);
    }

}
