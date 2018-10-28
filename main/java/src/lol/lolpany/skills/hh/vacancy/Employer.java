
package lol.lolpany.skills.hh.vacancy;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Employer {

    @SerializedName("trusted")
    @Expose
    public Boolean trusted;
    @SerializedName("logo_urls")
    @Expose
    public LogoUrls logoUrls;
    @SerializedName("url")
    @Expose
    public String url;
    @SerializedName("vacancies_url")
    @Expose
    public String vacanciesUrl;
    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("alternate_url")
    @Expose
    public String alternateUrl;

}
