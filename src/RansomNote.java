import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RansomNote {
	Map<String, Integer> magazineMap;
	Map<String, Integer> noteMap;
	String mag;
	String note;

	public RansomNote(String magazine, String message) {
		mag = magazine;
		note = message;
	}

	public boolean solve() {

		magazineMap = new HashMap<String, Integer>();
		noteMap = new HashMap<String, Integer>();
		int wordsGotten = 0;
		boolean canMakeNote = false;

		if (noteMap.size() < magazineMap.size()) {

			for (int i = 0; i < mag.split(" ").length; i++) {
				magazineMap.put(mag.split(" ")[i], i);
			}
			for (int j = 0; j < note.split(" ").length; j++) {
				noteMap.put(note.split(" ")[j], j);
			}
			for (int k = 0; k < noteMap.size(); k++) {
				for (int l = 0; l < magazineMap.size(); l++) {
					if (noteMap.get(k).equals(magazineMap.get(l))) {
						magazineMap.remove(l);
						l--;
						wordsGotten++;
						System.out.println(magazineMap);
					}
				}
			}

			if (wordsGotten == noteMap.size()) {
				canMakeNote = true;
			}
		}

		return canMakeNote;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		RansomNote s = new RansomNote(scanner.nextLine(), scanner.nextLine());
		scanner.close();

		boolean answer = s.solve();
		if (answer)
			System.out.println("Yes");
		else
			System.out.println("No");

	}
}