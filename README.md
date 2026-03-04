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
* Точно не запомнил но примерно какой рез-т будет и как исправить
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
Ответил что рез-т неопределен, как исправить все в кучу намешал про локи, синхронайзед, волатайл
* Таблица orders(id, customer_id). Нужно получить список customer_id, у которых 2 и более заказа.
```sql
SELECT customer_id
FROM orders
GROUP BY customer_id
HAVING COUNT(id) >= 2;
```
# https://www.youtube.com/watch?v=N3qyqftkV4A
Новичковый уровень:
синтаксис, ООП (классы, наследования, имплементировать, overload, implements, ключевые слова в джава, знание основных методов класса Object), импорты, методы класса Object,
знание базовых библиотек что они есть (collection frawework, доступ к файлам, сети, чтобы не изобретать велосипеды)
Для собеса:
Все перечисленное до этого + Знать нововедения зыка по версиям (хотя бы 8-й а лучше 11, в моем случае это 17-25, не досконально хотябы знать что добавило и зачем нужно)
Stream API, Optional, лямбды, все методы класса обджект, а не только основные(включая вейт, нотифай, нотифай олл) многопочка - что такое семафоры, мьютексы, локи
что такое race condition (как его избежать), dead lock
С чего начать многопотчку:
методы вейт, нотифай, нотифайолл, синхронизированные блоки
*От сбера прочитать про виртуал тредс (начиная с 21 джавы)
Работа с сетью, что такое сокет, серверсокет, какие соединения бывают, rmi
Интернационализация и локализация
ОБЯЗАТЕЛЬНО коллекции и equals hashCode на уровне понимания + применять лямбды стримапи и прочеее по обработке данных
