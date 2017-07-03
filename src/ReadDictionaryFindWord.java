import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadDictionaryFindWord {
	int upperBound;
	List<String> words = new ArrayList<String>();
	String wordChoice;

	public List<String> readWords(String wordChoice) {
		String fileChoice = null;
		switch (wordChoice) {
		case "farm":
			fileChoice = "farm_animal_words.txt";
			break;
		case "clothes":
			fileChoice = "clothes_words.txt";
			break;
		case "castle":
			fileChoice = "castle_words.txt";
			break;
		case "car":
			fileChoice = "car_part_words.txt";
			break;
		case "regular":
			fileChoice = "dictionary.txt";
			break;
		}
		File dict = new File(fileChoice);
		BufferedReader br = null;
		String line = null;
		try {
			br = new BufferedReader(new FileReader(dict));
			while ((line = br.readLine()) != null) {
				words.add(line.trim().toLowerCase());
			}
		} catch (FileNotFoundException fe) {
			throw new RuntimeException(
					"Error, cannnot find dictionary.txt file.  Please copy it to " + dict.getAbsolutePath());
		} catch (IOException io) {
			throw new RuntimeException(io);
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException io) {
			}
		}
		return words;
	}

	public int size() {
		return words.size();
	}

	public List<String> getWord(String wordChoice) {
		words = readWords(wordChoice);
		return words;
	}

}
