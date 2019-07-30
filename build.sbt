lazy val scastie = project
  .in(file("."))
  .settings(dockerfile in docker := new Dockerfile {
    from("openjdk:8u171-jdk-alpine")
    add(file("./1/2"), "/")
  })
  .enablePlugins(sbtdocker.DockerPlugin)
