package nl.zolotko.everything4s

enum Endianness {
  case Little, Big

  def toggle: Endianness = this match
    case Little => Big
    case Big    => Little
}
