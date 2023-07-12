val scala3Version = "3.2.2"
val h2Version = "2.1.214"
val scalaCsvVersion = "1.3.10"
val zioVersion = "2.0.6"
val zioSchemaVersion = "0.4.8"
val zioJdbcVersion = "0.0.2"
val zioJsonVersion = "0.5.0"
val zioHtppVersion = "3.0.0-RC2"
val scalacticVersion = "3.2.16"
val ironVersion = "2.2.0-RC2"
val scalaMetaVersion = "0.7.29"
val poslegmVersion = "0.1.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "ZIO_Application_Backend",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
      "com.h2database"        % "h2"              % h2Version,
      "dev.zio"               %% "zio"            % zioVersion,
      "dev.zio"               %% "zio-streams"    % zioVersion,
      "dev.zio"               %% "zio-schema"     % zioSchemaVersion,
      "dev.zio"               %% "zio-jdbc"       % zioJdbcVersion,
      "dev.zio"               %% "zio-json"       % zioJsonVersion,
      "dev.zio"               %% "zio-http"       % zioHtppVersion,
      "com.github.tototoshi"  %% "scala-csv"      % scalaCsvVersion,
      "org.scalactic"         % "scalactic_2.13"  % scalacticVersion,
      "io.github.iltotore"    %% "iron"           % ironVersion,
      "io.github.iltotore"    %% "iron-zio"       % ironVersion,
      "org.scalameta"         %% "munit"          % scalaMetaVersion,
      "com.github.poslegm"    %% "munit-zio"      % poslegmVersion
    ).map(_ % Compile),
    libraryDependencies ++= Seq(
      "org.scalameta" %% "munit" % "0.7.29"
    ).map(_ % Test)
  )





