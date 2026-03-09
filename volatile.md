### volatile
Обеспечивает видимость значения другим потокам, но не дает атомарность<br>
(кроме чтения и записи long и double на 32 битной платформе)<br><br>
__Отсылки к Java language specifiaction (21 версия)__
* JLS 17.4.5: A write to a volatile field (§8.3.1.4) happens-before every subsequent read of that field
* JLS: 8.3.1.4: A field may be declared volatile, in which case the Java Memory Model ensures that all threads see 
a consistent value for the variable (§17.4).

P.S. Для массивов не работает, нужно использовать класс AtomicReferenceArray