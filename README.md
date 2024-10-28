# Evaluación 1er Parcial (en línea)

**Instrucciones**: Desarrolle una aplicación móvil bajo plataforma Android y lenguaje Kotlin. El contexto es la ***Inventario de Tornillos*** a elección del usuario, el diseño es libre, cumpliendo con el manejo de componentes, información y características que se describe a continuación.

**1.Implementar la herencia** entre las clases **Producto y Tornillo**, con los atributos que contemplen la información solicitada por la app. Se deben contemplar 2 atributos para la clase padre y 2 atributos para la clase hija.

**2.Diseña una Activity** que contenga los componentes **etiquetas** (TextView), **cajas de texto** (EditText, de distintos formatos) y **botones**. Los botones para las acciones de: Registrar, Buscar y Limpiar. 

**3.Programa en el MainActivity** un arreglo objeto de la clase antes definida (clase derivada), cuyo tamaño da se 5 posiciones. Establece la relación entre los componentes gráficos y los objetos para obtener la información requerida. Desarrolla métodos para establecer la funcionalidad de cada botón como a continuación se describe.

**4.Funcionalidad del botón Registrar:** debe colocar la información del formulario dentro de una posición del arreglo de objetos. Considerar las validaciones que debe existir información dentro de cajas de texto (no vacías) y que exista espacio dentro del arreglo para registrar la información (no llegar al límite del tamaño del arreglo).  Colocar el mensaje por medio de la clase Toast que indique que la información fue registrada, o en caso contrario el motivo por el cual no se registró (cajas de texto vacías o sin espacio en el arreglo).

**5.Funcionalidad del botón Buscar:** debe mostrar la información almacenada en el arreglo de objetos dentro de los componentes del formulario, en caso de existir. Además colocar un mensaje por medio de la clase Toast que mencione que el registro fue encontrado. En caso de no existir, debe mostrar un mensaje informando al respecto.

**6.Funcionalidad del botón Limpiar:** debe dejar vacías todas las cajas de texto, y opciones; además de colocar el foco de control en el primer componente del formulario. Es decir, volver al estado inicial de la aplicación.
