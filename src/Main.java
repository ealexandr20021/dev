import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by root on 11.03.2021.
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<String> StringGenerateNumber;
        TreeSet<String> treeSet = new TreeSet<>();
        GenNumber gen = new GenNumber();
        StringGenerateNumber = gen.getListNumber();
        for (int i=0; i<StringGenerateNumber.size(); i++) {
            //System.out.println(StringGenerateNumber.get(i));
            treeSet.add(StringGenerateNumber.get(i));
        }
        String[] result = treeSet.toArray(new String[treeSet.size()]);
        for(String res:result){
            System.out.println(res);
        }
    }

}
