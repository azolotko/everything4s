ThisBuild / organization := "nl.zolotko"

ThisBuild / developers :=
  Developer(
    "azolotko",
    "Alex Zolotko",
    "azolotko@gmail.com",
    url("https://github.com/azolotko")
  ) :: Nil

ThisBuild / licenses := License.Apache2 :: Nil

ThisBuild / version := "0.0.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.4.2-RC1"

lazy val root = (project in file("."))
  .settings(
    name              := "everything4s",
    idePackagePrefix  := Some("nl.zolotko.everything4s"),
    libraryDependencies +=
      "org.typelevel" %% "spire" % "0.18.0"
  )
