
package lol.lolpany.skills.hh.vacancies;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Employer {

    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("alternate_url")
    @Expose
    public String alternateUrl;
    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("url")
    @Expose
    public String url;
    @SerializedName("logo_urls")
    @Expose
    public Object logoUrls;
    @SerializedName("trusted")
    @Expose
    public Boolean trusted;
    @SerializedName("vacancies_url")
    @Expose
    public String vacanciesUrl;

}
