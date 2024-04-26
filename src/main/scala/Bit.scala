package nl.zolotko.everything4s

enum Bit {
  case `0`, `1`

  def toBoolean: Boolean = this match
    case `0` => false
    case `1` => true

  def toByte: Byte = this match
    case `0` => 0
    case `1` => 1

  def toShort: Short = toByte

  def toInt: Short = toByte

  def toLong: Long = toByte

  def toFloat: Float = toByte

  def toDouble: Double = toByte

  def toChar: Char = this match
    case `0` => '0'
    case `1` => '1'

  override def toString: String = this match
    case `0` => "0"
    case `1` => "1"
}
