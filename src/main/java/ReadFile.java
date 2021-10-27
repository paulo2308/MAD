import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile implements IReadFile {

    List<String> csv = new ArrayList<>();

    @Override
    public List<String> readCsv(String addressCsv) {

        try (BufferedReader br = new BufferedReader(new FileReader(addressCsv))) {

            String line = br.readLine();

            while (line != null) {
                String[] vect = line.split(";");

                for(String v : vect) {
                    csv.add(v);
                }

                line = br.readLine();
            }
//            for (String l : csv){
//                System.out.println(l);
//            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return csv;
    }
}
