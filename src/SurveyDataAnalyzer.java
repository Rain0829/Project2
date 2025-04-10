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

    public static int[] maritalDistribution(CustomHashTable customHashTable) {
        int[] maritalDistribution = new int[4];
        int countMarital1 = 0;
        int countMarital2 = 0;
        int countMarital3 = 0;
        int countMarital4 = 0;
        for (int i = 0; i < customHashTable.getSize(); i++) {
            Response response = customHashTable.search(i);
            if (response != null) {
                switch (response.getIncomeSource()) {
                    case 1:
                        countMarital1++;
                        break;
                    case 2:
                        countMarital2++;
                        break;
                    case 3:
                        countMarital3++;
                        break;
                    case 4:
                        countMarital4++;
                        break;
                }
            }
        }
        maritalDistribution[0] = countMarital2;
        maritalDistribution[1] = countMarital2;
        maritalDistribution[2] = countMarital3;
        maritalDistribution[3] = countMarital4;
        System.out.println(maritalDistribution[0]);
        System.out.println(maritalDistribution[1]);
        System.out.println(maritalDistribution[2]);
        System.out.println(maritalDistribution[3]);
        return maritalDistribution;
    }

    public static int[] smokerDistribution(CustomHashTable customHashTable) {
        int[] smokerDistribution = new int[2];
        int countSmoker1 = 0;
        int countSmoker2 = 0;
        for (int i = 0; i < customHashTable.getSize(); i++) {
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


    public static double lifeQualityGeneral(CustomHashTable customHashTable) {
        double lifeQualityGeneral = 0;
        for (int i = 0; i < customHashTable.getSize(); i++) {
            Response response = customHashTable.search(i);
            if (response != null) {
                lifeQualityGeneral += response.getQuality();
            }
        }
        return lifeQualityGeneral / 300;
    }

    public static double [] lifeQualityGenderBased(CustomHashTable customHashTable) {
        double [] lifeQualityGeneral = new double[4];
        int countGender1 = 0;
        int countGender2 = 0;
        int countGender3 = 0;
        int countGender4 = 0;
        for (int i = 0; i < customHashTable.getSize(); i++) {
            Response response = customHashTable.search(i);
            if (response != null) {
                switch (response.getGender()) {
                    case "M":
                        lifeQualityGeneral[0] += response.getQuality();
                        countGender1++;
                        break;
                    case "F":
                        lifeQualityGeneral[1] += response.getQuality();
                        countGender2++;
                        break;
                    case "O":
                        lifeQualityGeneral[2] += response.getQuality();
                        countGender3++;
                        break;
                    case "-":
                        lifeQualityGeneral[3] += response.getQuality();
                        countGender4++;
                        break;
                }
            }
        }
        lifeQualityGeneral[0] = lifeQualityGeneral[0] / countGender1;
        lifeQualityGeneral[1] = lifeQualityGeneral[1] / countGender2;
        lifeQualityGeneral[2] = lifeQualityGeneral[2] / countGender2;
        lifeQualityGeneral[3] = lifeQualityGeneral[3] / countGender2;
        System.out.println(lifeQualityGeneral[0]);
        System.out.println(lifeQualityGeneral[1]);
        System.out.println(lifeQualityGeneral[2]);
        System.out.println(lifeQualityGeneral[3]);

        return lifeQualityGeneral;
    }

    public static double[] lifeQualityAgeBased(CustomHashTable customHashTable) {
        double [] lifeAgeBased = new double[4];
        int countAge1 = 0;
        int countAge2 = 0;
        int countAge3 = 0;
        int countAge4 = 0;
        for (int i = 0; i < customHashTable.getSize(); i++) {
            Response response = customHashTable.search(i);
            if (response != null) {
                switch (response.getAge()) {
                    case 1:
                        lifeAgeBased[0] += response.getQuality();
                        countAge1++;
                        break;
                    case 2:
                          lifeAgeBased[1] += response.getQuality();
                          countAge2++;
                          break;
                    case 3:
                        lifeAgeBased[2] += response.getQuality();
                        countAge3++;
                        break;
                     case 4:
                         lifeAgeBased[3] += response.getQuality();
                         countAge4++;
                         break;
                }
            }
        }
        lifeAgeBased[0] = lifeAgeBased[0] / countAge1;
        lifeAgeBased[1] = lifeAgeBased[1] / countAge2;
        lifeAgeBased[2] = lifeAgeBased[2] / countAge3;
        lifeAgeBased[3] = lifeAgeBased[3] / countAge4;
        System.out.println(lifeAgeBased[0]);
        System.out.println(lifeAgeBased[1]);
        System.out.println(lifeAgeBased[2]);
        System.out.println(lifeAgeBased[3]);
        return lifeAgeBased;
    }

    public static double[] lifeQualityResidenceBased(CustomHashTable customHashTable) {
        double [] lifeResidenceBased = new double[4];
        int countResidence1 = 0;
        int countResidence2 = 0;
        int countResidence3 = 0;
        int countResidence4 = 0;
        for (int i = 0; i < customHashTable.getSize(); i++) {
            Response response = customHashTable.search(i);
            if (response != null) {
                switch (response.getResidence()) {
                    case 1:
                        lifeResidenceBased[0] += response.getQuality();
                        countResidence1++;
                        break;
                    case 2:
                        lifeResidenceBased[1] += response.getQuality();
                        countResidence2++;
                        break;
                     case 3:
                         lifeResidenceBased[2] += response.getQuality();
                         countResidence3++;
                         break;
                     case 4:
                         lifeResidenceBased[3] += response.getQuality();
                         countResidence4++;
                         break;
                }
            }
        }
        lifeResidenceBased[0] = lifeResidenceBased[0] / countResidence1;
        lifeResidenceBased[1] = lifeResidenceBased[1] / countResidence2;
        lifeResidenceBased[2] = lifeResidenceBased[2] / countResidence2;
        lifeResidenceBased[3] = lifeResidenceBased[3] / countResidence2;
        System.out.println(lifeResidenceBased[0]);
        System.out.println(lifeResidenceBased[1]);
        System.out.println(lifeResidenceBased[2]);
        System.out.println(lifeResidenceBased[3]);
        return lifeResidenceBased;
    }

    public static double[] lifeQualityEducationBased(CustomHashTable customHashTable){
        double[] lifeEducationBased = new double[4];
        int countEducation1 = 0;
        int countEducation2 = 0;
        int countEducation3 = 0;
        int countEducation4 = 0;
        for (int i = 0; i < customHashTable.getSize(); i++) {
            Response response = customHashTable.search(i);
            if (response != null) {
                switch (response.getEducation()) {
                    case 1:
                        lifeEducationBased[0] += response.getQuality();
                        countEducation1++;
                        break;
                    case 2:
                        lifeEducationBased[1] += response.getQuality();
                        countEducation2++;
                        break;
                    case 3:
                        lifeEducationBased[2] += response.getQuality();
                        countEducation3++;
                        break;
                    case 4:
                        lifeEducationBased[3] += response.getQuality();
                        countEducation4++;
                        break;
                }
            }
        }
        lifeEducationBased[0] = lifeEducationBased[0] / countEducation1;
        lifeEducationBased[1] = lifeEducationBased[1] / countEducation2;
        lifeEducationBased[2] = lifeEducationBased[2] / countEducation3;
        lifeEducationBased[3] = lifeEducationBased[3] / countEducation4;
        System.out.println(lifeEducationBased[0]);
        System.out.println(lifeEducationBased[1]);
        System.out.println(lifeEducationBased[2]);
        System.out.println(lifeEducationBased[3]);
        return lifeEducationBased;
    }

    public static double[] lifeQualityIncomeBased(CustomHashTable customHashTable){
        double[] lifeIncomeBased = new double[4];
        int countIncome1 = 0;
        int countIncome2 = 0;
        int countIncome3 = 0;
        int countIncome4 = 0;
        for (int i = 0; i < customHashTable.getSize(); i++) {
            Response response = customHashTable.search(i);
            if (response != null) {
                switch (response.getResidence()) {
                    case 1:
                        lifeIncomeBased[0] += response.getQuality();
                        countIncome1++;
                        break;
                    case 2:
                        lifeIncomeBased[1] += response.getQuality();
                        countIncome2++;
                        break;
                    case 3:
                        lifeIncomeBased[2] += response.getQuality();
                        countIncome3++;
                        break;
                    case 4:
                        lifeIncomeBased[3] += response.getQuality();
                        countIncome4++;
                        break;
                }
            }
        }
        lifeIncomeBased[0] = lifeIncomeBased[0] / countIncome1;
        lifeIncomeBased[1] = lifeIncomeBased[1] / countIncome2;
        lifeIncomeBased[2] = lifeIncomeBased[2] / countIncome3;
        lifeIncomeBased[3] = lifeIncomeBased[3] / countIncome4;
        System.out.println(lifeIncomeBased[0]);
        System.out.println(lifeIncomeBased[1]);
        System.out.println(lifeIncomeBased[2]);
        System.out.println(lifeIncomeBased[3]);
        return lifeIncomeBased;
    }

    public static double[] lifeQualityMaritalBased(CustomHashTable customHashTable){
        double[] lifeMaritalBased = new double[4];
        int countMarital1 = 0;
        int countMarital2 = 0;
        int countMarital3 = 0;
        int countMarital4 = 0;
        for (int i = 0; i < customHashTable.getSize(); i++) {
            Response response = customHashTable.search(i);
            if (response != null) {
                switch (response.getResidence()) {
                    case 1:
                        lifeMaritalBased[0] += response.getQuality();
                        countMarital1++;
                        break;
                    case 2:
                        lifeMaritalBased[1] += response.getQuality();
                        countMarital2++;
                        break;
                    case 3:
                        lifeMaritalBased[2] += response.getQuality();
                        countMarital3++;
                        break;
                    case 4:
                        lifeMaritalBased[3] += response.getQuality();
                        countMarital4++;
                        break;
                }
            }
        }
        lifeMaritalBased[0] = lifeMaritalBased[0] / countMarital1;
        lifeMaritalBased[1] = lifeMaritalBased[1] / countMarital2;
        lifeMaritalBased[2] = lifeMaritalBased[2] / countMarital3;
        lifeMaritalBased[3] = lifeMaritalBased[3] / countMarital4;
        System.out.println(lifeMaritalBased[0]);
        System.out.println(lifeMaritalBased[1]);
        System.out.println(lifeMaritalBased[2]);
        System.out.println(lifeMaritalBased[3]);
        return lifeMaritalBased;
    }


    public static double[] lifeQualitySmokerBased(CustomHashTable customHashTable){
        double[] lifeSmokerBased = new double[2];
        int countSmoker1 = 0;
        int countSmoker2 = 0;
        for (int i = 0; i < customHashTable.getSize(); i++) {
            Response response = customHashTable.search(i);
            if (response != null) {
                switch (response.getSmoker()) {
                    case "Yes":
                        lifeSmokerBased[0] += response.getQuality();
                        countSmoker1++;
                        break;
                    case "No":
                        lifeSmokerBased[1] += response.getQuality();
                        countSmoker2++;
                        break;
                }
            }
        }
        lifeSmokerBased[0] = lifeSmokerBased[0] / countSmoker1;
        lifeSmokerBased[1] = lifeSmokerBased[1] / countSmoker2;
        System.out.println(lifeSmokerBased[0]);
        System.out.println(lifeSmokerBased[1]);
        return lifeSmokerBased;
    }





    public static void main(String[] args) {
        CustomHashTable customHashTable = ReadFile.readResponsesFromFile("responses.txt");
        genderDistribution(customHashTable);
        System.out.println("-------------------");
        ageGroupDistribution(customHashTable);
        System.out.println("-------------------");
        lifeQualityResidenceBased(customHashTable);
        System.out.println("-------------------");
        educationDistribution(customHashTable);
        System.out.println("-------------------");
        incomeDistribution(customHashTable);
        System.out.println("-------------------");
        maritalDistribution(customHashTable);
        System.out.println("-------------------");
        smokerDistribution(customHashTable);
        System.out.println("-------------------");
        lifeQualityGeneral(customHashTable);
        System.out.println("-------------------");
        lifeQualityGenderBased(customHashTable);
        System.out.println("-------------------");
        lifeQualityAgeBased(customHashTable);
        System.out.println("-------------------");
        lifeQualityResidenceBased(customHashTable);
        System.out.println("-------------------");
        lifeQualityEducationBased(customHashTable);
        System.out.println("-------------------");
        lifeQualityIncomeBased(customHashTable);
        System.out.println("-------------------");
        lifeQualityMaritalBased(customHashTable);
        System.out.println("------------------");
        lifeQualitySmokerBased(customHashTable);
        System.out.println("------------------");
        }

    }


