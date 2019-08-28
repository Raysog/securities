import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

/**
 * Created by Ivan on 27.08.2019.
 */
public class JSONFileLoader {
    public JSONFileLoader() throws IOException, ParseException {
        loadFile();
    }

    private File addFile() {
        boolean correctPathFlag = false;
        File file = null;
        Scanner scan = new Scanner(System.in);
        while (!correctPathFlag) {
            System.out.println("Enter absolute or relative file path:");
            String filePath = scan.nextLine();
            File testFile = new File(filePath);
            if (testFile.exists()) {
                System.out.println("File downloaded");
                correctPathFlag = true;
                file = testFile;
                scan.close();
            } else {
                System.out.println("The specified file does not exist");
            }
        }
        return file;
    }

    private JSONArray readFile(File readingFile) throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        Reader reader = new FileReader(readingFile.getPath());
        JSONArray ja = (JSONArray) parser.parse(reader);
        JSONObject jo = (JSONObject) ja.get(0);
        boolean  flag = (Boolean) jo.get("is_resident");
        System.out.println(flag);
        return ja;
    }

    private JSONArray loadFile() throws IOException, ParseException {
        return readFile(addFile());
    }
}
