package ie.atu.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class CopyFileCharBuffer {

	public static void main(String[] args) {
		File inputFile = null;
		File outputFile = null;
		FileReader charInputStream = null;
		FileWriter charOutputStream = null;
		BufferedReader charInputStreamBuffer = null;
		BufferedWriter charOutputStreamBuffer = null;
		String bufferData = null;

		try {
			// Create file instances
			inputFile = new File("./resources/inputHamlet.txt");
			outputFile = new File("./resources/outputHamlet.txt");
			// Create streams
			charInputStream = new FileReader(inputFile);
			charOutputStream = new FileWriter(outputFile);
			// Create stream buffers
			charInputStreamBuffer = new BufferedReader(charInputStream);
			charOutputStreamBuffer = new BufferedWriter(charOutputStream);
			// Read in buffer from file
			while ((bufferData = charInputStreamBuffer.readLine()) != null) {
				// Show buffer data
				System.out.println(bufferData);
				
				charOutputStreamBuffer.write(bufferData);
				charOutputStreamBuffer.newLine();
						
				// Sleep for 500 milliseconds (i.e. half a second) so we can watch write process
				TimeUnit.MILLISECONDS.sleep(500);
			}
			System.out.println("---------------------------------");
			System.out.println("Copy completed successfully! See resources/outputHamlet.txt");
		} catch (NullPointerException nullPtExc) {
			nullPtExc.printStackTrace();
		} catch (FileNotFoundException fnfExc) {
			fnfExc.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (InterruptedException intExc) {
			intExc.printStackTrace();
		} finally {
			try {
				if (charInputStream != null) {
					charInputStreamBuffer.close(); 
					charInputStream.close();
				}
				if (charOutputStream != null) {
					charOutputStreamBuffer.close(); // Flushes buffer, which transfers buffer data from the buffer to the file, then closes buffer.
					charOutputStream.close();
				}
			} catch (IOException ioe) {
				ioe.printStackTrace();
			} // End catch
		} // End finally
		
	} //End main
} //End Class
