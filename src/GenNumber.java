import java.util.ArrayList;

/**
 * Created by root on 11.03.2021.
 */
class GenNumber {

    ArrayList<String> ListNumber = new ArrayList<>();
    String[] letterOne = {"a","b","c","d"};

    public ArrayList<String> getListNumber() {
        for (int i = 0; i< letterOne.length; i++) {
            for (LetterTwo letterTwo : LetterTwo.values()) {
                for (int j = 0; j <= 150; j++) {
//                   System.out.println(letterOne + "-" + letterTwo + "-" + i);
                    ListNumber.add(letterOne[i] + "-" + letterTwo + "-" + j);
                }
            }
        }
        return ListNumber;
    }
}
