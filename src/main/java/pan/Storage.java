package pan;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Storage {
    public Storage() {}

    public void save(List<Task> tasks) {
        try{
            String filePath = "./src/main/java/pan/output/pan.txt";
            File outputFile = new File(filePath);
            FileWriter writer = new FileWriter(outputFile, false);
            // attempts to create the new file
            outputFile.createNewFile();
            StringBuilder sb = new StringBuilder();
            tasks.stream().forEach(task -> sb.append(task.toString() + "\n"));
            writer.write(sb.toString());
            writer.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        } 
    }
}