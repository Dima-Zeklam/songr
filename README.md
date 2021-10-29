# songr Web application 

* This app contains a hello world route at /hello, and I can visit that route.
* I Created a route that turns words into UPPER CASE. and I create Html file  that when I  visit /capitalize/hello it will get back an HTML page containing the response HELLO, or I could visit /capitalize/this is Kinda Capitalized and get an HTML page containing the response THIS IS KINDA CAPITALIZED.
* This app contains a basic splash page for the Songr app, available at the root route, and style it with some CSS.
* I Created an Album class that contain constructor has a title, an artist, a songCount, a length, and an imageUrl , also have getters and setters methods.
* the singr app contains a route at /albums that shows three album instances. 
* I do testing for constructor, getters, and setters for the Album class.


# lab 12 - Spring RESTful Routing
* connect to database by add the application properties:
```
server.port=8080
spring.sql.init.platform=postgres
spring.datasource.url=jdbc:postgresql://localhost:5432/album
spring.datasource.username=username
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=create
spring.sql.init.mode=always
```
* Create a database and album table .
* make the album class as Entity and have a primary key.
* create an interface repository AlbumRepository extends CrudRepository .
* http://localhost:8080/SongsApp will switch you the home page for song application .
* create postMapping to add the data in database and show it at the web application 
* http://localhost:8080/AddAlbum this URL will rout you to AddAlbum page *to fill the form 
with album data and press add album to add this data to this URL will rout you to the table.
* http://localhost:8080/AlbumsList this URL will rout you to AlbumsList page that is contained table 
have a title, an artist, a songCount, a length, and an imageUrl data for the album.

* the command line shows the database for album table :

```
  album=# SELECT * FROM album;
  id |    artist     |            image_url            | length | song_count |      title
  ----+---------------+---------------------------------+--------+------------+------------------
  1 | Avril Lavigne | https://akns-images.eonline.com |    3:17 |          3 | Head Above Water
  2 | Billie Eilish | https://upload.wikimedia.org/   |    3:00 |          7 | Happier Than Ever
  (2 rows)

```

# lab 13 - Spring RESTful Routing
* Create a Song model has a title, a length (in seconds), a trackNumber, and the album on which that song appears.
* Create an relationship between Albums and Songs is appropriately set up.
* http://localhost:8080/AddSongs this URL will rote you to page contain form to add data for song.
* http://localhost:8080/SongsList this URL will rote you to page contain the table for song data
and the album for this song.
* The user can add albums and can add song for specific album .

* the command line shows the database for album table :

```
album=# SELECT * FROM songs;
id | length |       title       | track_number | album_id
----+--------+-------------------+--------------+----------
1 |    3:00 | Tell Me It's Over |            4 |        1
2 |    4:04 | Getting Older     |            1 |        2
(2 rows)
```

* I made HelloControllerTest to test helloWorld method .
