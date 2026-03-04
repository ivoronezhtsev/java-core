# Задачки от Деловые решения и технологии, по которым я подглядел в ИИ
* Задачка: что выведет и почему?<br>
```java 
import java.util.*;

class User {
    private final String id;

    User(String id) {
        this.id = id;
    }
}

public class Demo {
    public static void main(String[] args) {
        Map<User, String> m = new HashMap<>();
        m.put(new User("42"), "ok");
        System.out.println(m.get(new User("42")));
    }
}
```
Ответил: null, потому что не определен equals и hashCode<br>
* 
```java
public class Demo {
    static int x = 0;

    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) x++;
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) x++;
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(x);
    }
}
```
* Таблица orders(id, customer_id). Нужно получить список customer_id, у которых 2 и более заказа.
```sql
SELECT customer_id
FROM orders
GROUP BY customer_id
HAVING COUNT(id) >= 2;
```
