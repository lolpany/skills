
package lol.lolpany.skills.hh.vacancies;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("response_letter_required")
    @Expose
    public Boolean responseLetterRequired;
    @SerializedName("response_url")
    @Expose
    public Object responseUrl;
    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("created_at")
    @Expose
    public String createdAt;
    @SerializedName("has_test")
    @Expose
    public Boolean hasTest;
    @SerializedName("area")
    @Expose
    public Area area;
    @SerializedName("apply_alternate_url")
    @Expose
    public String applyAlternateUrl;
    @SerializedName("alternate_url")
    @Expose
    public String alternateUrl;
    @SerializedName("employer")
    @Expose
    public Employer employer;
    @SerializedName("url")
    @Expose
    public String url;
    @SerializedName("published_at")
    @Expose
    public String publishedAt;
    @SerializedName("sort_point_distance")
    @Expose
    public Object sortPointDistance;
    @SerializedName("archived")
    @Expose
    public Boolean archived;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("relations")
    @Expose
    public List<Object> relations = null;
    @SerializedName("contacts")
    @Expose
    public Object contacts;
    @SerializedName("premium")
    @Expose
    public Boolean premium;
    @SerializedName("type")
    @Expose
    public Type type;
    @SerializedName("snippet")
    @Expose
    public Snippet snippet;
    @SerializedName("department")
    @Expose
    public Object department;
    @SerializedName("address")
    @Expose
    public Object address;
    @SerializedName("salary")
    @Expose
    public Salary salary;

}
