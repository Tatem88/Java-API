package DZ_2;
/*
Вам дается строка S и целочисленный массив индексов int index[s.length].
Напишите программу, которая перетасует символы в S таким образом, что символ c i-й позиции
переместится на индекс index[i] в результирующей строке.
Пример: s = “cba”, index = [3,2,1] result “abc”
 */
public class task_1 {
    public static void main(String[] args) {
        String s = "cba";
        int [] index = {3,2,1};
        System.out.println(shuffle(s, index));
    }
    public static String shuffle(final String s, final int[] index){
        char[] charArray = new char[s.length()];

        for(int i = 0; i < s.length(); i ++){
            charArray[index[i]-1] = s.charAt(i);
        }
        String result = new String(charArray);
        return result;
    }
    }

