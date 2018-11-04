package test.model;

/**
 *   country表
 */
public class Country {
    /**
     *   id
     */
    private Integer id;

    /**
     *   countryname
     */
    private String countryname;

    /**
     *   countrycode
     */
    private String countrycode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }
}