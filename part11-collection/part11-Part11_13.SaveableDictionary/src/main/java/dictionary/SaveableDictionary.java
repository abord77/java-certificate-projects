
package dictionary;

import java.io.FileWriter;
import java.nio.file.Paths;
import java.util.*;

public class SaveableDictionary {

    private Map<String, String> dictionary;
    private String file;
    
    public SaveableDictionary(){
        this("words.txt");
    }
    
    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.file = file;
    }

    public void add(String words, String translation) {
        this.dictionary.putIfAbsent(words, translation);
        this.dictionary.putIfAbsent(translation, words);
    }

    public String translate(String word) {
        return this.dictionary.get(word);
    }

    public void delete(String word) {
        String temp = this.dictionary.get(word);
        this.dictionary.remove(word, temp);
        this.dictionary.remove(temp, this.dictionary.get(temp));
    }

    public boolean load() {
        try (Scanner fileReader = new Scanner(Paths.get(this.file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                this.add(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e) {
            //System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public boolean save() {
        try (FileWriter fw = new FileWriter(this.file, false)) {
            List<String> words = new ArrayList<>();
            for(String word : this.dictionary.keySet()){
                if(words.contains(word)){
                    continue;
                } else{
                    words.add(word);
                    words.add(this.dictionary.get(word));
                }
            }

            for(int i = 0; i < words.size();){
                StringBuilder build = new StringBuilder();
                build.append(words.get(i));
                build.append(":");
                i++;
                build.append(words.get(i));
                i++;
                build.append("\n");
                fw.write(build.toString());
            }
            
            fw.close();
            return true;
        } catch (Exception e) {
            //System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
}
