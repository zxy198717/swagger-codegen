package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Category;
import io.swagger.client.model.Tag;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;


/**
 * Pet
 */
public class Pet   {
    @SerializedName("id")
    private Long id = null;
    @SerializedName("category")
    private Category category = null;
    @SerializedName("name")
    private String name = null;
    @SerializedName("photoUrls")
    private List<String> photoUrls = new ArrayList<String>();
    @SerializedName("tags")
    private List<Tag> tags = new ArrayList<Tag>();
  /**
   * pet status in the store
   */
  public enum StatusEnum {
    @SerializedName("available")
    AVAILABLE("available"),

    @SerializedName("pending")
    PENDING("pending"),

    @SerializedName("sold")
    SOLD("sold");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

    @SerializedName("status")
    private StatusEnum status = null;

    /**
     * Get id
     * @return id
     **/
    @ApiModelProperty(value = "")
    public Long getId() {
        return id;
    }

    /**
     * Set id
     *
     * @param id id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Get category
     * @return category
     **/
    @ApiModelProperty(value = "")
    public Category getCategory() {
        return category;
    }

    /**
     * Set category
     *
     * @param category category
     */
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     * Get name
     * @return name
     **/
    @ApiModelProperty(required = true, value = "")
    public String getName() {
        return name;
    }

    /**
     * Set name
     *
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get photoUrls
     * @return photoUrls
     **/
    @ApiModelProperty(required = true, value = "")
    public List<String> getPhotoUrls() {
        return photoUrls;
    }

    /**
     * Set photoUrls
     *
     * @param photoUrls photoUrls
     */
    public void setPhotoUrls(List<String> photoUrls) {
        this.photoUrls = photoUrls;
    }

    /**
     * Get tags
     * @return tags
     **/
    @ApiModelProperty(value = "")
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * Set tags
     *
     * @param tags tags
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    /**
     * pet status in the store
     * @return status
     **/
    @ApiModelProperty(value = "pet status in the store")
    public StatusEnum getStatus() {
        return status;
    }

    /**
     * Set status
     *
     * @param status status
     */
    public void setStatus(StatusEnum status) {
        this.status = status;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pet pet = (Pet) o;
        return Objects.equals(this.id, pet.id) &&
        Objects.equals(this.category, pet.category) &&
        Objects.equals(this.name, pet.name) &&
        Objects.equals(this.photoUrls, pet.photoUrls) &&
        Objects.equals(this.tags, pet.tags) &&
        Objects.equals(this.status, pet.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category, name, photoUrls, tags, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Pet {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    photoUrls: ").append(toIndentedString(photoUrls)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     *
     * @param o Object to be converted to indented string
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

