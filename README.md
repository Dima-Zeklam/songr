# songr Web application 

* This app contains a hello world route at /hello, and I can visit that route.
* I Created a route that turns words into UPPER CASE. and I create Html file  that when I  visit /capitalize/hello it will get back an HTML page containing the response HELLO, or I could visit /capitalize/this is Kinda Capitalized and get an HTML page containing the response THIS IS KINDA CAPITALIZED.
* This app contains a basic splash page for the Songr app, available at the root route, and style it with some CSS.
* I Created an Album class that contain constructor has a title, an artist, a songCount, a length, and an imageUrl , also have getters and setters methods.
* the singr app contains a route at /albums that shows three album instances. 
* I do testing for constructor, getters, and setters for the Album class.


# lab 12 
Update your Album model so that it can be saved in a database,
create a interface repository AlbumRepository extends CrudRepository  to save the data into database.
made sure to try each route in the appliction. 

Lab: 13 - Related Resources and Integration Testing
create Song entity, to make songs for each album
the user should input the name,length and trackNumber for specific album bu visiting http://localhost:8080/addOneSong/{{id}}
http://localhost:8080/songs to display the songs 