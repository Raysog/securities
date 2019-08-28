import java.util.ArrayList;

/**
 * Created by Ivan on 27.08.2019.
 */
public class Company {
    private String ogrn = null;
    private Company_type company_type = null;
    private Country country = null;
    private String code = null;
    private String address = null;
    private String name_full = null;
    private String inn = null;
    private String fio_head = null;
    private String egrul_date = null;
    private String phone = null;
    private String e_mail = null;
    private String www = null;
    private boolean is_resident;
    private int id;
    private String name_short = null;
    private ArrayList<Security> securities = null;

    public Company(String ogrn, Company_type company_type, Country country, String code, String address, String name_full, String inn, String fio_head, String egrul_date, String phone, String e_mail, String www, boolean is_resident, int id, String name_short, ArrayList<Security> securities) {
        this.ogrn = ogrn;
        this.company_type = company_type;
        this.country = country;
        this.code = code;
        this.address = address;
        this.name_full = name_full;
        this.inn = inn;
        this.fio_head = fio_head;
        this.egrul_date = egrul_date;
        this.phone = phone;
        this.e_mail = e_mail;
        this.www = www;
        this.is_resident = is_resident;
        this.id = id;
        this.name_short = name_short;
        this.securities = securities;
    }
}
