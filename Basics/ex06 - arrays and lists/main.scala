/* Lists and Arrays
Arrays are mutable while Lists are not. We are encouraged to use lists
becouse they're useful in functional programming style.

Apparently...! Appending to lists is very expensive! Appending time
grows linearly as list becomes longer. HOWEVER! Prepending is cheap for
large lists! It doesn't grow  the longer the list is. Fascinating! So
best practice is to prepend to a list a bunch of numbers and then
reverse it in the end.

INTERESTING! Does this apply to Python and Cython as well!?
*/

val as = List(1, 2, 3)
val bs = List[Int](4, 5, 6)  // Optionally set types for this list

val cs = as ::: bs  // Append two lists

for (i <- cs)
	println("cs: " + i)

val z_cs = 0 :: cs
for (i <- z_cs)
	println("z_cs: " + i)

def buildList(n: Int, xs: List[Int]): List[Int] = {
	if (n >= 0)
		buildList(n - 1, n :: xs)
	else
		xs
}
val ys = buildList(17, Nil)
println(ys)
println(ys count(s => s > 5))  // count takes a lambda with predicate
println(ys drop(3))
println(ys dropRight(4))
println(ys exists(s => s > 17))  // Has any numbers larger than 17?
println(ys filter(s => s < 7))  // filter values not passing condition
println(ys forall(s => s < 18)) // tests all values in list
println(ys.head)  // first element in list
println(ys.init)  // all but last element of list
println(ys.isEmpty)  // is list empty?
println(ys.last)  // last element in list
println(ys.length) // # elements in list
println(ys map(s => s * 2)) // new list with lambda applied to elements
println(ys.reverse) // new list with reversed elements
// println(ys sort((s, t) => s > t))  // In the book but doesn't work
println(ys.tail) //  new list without first element of ys
