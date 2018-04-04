lazy val p = (project in file(".")).settings(
   name := "sbt-crosspublish",
   sbtPlugin := true,
   organization := "com.abhi",
   version := "1.0.0",
   crossScalaVersions := Seq("2.10.6", "2.12.0"),   
   crossSbtVersions := Seq("0.13.17", "1.0.0"),
   libraryDependencies ++= Seq(
       "com.typesafe" % "config" % "1.3.3"
   )
)