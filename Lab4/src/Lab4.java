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
        studentNames.add("Student1");
        studentNames.add("Student2");
        studentNames.add("Student3");
        studentNames.add("Student4");

        ArrayList<String> groupNames = new ArrayList<>();
        groupNames.add("B");
        groupNames.add("C");
        groupNames.add("D");
        groupNames.add("ABCD");


        for (String name : studentNames) {
            HashMap<String, String> data = new HashMap<>();
            for (int i = 1; i <= 5; i++) {
                int grade = (int) (Math.random() * 7) + 4;
                data.put("Note" + i, String.valueOf(grade));
            }

            data.put("Group", groupNames.get((int)(Math.random() * 3)));

            Students.put(name, data);
        }

        List<Map.Entry<String, HashMap<String, String>>> studentList = new ArrayList<>(Students.entrySet());

        studentList.sort(Comparator.comparing(o -> o.getValue().get("Group")));

        System.out.println("Sorted by group (alphabetically): "+ studentList);

        List<Map.Entry<String, HashMap<String, String>>> Integralists = new ArrayList<>();

        for (var i : studentList) {
            HashMap<String, String> data = i.getValue();
            boolean allAboveFive = true;

            for (int j = 1; j <= 5; j++) {
                int grade = Integer.parseInt(data.get("Note" + j));
                if (grade < 5) {
                    allAboveFive = false;
                    break;
                }
            }

            if (allAboveFive) {
                Integralists.add(i);
            }
        }


    }
}
