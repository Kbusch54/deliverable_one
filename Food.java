package event;
import java.util.Scanner; 
public class Food {

	public static void main(String[] args) {
		
		String result = "";
		Scanner Scar = new Scanner(System.in);
		System.out.println("Please enter the event type you'll be having.");
		String eventType = Scar.next();
		System.out.println("Please enter the amount of people you will be entertaining.");
		int partySize = Scar.nextInt();
	
		
		if ("formal".equals(eventType)) {
				
				if  ((partySize > 1) && (partySize < 13)) {
					result = ("Since you are hosting a " + eventType + " event for " + partySize + " guests you should serve chicken parseman prepared in your kitchen.");
					
				}
					if (partySize == 1) {
						result = ("Since you are hosting a " + eventType + " event for " + partySize + " person you should serve chicken parsmeman prepared by your microwave.");
					}
					if (partySize >12) {
						result = ("Since you are hosting a " + eventType + " event for " + partySize + " guests you should serve chicken parseman prepared by a caterer."
								);
		}
		}						
		if ("casual".equals(eventType)) {			
				if ((partySize > 1) && (partySize < 13)) {
							result = ("Since you are hosting a " + eventType + " event for " + partySize + " guests you should serve sandwhiches prepared in your kitchen.");	
						}
					if (partySize == 1) {
								result = ("Since you are hosting a " + eventType + " event for " + partySize + ", you should serve sandwhiches prepared in your microwave.");
							}
					if (partySize >12) {
								result = ("Since you are hosting a " + eventType + " event for " + partySize + " guests you should serve sandwhiches prepared by a caterer.");
					}
					}	
		if ("semi-formal".equals(eventType)) {
			
				if ((partySize > 1) && (partySize < 13)) {
						result = ("Since you are hosting a " + eventType + " event for " + partySize + " guests you should serve fried chicken prepared in your kitchen.");				
					}
					if (partySize == 1) {
							result = ("Since you are hosting a " + eventType + " event for " + partySize + ", you should serve fried chicken prepared in your microwave.");
						}
					if (partySize >12) {
							result = ("Since you are hosting a " + eventType + " event for " + partySize + " guests you should serve fried chicken prepared by a caterer.");
				}
				}
		
		System.out.println(result);
		}
}
