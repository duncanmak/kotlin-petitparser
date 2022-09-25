import org.petitparser.core.parser.action.flatten
import org.petitparser.core.parser.combinator.div
import org.petitparser.core.parser.combinator.optional
import org.petitparser.core.parser.combinator.plus
import org.petitparser.core.parser.consumer.char

fun main() {
  val parser1 = char('a').plus().flatten()
  val parser2 = char('b').plus().flatten()
  val parser3 = char('c').plus().flatten()

  val parser = (parser1 + (parser2 / parser3) + parser3.optional())

  println(parser.parse("aabbbccc").value)
  println(parser.parse("aacccc").value)
}