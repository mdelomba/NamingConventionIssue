ThisBuild / scalaVersion := "2.13.6"
ThisBuild / organization := "com.example"


lazy val library = (project in file(".")).settings(name := "Library").dependsOn(subProjectA, subProjectB, subProjectC)


lazy val subProjectA = (project in file("subprojecta")).settings(name := "SubProjectA")
lazy val subProjectB = (project in file("subprojectb")).settings(name := "SubProjectB")
lazy val subProjectC = (project in file("subprojectc")).settings(name := "SubProjectC")