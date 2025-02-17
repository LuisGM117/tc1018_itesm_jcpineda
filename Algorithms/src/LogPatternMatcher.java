import java.util.Scanner;
import java.util.regex.*;

public class LogPatternMatcher {
	
	private static final String DATE_REGEX = "\\d{1,2}/\\d{1,2}/\\d{4,4} \\d{2}:\\d{2}:\\d{2}";
	
	
	public static Integer getLogEntryLength(String entries){
		
		Scanner scanner = new Scanner(entries);
		int cnt = 1;
		while (scanner.hasNextLine()) {
		  String line = scanner.nextLine();
		  // process the line
		  System.out.println("Line "+ cnt + ":" + line);
		  cnt++;
		}
		
		scanner.close();
		return null;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("8/13/2016 6:07:54 PM 03B4 EVENT   The DNS server has started. \n" );
sb.append("8/11/2016 3:16:44 PM 00DC PACKET  00000000016B80A0 UDP Rcv ::1             9ebb   Q [0001   D   NOERROR] SOA    (5)xyztu(4)labs(0)\n");
sb.append("UDP question info at 00000000016B80A0 \n");
sb.append("Socket = 336 \n");
sb.append("Remote addr ::1, port 64329 \n");
sb.append("8/11/2016 3:16:44 PM 00DC PACKET  00000000016B80A0 UDP Snd ::1             9ebb R Q \n" );
sb.append( "[8085 A DR  NOERROR] SOA    (5)xyztu(4)labs(0) \n");
sb.append("UDP response info at 00000000016B80A0 \n");

		getLogEntryLength(sb.toString());

	}

}
