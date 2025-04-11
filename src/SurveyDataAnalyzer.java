public class SurveyDataAnalyzer {
    public static int[] genderDistribution(CustomHashTable customHashTable) {
        int[] genderDistribution = new int[4];
        int countGender1 = 0;
        int countGender2 = 0;
        int countGender3 = 0;
        int countGender4 = 0;
        for (int i = 0; i < customHashTable.getSize(); i++) {
            Response response = customHashTable.search(i);
            if (response != null) {
                switch (response.getGender()) {
                    case "F":
                        countGender1++;
                        break;
                    case "M":
                        countGender2++;
                        break;
                    case "O":
                        countGender3++;
                        break;
                    case "-":
                        countGender4++;
                }

            }

        }
        genderDistribution[0] = countGender1;
        genderDistribution[1] = countGender2;
        genderDistribution[2] = countGender3;
        genderDistribution[3] = countGender4;
        System.out.println(genderDistribution[0]);
        System.out.println(genderDistribution[1]);
        System.out.println(genderDistribution[2]);
        System.out.println(genderDistribution[3]);


        return genderDistribution;
    }

    public static int[] ageGroupDistribution(CustomHashTable customHashTable) {
        System.out.println("hi");
    return null;
}
    public static void main(String[] args) {
        CustomHashTable customHashTable = ReadFile.readResponsesFromFile("responses.txt");
        System.out.println(customHashTable.getSize());
        genderDistribution(customHashTable);
    }
    }
