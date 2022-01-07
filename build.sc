import mill._, scalalib._

object quillsample extends ScalaModule {
  val zioVersion = "2.0.0-M6-2"
  def scalaVersion = "3.1.0"

  def ivyDeps = Agg(
    /* ivy"dev.zio::zio::${zioVersion}",

    ivy"org.slf4j:slf4j-simple:1.7.32"*/
    //"io.getquill" %% "quill-jdbc-zio" % "3.12.0.Beta1.7",
    ivy"io.getquill::quill-zio:3.12.0.Beta1.7",
    ivy"io.getquill::quill-jdbc-zio:3.12.0.Beta1.7",
    ivy"com.github.ghostdogpr::caliban:1.2.4",
    ivy"com.github.ghostdogpr::caliban-zio-http:1.2.4",
    //  ivy"io.getquill::quill-jdbc:3.12.0.Beta1.7",
    // Or ZIO Modules
    /*:+ "io.getquill" %% "quill-jdbc-zio" % "3.12.0.Beta1.7",
  // Or Postgres Async
  "io.getquill" %% "quill-jasync-postgres" % "3.12.0.Beta1.7",
  // Or Cassandra
  "io.getquill" %% "quill-cassandra" % "3.12.0.Beta1.7",
  // Or Cassandra + ZIO
  "io.getquill" %% "quill-cassandra-zio" % "3.12.0.Beta1.7",
  // Add for Caliban Integration*/
    // ivy"io.getquill::quill-caliban:3.12.0.Beta1.7",
    ivy"io.getquill::quill-caliban:3.12.0.Beta1.7",
    ivy"org.postgresql:postgresql:42.2.6"
  )
  override def mainClass = Some("io.getquill.CalibanExample")

}
