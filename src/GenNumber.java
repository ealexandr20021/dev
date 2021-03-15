import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by root on 11.03.2021.
 */
class GenNumber {

    ArrayList<String> ListNumber = new ArrayList<>();
    private String[] letterOne = {"a","b","c","d"};

    public ArrayList<String> getListNumber() {
        for (int i = 0; i< letterOne.length; i++) {
            for (LetterTwo letterTwo : LetterTwo.values()) {
                for (int j = 0; j <= 10; j++) {
                    StringBuilder bil = new StringBuilder();
                    bil.append(letterOne[i])
                    .append("-")
                    .append(letterTwo.toString())
                    .append("-")
                    .append(j);
                  //  bil.append("\n");
//                   System.out.println(letterOne + "-" + letterTwo + "-" + i);
                    ListNumber.add(bil.toString());
                  //  ListNumber.add(letterOne[i] + "-" + letterTwo + "-" + j);
                }
            }
        }
     //.....  Collections.sort(ListNumber);
        return ListNumber;
    }
}
