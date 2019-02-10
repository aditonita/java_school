package java_school;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class ReadFile {

	private List<String> lines = new ArrayList<>();

	public ReadFile(String file) {
		try (BufferedReader r = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = r.readLine()) != null) {
				lines.add(line);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public final List<String> getLines() {
		
		return new ArrayList<String> (lines);
	}
	
	
}
