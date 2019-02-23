# Spring Boot, MySQL, JPA, Hibernate Rest API Tutorial

Restful CRUD API para un Note-Taking application usando Spring Boot, Mysql, JPA and Hibernate.

## Requirements

1. Java - 1.8.x

2. Maven - 3.x.x

3. Mysql - 5.x.x

## Steps to Setup


**1. Build and run the app using maven**

```En Openshift
./mvnw fabric8:resource fabric8:deploy
```

## Explore Rest APIs

La app define las siguientes CRUD APIs.

    GET /api/notes
    
    POST /api/notes
    ```Body
    {"title": "Mi primera nota", "content": "Esto es desde pod spring hacia pod mysql"}
    ```
    GET /api/notes/{noteId}
    
    PUT /api/notes/{noteId}
    
    DELETE /api/notes/{noteId}

Puedes probar usando postman.

## Learn more
Autor:

AGCZ

Arqsoft-2019
