import scala.io.Source

val file = Source.fromFile("mySource.txt")
for (line <- file.getLines())
	println(line)