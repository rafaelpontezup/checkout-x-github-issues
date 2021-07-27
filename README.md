Running PostgreSQL 13.x container via command line:
```shell
docker run --name github-postgres -p 5432:5432 -e POSTGRES_PASSWORD=postgres -d postgres:13.3
```

We can **start** and **stop** the container as well:
```shell
docker container start github-postgres
docker container stop github-postgres
```