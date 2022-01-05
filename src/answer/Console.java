package answer;

public class Console {

    public static void main(String[] argc){
        ConnectWord testStub = new ConnectWord();
        String[] test1 = {"cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"};
        System.out.print(testStub.findAllConcatenatedWordsInADict(test1));
    }
}
