package guru.springframework.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Product {
    private Integer id;
    private String name;
    private String subtitle;
    private String description;
    private Author author;
    private BigDecimal price;
    private List<ProductCategory> productCategories = new ArrayList<>();
    private String imageUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseName() {
        return name;
    }

    public void setCourseName(String name) {
        this.name = name;
    }

    public String getCourseSubtitle() {
        return subtitle;
    }

    public void setCourseSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getCourseDescription() {
        return description;
    }

    public void setCourseDescription(String description) {
        this.description = description;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public List<ProductCategory> getProductCategories() {
        return productCategories;
    }

    public void setProductCategories(List<ProductCategory> productCategories) {
        this.productCategories = productCategories;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
