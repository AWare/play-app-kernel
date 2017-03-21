package models

sealed trait Animal
case object Dog extends Animal
case object Cat extends Animal
case object Rabbit extends Animal
case object Duck extends Animal