import java.util.Arrays;

public class SurveyDataAnalyzer {

    public static int[] genderDistribution(CustomHashTable customHashTable) {
        int[] genderDistribution = new int[4];
        int countGender1 = 0;
        int countGender2 = 0;
        int countGender3 = 0;
        int countGender4 = 0;
        for (CustomHashTable.Entry entry : customHashTable.getTable()) {
            if (entry != null) {
                Response response = entry.getValue();
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
        for (CustomHashTable.Entry entry : customHashTable.getTable()) {
            if (entry != null) {
                Response response = entry.getValue();
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
        System.out.println(ageGroupDistribution[0]);
        System.out.println(ageGroupDistribution[1]);
        System.out.println(ageGroupDistribution[2]);
        System.out.println(ageGroupDistribution[3]);
        return ageGroupDistribution;
    }

    public static int[] residenceDistribution(CustomHashTable customHashTable) {
        int[] residenceDistribution = new int[4];
        int countResidence1 = 0;
        int countResidence2 = 0;
        int countResidence3 = 0;
        int countResidence4 = 0;
        for (CustomHashTable.Entry entry : customHashTable.getTable()) {
            if (entry != null) {
                Response response = entry.getValue();
                switch (response.getResidence()) {
                    case 1:
                        countResidence1++;
                        break;
                    case 2:
                        countResidence2++;
                        break;
                    case 3:
                        countResidence3++;
                        break;
                    case 4:
                        countResidence4++;
                        break;
                }
            }
        }
        residenceDistribution[0] = countResidence1;
        residenceDistribution[1] = countResidence2;
        residenceDistribution[2] = countResidence3;
        residenceDistribution[3] = countResidence4;
        return residenceDistribution;
    }

    public static int[] educationDistribution(CustomHashTable customHashTable) {
        int[] educationDistribution = new int[4];
        int countEducation1 = 0;
        int countEducation2 = 0;
        int countEducation3 = 0;
        int countEducation4 = 0;
        for (CustomHashTable.Entry entry : customHashTable.getTable()) {
            if (entry != null) {
                Response response = entry.getValue();
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
        for (CustomHashTable.Entry entry : customHashTable.getTable()) {
            if (entry != null) {
                Response response = entry.getValue();
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
        for (CustomHashTable.Entry entry : customHashTable.getTable()) {
            if (entry != null) {
                Response response = entry.getValue();
                switch (response.getMaritalStatus()) {
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
        maritalDistribution[0] = countMarital1;
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
        for (CustomHashTable.Entry entry : customHashTable.getTable()) {
            if (entry != null) {
                Response response = entry.getValue();
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
        int count = 0;
        for (CustomHashTable.Entry entry : customHashTable.getTable()) {
            if (entry != null) {
                count++;
                Response response = entry.getValue();
                lifeQualityGeneral += response.getQuality();
            }
        }
        lifeQualityGeneral = lifeQualityGeneral / count;
        System.out.println(lifeQualityGeneral);
        return lifeQualityGeneral;
    }

    public static double[] lifeQualityGenderBased(CustomHashTable customHashTable) {
        double[] lifeQualityGeneral = new double[4];
        int countGender1 = 0;
        int countGender2 = 0;
        int countGender3 = 0;
        int countGender4 = 0;
        for (CustomHashTable.Entry entry : customHashTable.getTable()) {
            if (entry != null) {
                Response response = entry.getValue();
                switch (response.getGender()) {
                    case "F":
                        lifeQualityGeneral[0] += response.getQuality();
                        countGender1++;
                        break;
                    case "M":
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
        lifeQualityGeneral[2] = lifeQualityGeneral[2] / countGender3;
        lifeQualityGeneral[3] = lifeQualityGeneral[3] / countGender4;
        System.out.println(lifeQualityGeneral[0]);
        System.out.println(lifeQualityGeneral[1]);
        System.out.println(lifeQualityGeneral[2]);
        System.out.println(lifeQualityGeneral[3]);

        return lifeQualityGeneral;
    }

    public static double[] lifeQualityAgeBased(CustomHashTable customHashTable) {
        double[] lifeAgeBased = new double[4];
        int countAge1 = 0;
        int countAge2 = 0;
        int countAge3 = 0;
        int countAge4 = 0;
        for (CustomHashTable.Entry entry : customHashTable.getTable()) {
            if (entry != null) {
                Response response = entry.getValue();
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
        double[] lifeResidenceBased = new double[4];
        int countResidence1 = 0;
        int countResidence2 = 0;
        int countResidence3 = 0;
        int countResidence4 = 0;
        for (CustomHashTable.Entry entry : customHashTable.getTable()) {
            if (entry != null) {
                Response response = entry.getValue();
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
        lifeResidenceBased[2] = lifeResidenceBased[2] / countResidence3;
        lifeResidenceBased[3] = lifeResidenceBased[3] / countResidence4;
        System.out.println(lifeResidenceBased[0]);
        System.out.println(lifeResidenceBased[1]);
        System.out.println(lifeResidenceBased[2]);
        System.out.println(lifeResidenceBased[3]);
        return lifeResidenceBased;
    }

    public static double[] lifeQualityEducationBased(CustomHashTable customHashTable) {
        double[] lifeEducationBased = new double[4];
        int countEducation1 = 0;
        int countEducation2 = 0;
        int countEducation3 = 0;
        int countEducation4 = 0;
        for (CustomHashTable.Entry entry : customHashTable.getTable()) {
            if (entry != null) {
                Response response = entry.getValue();
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

    public static double[] lifeQualityIncomeBased(CustomHashTable customHashTable) {
        double[] lifeIncomeBased = new double[4];
        int countIncome1 = 0;
        int countIncome2 = 0;
        int countIncome3 = 0;
        int countIncome4 = 0;
        for (CustomHashTable.Entry entry : customHashTable.getTable()) {
            if (entry != null) {
                Response response = entry.getValue();
                switch (response.getIncomeSource()) {
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

    public static double[] lifeQualityMaritalBased(CustomHashTable customHashTable) {
        double[] lifeMaritalBased = new double[4];
        int countMarital1 = 0;
        int countMarital2 = 0;
        int countMarital3 = 0;
        int countMarital4 = 0;
        for (CustomHashTable.Entry entry : customHashTable.getTable()) {
            if (entry != null) {
                Response response = entry.getValue();
                switch (response.getMaritalStatus()) {
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


    public static double[] lifeQualitySmokerBased(CustomHashTable customHashTable) {
        double[] lifeSmokerBased = new double[2];
        int countSmoker1 = 0;
        int countSmoker2 = 0;
        for (CustomHashTable.Entry entry : customHashTable.getTable()) {
            if (entry != null) {
                Response response = entry.getValue();
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

    public static String[] mostCommonTreatment(CustomHashTable customHashTable) {
        String[] mostCommonTreatments = {"Surgical", "Chemotherapy", "Radiotherapy", "Immunotherapy", "MolecularlyTargetedTherapy"};

        int[] countTreatments = new int[5];

        for (CustomHashTable.Entry entry : customHashTable.getTable()) {
            if (entry != null) {
                Response response = entry.getValue();
                String response9 = response.getQ9();
                if (response9.contains("Surgical")) {
                    countTreatments[0]++;
                }
                if (response9.contains("Chemotherapy")) {
                    countTreatments[1]++;
                }
                if (response9.contains("Radiotherapy")) {
                    countTreatments[2]++;
                }
                if (response9.contains("Immunotherapy")) {
                    countTreatments[3]++;
                }
                if (response9.contains("MolecularlyTargetedTherapy")) {
                    countTreatments[4]++;
                }
            }
        }
        sortByCountDescending(mostCommonTreatments, countTreatments);
        System.out.println(mostCommonTreatments[0]);
        System.out.println(mostCommonTreatments[1]);
        System.out.println(mostCommonTreatments[2]);
        System.out.println(mostCommonTreatments[3]);
        System.out.println(mostCommonTreatments[4]);
        return mostCommonTreatments;
    }

    public static String[] mostCommonSymptoms(CustomHashTable customHashTable) {
        String[] mostCommonSymptoms = {"Cough", "Hoarseness", "CoughingUpBlood", "ChestPain", "ShortnessOfBreath", "Weakness"};
        int[] countSymptoms = new int[6];
        for (CustomHashTable.Entry entry : customHashTable.getTable()) {
            if (entry != null) {
                Response response = entry.getValue();
                String response16 = response.getQ16();

                String[] reportedSymptoms = response16.split(";"); // splits when ;
                for (String symptom : reportedSymptoms) {
                    symptom = symptom.trim(); // removes extra spaces
                    switch (symptom) {
                        case "Cough":
                            countSymptoms[0]++;
                            break;
                        case "Hoarseness":
                            countSymptoms[1]++;
                            break;
                        case "CoughingUpBlood":
                            countSymptoms[2]++;
                            break;
                        case "ChestPain":
                            countSymptoms[3]++;
                            break;
                        case "ShortnessOfBreath":
                            countSymptoms[4]++;
                            break;
                        case "Weakness":
                            countSymptoms[5]++;
                            break;
                    }
                }
            }
        }

        sortByCountDescending(mostCommonSymptoms, countSymptoms);
       System.out.println(Arrays.toString(countSymptoms));
       System.out.println(mostCommonSymptoms[0]);
       System.out.println(mostCommonSymptoms[1]);
       System.out.println(mostCommonSymptoms[2]);
       System.out.println(mostCommonSymptoms[3]);
       System.out.println(mostCommonSymptoms[4]);
       System.out.println(mostCommonSymptoms[5]);
        return mostCommonSymptoms;
    }

    public static String[] mostCommonLifeAspects(CustomHashTable customHashTable) {
        String[] mostCommonLifeAspects = {"PhysicalAspect", "PsychologicalAspect", "ProfessionalLife", "FamilyLife", "SocialLife"};
        int[] countLifeAspects = new int[5];
        for (CustomHashTable.Entry entry : customHashTable.getTable()) {
            if (entry != null) {
                Response response = entry.getValue();
                String response23 = response.getQ23();
                if (response23.contains("PhysicalAspect")) countLifeAspects[0]++;
                if (response23.contains("PsychologicalAspect")) countLifeAspects[1]++;
                if (response23.contains("ProfessionalLife")) countLifeAspects[2]++;
                if (response23.contains("FamilyLife")) countLifeAspects[3]++;
                if (response23.contains("SocialLife")) countLifeAspects[4]++;
            }
        }
        sortByCountDescending(mostCommonLifeAspects, countLifeAspects);
        System.out.println(mostCommonLifeAspects[0]);
        System.out.println(mostCommonLifeAspects[1]);
        System.out.println(mostCommonLifeAspects[2]);
        System.out.println(mostCommonLifeAspects[3]);
        System.out.println(mostCommonLifeAspects[4]);
        return mostCommonLifeAspects;
    }

    public static double[] lifeQualityMixConditionsBased(CustomHashTable customHashTable) {

        double[] avg = new double[2];
        int count = 0;
        double quality = 0;

        for (CustomHashTable.Entry entry : customHashTable.getTable()) {
            if (entry != null) {
                Response response = entry.getValue();
                int Residence = response.getResidence();
                int Marital = response.getMaritalStatus();
                if (Residence == 4 && Marital == 1) {
                    count++;
                    quality += response.getQuality();
                }
            }
        }
        quality = quality / count;
        avg[0] = quality;

        count = 0;
        quality = 0;

        for (CustomHashTable.Entry entry : customHashTable.getTable()) {
            if (entry != null) {
                Response response = entry.getValue();
                int Residence = response.getResidence();
                int Marital = response.getMaritalStatus();
                if ((Residence == 1 || Residence == 2) && Marital == 2) {
                    count++;
                    quality += response.getQuality();
                }
            }
        }
        quality = quality / count;
        avg[1] = quality;
        System.out.println(avg[0]);
        System.out.println(avg[1]);

        return avg;
    }

    public static double[] lifeQualityResponseBased(CustomHashTable customHashTable) {
        double[] avg = new double[4];
        int countVeryGood = 0;
        int countGood = 0;
        int countBad = 0;
        int countVeryBad = 0;
        double qualityVeryGood = 0;
        double qualityGood = 0;
        double qualityBad = 0;
        double qualityVeryBad = 0;

        for (CustomHashTable.Entry entry : customHashTable.getTable()) {
            if (entry != null) {
                Response response = entry.getValue();
                int Q15 = response.getQ15();
                if (Q15 == 1) {
                    countVeryGood++;
                    qualityVeryGood += response.getQuality();
                }
                if (Q15 == 2) {
                    countGood++;
                    qualityGood += response.getQuality();
                }
                if (Q15 == 3) {
                    countBad++;
                    qualityBad += response.getQuality();
                }
                if (Q15 == 4) {
                    countVeryBad++;
                    qualityVeryBad += response.getQuality();
                }
            }
        }
        qualityVeryGood = qualityVeryGood / countVeryGood;
        qualityGood = qualityGood / countGood;
        qualityBad = qualityBad / countBad;
        qualityVeryBad = qualityVeryBad / countVeryBad;
        avg[0] = qualityVeryGood;
        avg[1] = qualityGood;
        avg[2] = qualityBad;
        avg[3] = qualityVeryBad;
        System.out.println(avg[0]);
        System.out.println(avg[1]);
        System.out.println(avg[2]);
        System.out.println(avg[3]);
        return avg;
    }

    public static void main(String[] args) {

    }

    public static void sortByCountDescending(String[] stringArray, int[] counts) {
        if (stringArray == null || counts == null || stringArray.length != counts.length) {
            throw new IllegalArgumentException("Arrays must be non-null and of equal length");
        }
        int n = counts.length;

        for (int i = 0; i < n - 1; i++) {
            // Reset maxIndex to i at the start of each pass
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (counts[j] > counts[maxIndex]) {
                    maxIndex = j;
                }
            }

            if (maxIndex != i) {
                int tmpCount = counts[i];
                counts[i] = counts[maxIndex];
                counts[maxIndex] = tmpCount;

                // Swap strings in parallel
                String tmpStr = stringArray[i];
                stringArray[i] = stringArray[maxIndex];
                stringArray[maxIndex] = tmpStr;
            }
        }
    }
}


