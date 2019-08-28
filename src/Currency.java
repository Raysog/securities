/**
 * Created by Ivan on 28.08.2019.
 */
public class Currency {
    private String code = null;
    private String name_full = null;
    private int id;
    private String name_short = null;

    public Currency(String code, String name_full, int id, String name_short) {
        this.code = code;
        this.name_full = name_full;
        this.id = id;
        this.name_short = name_short;
    }
}
