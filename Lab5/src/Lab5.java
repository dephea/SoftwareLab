import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Lab5 {

    public static void Lab5Func() throws IOException {
        Path path = Paths.get("Lab5/src/in.txt");
        String resultA = "", resultB = "";

        try (Scanner scanner = new Scanner(path)) {
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                resultA += line + "\n";
                String[] words = line.split(" ");
                for(String w: words) {
                    if(w.contains(".")) {
                        w = w + "\n";
                    }
                    resultB += w + " ";
                }
            }
        } catch(IOException e) {
            throw e;
        }

        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("Lab5/src/out.txt"))) {
            writer.write("a: \n" + resultA);
            writer.write("-----------------------------\n");
            writer.write("b: \n" + resultB);
        } catch(IOException e) {
            throw e;
        }

        System.out.println("a: " + resultA);
        System.out.println("b: " + resultB);


        Random rand = new Random();
        int countLetters = 'z'-'a';

        List<String> lines = new ArrayList<>();

        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("Lab5/src/outrand.txt"))) {

            for(int i = 0; i < 5; i++) { //lines
                //StringBuilder line = new StringBuilder();
                List<String> line = new ArrayList<>();
                for (int word = 0; word < 10; word++) {
                    StringBuilder myWord = new StringBuilder();
                    for (int ch = 0; ch < 4; ch++) {
                        char c = (char)('a' + rand.nextInt(countLetters));
                        myWord.append(c);
                    }
                    line.add(myWord.toString() + " ");

                }
                Collections.sort(line);
                lines.add(line.toString().trim());
            }

            Collections.sort(lines);

            for(String line : lines) {
                writer.write(line + "\n");
            }

        } catch(IOException e) {
            throw e;
        }

    }
}
