import java.util.ArrayList;

public class OncogeneDetector {

	public boolean isOncogene(ArrayList<String> healthySequences, ArrayList<String> cancerSequences, String canidate) {
		int hCount = 0;
		int cCount = 0;
		if (canidate.equals("")){
			return false;
		}
		for (String s : healthySequences) {
			if (s.contains(canidate)){
				hCount += 1;
			}
		}
		double hfCount = hCount/healthySequences.size();
		for (String s : cancerSequences) {
			if (s.contains(canidate)){
				cCount += 1;
			}
		}
		double cfCount = cCount/cancerSequences.size();
		if (hCount <= cCount){
			return true;			
		}
		else {
			return false;
		}
	}

}
