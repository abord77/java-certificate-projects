

public class Checker {
    public boolean isDayOfWeek(String string){
        if(string.matches("(m|t|w|f|s)(o|u|e|h|r|a)(n|e|d|u|i|t)")){
            return true;   //
        }
        return false;
    }
    
    public boolean allVowels(String string){
        if(string.matches("(a|e|i|o|u)+")){
            return true;
        }
        return false;
    }
    
    public boolean timeOfDay(String string){
        String [] time = string.split(":");
        if(string.matches("([01]?[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]")){
            if(Integer.valueOf(time[0]) < 10){
                if(time[0].matches("0[0-9]")){
                    return true;
                } else{
                    return false;
                }
            } else{
                return true;
            }
        }
        return false;
    }
}
