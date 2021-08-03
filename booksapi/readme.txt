*********booksapi*******
*****************************
Web Api
Application used Postman, Browser
Data format : JSON
DB: LIST object
DATABASE NAME:
TABLE NAME:
TABLE FIELDS :

GetMapping /home ===> RETURN HOME PAGE
GetMapping /courses ===> RETURN LIST OF COURSES
GetMapping /courses/id ===> RETURN COURSE VIA ID NUMBER
PostMapping /courses ===> ADD A NEW COURSE
PutMapping /courses/id ===> UPDATE A COURSE
DeleteMapping /courses/id ===> DELETE A COURSE

SpringBootApplication => booksapimysql.java
RestController => MyController.java
Dao, JpaRepository => CourseDao.java
entities = Courses.java
interface = CourseService.java
interfaces implement CoursesService = CourseServiceImpl

##########APPLICATION.PROPERTIRES#############################
<<<<BLANK>>>>>>


########################POM.XML###############################
DEPENDENICES TO BE ADDED
spring-boot-starter-web
spring-boot-devtools
mysql-connector-java
spring-boot-starter-test

