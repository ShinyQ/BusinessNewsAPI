package id.sch.smktelkom_mlg.tugas02.xirpl319.businessnewsapi;

/**
 * Created by Kurniadi A.W on 2/11/2018.
 */

public class ModelBerita {
    private String author;
    private String title;
    private String urlToImage;
    private String publishedAt;
    private String description;
    private String url;

    public ModelBerita(String author, String title, String urlToImage, String publishedAt, String description, String url) {
        this.author = author;
        this.title = title;
        this.urlToImage = urlToImage;
        this.publishedAt = publishedAt;
        this.description = description;
        this.url = url;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
