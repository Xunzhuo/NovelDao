package top.liuxunzhuo.books.common.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


@Component
@ConfigurationProperties(prefix = "index")
public class IndexRecBooksConfig {


    private List<Map<String,String>> recBooks;

    private boolean isRead;

    public List<Map<String, String>> getRecBooks() {
        return recBooks;
    }

    public void setRecBooks(List<Map<String, String>> recBooks) {
        this.recBooks = recBooks;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }
}
