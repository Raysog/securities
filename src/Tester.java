import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.time.LocalDate;

/**
 * Created by Ivan on 27.08.2019.
 */
public class Tester {
    public static void main(String[] args) throws IOException, ParseException {
    	//
        JSONFileLoader jfl = new JSONFileLoader();
        System.out.println();

        ShortPrintable shortPrint = (c) -> System.out.println("Краткое название: " + c.getNameShort() + "\nДата основания:  " + c.getEgrulDate());
        jfl.getCompanies().forEach(shortPrint::shortPrint);

        jfl.getCompanies().stream().forEach(company -> company.getSecurities().forEach(security -> {
            if (security.getDateTo().isBefore(LocalDate.now())){
                System.out.println( "code: " + security.getCode() + "\n" +
                                    "dateTo: " + security.getDateTo() + "\n" +
                                    "companyFullName: " + company.getNameFull() + "\n");
            } else {}
        }));




        
    }
}
