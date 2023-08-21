public class fuckaround{
    public static void main(String[] args) {
        
    }
    public String getHint(String a, String word){
        String hint = "";
        for(int i = 0; i<word.length()+1; i++){
            if(a.substring(i, i+1).compareTo(word.substring(i, i+1) == 0){
                hint = hint.substring(0,i)+a.substring(i,i+1)+hint.substring(i+1, word.length()-1);
            }if(word.indexOf(a.substring(i, i+1)) != -1){
                hint = hint.substring(0,i)+"*"+hint.substring(i+1, word.length()-1);
            }
            hint = hint.substring(0,i)+"+"+hint.substring(i+1, word.length()-1);}
            return hint;
        }
}