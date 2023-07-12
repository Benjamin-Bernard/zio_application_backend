/*
package mlb

import com.github.tototoshi.csv.CSVReader
import com.github.tototoshi.csv.defaultCSVFormat
import zio.*
import zio.jdbc.*
import zio.http.*
import zio.stream.ZStream

import java.io.File

object MlbApi extends ZIOAppDefault {

  val createZIOPoolConfig: ULayer[ZConnectionPoolConfig] =
    ZLayer.succeed(ZConnectionPoolConfig.default)

  val properties: Map[String, String] = Map(
    "user" -> "postgres",
    "password" -> "postgres"
  )

  val connectionPool : ZLayer[ZConnectionPoolConfig, Throwable, ZConnectionPool] =
    ZConnectionPool.h2mem(
      database = "testdb",
      props = properties
    )

  val create: ZIO[ZConnectionPool, Throwable, Unit] = transaction {
    execute(
      sql"CREATE TABLE IF NOT EXISTS ..."
    )
  }

  val insertRows: ZIO[ZConnectionPool, Throwable, UpdateResult] = transaction {
    insert(
      sql"INSERT INTO ...".values((value1, value2, value2))
    )
  }

  val endpoints: App[Any] =
    Http
      .collect[Request] {
        case Method.GET -> Root / "init" => ???
        case Method.GET -> Root / "games" => ???
        case Method.GET -> Root / "predict" / "game" / gameId => ???
      }
      .withDefaultErrorResponse

  val app: ZIO[ZConnectionPool & Server, Throwable, Unit] = for {
    source <- ZIO.succeed(CSVReader.open(new File("C:/Users/barto/Desktop/EFREI/M1/S8/functional_programming/mlb-elo/mlb-elo/mlb_elo.csv")))
    tream <- ZStream
      .fromIterator[Seq[String]](source.iterator)
      .foreach(chunk => println(chunk))
    _ <- ZIO.succeed(source.close())
    // conn <- create *> insertRows
    // _ <- Server.serve(endpoints)
  } yield ()

  override def run: ZIO[Any, Throwable, Unit] =
    app.provide(createZIOPoolConfig >>> connectionPool, Server.default)
}
*/