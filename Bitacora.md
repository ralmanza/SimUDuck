#### Face 1
En esta face, deacuerdo a los requerimientos que se tiene el diseño de la clase Pato y las clases especializadas que herencia de la clase Pato cumplen con lo requerido. 

#### Face 2
En esta face, deacuerdo a nuevos requerimientos los patos deben saber volar y ademas debe existir un nuevo tipo de Pato de goma. 
En este punto se puede notar que la herencia que se a estado usando no es suficiente para añadir nuevos tipos de patos, debido a que el nuevo tipo de patos de goma no deberia de poder volar ni tampoco graznar.
El codigo no es flexible a añadir nuevos tipos de Patos.          

#### Face 3
En esta face, Se puede notar que el uso de Interfaces ayuda a que la clase Duck solo implemente el comportamiento comun y delega a las clases especializadas la tarea de implementar el comportamiento que pueda tener cada tipo de Pato.
Pero tambien se puede ver que esta solucion causa que se tenga codigo repetido en diferentes clases especializadas.

#### Face 4
En esta face, Se puede notar que la encapsulacion de el comportamiento variable y mantener la clase Pato con el comportamiento comun hace que la clase sea extendible para nuevos tipos de Patos, 
pero todavia se puede ver un que existe un alto nivel de dependecia entre las clases especializada y los comportamientos debido a que se esta creando instancias del comportamiento dentro del constructor de la clase especializada.    
