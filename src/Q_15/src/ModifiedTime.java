package Q_15.src;

import java.io.File;
import java.text.SimpleDateFormat;

public class ModifiedTime {
    public static void main(String[] args) {
        File file = new File("src/ques15/test.text");
        long time = file.lastModified();
        SimpleDateFormat formatter = new SimpleDateFormat ("yyyy/MM/dd H:mm");
        System.out.println("Last Modified Time: "+formatter.format(time));
    }
}
