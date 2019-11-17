
package lol.lolpany.skills.hh.vacancies;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Example {

    @SerializedName("alternate_url")
    @Expose
    public String alternateUrl;
    @SerializedName("pages")
    @Expose
    public Integer pages;
    @SerializedName("page")
    @Expose
    public Integer page;
    @SerializedName("arguments")
    @Expose
    public Object arguments;
    @SerializedName("clusters")
    @Expose
    public Object clusters;
    @SerializedName("per_page")
    @Expose
    public Integer perPage;
    @SerializedName("found")
    @Expose
    public Integer found;
    @SerializedName("items")
    @Expose
    public List<Item> items = null;

}
