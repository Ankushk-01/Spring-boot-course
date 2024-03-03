# Books Management Project 

This is the project which use the in memory database to store the books info and we can perform the `CRUD` Operations on it via api's 

## Pre-requisties

1. Docker Desktop
2. JDK 8

## Dockerization 

1. We created the `Dockerfile` to containerized the process and use this command to create the image of the process :

```bash 
docker build -t books-mangement .
```

it will create the image of the process with the name of the `books-management` 

2. Use the bellow given command to run the image :

```bash
docker run --name books-management-container -p 8080:8080 -ti books-management
```
