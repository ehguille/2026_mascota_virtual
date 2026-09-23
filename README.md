# 2026_mascota_virtual
Ejemplo para introducirse en la programación orientada a objetos. No te preocupes si hay cosas que no te cuadran, iremos avanzando en ello.

## Enunciado

Crea una clase modele una MascotaVirtual. Una mascotaVirtual debe tener nombre y niveles de hambre, felicidad y energía. 

Cada mascota puede tener un nombre distinto, pero todas empiezan teniendo 50 puntos de hambre, 50 de felicidad y 100 de energía. 

Una mascota puede comer, en cuyo caso su nivel de hambre baja 5 puntos y su energía sube 1 punto. Puede jugar un número determinado de minutos, de manera que su energía baje 2 puntos por cada minuto jugado. Su felicidad aumentará 3 puntos por cada minuto jugado, y su hambre subirá 1 punto por cada minuto jugado.

También puede dormir un número determinado de horas, recargando 2 puntos de energía por cada hora dormida. Su hambre sube 1 punto cada hora que duerme.

También debe haber un método llamado mostrarEstado() que imprima por pantalla el nombre, hambre, felicidad y energía de la mascota.

### Ampliación

Crea una clase llamada Cuidador. Un cuidador puede alimentar a una mascota y puede jugar con ella un número determinado de minutos. 
