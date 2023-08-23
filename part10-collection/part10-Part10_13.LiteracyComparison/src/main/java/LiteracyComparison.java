
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        csvProcessor(fileReader("literacy.csv"));
    }
    
    public static List<String> fileReader(String file){
        List<String> lines = new ArrayList<>();
        try{
            lines = Files.lines(Paths.get(file))
                    .collect(Collectors.toCollection(ArrayList::new));
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return lines;
    }
    
    public static void csvProcessor(List<String> list){
        List<LiteracyData> data = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            String [] parts = list.get(i).split(",");
            for(int j = 0; j < parts.length; j++){
                parts[j].trim();
            }
            data.add(new LiteracyData(parts[3], parts[2], Integer.valueOf(parts[4]), Double.valueOf(parts[5])));
        }
        Collections.sort(data);
        for(LiteracyData print : data){
            System.out.println(print);
        }
    }
}
