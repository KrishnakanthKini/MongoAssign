package com.example.mongoassign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * A single link structure
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-25T11:28:31.548Z")
public class Link {
  @JsonProperty("rel")
  private String rel = null;

  @JsonProperty("href")
  private String href = null;

  public Link rel(String rel) {
    this.rel = rel;
    return this;
  }

  /**
   * Relationship of the link. Current links include: * self: when requesting a single memberId * coverages: link to the member&#39;s coverages
   * @return rel
   **/
  @NotNull
  public String getRel() {
    return rel;
  }

  public void setRel(String rel) {
    this.rel = rel;
  }

  public Link href(String href) {
    this.href = href;
    return this;
  }

  /**
   * The hyperlink reference to a resource. Examples: \&quot;https://api.horizonblue.com/v1/members/M3\&quot; \&quot;https://api.horizonblue.com/v1/members/M3/coverages\&quot;
   * @return href
   **/
//  @ApiModelProperty(required = true, value = "The hyperlink reference to a resource. Examples: \"https://api.horizonblue.com/v1/members/M3\" \"https://api.horizonblue.com/v1/members/M3/coverages\"")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Link link = (Link) o;
    return Objects.equals(this.rel, link.rel) &&
            Objects.equals(this.href, link.href);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rel, href);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Link {\n");

    sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
