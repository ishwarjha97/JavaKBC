import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Display extends Queskbc {
	int round=0,unique;
	String select;
	int choice[] = new int[10];
	Random n = new Random();
	void DispQues(int n) {
		Queskbc k = new Display();
		k.Questions();
        System.out.println(k.get(n));
        
	}
}
