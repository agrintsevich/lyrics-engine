package scalalab3.lyricsengine.persistence

import scalalab3.lyricsengine.domain._

/**
  * Created by annie on 5/17/16.
  */
trait StorageComponent {

  val storage: Storage

  trait Storage {

    def findSongs(version: Option[Int] = None): Seq[Song]

    def findWordsDefinitions(version: Option[Int] = None): Seq[Map[Int, String]]

    def countSongs(): Int

    def countWD(): Int

    def addDataSet(dataSet: DataSet, version: Option[Int] = None)

    def getDataSet(version: Option[Int] = None)

    def getLastVersion: Option[Int]

  }

}
