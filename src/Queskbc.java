import java.util.ArrayList;
import java.util.HashMap;
public class Queskbc{
	static ArrayList<String> ques = new ArrayList<String>();
	static HashMap<Integer,Character> ans = new HashMap<Integer,Character>();
	int choice;
	public void Questions() {	
		
		ques.add("RASH/Prickly heat (Ghamoriyan) is associated with?\r\n" + 
				"(A) Hair (B) Skin \r\n" + 
				"(C) Nails (D) Eyes\n");
		ques.add("Which of these flowers have prickles on their stems ?\r\n" + 
				"(A) Genda (B) Kamal \r\n" + 
				"(C) Gulab (D) Rajanigandha\n");
		ques.add("In Which of these sports are a “ball” , “gloves” and “helmet” part of playing equipment ?\r\n" + 
				"(A) Hockey (B) Volleyball \r\n" + 
				"(C) Tennis (D) Badminton\n");
		ques.add("According to Islamic tradition ,in which month was the holy Quran revealed to the Prophet Mohammad?\r\n" + 
				"(A) Muharram (B) Dhu al – Hijjah \r\n" + 
				"(C) Ramadan (D) Rajab\n");
		ques.add("In which of these sectors was 51% FDI permitted by the Government of India in 2012?\r\n" + 
				"(A) Multi-brand retail (B) Healthcare \r\n" + 
				"(C) Life Insurance (D) Civil Aviation\n");
		ques.add("Which of these metals or non-metals is the main constituent of both brass and bronze ?\r\n" + 
				"(A) Carbon (B) Lead \r\n" + 
				"(C) Copper (D) Silver\n");
		ques.add("Kanchenjunga is widely regarded as the guardian deity of which state ?\r\n" + 
				"(A) Assam (B) Arunachal Pradesh \r\n" + 
				"(C) West Bengal (D) Sikkim");
		ques.add("On which of these routes does India’s fastest passenger train run ?\r\n" + 
				"(A) New Delhi – Bhopal (B) New Delhi – Jaipur \r\n" + 
				"(C) Mumbai – Pune (D) New Delhi – Lucknow\n");
		ques.add("As a captain, which cricketer holds the record for winning the most number of tests?\r\n" + 
				"(A) Graeme Smith (B) Ricky Ponting \r\n" + 
				"(C) Steve Waugh (D) Arjuna Ranatunga\n");
		ques.add("The first woman president of India, Pratibha Patil, was the first woman governor of which state ?\r\n" + 
				"(A) Maharashtra (B) Rajasthan \r\n" + 
				"(C) Gujarat (D) Goa\n");

		
	}
	public int Answers(int n) {
		
		ans.put(0,'B');
		ans.put(1,'C');
		ans.put(2,'A');
		ans.put(3,'C');
		ans.put(4,'A');
		ans.put(5,'C');
		ans.put(6,'D');
		ans.put(7,'A');
		ans.put(8,'B');
		ans.put(9,'B');
		return(ans.get(n));
	}
	public String get(int choice) {
		
		this.choice = choice; 
		
		return ques.get(choice);
	}

}
