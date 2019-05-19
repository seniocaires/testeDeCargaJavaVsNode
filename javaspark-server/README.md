# Java Spark Server

```
docker build -t javaspark_server .
```

```
docker run -it --rm -p 4567:4567 javaspark_server
```

```
curl http://localhost:4567/status
```