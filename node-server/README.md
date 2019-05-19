# Node Server

```
docker build -t node_server .
```

```
docker run -it --rm -p 3000:3000 node_server
```

```
curl http://localhost:3000/status
```