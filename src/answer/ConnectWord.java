package answer;

import java.util.*;

/**
 * 给你一个 不含重复 单词的字符串数组 words ，请你找出并返回 words 中的所有 连接词 。
 *
 * 连接词 定义为：一个完全由给定数组中的至少两个较短单词组成的字符串。
 *
 * 输入：words = ["cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"]
 * 输出：["catsdogcats","dogcatsdog","ratcatdogcat"]
 * 解释："catsdogcats" 由 "cats", "dog" 和 "cats" 组成;
 *      "dogcatsdog" 由 "dog", "cats" 和 "dog" 组成;
 *      "ratcatdogcat" 由 "rat", "cat", "dog" 和 "cat" 组成。
 *
 * 输入：words = ["cat","dog","catdog"]
 * 输出：["catdog"]
 */
public class ConnectWord {

    private Set<String> prefix = new HashSet<String>();

    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        if(words == null || words.length == 0){
            return new ArrayList<String>();
        }
        prefix.clear();
        prefix.addAll(Arrays.asList(words));
        List<String> result = new ArrayList<String>();
        for(String temp:words){
            if (hasPrefix(temp,false)){
                result.add(temp);
            }
        }
        return result;
    }

    private boolean hasPrefix(String word,boolean secondTime) {
        if (!secondTime && word.length() == 0){
            return false;
        }
        if (word.length() == 0){
            return true;
        }
        for(int i = 1;i <= word.length();i++){
            String temp = word.substring(0,i);
            if (prefix.contains(temp)){
                boolean tempResult =  hasPrefix(word.substring(i),true);
                if (!secondTime && i == word.length())return false;
                if (tempResult){
                    return true;
                }else{
                    continue;
                }
            }
        }
        return false;
    }
}
