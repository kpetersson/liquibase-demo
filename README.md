# liquibase-demo

### How to start MYSQL
Run `docker-compose -f docker/docker-compose.yml up`

### Start application
Changelogs will be executed in the order in `db.changelog-master.yaml`

### Actuator endpoint
`http://localhost:8080/actuator/liquibase`
