import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class ThreadWords1 {
public static void main(String[ ] args) throws FileNotFoundException, IOException {
File file = new File("ThreadsSentences/threadSentence1.txt");
File outfile = new File("ThreadsWords/threadWords1.txt");
BufferedReader read = new BufferedReader(new FileReader(file));
BufferedWriter write = new BufferedWriter(new FileWriter(outfile));
String reader;
while((reader = read.readLine( ))!= null){
String[ ] newString = reader.split("\\s+");
for(String s: newString){
System.out.println(s);
write.write(s);
write.newLine( );
}
}
read.close( );
write.close( );
}
}
