import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by Ivan on 27.08.2019.
 */
public class Tester {
    public static void main(String[] args) throws IOException, ParseException {
    	//C:\Users\������� ����\Downloads\test.json
        JSONFileLoader jfl = new JSONFileLoader();
        System.out.println();
        
        ShortPrintable shortPrint = (c) -> {
				System.out.println("\"" + c.getNameShort() + "\" ���� ��������� " + c.getEgrulDate());
			
        };
        

        for (Company c : jfl.getCompanies()) {
			shortPrint.shortPrint(c);
		}
        
        
    }
}
