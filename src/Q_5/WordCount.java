package Q_5;

import java.io.*;

public class WordCount {
    public static void main(String[] args) throws IOException
    {
        File txt = new File("lear.txt");
        FileInputStream fileio = new FileInputStream(txt);
        InputStreamReader inputio = new InputStreamReader(fileio);
        BufferedReader bufferedReader = new BufferedReader(inputio);

        String line;
        int wc = 0;
        int cc = 0;
        int pc = 0;
        int wsc = 0;
        int sc = 0;

        while ((line = bufferedReader.readLine()) != null) {
            if (line.equals("")) {
                pc+= 1;
            }
            else {
                cc += line.length();
                String words[] = line.split("\\s+");
                wc += words.length;
                wsc+=wc-1;
                String sentence[] = line.split("[!?.:]+");
                sc += sentence.length;
            }
        }
        if (sc >= 1) {
            pc++;
        }
        System.out.println("Total word count = "+ wc);
        System.out.println("Total number of sentences = "+ sc);
        System.out.println("Total number of characters = "+ cc);
        System.out.println("Number of paragraphs = "+ pc);
        System.out.println("Total number of whitespaces = "+ wsc);
    }
}
