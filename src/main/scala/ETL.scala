object ETL {
  def transform(old: Map[Int, Seq[String]]) = Map(old(1).head.toLowerCase -> 1)

}
