
/**
 * Created by Ivan on 27.08.2019.
 */
public class Security {
    private String code = null;
    private String name_full = null;
    private String cfi = null;
    private Currency currency = null;
    private int id;
    private String date_to = null;
    private String state_reg_date = null;
    private State state = null;

    public Security(String code, String name_full, String cfi, Currency currency, int id, String date_to, String state_reg_date, State state) {
        this.code = code;
        this.name_full = name_full;
        this.cfi = cfi;
        this.currency = currency;
        this.id = id;
        this.date_to = date_to;
        this.state_reg_date = state_reg_date;
        this.state = state;
    }
}
