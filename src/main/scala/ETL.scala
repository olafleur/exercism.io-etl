object ETL {
  def transform(oldValues: Map[Int, Seq[String]]) =
  {
    var newMap = Map[String, Int]()
    for(element <- oldValues) {
      for(lettre <- element._2) {
        newMap = newMap ++ Map(lettre.toLowerCase -> element._1)
      }
    }

    newMap
  }

}
