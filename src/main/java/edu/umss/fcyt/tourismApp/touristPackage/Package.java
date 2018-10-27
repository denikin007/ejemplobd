package edu.umss.fcyt.tourismApp.touristPackage;

//import java.io.Serializable;
//import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Package //implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "package_id")
    private Long packageId;
    @NotBlank
    @Column(name = "minimun_group")
    private int minimunGroup;
    @NotBlank
    @Column(name = "category_id")
    private int categoryId;
    @Size(min=3, max=75)
    private String name;
    @NotNull
    private String description;
    @NotBlank
    private String keywords;
    @NotBlank
    private Double inversion;
    //@OneToMany(mappedBy = "touristPackage")
    //private List<circuit> circuit;

    public Package(Long packageId, int minimunGroup, int category_id, String name, String description, String keywords, Double inversion){
        this.packageId = packageId;
        this.minimunGroup = minimunGroup;
        this.categoryId = category_id;
        this.name = name;
        this.description = description;
        this.keywords = keywords;
        this.inversion = inversion;
    }

    public Package(){
    }

    public Long getPackageId() {
        return packageId;
    }

    public void setId(Long packageId)
    {
        this.packageId = packageId;
    }

    public int getMinimunGroup() {
        return minimunGroup;
    }

    public void setMinimumGroup(int minimunGroup) {
        this.minimunGroup = minimunGroup;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId)
    {
        this.categoryId = categoryId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeyword(String keyword)
    {
        this.keywords = keywords;
    }

    public Double getInversion() {
        return inversion;
    }

    public void setInversion(Double inversion) {
        this.inversion = inversion;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }
}