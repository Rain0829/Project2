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
                        break;
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
        int[] ageGroupDistribution = new int[4];
        int countAge1 = 0;
        int countAge2 = 0;
        int countAge3 = 0;
        int countAge4 = 0;
        for (int i = 0; i < 900; i++) {
            Response response = customHashTable.search(i);
            if (response != null) {
                switch (response.getAge()) {
                    case 1:
                        countAge1++;
                        break;
                    case 2:
                        countAge2++;
                        break;
                    case 3:
                        countAge3++;
                        break;
                    case 4:
                        countAge4++;
                }
            }
        }
        ageGroupDistribution[0] = countAge1;
        ageGroupDistribution[1] = countAge2;
        ageGroupDistribution[2] = countAge3;
        ageGroupDistribution[3] = countAge4;
        return ageGroupDistribution;
    }

    public static int[] educationDistribution(CustomHashTable customHashTable) {
        int[] educationDistribution = new int[4];
        int countEducation1 = 0;
        int countEducation2 = 0;
        int countEducation3 = 0;
        int countEducation4 = 0;
        for (int i = 0; i < customHashTable.getSize(); i++) {
            Response response = customHashTable.search(i);
            if (response != null) {
                switch (response.getEducation()) {
                    case 1:
                        countEducation1++;
                        break;
                    case 2:
                        countEducation2++;
                        break;
                    case 3:
                        countEducation3++;
                        break;
                    case 4:
                        countEducation4++;
                        break;
                }
            }
        }
        educationDistribution[0] = countEducation1;
        educationDistribution[1] = countEducation2;
        educationDistribution[2] = countEducation3;
        educationDistribution[3] = countEducation4;
        System.out.println(educationDistribution[0]);
        System.out.println(educationDistribution[1]);
        System.out.println(educationDistribution[2]);
        System.out.println(educationDistribution[3]);
        return educationDistribution;
    }

    public static int[] incomeDistribution(CustomHashTable customHashTable) {
        int[] incomeDistribution = new int[4];
        int countIncome1 = 0;
        int countIncome2 = 0;
        int countIncome3 = 0;
        int countIncome4 = 0;
        for (int i = 0; i < customHashTable.getSize(); i++) {
            Response response = customHashTable.search(i);
            if (response != null) {
                switch (response.getIncomeSource()) {
                    case 1:
                        countIncome1++;
                        break;
                    case 2:
                        countIncome2++;
                        break;
                    case 3:
                        countIncome3++;
                        break;
                    case 4:
                        countIncome4++;
                        break;
                }
            }
        }
        incomeDistribution[0] = countIncome1;
        incomeDistribution[1] = countIncome2;
        incomeDistribution[2] = countIncome3;
        incomeDistribution[3] = countIncome4;
        System.out.println(incomeDistribution[0]);
        System.out.println(incomeDistribution[1]);
        System.out.println(incomeDistribution[2]);
        System.out.println(incomeDistribution[3]);
        return incomeDistribution;
    }

    public static int[] smokerDistribution(CustomHashTable customHashTable) {
        int[] smokerDistribution = new int[2];
        int countSmoker1 = 0;
        int countSmoker2 = 0;
        for(int i = 0; i < customHashTable.getSize(); i++) {
            Response response = customHashTable.search(i);
            if (response != null) {
                switch (response.getSmoker()) {
                    case "Yes":
                        countSmoker1++;
                        break;
                    case "No":
                        countSmoker2++;
                        break;
                }
            }
        }
        smokerDistribution[0] = countSmoker1;
        smokerDistribution[1] = countSmoker2;
        System.out.println(smokerDistribution[0]);
        System.out.println(smokerDistribution[1]);
        return smokerDistribution;

    }
    public static void main(String[] args) {
        CustomHashTable customHashTable = ReadFile.readResponsesFromFile("responses.txt");
        genderDistribution(customHashTable);
        ageGroupDistribution(customHashTable);
        educationDistribution(customHashTable);


    }
}
