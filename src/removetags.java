
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class removetags {
public static void main(String[ ] args) throws FileNotFoundException, IOException {
    for (int j = 1; j <= 39; j++){
        File file = new File("Threads\\Thread" + j + ".txt"); 
        File outfile = new File("ThreadsRemovedTags\\Thread" + j + ".txt");
BufferedReader read = new BufferedReader(new FileReader(file));
BufferedWriter write = new BufferedWriter(new FileWriter(outfile));
String reader;
while((reader = read.readLine( ))!= null){
reader = reader.replaceAll("\\<.*?\\>", "");
System.out.println(reader);
write.write(reader);
write.newLine( );
}
read.close();
write.close();
}
}
}