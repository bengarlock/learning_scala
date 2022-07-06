package lectures.part1basics

object Expressions extends App {
  val x = 1 + 2
  println(x)

  println(2 + 3 * 4)

  println(1 == x)
  println(1 != x)
  println(1 > x)
  println(1 >= x)
  println(1 < x)
  println(1 <= x)

  // logical negation
  println(!(1==x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /= .... side effects
  println(aVariable)

  // Instructions vs Expressions
  // An instruction is something you tell the computer to DO. (Change a variable, print to the console etc)
  // in python, we work exclusively with instructions.

  // An Expression is something that has a VALUE or a TYPE.
  // In Scala, every bit of your code will express a value.

  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3

  println(aConditionedValue)

  // the above returns 5 because aCondition is true.  In other languages, we would write the above like this:

  //  if aCondition:
  //     return 5
  //  else:
  //     return 3

  // In scala, code resolves because of values or types.  I think of expressions like long equations that
  // become simplified and 'squish' down to a single value.

  println(if(aCondition) 5 else 3)
  // returns 5

  // Loops
  // Never use them in Scala.  You can, but side effects become a problem.
  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  // never write this again :).  Looping in general is related to imperative code
  // Everything in Scala is an expression.  Writing imperative code in an expressive world, is bad.

  val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue)
  // return ()
  // The above is an example of a Side Effect.  whiles, reassigning, println(), these are all examples of
  // imperative programming.

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

  println(aCodeBlock)

  // the above is called a code block.  This is still considered an expression.  The value of the block
  // is the value of its last expression.

  // Scope is limited to what is inside the aCodeBlock, so we cannot see values outside of it.

}
