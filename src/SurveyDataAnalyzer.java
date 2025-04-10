import java.util.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;


public class SurveyDataAnalyzer {
    public static CustomHashTable readResponsesFromFile(String filePath){
        List<String> Line = readFileToList(filePath);
        CustomHashTable customHashTable = new CustomHashTable();
        for (String line :Line) {
            String[] fields = line.trim().split("\\s+");
            int id = Integer.parseInt(fields[0]);
            String gender = fields[1];
            int age = Integer.parseInt(fields[2]);
            int residence = Integer.parseInt(fields[3]);
            int education = Integer.parseInt(fields[4]);
            int maritalStatus = Integer.parseInt(fields[5]);
            int incomeSource = Integer.parseInt(fields[6]);
            int smoker = Integer.parseInt(fields[7]);
            int year = Integer.parseInt(fields[8]);
            String q9 = fields[9];
            int q10 = Integer.parseInt(fields[10]);
            int q11 = Integer.parseInt(fields[11]);
            int q12 = Integer.parseInt(fields[12]);
            int q13 = Integer.parseInt(fields[13]);
            int q14 = Integer.parseInt(fields[14]);
            int q15 = Integer.parseInt(fields[15]);
            String q16 = fields[16];
            int q17 = Integer.parseInt(fields[17]);
            int q18 = Integer.parseInt(fields[18]);
            int q19 = Integer.parseInt(fields[19]);
            int q20 = Integer.parseInt(fields[20]);
            int q21 = Integer.parseInt(fields[21]);
            int q22 = Integer.parseInt(fields[22]);
            String q23 = fields[23];
            int q24 = Integer.parseInt(fields[24]);
            int q25 = Integer.parseInt(fields[25]);
            int q26 = Integer.parseInt(fields[26]);
            int q27 = Integer.parseInt(fields[27]);
            int q28 = Integer.parseInt(fields[28]);
            int q29 = Integer.parseInt(fields[29]);
            int q30 = Integer.parseInt(fields[30]);

            Response response = new Response(id, gender, age, residence, education, maritalStatus, incomeSource, smoker, year, q9, q10, q11, q12, q13, q14, q15, q16, q17, q18, q19, q21, q22, q23, q24, q20, q25, q26, q27, q28, q29, q30);

            customHashTable.insert(id, response);
        }
        return customHashTable;
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
        CustomHashTable customHashTable = readResponsesFromFile("responses.txt");
        customHashTable.printHashTable();
    }
    }
