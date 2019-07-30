# sbt-docker-issue
run `sbt docker`

it will fail with `FileAlreadyExistsException`

on sbt `1.3.0-RC2` and previous it would create a docker image (if you have docker running) or fail trying to connect to it
