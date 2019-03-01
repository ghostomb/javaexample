package springcache;


import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * @author ghostomb
 * @date 2019/3/1
 */
@Component
public class SimpleBookRepository implements BookRepository {

    @Override
    @Cacheable("book")
    public Book getByIsbn(String isbn) {
        slowService();
        return new Book("12323","Thinking in Java");
    }

    /**
     * slow service
     */
    private void slowService(){
        try{
            long time=3000L;
            Thread.sleep(time);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
