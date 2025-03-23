import java.util.*;

public class Lab4 {

    public static void Lab4Func() {
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        List<Integer> xPlusY = new ArrayList<>();
        Set<Integer> zSet = new TreeSet<>();
        List<Integer> xMinusY = new ArrayList<>();
        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            x.add( (int) (Math.random() * 10) );
        }

        for(int i = 0; i < 7; i++){
            y.add( (int) (Math.random() * 10) );
        }

        xPlusY.addAll(x);
        xPlusY.addAll(y);

        zSet.addAll(xPlusY);

        for (int element : x) {
            if (!y.contains(element)) {
                xMinusY.add(element);
            }
        }



        Collections.sort(x);
        Collections.sort(y);
        Collections.sort(xPlusY);
        //Collections.sort(x);

        for (int i = 0; i < p; i++) {
            xPlusYLimitedByP.add(xPlusY.get(i));
        }

        System.out.println("x: " + x + "\n");
        System.out.println("y: " + y + "\n");
        System.out.println("x plus y: "+ xPlusY + "\n");
        System.out.println("zset: " + zSet + "\n");
        System.out.println("xPlusYLimitedByP: " + xPlusYLimitedByP + "\n");


        HashMap<String, HashMap<String, String>> Students = new HashMap<>();
        ArrayList<String> studentNames = new ArrayList<>();
        studentNames.add("Diana");
        studentNames.add("Elena");
        studentNames.add("Maria");
        studentNames.add("Jennifer");

        ArrayList<String> groupNames = new ArrayList<>();
        groupNames.add("B");
        groupNames.add("C");
        groupNames.add("D");
        groupNames.add("ABCD");

        ArrayList<String> subjectNames = new ArrayList<>();
        subjectNames.add("OOP");
        subjectNames.add("Linear Algebra");
        subjectNames.add("Assembly language");
        subjectNames.add("Electronics");
        subjectNames.add("P.E.");

        for (String name : studentNames) {
            HashMap<String, String> data = new HashMap<>();
            for(String subject : subjectNames) {
                int grade = (int) (Math.random() * 7) + 4;
                data.put(subject, String.valueOf(grade));
            }

            data.put("Group", groupNames.get((int)(Math.random() * 3)));

            Students.put(name, data);
        }

        List<Map.Entry<String, HashMap<String, String>>> studentList = new ArrayList<>(Students.entrySet());

        studentList.sort(Comparator.comparing(o -> o.getValue().get("Group")));

        System.out.println("Sorted by group (alphabetically): "+ studentList);

        List<Map.Entry<String, HashMap<String, String>>> Integralists = new ArrayList<>();
        List<Map.Entry<String, HashMap<String, String>>> Restantieri = new ArrayList<>();

        for (var student : studentList) {
            HashMap<String, String> data = student.getValue();
            boolean allAboveFive = true;
            int gradesSum = 0;

            for (String subject : subjectNames) {
                int grade = Integer.parseInt(data.get(subject));
                if (grade < 5) {
                    allAboveFive = false;
                    Restantieri.add(student);
                    break;
                }
                gradesSum += grade;
            }

            if (allAboveFive) {
                data.put("Average", String.valueOf((gradesSum/5)));
                Integralists.add(student);
            }
        }

        Integralists.sort(Comparator.comparing(
                        (Map.Entry<String, HashMap<String, String>> o) ->
                                Integer.parseInt(o.getValue().get("Average")))
                .reversed()
        );


        System.out.println("Integralists: \n" + Integralists);
        System.out.println("Restantieri: \n" + Restantieri);

    }
}
