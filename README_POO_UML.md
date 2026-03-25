# 📘 POO en Java + Diagramas UML

---

## 🧩 Diagrama de Clases (Ejemplo)

```plantuml
@startuml
class Animal {
  +comer()
}

class Perro {
  +ladrar()
}

Animal <|-- Perro
@enduml
```

---

## 🔐 Encapsulación

```plantuml
@startuml
class Persona {
  -nombre : String
  +getNombre() : String
  +setNombre(nombre : String)
}
@enduml
```

---

## 🧬 Herencia

```plantuml
@startuml
class Animal {
  +comer()
}

class Gato {
  +maullar()
}

Animal <|-- Gato
@enduml
```

---

## 🔄 Polimorfismo

```plantuml
@startuml
class Animal {
  +sonido()
}

class Perro {
  +sonido()
}

class Gato {
  +sonido()
}

Animal <|-- Perro
Animal <|-- Gato
@enduml
```

---

## 🎯 Abstracción

```plantuml
@startuml
abstract class Vehiculo {
  +mover()
}

class Carro {
  +mover()
}

Vehiculo <|-- Carro
@enduml
```

---

## 📌 Cómo usar estos diagramas

Puedes renderizar estos diagramas usando:

- https://www.plantuml.com/plantuml
- Extensión de PlantUML en VS Code
- Herramientas como IntelliJ IDEA

---

💡 *Practica todos los días, aunque sea 20 minutos.*
