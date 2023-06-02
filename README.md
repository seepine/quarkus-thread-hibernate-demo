# quarkus-thread-hibernate-demo

## Modify application.properties

default config

```properties
quarkus.datasource.jdbc.url=jdbc:mysql://127.0.0.1:3306/thread_demo?createDatabaseIfNotExist=true
quarkus.datasource.username=root
quarkus.datasource.password=123456
```

## Run

```shell
./gradlew quarkusDev
```

## Try curl

### /user/save1

throw CreationException

```
http://localhost:8080/user/save1
```

### /user/save2

insert data to db success without thread

```
http://localhost:8080/user/save2
```