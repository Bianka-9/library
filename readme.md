# library
 
feladat leírása szit.hu-ról:
 
Készítsen alkalmazást, ami kapcsolódik SQLite adatbázishoz.

Készítse el a következő táblákat. 

```
create table books(
  id integer not null primary key autoincrement,
  title varchar(100),
  author varchar(100),
  year integer,
  pages integer
);
```



Vegye fel a következő adatokat: 

```
INSERT INTO books
(id, title, author, year, pages)
VALUES
(1, 'Egri csillagok', 'Gárdonyi Géza', 1901, 580),
(2, 'A Pál utcai fiúk', 'Molnár Ferenc', 1906, 288),
(3, 'Légy jó mindhalálig', 'Móricz Zsigmond', 1920, 410),
(4, 'Tüskevár', 'Fekete István', 1957, 320),
(5, 'Abigél', 'Szabó Magda', 1970, 450);
```

Készítsen alkalmazást, ami megjeleníti a könyvek tartalmát konzolon. Megjeleníteni elég a következő oszlopokat: id, title, author, year 

Kimenet:

```
Id    Cím                   Szerző                Év
1    Egri csillagok        Gárdonyi Géza         1901
2    A Pál utcai fiúk      Molnár Ferenc         1906
3    Légy jó mindhalálig   Móricz Zsigmond       1920
4    Tüskevár              Fekete István         1957
5    Abigél                Szabó Magda           1970
```




