package hackerrank.iostream;

import java.io.*;
import java.io.IOException;

public class BufferStreams {

	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new FileReader("in.txt"));
				BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt"))) {
			String line = null;
			line = reader.readLine();
			writer.write(line);
		} catch (IOException e) {
			System.out.println(e.getStackTrace());
		}

	}

}
