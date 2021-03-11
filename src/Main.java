import java.util.ArrayList;

/**
 * Created by root on 11.03.2021.
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<String> StringGenerateNumber;

        GenNumber gen = new GenNumber();
        StringGenerateNumber = gen.getListNumber();
        for (int i=0; i<StringGenerateNumber.size(); i++) {
            System.out.println(StringGenerateNumber.get(i));
        }
    }
}
