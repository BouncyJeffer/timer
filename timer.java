// Open source simple timer created by Ajay G
class timer {
	public static void main(String[] args){
		 int seconds = 0;
		 int minutes = 0;
		 int hours = 0;
		 String minutesMsg = "";
		 String hoursMsg = "";
		 while(true){
		 	if(seconds == 60){
		 		minutes++;
		 		minutesMsg = "Minutes: " + minutes;
		 		seconds = 0;
		 	}
		 	if(minutes == 60){
		 		hours++;
		 		hoursMsg = "Hours: " + hours;
		 		minutes = 0;
		 	}
		 	try {
		 		Thread.sleep(1000);
		 	} catch (InterruptedException ex){
		 		Thread.currentThread().interrupted();
		 	}
		 	String display;
		 	System.out.println(hoursMsg + minutesMsg + " Seconds: " + seconds++);
		 }
	}
}
