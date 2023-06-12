import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BancoDePalavras {
    private String fileName = "wordsFile.txt";
    private Path pathToWordsFile = Paths.get(fileName);
    List<String> wordsList = new ArrayList<>();

    File file = new File(pathToWordsFile.toAbsolutePath().toString());

    public void addWords() throws FileNotFoundException{

        Scanner scFile = new Scanner(file);

        while(scFile.hasNextLine()){
            wordsList.add(scFile.nextLine());
        }
    }
    
}
