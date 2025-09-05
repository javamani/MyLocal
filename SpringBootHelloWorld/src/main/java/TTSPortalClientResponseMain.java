import com.javainuse.dto.TTSPortalClientResponse;

public class TTSPortalClientResponseMain {
	
	public static void main(String args[]) {
		String response = "{\"response\":\"s\"}";
		
		TTSPortalClientResponse ttsPortalClientResponse = new TTSPortalClientResponse(response);
		System.out.println("Printout using constructor is " + ttsPortalClientResponse.toString());
		
		TTSPortalClientResponse ttsPortalClientResponse1 = new TTSPortalClientResponse();
		ttsPortalClientResponse1.setResponse(response);
		System.out.println("Printout using response setObject is " + ttsPortalClientResponse1.toString());
		
		
	}

}
