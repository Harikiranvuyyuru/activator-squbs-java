lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "org.squbs",
      scalaVersion := "2.12.3"
    )),
    name := "squbs-scala-java.g8"
  )