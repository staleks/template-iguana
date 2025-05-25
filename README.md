# template-iguana
Java 21, Spring 4, Hexagonal Showcase


## Building Image
```
$ ./gradlew jibDockerBuild
```

## How to run app as Docker Container?

```
$ docker run -p 8080:8080 -it -e "SPRING_PROFILES_ACTIVE=dev" staleks/template-iguana
```