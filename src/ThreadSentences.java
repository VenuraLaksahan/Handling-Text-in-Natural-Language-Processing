import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class ThreadSentences {
public static void main(String[ ] args) throws FileNotFoundException, IOException {
    for (int j = 1; j <= 39; j++){
        File file = new File("ThreadsRemovedTags\\Thread" + j + ".txt"); 
        File outfile = new File("ThreadsSentences\\threadSentence" + j + ".txt");
BufferedReader read = new BufferedReader(new FileReader(file));
BufferedWriter write = new BufferedWriter(new FileWriter(outfile));
String reader;
while((reader = read.readLine( ))!= null){
String[ ] newString = reader.split("\\.");
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
}
