public class largeWord{
    public static void main(String[] args){
        String inputString = "It is a long-established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distributionqqqqqqqqqqqqqqqqqqq of letters, as opposed to using 'Content here, content here', making it look like readable English";
        
        String longestWord = findlongestWord(inputString);

        System.out.println("longest Word:"+longestWord);

    }
    private static String findlongestWord(String input){
        String[] words=input.split("\\s+");
        String longestWord="";
        int maxLength=0;
        for(String word:words){
            word=word.replaceAll("[^a-zA-Z]","");
            if(word.length()>maxLength){
                maxLength=word.length();
                longestWord=word;
            }
        }
        return longestWord;
    }
}