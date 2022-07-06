package lectures.part1basics

object ValuesVariablesTypes extends App {

  val x: Int = 42
  println(x)

  // VAL are immutable similar to const in Javascript, although they servce a dif purpose.
  // The 'types' of vas are option.  Here we declared "Int", but that isn't necessary.
  // the compiler is smart enough to infer types.
  // val x: = 42 would work.

  val aString: String = "hello";

  // Semicolons are allowed in Scala, but are not necessary as expressions are all written on
  // separate lines.

  val aBoolean: Boolean = false
  val aChar: Char = 'a' // Characters are single letters separated by single quotes.
  val anInt: Int = x
  val aShort: Short = 4455 // Shorts are short int.  If they  are too long the compiler will complain.
  val aLong: Long = 54654654 // Longs are long ints.
  val aFloat: Float = 2.5f // if you do not include the f, they compiler will complain that it should be a double
  val aDouble: Double = 3.14 // a more standard decimal number.

  // variables "var" vs "val"
  var aVariable: Int = 4

  // Variables can be redefined. This is known as a side effect.  Programs without side effects are easier to
  // understand.
  aVariable = 5




}
