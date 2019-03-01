package springcache;

import org.springframework.stereotype.Component;

/**
 * @author ghostomb
 * @date 2019/3/1
 */

public interface BookRepository {
    Book getByIsbn(String isbn);
}
