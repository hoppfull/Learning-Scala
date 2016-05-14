var i = 0
while (i < 5) {
	if (i % 2 == 0)
		println(i)
	else
		print(i)
	i += 1
}

Array(1, 2, 3, 11, 5, 119).foreach(x => print(x))

Array("tjosan", 5, '6').foreach(println)

for (i <- Array(0, 1, 2, 3))  // Like "for x in xs" in Python!
	print(i)

println("Pattern matching!?:")
val x = 1
x match {
	case 0 => println("Nil!")
	case 1 => println("Uno!")
	case 2 => println("Zwei!")
	case 3 => println("Three!")
}

for (i <- 10 to 55)  // Python: for i in range(1, 56)
	print(i)