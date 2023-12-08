import java.util.Scanner;
public class NokiaPhone{
  public static void main(String[]args){
  Scanner input = new Scanner(System.in);

System.out.println("1:Phonebook");
System.out.println("2:Messages");
System.out.println("3:Chat");
System.out.println("4:Call Register");
System.out.println("5:Tones");
System.out.println("6:Settings");
System.out.println("7:Call Divert");
System.out.println("8:Games");
System.out.println("9:Calculator");
System.out.println("10:Reminders");
System.out.println("11:Clock");
System.out.println("12:Profiles");
System.out.println("13:Sim Services");

System.out.print("Please enter to select:");
int option = input.nextInt();

  if (option == 1){
System.out.println("PHONEBOOK");
System.out.println("1:Search");
System.out.println("2:Service Nos");
System.out.println("3:Add Name");
System.out.println("4:Erase");
System.out.println("5:Edit");
System.out.println("6:Assign tone");
System.out.println("7:Send b'Card");
System.out.println("8:Options");
System.out.println("9:Speed Dials");
System.out.println("10:Voice tags");

System.out.print("Please enter a selection:");
 int selection = input.nextInt();

if (selection == 8){
System.out.println("1:Type of view");
System.out.println("2:Memory status");

 }
 
}


if (option == 2){
System.out.println("MESSAGES");
System.out.println("1:Write messages");
System.out.println("2:Inbox");
System.out.println("3:Outbox");
System.out.println("4:Picture messages");
System.out.println("5:Templates");
System.out.println("6:Smileys");
System.out.println("7:Message settings");
System.out.println("8:Info service");
System.out.println("9:Voice mailbox number");
System.out.println("10:Service command editor");

System.out.print("Please enter a selection:");
 int selection = input.nextInt();

if (selection == 7){
System.out.println("1:Set1");
System.out.println("2:Common");

System.out.print("Please enter a selection:");
selection = input.nextInt();

if (selection == 1){
System.out.println("1:Message center number");
System.out.println("2:Messages sent as");
System.out.println("3:Message validity");
 }

if (selection == 2){
System.out.println("1:Delivery reports");
System.out.println("2:Reply via same centre");
System.out.println("3:Character support");

 }
}
}




if (option == 3){
System.out.println("CHAT");
}

if (option == 4){
System.out.println("CALL REGISTER");
System.out.println("1:Missed calls");
System.out.println("2:Received");
System.out.println("3:Dailed numbers");
System.out.println("4:Erase recent call lists");
System.out.println"5:Show call duration");
System.out.println("6:Show call costs");
System.out.println("7:Call cost settings");
System.out.println("8:Prepaid credit");

System.out.print("Please enter selection:");
 int selection = input.nextInt();


if (selection == 5){
System.out.prinln("Show call durations");
System.out.println("1:Last call duration");
 System.out.println("2:All calls' duration");
  System.out.println("3:Received calls' duration");
  System.out.println("4:Dailed calls' duration");
  System.out.println("5:Clear timers");
}

if (selection == 6){
System.out.println("Show call costs");
System.out.println("1:Last call costs");
System.out.println("2:All calls' cost");
System.out.println("3:Clear counters");
}

 if (selection == 7){
System.out.println("Call cost settings");
System.out.println("1:Call cost limit") ;
System.out.println("2:Show cost limit");

 }
 }


if (option == 5){
System.out.println("TONES");
System.out.println("1:Ringing tone");
System.out.println("2:Ringing volume");
System.out.println("3:Incoming call alert");
System.out.println("4:Composer");
System.out.println("5:Message alert tone");
System.out.println("6:Keypad tones");
System.out.println("7:Warning and game tones");
System.out.println("8:Vibrating alert");
System.out.println("9:Screen saver");
}

if (option == 6){
System.out.println("SETTINGS");
System.out.println("1:Call settings");
System.out.println("2:Phone settings");
System.out.println("3:Security settings");
System.out.println("4:Restore factory settings");

System.out.print("Please enter selection:");
int selection = input.nextInt();

if (selection == 1){
System.out.println("CALL SETTINGS");
System.out.println("1:Automatic redial");
System.out.println("2:Speed dialing");
System.out.println("3:Call waiting options");
System.out.println("4:Own number sending");
System.out.println("5:Phone line in use");
System.out.println("6:Automatic answer");
}

if (selection == 2){
System.out.println("PHONE SETTINGS");
System.out.println("1:Language");
System.out.println("2:Cell info display");
System.out.println("3:Welcome note");
System.out.println("4:Network selection");
System.out.println("5:Lights");
System.out.println("6:Confirm SIM service actions");
}

if (selection == 3){
System.out.println("SECURITY SETTINGS");
System.out.println("1:PIN code request");
System.out.println("2:Call baring service");
System.out.println("3:Fixed dialing");
System.out.println("4:Closed user group");
System.out.println("5:Phone security");
System.out.println("6:Changed access codes");
}

if (selection == 4){
System.out.println("Restore factory settings");
 }
}

if (option == 7){
System.out.println("CALL DIVERT");
}

if (option == 8){
System.out.println("GAMES");
}

if (option == 9){
System.out.println("CALCULATOR");
}
if (option == 10){
System.out.println("REMINDERS");
}

if (option == 11){
System.out.println("CLOCK");
System.out.println("1:Alarm clock");
System.out.println("2:Clock settings");
System.out.println("3:Date setting");
System.out.println("4:Stopwatch");
System.out.println("5:Countdown timer");
System.out.println("6:Auto update of date and time");
}

if (option == 12){
System.out.println("PROFILES");
}

if (option == 13){
System.out.println("SIM SERVICES");
}




}

}
















 









