import javax.sound.sampled.Line;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;


public class SurveyDataAnalyzer {
    public static CustomHashTable readResponsesFromFile(String filePath){
        List<String> data = readFileToList(filePath);
        CustomHashTable customHashTable = new CustomHashTable();
    }



    public static List<String> readFileToList(String filePath){
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(Paths.get(filePath));


        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    public static void main(String[] args) {
        List<String> list = readFileToList("responses.txt");
        System.out.println(list);
    }

    }
