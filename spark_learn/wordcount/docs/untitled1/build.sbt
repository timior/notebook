name := "untitled1"

version := "1.0"

scalaVersion := "2.11.6"

//for conf
libraryDependencies += "com.typesafe" % "config" % "1.2.1"
resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/maven-releases/"

//for spark
libraryDependencies += "org.apache.spark" %% "spark-core" % "2.1.1" % "provided"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.1.1" % "provided"

//for conf
libraryDependencies += "com.typesafe" % "config" % "1.2.1"
resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/maven-releases/"
// https://mvnrepository.com/artifact/net.java.dev.jna/jna
libraryDependencies += "net.java.dev.jna" % "jna" % "3.4.0"
//for sbt assembly
assemblyMergeStrategy in assembly := {
  case PathList("org", "apache", "spark", "unused", "UnusedStubClass.class")
  => MergeStrategy.last
  case x => (assemblyMergeStrategy in assembly).value(x)
}
//for log
libraryDependencies += "log4j" % "log4j" % "1.2.17"