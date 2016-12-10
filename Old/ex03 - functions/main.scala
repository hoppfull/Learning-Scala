def myFunc1(x: Int, y: Int): Int = {
	/*
		If return-statement isn't assigned to function body,
		then last evaluated expression will be returned.
	*/
	println("tjosan")
	return x + y
	6
}  // Looks like functions has to have types defined.

// optionally leave out the curly braces in case of single expression:
def myFunc2(x: Int): Int = x * 2 



println(myFunc1(1, 4))
println(myFunc2(9))

// Closures:
def myFunc3(x: Int) = {
	(y: Int) => {
		x * y
	}  // Last expression is returned
}

val f = myFunc3(5)
println(f(3))

// Functions as arguments:
def myFunc4(f: (Int) => Int): Unit = {
	println(f(3))
}  // Unit is like void. This function is useful for side effects only.

myFunc4((x: Int) => x * 31)  // Passing a lambda style function