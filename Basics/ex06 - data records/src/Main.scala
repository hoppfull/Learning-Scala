object Main {
    // Immutable data record:
    case class DataRecord(x: Int, y: Int)
    def main (args: Array[String]): Unit = {
        val record = DataRecord(10, 16)
        
        println(record.x) // 10
        println(record.y) // 16
    }
}
