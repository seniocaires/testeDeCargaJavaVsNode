# Java Server

```
docker build -t java_server .
```

```
docker run -it --rm -p 8080:8080 java_server
```

```
curl http://localhost:8080/status
```