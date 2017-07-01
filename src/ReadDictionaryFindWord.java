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

	public ReadDictionaryFindWord() {
		readWords();
	}

	private void readWords() {
		File dict = new File("dictionary.txt");
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
	}

	public int size() {
		return words.size();
	}

	public List<String> getWord() {
		return words;
	}

}
