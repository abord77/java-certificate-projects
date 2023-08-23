
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Name of the file: ");
        String file = scanner.nextLine();
        
        ArrayList<String> games = addGames(file);
        System.out.println("Team:");
        String team = scanner.nextLine();
        
        int gamesPlayed = 0;
        int wins = 0;
        int losses = 0;
        for(int i = 0; i < games.size(); i++){
            String [] game = games.get(i).split(",");
            if(team.equals(game[0])){
                gamesPlayed++;
                if(Integer.valueOf(game[2]) > Integer.valueOf(game[3])){
                    wins++;
                } else{
                    losses++;
                }
            } else if(team.equals(game[1])){
                gamesPlayed++;
                if(Integer.valueOf(game[3]) > Integer.valueOf(game[2])){
                    wins++;
                } else{
                    losses++;
                }
            }
        }
        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
    
    public static ArrayList<String> addGames(String file){
        ArrayList<String> games = new ArrayList<>();
        try(Scanner sc = new Scanner(Paths.get(file))){
            while(sc.hasNextLine()){
                games.add(sc.nextLine());
            }
        } catch (Exception ex){
            System.out.println("Reading the file " + file + " failed due to: " + ex);
        }
        return games;
    }

}
