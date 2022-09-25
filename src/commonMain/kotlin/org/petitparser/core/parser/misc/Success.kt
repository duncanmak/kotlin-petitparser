package org.petitparser.core.parser.misc

import org.petitparser.core.context.Context
import org.petitparser.core.parser.Parser

/** Returns a parser that consumes nothing and succeeds. */
fun success() = success(Unit)

/** Returns a parser that consumes nothing and succeeds with a [value]. */
fun <R> success(value: R) = object : Parser<R> {
  override fun parseOn(context: Context) = context.success(value)
}